package com.gurpster.slidingpanel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.bumptech.glide.Glide;
import com.gurpster.library.SlidingPanelLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlidingPanelLayout slidingPanel = findViewById(R.id.sliding_layout);
        slidingPanel.addPanelSlideListener(new SlidingPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset, float inverseSlideOffset) {
                Log.d("", inverseSlideOffset+"");
            }

            @Override
            public void onPanelStateChanged(View panel, SlidingPanelLayout.PanelState previousState, SlidingPanelLayout.PanelState newState) {

            }
        });

        AppCompatImageView imageView = findViewById(R.id.imageView);
        Glide.with(this)
                .load("https://biografieonline.it/img/bio/Scarlett_Johansson_3.jpg")
                .into(imageView);
    }
}
