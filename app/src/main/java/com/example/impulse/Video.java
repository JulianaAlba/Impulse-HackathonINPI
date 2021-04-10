package com.example.impulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Video extends AppCompatActivity {
    ImageButton btvp;
    ImageButton btvf;
    ImageButton btva;
    ImageButton btvs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        btvp = (ImageButton) findViewById(R.id.btvp);
        btvf = (ImageButton) findViewById(R.id.btvf);
        btva = (ImageButton) findViewById(R.id.btva);
        btvs = (ImageButton) findViewById(R.id.btvs);



        btvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Perfil.class); //IR PARA O PERFIL
                startActivity(intent);



            }
        });

        btvf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Feed.class); //IR PARA O FEED
                startActivity(intent);



            }
        });

        btva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Audio.class); //IR PARA O AUDIO
                startActivity(intent);



            }
        });

        btvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Simulado.class); //IR PARA O SIMULADO
                startActivity(intent);



            }
        });


    }
}