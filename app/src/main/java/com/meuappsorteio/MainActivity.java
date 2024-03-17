package com.meuappsorteio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoSorteio;
    private TextView resultadoSorteio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        botaoSorteio = findViewById(R.id.botao);
        resultadoSorteio =  findViewById(R.id.resultado);

        botaoSorteio.setOnClickListener(new View.OnClickListener()  {
            private int bound;

            @Override
            public void onClick(View view) {


                int numero = new Random().nextInt(11);


                resultadoSorteio.setText("Numero:" + numero);


            }
        });



    }
}