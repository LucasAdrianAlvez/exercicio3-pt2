package com.example.nova;

import static com.example.nova.MainActivity.MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class escribirMensaje extends AppCompatActivity {
    private Button bt2;
    private EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribir_mensaje);

        bt2 = (Button) findViewById(R.id.bt2);
        e2 = (EditText) findViewById(R.id.e2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String mensaje = e2.getText().toString();
                intent.putExtra(MESSAGE, mensaje);
                setResult(RESULT_OK, intent);
                finish();

            }
        });
    }


}