package com.pedro.vemax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Handler handler;
    ProgressBar pb;
    TextView txtLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLoad = (TextView) findViewById(R.id.txtLoad);
        ProgressBar pb = (ProgressBar) findViewById(R.id.pbSplash);
        handler = new Handler();

        txtLoad.setText("Carregando...");
        final Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Pedru", "OI!");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try{

                            Thread.sleep(1000);
                            txtLoad.setText("Procurando CLP...");


                            Intent it = new Intent(MainActivity.this, Operacao.class);
                            startActivity(it);

                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
            }
        };

        handler.postDelayed(run, 1000);


    }
}