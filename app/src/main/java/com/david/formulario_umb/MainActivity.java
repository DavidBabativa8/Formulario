package com.david.formulario_umb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Nombres, Apellidos, Cedula, Correo, Telefono;
    Button Guardar_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombres =(TextView)findViewById(R.id.textView2);
        Apellidos =(TextView)findViewById(R.id.textView3);
        Cedula =(TextView)findViewById(R.id.textView4);
        Correo =(TextView)findViewById(R.id.textView6);
        Telefono =(TextView)findViewById(R.id.textView7);
        Guardar_datos = (Button) findViewById(R.id.button);


        Guardar_datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {

                String name = Nombres.getText().toString();
                String ape = Apellidos.getText().toString();
                String ced = Cedula.getText().toString();
                String email = Correo.getText().toString();
                String tel = Telefono.getText().toString();

            }
        });
    }
}


