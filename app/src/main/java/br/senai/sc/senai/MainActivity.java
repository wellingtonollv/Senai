package br.senai.sc.senai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextTexto2= findViewById(R.id.et_texto2);
        final EditText    editTextTexto = findViewById(R.id.et_texto);
        Button btnMostrar= findViewById(R.id.btn_mostrar);
        Button btnLimpar =findViewById(R.id.btn_limpar);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, editTextTexto.getText().toString() + editTextTexto2.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextTexto.getText().clear();
                editTextTexto2.getText().clear();

            }
        });
    }
}