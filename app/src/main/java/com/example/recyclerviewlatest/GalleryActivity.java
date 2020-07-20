package com.example.recyclerviewlatest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getIncomingIntent();
    }

    private void getIncomingIntent() {

        if (getIntent().hasExtra("name") && getIntent().hasExtra("image")) {

            String imageName = getIntent().getStringExtra("name");
            String image = getIntent().getStringExtra("image");
            setImage(image, imageName);
        }


    }

    private void setImage(String image, String imageName) {
        TextView name = findViewById(R.id.tv_gallery);
        ImageView imageView = findViewById(R.id.iv_gallery);

        name.setText(imageName);

        Glide.with(this)
                .asBitmap()
                .load(image)
                .into(imageView);
    }
}
