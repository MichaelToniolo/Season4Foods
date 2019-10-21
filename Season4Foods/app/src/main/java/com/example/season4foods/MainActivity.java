package com.example.season4foods;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.app.ListActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    CalendarView CalendarioView;
    TextView TxtMain;
    ListView listView;
    String Omes;
    LinearLayout LinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Omes = "0";
        CalendarioView = (CalendarView) findViewById(R.id.CalendarioView);
        TxtMain = (TextView) findViewById(R.id.TxtMain);
        listView = (ListView) findViewById(R.id.lista_alimentos);
        LinearLayout = (LinearLayout) findViewById(R.id.menu_principal);

            //DEFINE VALOR LIST VIEW
            listView  = (ListView) findViewById(R.id.lista_alimentos);
            CalendarioView = (CalendarView)findViewById(R.id.CalendarioView);

        CalendarioView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

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
                                        "INGREDIENTES",
                                        "TOMATE",
                                        "CEBOLA"
                                };

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
                                        "Pera",
                                        "Pêssego",
                                        "Hortelã",
                                        "Repolho",
                                        "Abóbora",
                                        "Milho Verde",
                                        "Tomate"
                                };

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

                        LinearLayout.setBackgroundResource(R.drawable.outono_bg);

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

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 5:
                        TxtMain.setText(date);
                        TxtMain.setText("MAIO");
                        Omes = new String[]
                                {
                                        "ARROZ",
                                        "FEIJÃO"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 6:
                        TxtMain.setText(date);
                        TxtMain.setText("JUNHO");
                        Omes = new String[]
                                {
                                        "MANGA",
                                        "LARANJA"
                                };

                        LinearLayout.setBackgroundResource(R.drawable.inverno_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 7:
                        TxtMain.setText(date);
                        TxtMain.setText("JULHO");
                        Omes = new String[]
                                {
                                        "LIMÃO",
                                        "AZEITONA"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 8:
                        TxtMain.setText(date);
                        TxtMain.setText("AGOSTO");
                        Omes = new String[]
                                {
                                        "ACEROLA",
                                        "MANDIOCA"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 9:
                        TxtMain.setText(date);
                        TxtMain.setText("SETEMBRO");
                        Omes = new String[]
                                {
                                        "Caju",
                                        "Jabuticaba",
                                        "Mamão Havaí",
                                        "Cará",
                                        "Agrião",
                                        "Almeirão",
                                        "Palmito",
                                        "Maracujá",
                                        "Tangerina",

                                };

                        LinearLayout.setBackgroundResource(R.drawable.primavera_bg);

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
                                        "Noses",
                                        "Chuchu"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 11:
                        TxtMain.setText(date);
                        TxtMain.setText("NOVEMBRO");
                        Omes = new String[]
                                {
                                        "Alcachofras",
                                        "Couve-Flor",
                                        "Abacaxi Pérola",
                                        "Amendoas",
                                        "Amora",
                                        "Castanha Nacional",
                                        "Jaca",
                                        "Melão",
                                        "Berinjela",
                                        "Maxixe"

                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 12:
                        TxtMain.setText(date);
                        TxtMain.setText("DEZEMBRO");

                        Omes = new String[]
                                {
                                        "Abacaxi",
                                        "Amêndoa",
                                        "Laranja",
                                        "Cenoura",
                                        "Berinjela Japonesa",
                                        "Palmito",
                                        "Pernil",
                                        "Salmão",
                                        "Bacalhau",
                                        "Tender"
                                };

                        LinearLayout.setBackgroundResource(R.drawable.verao_bg);

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;

                    default:

                }


            }
        });


            String[] Omes = new String[]
                    {

                    };

            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, Omes);

            listView.setAdapter(adapter);


            listView.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent it = new Intent(MainActivity.this, ActivityReceitas.class);
                        startActivity(it);

                }
            });



        }
    }




