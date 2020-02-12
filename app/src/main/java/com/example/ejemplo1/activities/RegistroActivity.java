package com.example.ejemplo1.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejemplo1.R;

import java.util.List;

public class RegistroActivity extends AppCompatActivity {
    private SharedPreferences sharedPref;
    private EditText etEmail;
    private EditText etPass;
    private EditText etRepPass;

    private Activity miActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        miActivity = this;

        sharedPref = getSharedPreferences("login", Context.MODE_PRIVATE);

        final Button btnGuardar = findViewById(R.id.btRegistro);
        etEmail = findViewById(R.id.etIntMailRegistro);
        etPass = findViewById(R.id.etIntPwdRegistro);
        etRepPass = findViewById(R.id.etIntRepPwdRegistro);

        String em = sharedPref.getString("email", "");
        String pw = sharedPref.getString("contrasenha", "");




        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String password = etPass.getText().toString();
                String RepPass = etRepPass.getText().toString();



                if (etPass.getText().toString().equals(etRepPass.getText().toString())){

                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("email" , email);
                    editor.putString("contrasenha", password);
                    editor.putString("RepetirContrasenha", RepPass);
                    editor.commit();

                    Intent intent = new Intent(v.getContext(), MainActivity.class);

                    startActivity(intent);


                }else{

                   AlertDialog.Builder builder = new AlertDialog.Builder(miActivity);
                   builder.setMessage(R.string.DialogContraseñaDiferente);
                   builder.setPositiveButton(R.string.validar, null);
                   builder.show();
//                    Toast toast1 =
//                            Toast.makeText(getApplicationContext(),
//                                    "Las contraseñas no coinciden", Toast.LENGTH_SHORT);
//
//                    toast1.show();
                }










            }
        });














/*        Button butRegistro = findViewById(R.id.btRegistro);
        butRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistroActivity.this, "Boton pulsado", Toast.LENGTH_SHORT).show();




            }
        });*/


    }

    public void cambiarActivityMain(View view) {
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
    }





}
