package com.example.impulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Simulado extends AppCompatActivity {
    ImageButton btsp;
    ImageButton btsf;
    ImageButton btsv;
    ImageButton btsa;
    ImageButton btiranking;
    Button btranking;
    ImageButton btsimulado1;
    ImageButton btsimulado2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulado);


        btsp = (ImageButton) findViewById(R.id.btsp);
        btsf = (ImageButton) findViewById(R.id.btsf);
        btsv = (ImageButton) findViewById(R.id.btsv);
        btsa = (ImageButton) findViewById(R.id.btsa);
        btiranking = (ImageButton) findViewById(R.id.btiranking);
        btranking = (Button) findViewById(R.id.btranking);
        btsimulado1 = (ImageButton) findViewById(R.id.btsimulado1);
        btsimulado2 = (ImageButton) findViewById(R.id.btsimulado2);


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

        btiranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Ranking.class); //IR PARA O RANKING
                startActivity(intent);



            }
        });

        btranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Ranking.class); //IR PARA O RANKING
                startActivity(intent);



            }
        });

        btsimulado1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), QuestoesSimulado.class); //IR PARA AS QUESTOES DO SIMULADO
                startActivity(intent);



            }
        });

        btsimulado2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), QuestoesSimulado.class); //IR PARA AS QUESTOES DO SIMULADO
                startActivity(intent);



            }
        });


    }
}