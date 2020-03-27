package com.example.pikchaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class DisplayImage extends AppCompatActivity {
    private ImageView imageViewDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_image);

        imageViewDisplay = findViewById(R.id.image_view_dispalyed);
    }
}
