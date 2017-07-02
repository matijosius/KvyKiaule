package com.example.jonas.kvykiaule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.media.MediaPlayer;


public class KiauleActivity extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiaule);
        addListenerOnButton();

    }
    public void addListenerOnButton() {

        imageButton = (ImageButton) findViewById(R.id.imageButton1);

        imageButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(KiauleActivity.this,
                        "Kiaule sako: KVY", Toast.LENGTH_SHORT).show();

                final MediaPlayer mp;
                mp = MediaPlayer.create(KiauleActivity.this, R.raw.kiaule4);
                mp.start();

            }

        });





    }

}
