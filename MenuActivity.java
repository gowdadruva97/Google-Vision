package com.example.jeevan.gvision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.FileOutputStream;

public class MenuActivity extends AppCompatActivity {

    Intent intent;
    ImageButton button_search, button_speech, button_trans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button_speech = findViewById(R.id.texttospeech);
        button_search = findViewById(R.id.gooelsearch);
        //button_trans = findViewById(R.id.translate);

        button_speech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

       /* button_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MenuActivity.this, TranslateActivity.class);
                startActivity(intent);
            }
        });*/

        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MenuActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
