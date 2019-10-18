package com.example.mylocalization;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            lang = findViewById(R.id.Blang);
            lang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent lang = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                    startActivity(lang);
                }
            });
    }
}
