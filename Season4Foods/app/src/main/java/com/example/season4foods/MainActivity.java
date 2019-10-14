package com.example.season4foods;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CalendarView;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Omes = "0";
        CalendarioView = (CalendarView) findViewById(R.id.CalendarioView);
        TxtMain = (TextView) findViewById(R.id.TxtMain);
        listView = (ListView) findViewById(R.id.lista_alimentos);

            //DEFINE VALOR LIST VIEW
            listView  = (ListView) findViewById(R.id.lista_alimentos);
            CalendarioView = (CalendarView)findViewById(R.id.CalendarioView);
        CalendarioView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
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
                                        "ABACAXI",
                                        "LARANJA"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 3:
                        TxtMain.setText(date);
                        TxtMain.setText("MARÇO");

                        Omes = new String[]
                                {
                                        "ABOBORA",
                                        "MAÇA"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 4:
                        TxtMain.setText(date);
                        TxtMain.setText("ABRIL");
                        Omes = new String[]
                                {
                                        "MORANGO",
                                        "LARANJINHA"
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
                                        "ABACAXI",
                                        "LARANJA"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 10:
                        TxtMain.setText(date);
                        TxtMain.setText("OUTUBRO");
                        Omes = new String[]
                                {
                                        "ABACAXI",
                                        "CEBOLINHA"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 11:
                        TxtMain.setText(date);
                        TxtMain.setText("NOVEMBRO");
                        Omes = new String[]
                                {
                                        "maracujá",
                                        "LARANJA"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;
                    case 12:
                        TxtMain.setText(date);
                        TxtMain.setText("DEZEMBRO");

                        Omes = new String[]
                                {
                                        "PAPAI NO EL",
                                        "LARANJA"
                                };

                        adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, Omes);

                        listView.setAdapter(adapter);
                        break;

                    default:

                }
            }
        });


            String[] Omes = new String[]
                    {
                            "INGREDIENTES"
                    };

            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, Omes);

            listView.setAdapter(adapter);


            listView.setOnItemClickListener((new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    int itemPosition = position;

                    String itemvalue = (String) listView.getItemAtPosition(position);

                    Toast.makeText(getApplicationContext(), itemvalue, Toast.LENGTH_LONG).show();

                }
            }));
        }
    }




