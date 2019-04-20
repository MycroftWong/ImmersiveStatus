package com.mycroft.immersivestatus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fullScreen(View view) {
        startActivity(new Intent(this, FullScreenActivity.class));
    }

    public void color(View view) {
        startActivity(new Intent(this, ColorStatusBarActivity.class));
    }

    public void immersive(View view) {
        startActivity(new Intent(this, ImmersiveStatusBarActivity.class));
    }

    public void flag(View view) {
        startActivity(new Intent(this, FlagsActivity.class));
    }
}
