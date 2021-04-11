package com.example.impulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestoesSimulado extends AppCompatActivity {
    Button bEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes_simulado);

        bEnviar= (Button) findViewById(R.id.bEnviar);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Simulado.class);
                startActivity(intent);



            }
        });

    }
}