package co.com.example.primerreto;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Formulario extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextTelefono = findViewById(R.id.editTextTelefono);

    }

    public void pulsarBoton(View view) {
        String nombre = editTextNombre.getText().toString();
        String apellido = editTextApellido.getText().toString();
        String telefono = editTextTelefono.getText().toString();

        if("".equals(nombre)){
            editTextNombre.setError(getString(R.string.obligatorio));
        }else if("".equals(apellido)){
            editTextApellido.setError(getString(R.string.obligatorio));
        }else if("".equals(telefono)) {
            editTextTelefono.setError(getString(R.string.obligatorio));
        }else{

            Toast.makeText(getApplicationContext(),nombre+" "+apellido+","+telefono,Toast.LENGTH_LONG).show();

        }





    }
}