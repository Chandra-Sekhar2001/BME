package com.example.bmep_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class full_image_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image_view);
        ImageView imageView = findViewById(R.id.img_full);
        int img_id = getIntent().getExtras().getInt("img_id");
        imageView.setImageResource(img_id);

    }
}
