package com.example.impulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Simulado extends AppCompatActivity {
    ImageButton btsp;
    ImageButton btsf;
    ImageButton btsv;
    ImageButton btsa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulado);


        btsp = (ImageButton) findViewById(R.id.btsp);
        btsf = (ImageButton) findViewById(R.id.btsf);
        btsv = (ImageButton) findViewById(R.id.btsv);
        btsa = (ImageButton) findViewById(R.id.btsa);


        btsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Perfil.class); //IR PARA O PERFIL
                startActivity(intent);



            }
        });


        btsf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Feed.class); //IR PARA O FEED
                startActivity(intent);



            }
        });

        btsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Video.class); //IR PARA O VIDEO
                startActivity(intent);



            }
        });

        btsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Audio.class); //IR PARA O AUDIO
                startActivity(intent);



            }
        });


    }
}