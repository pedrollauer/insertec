package com.pedro.vemax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Operacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacao);

        Button estrobo = (Button) findViewById(R.id.button2);
        estrobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getBaseContext(), Estrobo.class);
                startActivity(it);
            }
        });

        Button receitas = (Button) findViewById(R.id.button3);
        receitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getBaseContext(), Receita.class);
                startActivity(it);
            }
        });

        Button passagem = (Button) findViewById(R.id.button4);
        passagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getBaseContext(), Passagem.class);
                startActivity(it);
            }
        });

        Button ajustes = (Button) findViewById(R.id.button);
        ajustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getBaseContext(), Ajuste.class);
                startActivity(it);
            }
        });
    }
    public void onBackPressed(){
        Log.i("N", "Hello!");
    }
}