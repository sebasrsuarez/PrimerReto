package co.com.example.primerreto;

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

    public void goToPresentacionEquipo(View view) {
        Intent intent = new Intent(getApplicationContext(),PresentacionEquipo.class);
        startActivity(intent);
    }

    public void goToFormulario(View view) {
        Intent intent = new Intent(getApplicationContext(),Formulario.class);
        startActivity(intent);

    }

    public void goToCalcularEdad(View view) {
        Intent intent = new Intent(getApplicationContext(),CalcularEdad.class);
        startActivity(intent);

    }
}