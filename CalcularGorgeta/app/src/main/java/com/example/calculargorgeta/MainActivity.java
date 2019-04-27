package com.example.calculargorgeta;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText CampoProduto;
    private TextView Resultado;
    private CheckBox  cbBranco, cbVerde, cbVermelho;
    List<String>Check = new ArrayList<String>();
    private RadioGroup rgEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CampoProduto = findViewById(R.id.etNomeProduto);
        Resultado = findViewById(R.id.tvResultado);

        cbBranco = findViewById(R.id.cbBranco);
        cbVerde = findViewById(R.id.cbVerde);
        cbVermelho = findViewById(R.id.cbVermelho);

        rgEstoque = findViewById(R.id.rgEstoque);
        VerificaRadioButton();

    }

    public void RecuperaCheck() {

        Check.clear();

        if (cbBranco.isChecked()){

            Check.add( cbBranco.getText().toString());
    }
        if (cbVerde.isChecked()){

            Check.add( cbVerde.getText().toString());
        }
        if (cbVermelho.isChecked()){

            Check.add( cbVermelho.getText().toString());
        }
        Resultado.setText(Check.toString());

 }
 public  void VerificaRadioButton(){
        rgEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if (i == R.id.rbSim){
                    Resultado.setText("sim");


                }else{
                    Resultado.setText("não");
                }
            }
        });



 }
    public void btEnviar (View view){
 /*Recuperar texto do edit text:
        String NomeProduto = CampoProduto.getText().toString();
        Resultado.setText(  NomeProduto   )
;*/




    }
}
