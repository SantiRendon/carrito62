package com.example.prestamo62;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
 String user="srendon@misena.edu.co";
 String contra="123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView usuario;
        TextView contrasena;
        Button validar;
        Button registrar;

        usuario=(TextView) findViewById(R.id.tUsuario);
        contrasena=(TextView)  findViewById(R.id.tContrasena);
        validar=(Button) findViewById(R.id.bValidar);
        registrar=(Button) findViewById(R.id.bRegistrarse);


        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iregistro=new Intent(Login.this,Registro.class);

                startActivity(iregistro);

            }
        });


        validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usuario.getText().toString().equals(user) && contrasena.getText().toString().equals(contra)){
                    Toast.makeText(Login.this, "Bienvenido", Toast.LENGTH_LONG).show();
                    Intent sme = new Intent(Login.this, Menus.class);
                    startActivity(sme);
                }else{
                    Toast.makeText(Login.this, "usuario y contraseña no validos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}