package com.example.impulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Feed extends AppCompatActivity {
    ImageButton btfp;
    ImageButton btfv;
    ImageButton btfa;
    ImageButton btfs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        btfp = (ImageButton) findViewById(R.id.btfp);
        btfv = (ImageButton) findViewById(R.id.btfv);
        btfa = (ImageButton) findViewById(R.id.btfa);
        btfs = (ImageButton) findViewById(R.id.btfs);



        btfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Perfil.class); //IR PARA O PERFIL
                startActivity(intent);



            }
        });

        btfv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Video.class); //IR PARA O VIDEO
                startActivity(intent);



            }
        });

        btfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Audio.class); //IR PARA O AUDIO
                startActivity(intent);



            }
        });

        btfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Simulado.class); //IR PARA O SIMULADO
                startActivity(intent);



            }
        });


    }
}