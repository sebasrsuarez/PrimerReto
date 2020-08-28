package co.com.example.primerreto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class CalcularEdad extends AppCompatActivity {
    TextView error_fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_edad);
        error_fecha =(TextView) findViewById(R.id.error_fecha);
    }

    public void goToAbrirCalendario(View view) {
        final int ano_actual, mes_actual, dia_actual;
        Calendar cal= Calendar.getInstance();
        ano_actual = cal.get(Calendar.YEAR);
        mes_actual= cal.get(Calendar.MONDAY);
        dia_actual= cal.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int ano_elegido, int mes_elegido, int dia_elegido) {
                calcular(ano_actual,mes_actual,ano_elegido,mes_elegido);
            }
        },ano_actual,mes_actual,dia_actual);
        dpd.show();

    }

    public void calcular (int ano_actual, int mes_actual, int ano_objetivo, int mes_objetivo){
        int year=0;
        int month=0;
        if (mes_objetivo<=mes_actual){
            year=ano_actual-ano_objetivo;
            month=mes_actual-mes_objetivo;
        }
        else{
            year=ano_actual-ano_objetivo-1;
            month=12-(mes_objetivo-mes_actual);
        }
        if(year>=0){
            Toast.makeText(getApplicationContext(),"Tienes "+year+" años "+month+" meses",Toast.LENGTH_LONG).show();
            error_fecha.setText(" ");
        }
        else{
            error_fecha.setText(R.string.error_calcular_edad);
        }
    }
}