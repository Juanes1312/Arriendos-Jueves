package com.example.arriendoviviendas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton jrbcasa, jrbapto, jrbfinca, jrbmenos3, jrb3o4, jrbmas4;
    TextView jtvinmueble, jtvhabitacion, jtvtotal, jtvparqueadero;
    CheckBox jcbparqueadero;
    Button jbtncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        jrbcasa = findViewById(R.id.rbcasa);
        jrbapto = findViewById(R.id.rbapto);
        jrbfinca = findViewById(R.id.rbfinca);
        jrbmenos3 = findViewById(R.id.rbmenos3);
        jrb3o4 = findViewById(R.id.rb3o4);
        jrbmas4 = findViewById(R.id.rbmas4);
        jtvinmueble = findViewById(R.id.tvinmueble);
        jtvhabitacion = findViewById(R.id.tvhabitacion);
        jtvtotal = findViewById(R.id.tvtotal);
        jtvparqueadero = findViewById(R.id.tvparqueadero);
        jcbparqueadero = findViewById(R.id.cbparqueadero);
        jbtncalcular = findViewById(R.id.btncalcular);
    }
    public void Eliminar(View view){
        jtvinmueble.setText("400000");
        jtvhabitacion.setText("100000");
        jtvparqueadero.setText("0");
        jrbcasa.setChecked(true);
        jrbmenos3.setChecked(true);
        jcbparqueadero.setChecked(false);
        jtvtotal.setText("0");
        jtvtotal.requestFocus();
    }

    public void calcular_total(View view){

        int inmueble,habitaciones,parqueadero;
        float total;

        if (jrbcasa.isChecked()){
            jtvinmueble.setText("400000");
            inmueble = 400000;
        }else{
            if (jrbapto.isChecked()){
                jtvinmueble.setText("300000");
                inmueble = 300000;
            }else {
                jtvinmueble.setText("600000");
                inmueble = 600000;
            }
        }
        if (jrbmenos3.isChecked()){
            jtvhabitacion.setText("100000");
            habitaciones = 100000;
        }else {
            if (jrb3o4.isChecked()){
                jtvhabitacion.setText("200000");
                habitaciones = 200000;
            }else{
                jtvhabitacion.setText("300000");
                habitaciones = 300000;
            }
        }
        if (jcbparqueadero.isChecked()){
            jtvparqueadero.setText("100000");
            parqueadero = 100000;
        }else{
            jtvparqueadero.setText("0");
            parqueadero = 0;
        }
        total = inmueble + habitaciones + parqueadero;
        String valor = String.format("%.2f", total);
        jtvtotal.setText(valor);
    }
}