package com.example.season4foods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityPreparo extends AppCompatActivity {

    TextView Preparo;
    TextView Ingredientes;
    ImageView Foto_alimento;
    LinearLayout GeralLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparo);

        Ingredientes = (TextView) findViewById(R.id.Ingredientes);
        Preparo = (TextView) findViewById(R.id.Preparo);
        Foto_alimento = (ImageView) findViewById(R.id.Foto_alimento);


        Bundle bundle = getIntent().getExtras();
        //assert bundle != null;
        String NomeAlimento = bundle.getString("Receita");
        Ingredientes.setText(NomeAlimento);


        //Carrega Receitas

        switch (NomeAlimento) {
            case "Abobrinha Gratinada":
                Ingredientes.setText(" - 2 e 1/4 xícaras de farinha de trigo \n - 1 xícara de açúcar cristal\n - 1/2 xícara de óleo vegetal\n - 1 colher de sopa de essência de baunilha\n - 1 colher de sopa de vinagre branco\n - 1 colher de café de bicarbonato de sódio\n - 1 colher de sopa de fermento em pó\n - 1 xícara de água na temperatura ambiente\n - 1/3 xícara de polpa de abacate bem maduro\n - caldo de 1/2 limão pequeno\n - 1 pitada de sal");
                Preparo.setText("Retire a polpa do abacate e amasse com um garfo adicionando o caldo do limão. Reserve. \nNão é necessário bater. (Faça este bolo a mão). Misture bem a farinha com o açúcar e o bicarbonato. Acrescente a água aos poucos alternando com o óleo. Adicione o vinagre e a baunilha. Depois acrescente o abacate preparado antes e misture delicadamente. Por último adicione o fermento misturando delicadamente sem bater. Unte uma forma, coloque a massa e leve para assar em forno pré-aquecido em temperatura media de 180C por 30 a 40 minutos ou até que esteja dourado.\n");

        }




         Preparo.setMovementMethod(new ScrollingMovementMethod());
        Ingredientes.setMovementMethod(new ScrollingMovementMethod());

    }
}
