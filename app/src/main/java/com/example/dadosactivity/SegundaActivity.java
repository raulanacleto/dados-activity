package com.example.dadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class SegundaActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = findViewById(R.id.textoId);

        Bundle extra = getIntent().getExtras();

        if(extra != null){
            String textoPassado = extra.getString("nome");
            texto.setText(textoPassado);
        }

    }
}
