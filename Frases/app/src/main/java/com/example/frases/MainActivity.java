package com.example.frases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
     public void ExibirFrase(View view){
         String[] Frases = {
                 "A vida é linda pelo simples fato de poder vivê-la" ,
                 "Ando devagar por que ja tive pressa e levo esse sorriso porque ja chorei demais",
                 "Nunca deixe que lhe digam que não vale a pena acreditar",
                 "Viva os seus sonhos"
         };

         int Numero = new Random().nextInt(4);
         TextView Texto = findViewById(R.id.Texo);
         Texto.setText( Frases[Numero]);

     }
}
