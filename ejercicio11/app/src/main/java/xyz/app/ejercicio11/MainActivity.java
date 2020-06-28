package xyz.app.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo boton nombre
    public void Nombre(View view){
        Intent nombre = new Intent(this,NombreActivity.class);
        startActivity(nombre);

    }

}