package com.devproject.miguelfagundez.blureffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jgabrielfreitas.core.BlurImageView;

public class MainActivity extends AppCompatActivity {

    // Views
    private BlurImageView blurImageView;
    private BlurImageView blurImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        setupValues();
    }

    private void setupViews() {
        blurImageView = (BlurImageView) findViewById(R.id.ivBlurImage);
        blurImageView2 = (BlurImageView) findViewById(R.id.ivBlurImage2);
    }

    private void setupValues() {
        blurImageView.setBlur(4);
        blurImageView2.setBlur(10);
    }
}