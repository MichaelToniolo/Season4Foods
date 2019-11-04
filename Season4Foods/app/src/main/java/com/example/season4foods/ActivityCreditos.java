package com.example.season4foods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityCreditos extends AppCompatActivity {

    Button volta_principal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);


        volta_principal = (Button) findViewById(R.id.btn_volte_principal);

        volta_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(ActivityCreditos.this, MainActivity.class);
                startActivity(it);

            }
        });

    }
}
