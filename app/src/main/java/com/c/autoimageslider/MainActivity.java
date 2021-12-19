package com.c.autoimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {


    SliderView slider_view;
    int[] images = {R.drawable.background, R.drawable.background1, R.drawable.background2, R.drawable.background3,
            R.drawable.background4, R.drawable.bg, R.drawable.good_morning_img, R.drawable.good_night_img};


    SliderAdp sliderAdp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        slider_view = findViewById(R.id.slider_view);

        sliderAdp = new SliderAdp(images);
        slider_view.setSliderAdapter(sliderAdp);
        slider_view.setIndicatorAnimation(IndicatorAnimationType.WORM);
        slider_view.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        slider_view.startAutoCycle();


    }
}