package com.example.impulse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Cadastrar extends AppCompatActivity {
    Button bAcessar;
    ImageButton bCACompatibilidade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar2);

        bAcessar= (Button) findViewById(R.id.bAcessar);
        bCACompatibilidade= (ImageButton) findViewById(R.id.bCACompatibilidade);


        bAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Acessar.class);
                startActivity(intent);



            }
        });

        bCACompatibilidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), CadastroAreaDeCompatibilidade.class);
                startActivity(intent);



            }
        });


    }
}