package com.example.impulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Audio extends AppCompatActivity {
    ImageButton btap;
    ImageButton btaf;
    ImageButton btav;
    ImageButton btas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);


        btap = (ImageButton) findViewById(R.id.btap);
        btaf = (ImageButton) findViewById(R.id.btaf);
        btav = (ImageButton) findViewById(R.id.btav);
        btas = (ImageButton) findViewById(R.id.btas);



        btap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Perfil.class); //IR PARA O PERFIL
                startActivity(intent);



            }
        });

        btaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Feed.class); //IR PARA O FEED
                startActivity(intent);



            }
        });

        btav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Video.class); //IR PARA O VIDEO
                startActivity(intent);



            }
        });

        btas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Simulado.class); //IR PARA O SIMULADO
                startActivity(intent);



            }
        });

    }
}