package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> images = new ArrayList<>();
    Button myButton1;
    ImageView imageView;
    CheckBox image1, image2, image3, image4, image5;
    int count = 0;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        image1 = (CheckBox) findViewById(R.id.checkBox);
        image2 = (CheckBox) findViewById(R.id.checkBox2);
        image3 = (CheckBox) findViewById(R.id.checkBox3);
        image4 = (CheckBox) findViewById(R.id.checkBox4);
        image5 = (CheckBox) findViewById(R.id.checkBox5);

        image1.setChecked(true);
        images.add(R.drawable.ic_account_red);
        imageView.setImageDrawable(getResources().getDrawable(images.get(0)));
        myButton1 = (Button) findViewById(R.id.button);
        myButton1.setOnClickListener(v -> {
            count = (count+1)%5;
            imageView.setImageDrawable(getResources().getDrawable(images.get(count)));
        });
    }
    @SuppressLint("NonConstantResourceId")
    public void checkImage(View v){
        boolean ch = ((CheckBox) v).isChecked();
        switch (v.getId()){
            case R.id.checkBox:
                if(ch)
                    images.add(R.drawable.ic_account_circle);
                else
                    images.remove(R.drawable.ic_account_circle);
                break;
            case R.id.checkBox2:
                if(ch)
                    images.add(R.drawable.ic_account_blue);
                else
                    images.remove(R.drawable.ic_account_blue);
                break;
            case R.id.checkBox3:
                if(ch)
                    images.add(R.drawable.ic_account_red);
                else
                    images.remove(R.drawable.ic_account_red);
                break;

            case R.id.checkBox4:
                if(ch)
                    images.add(R.drawable.ic_account_green);
                else
                    images.remove(R.drawable.ic_account_green);
                break;

            case R.id.checkBox5:
                if(ch)
                    images.add(R.drawable.ic_account_yellow);
                else
                    images.remove(R.drawable.ic_account_yellow);
                break;
        }
    }
}