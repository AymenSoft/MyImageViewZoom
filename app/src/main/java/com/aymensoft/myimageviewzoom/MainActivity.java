package com.aymensoft.myimageviewzoom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import it.sephiroth.android.library.imagezoom.ImageViewTouch;

public class MainActivity extends AppCompatActivity {

    ImageViewTouch mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImage=(ImageViewTouch)findViewById(R.id.img_image);
        Picasso.with(MainActivity.this)
                .load("http://www.faceaface-paris.com/wp-content/uploads/2015/07/carre_homme.jpg")
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .networkPolicy(NetworkPolicy.NO_CACHE)
                .fit()
                .into(mImage);
    }
}
