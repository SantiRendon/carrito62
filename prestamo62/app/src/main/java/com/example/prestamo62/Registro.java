package com.example.prestamo62;

import static android.widget.Toast.LENGTH_LONG;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        // Falta conectar botones de activity_registro.xml

        TextView idUser;
        TextView nombreUser;
        TextView correoUser;
        TextView contraUser;
        Button cancelar;
        Button registrar;

        idUser=(TextView) findViewById(R.id.idUsuario);
        nombreUser=(TextView)  findViewById(R.id.nomUsuario);
        correoUser=(TextView) findViewById(R.id.correoUsuario);
        contraUser=(TextView)  findViewById(R.id.contraUsuario);

        cancelar=(Button) findViewById(R.id.bCancelar);
        registrar=(Button) findViewById(R.id.bValidarRegis);

        // Accion de boton Cancelar
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent irlogin=new Intent(Registro.this,Login.class);

                startActivity(irlogin);

            }
        });

        //Accion del boton validar
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (idUser.getText().toString().isEmpty() || nombreUser.getText().toString().isEmpty() ||
                        correoUser.getText().toString().isEmpty() || contraUser.getText().toString().isEmpty()){
                    Toast.makeText(Registro.this,"Por favor, no deje campos vacios", LENGTH_LONG).show();// mensaje "Por favor, no deje campos vacios"
                }else{
                    Intent irlogin=new Intent(Registro.this,Login.class);
                    startActivity(irlogin);
                }


            }
        });

    }
}