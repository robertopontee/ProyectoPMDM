package com.example.ejemplo1.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ejemplo1.R;
import com.example.ejemplo1.adapters.AdapterPeliculas;
import com.example.ejemplo1.entidades.Peliculas;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


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

//        TXT_USR = (EditText)findViewById(R.id.etIniciarSesion);


        RecyclerView rvPeliculas =findViewById(R.id.rvPeliculas);
        rvPeliculas.setLayoutManager(new LinearLayoutManager(this));
        rvPeliculas.setHasFixedSize(true);

        //Adapter

        //Hacemos la Lista de las Peliculas

        List<Peliculas> peliculas = crearPeliculas();

        //Creamos el objeto Adapter para la Lista de Peliculas

        AdapterPeliculas ListAdapter = new AdapterPeliculas(this, peliculas);

        rvPeliculas.setAdapter(ListAdapter);





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

        Toast toast = Toast.makeText(this, "Anda a tomar por el culo maricon", Toast.LENGTH_SHORT); //aparece el mensaje cuando realizas la accion
        toast.show(); //esto es para mostrar el mensaje
    }


    private List<Peliculas> crearPeliculas(){
        Peliculas p = new Peliculas();
        p.setTituloPelicula("El viaje de Chihiro");
        p.setGenero("Fantasía");
        p.setEdad(+6);
        p.setVisto(true);

        Peliculas p2 = new Peliculas();
        p2.setTituloPelicula("La Princesa Mononoke");
        p2.setGenero("Accion");
        p2.setEdad(+8);
        p2.setVisto(false);

        List<Peliculas> peliculasList = new ArrayList<>();

        peliculasList.add(p);
        peliculasList.add(p2);


        return peliculasList;
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
        Intent intent = new Intent(this, AdapterPeliculas.class);
        startActivity(intent);
    }

    public void mostrarContrasenha(View v){
      EditText view =  findViewById(R.id.etintContraseña);
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
    public void recuperarcontraseña (View v){

        String url = "https://recovery.riotgames.com/es/forgot-password?region=EUW1";

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);


    }


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
