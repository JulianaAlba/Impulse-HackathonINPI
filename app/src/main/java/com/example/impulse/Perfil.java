package com.example.impulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Perfil extends AppCompatActivity {
    ImageButton btpf;
    ImageButton btpv;
    ImageButton btpa;
    ImageButton btps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

       btpf = (ImageButton) findViewById(R.id.btpf);
       btpv = (ImageButton) findViewById(R.id.btpv);
       btpa = (ImageButton) findViewById(R.id.btpa);
       btps = (ImageButton) findViewById(R.id.btps);



        btpf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Feed.class); //IR PARA O FEED
                startActivity(intent);



            }
        });

        btpv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Video.class); //IR PARA O VIDEO
                startActivity(intent);



            }
        });

        btpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Audio.class); //IR PARA O AUDIO
                startActivity(intent);



            }
        });

        btps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Simulado.class); //IR PARA O SIMULADO
                startActivity(intent);



            }
        });


    }
}