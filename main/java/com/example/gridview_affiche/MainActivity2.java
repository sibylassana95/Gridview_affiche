package com.example.gridview_affiche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView selectedImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        selectedImage = (ImageView) findViewById(R.id.selectedImage);

        Intent intent = getIntent();
        selectedImage.setImageResource(intent.getIntExtra("image", 0));

    }
}