package com.example.ejemplo1.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ejemplo1.R;
import com.example.ejemplo1.entidades.AppDataBase;
import com.example.ejemplo1.entidades.Usuario;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sharedPref;
    private TextView tvDatos;
    private EditText etIntCorreo;
    private EditText etIntContraseña;
    private Activity miActivity;




//    EditText TXT_USR, TXT_PASS;

//    Button BTN_ING;

    private TextView texto;
    @Nullable
    private Bundle savedInstanceState;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sharedPref = getSharedPreferences("login", Context.MODE_PRIVATE);

        final Button btnEntrar = findViewById(R.id.btEntrar);
        tvDatos = findViewById(R.id.tvDatos);
        etIntCorreo = findViewById(R.id.etIntCorreoMain);
        etIntContraseña = findViewById(R.id.etintContraseñaMain);

        String em = sharedPref.getString("email", "");
        String pw = sharedPref.getString("contrasenha", "");

        tvDatos.setText("Email: " +   em + "/n"  + "Contrasenha:" + pw);


        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(sharedPref.getString("email", "").equals(etIntCorreo.getText().toString()) &&
                        sharedPref.getString("contrasenha", "").equals(etIntContraseña.getText().toString())) {

                    Intent intent = new Intent(v.getContext(), ListaPeliculasActivity.class);

                    startActivity(intent);

                }else{

                    AlertDialog.Builder builder = new AlertDialog.Builder(miActivity);
                    builder.setMessage(R.string.DialogUsarioContraseñaMalIntroducidos);
                    builder.setPositiveButton(R.string.validar, null);
                    builder.show();


                }



            }
        });








            }



    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MainActivity", "Estoy en el onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MainActivity", "Estoy en el onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MainActivity", "Estoy en el onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MainActivity", "Estoy en el onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("MainActivity", "Estoy en el onDestroy");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Log.d("MainActivity", "Se ha pulsado el boton hacia atras"); //esto hace que aparezca el msg en el logcat

        Toast toast = Toast.makeText(this, "Adios", Toast.LENGTH_SHORT); //aparece el mensaje cuando realizas la accion
        toast.show(); //esto es para mostrar el mensaje
    }




    public void cambiarActivityRegistro(View v){
        Intent intent = new Intent (this, RegistroActivity.class);
        startActivity(intent);
    }

    public void cambiarActivityMain(View v){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void cambiarActivityLista(View v){
        Intent intent = new Intent(this, ListaPeliculasActivity.class);
        startActivity(intent);
    }

    public void mostrarContrasenha(View v){
      EditText view =  findViewById(R.id.etintContraseñaMain);
      view.setInputType(InputType.TYPE_TEXT_VARIATION_NORMAL);
    }








//    public void cambiarMensaje(View v) {
//        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
//        Date fechaActual = Calendar.getInstance().getTime();
//
//
//        String s = formato.format(fechaActual);
//          texto.setText(String.format("Hora de inicio de sesión: %s", s));
//
//
//
//
//    }





//
//
//    public void loginlol (View v) {
//
//
//        String url = "https://euw.leagueoflegends.com/es/";
//
//        Intent i = new Intent(Intent.ACTION_VIEW);
//        i.setData(Uri.parse(url));
//        startActivity(i);
//    }
//
//    public void crearcuenta (View v){
//
//        String url = "https://signup.euw.leagueoflegends.com/es/signup/index#/";
//
//        Intent i = new Intent(Intent.ACTION_VIEW);
//        i.setData(Uri.parse(url));
//        startActivity(i);
//    }
//






//        public boolean onTouchEvent (View v, MotionEvent event){
//            EditText password = (EditText) findViewById(R.id.etintContraseña);
//            switch (event.getAction()) {
//               case MotionEvent.ACTION_DOWN:
//                    password.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT);
//                    break;
//                case MotionEvent.ACTION_BUTTON_PRESS:
//                    password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
//                    break;
//            }
//            return super.onTouchEvent(event);
//        }
//   }




}
