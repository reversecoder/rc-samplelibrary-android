package com.reversecoder.samplelibrary.androidstudio.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.reversecoder.samplelibrary.androidstudio.AndroidView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.btn_check_in)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AndroidView androidView = new AndroidView(MainActivity.this);
                androidView.showAndroidView();
            }
        });
    }
}
