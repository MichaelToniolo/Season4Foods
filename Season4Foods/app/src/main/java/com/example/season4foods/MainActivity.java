package com.example.season4foods;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity {


    CalendarView CalendarioView;
    TextView TxtMain;
    ListView listView;
    String Omes;
    LinearLayout LinearLayout;
    Button AboutButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Omes = "0";
        CalendarioView = (CalendarView) findViewById(R.id.CalendarioView);
        TxtMain = (TextView) findViewById(R.id.TxtMain);
        listView = (ListView) findViewById(R.id.lista_alimentos);
        LinearLayout = (LinearLayout) findViewById(R.id.menu_principal);
        AboutButton = (Button) findViewById(R.id.AboutButton);



        CalendarioView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)

            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {

                //Mes = (i1 +1)
                //Dia = i2
                //Ano = i

                String date = i2 + "/" + (i1 + 1) + "/" + i;


                switch (i1 + 1) {
                    case 1:

                        TxtMain.setText(date);
                        TxtMain.setText("JANEIRO");
                        String[] Omes = new String[]
                                {
                                        "Abobrinha",
                                        "Alface",
                                        "Couve",
                                        "Cupuaçu",
                                        "Goiaba",
                                        "Limão",
                                        "Maracujá",
                                        "Quiabo",
                                        "Tomate",
                                        "Pimentão"

                                };
                        LinearLayout.setBackgroundResource(R.drawable.summer_bg);

                        ArrayAdapter adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);


                        break;
                    case 2:
                        TxtMain.setText(date);
                        TxtMain.setText("FEVEREIRO");
                        Omes = new String[]
                                {
                                        "Abacate",
                                        "Coco Verde",
                                        "Maçã",
                                        "Pêra",
                                        "Pêssego",
                                        "Hortelã",
                                        "Repolho",
                                        "Abóbora",
                                        "Milho Verde",
                                        "Tomate"
                                };
                        LinearLayout.setBackgroundResource(R.drawable.summer_bg);
                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 3:
                        TxtMain.setText(date);
                        TxtMain.setText("MARÇO");

                        Omes = new String[]
                                {
                                        "Abacaxi",
                                        "Alho Poró",
                                        "Ameixa",
                                        "Berinjela",
                                        "Cará",
                                        "Endívias",
                                        "Goiaba",
                                        "Limão",
                                        "Rúcula",
                                        "Tangerina",

                                };

                        LinearLayout.setBackgroundResource(R.drawable.autumn_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 4:
                        TxtMain.setText(date);
                        TxtMain.setText("ABRIL");
                        Omes = new String[]
                                {
                                        "Abobrinha",
                                        "Alface",
                                        "Banana-Maçã",
                                        "Beterraba",
                                        "Chuchu",
                                        "Inhame",
                                        "Kiwi",
                                        "Mamão",
                                        "Nabo",
                                        "Uva"
                                };
                        LinearLayout.setBackgroundResource(R.drawable.autumn_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 5:
                        TxtMain.setText(date);
                        TxtMain.setText("MAIO");
                        Omes = new String[]
                                {
                                        "Batata Doce Amarela",
                                        "Mandioca",
                                        "Espinafre",
                                        "Morango",
                                        "Ovos Brancos",
                                        "Mandioquinha",
                                        "Abóbora Moranga",
                                        "Chicória",
                                        "Canjica"


                                };

                        LinearLayout.setBackgroundResource(R.drawable.autumn_bg);
                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);

                        break;
                    case 6:
                        TxtMain.setText(date);
                        TxtMain.setText("JUNHO");

                        Omes = new String[]
                                {
                                        "Abacate",
                                        "Batata Doce",
                                        "Caqui",
                                        "Chuchu",
                                        "Inhame",
                                        "Kiwi",
                                        "Maracuja",
                                        "Nabo",
                                        "Pinhão",
                                        "Tangerina"

                                };

                        LinearLayout.setBackgroundResource(R.drawable.winter_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 7:
                        TxtMain.setText(date);
                        TxtMain.setText("JULHO");
                        Omes = new String[]
                                {
                                        "Cenoura",
                                        "Espinafre",
                                        "Goiaba",
                                        "Mandioca",
                                        "Milho Verde",
                                        "Pepino",
                                        "Pimentão",
                                        "Quiabo",
                                        "Rabanete"


                                };
                        LinearLayout.setBackgroundResource(R.drawable.winter_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;

                    case 8:
                        TxtMain.setText(date);
                        TxtMain.setText("AGOSTO");
                        Omes = new String[]
                                {
                                        "Abóbora",
                                        "Alface",
                                        "Alho",
                                        "Banana",
                                        "Beterraba",
                                        "Escarola",
                                        "Morango",
                                        "Tomate"


                                };

                        LinearLayout.setBackgroundResource(R.drawable.winter_bg);
                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 9:
                        TxtMain.setText(date);
                        TxtMain.setText("SETEMBRO");
                        Omes = new String[]
                                {
                                        "Agrião",
                                        "Almeirão",
                                        "Caju",
                                        "Cará",
                                        "Jabuticaba",
                                        "Mamão Havaí",
                                        "Maracujá",
                                        "Palmito",
                                        "Tangerina"


                                };

                        LinearLayout.setBackgroundResource(R.drawable.winter_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 10:
                        TxtMain.setText(date);
                        TxtMain.setText("OUTUBRO");
                        Omes = new String[]
                                {
                                        "Banana Prata",
                                        "Manga",
                                        "Beterraba",
                                        "Pepino Japonês",
                                        "Tomate",
                                        "Brócolis",
                                        "Cenoura",
                                        "Acerola",
                                        "Nozes",
                                        "Chuchu"
                                };
                        LinearLayout.setBackgroundResource(R.drawable.spring_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);


                        break;
                    case 11:

                        TxtMain.setText(date);
                        TxtMain.setText("NOVEMBRO");
                        Omes = new String[]
                                {
                                        "Abacaxi Pérola",
                                        "Alcachofras",
                                        "Amêndoas",
                                        "Amora",
                                        "Berinjela",
                                        "Castanha Nacional",
                                        "Couve-Flor",
                                        "Jaca",
                                        "Maxixe",
                                        "Melão"


                                };
                        LinearLayout.setBackgroundResource(R.drawable.spring_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);

                        break;
                    case 12:
                        TxtMain.setText(date);
                        TxtMain.setText("DEZEMBRO");

                        Omes = new String[]
                                {
                                        "Abacaxi",
                                        "Amêndoas",
                                        "Berinjela Japonesa",
                                        "Cenoura",
                                        "Laranja",
                                        "Palmito"

                                };

                        LinearLayout.setBackgroundResource(R.drawable.summer_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                       ;
                        break;

                    default:

                }


            }
        });


            final String[] Omes = new String[]
                    {

                    };

            final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, Omes);

            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                        int itemPosicao = position;
                        listView.getItemAtPosition(position);
                        String itemValor = (String)
                        listView.getItemAtPosition(position);


                        //Toast.makeText(getApplicationContext(), itemValor,Toast.LENGTH_LONG).show();
                        Intent it = new Intent(MainActivity.this, ActivityReceitas.class);
                        it.putExtra("posit", position);
                        it.putExtra("ingre",itemValor);
                        startActivity(it);

                }
            });

            AboutButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(MainActivity.this, ActivityCreditos.class);
                    startActivity(it);

                }
            });



        }
}




