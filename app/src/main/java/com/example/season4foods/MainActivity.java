package com.example.season4foods;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.TextView;
import android.app.ListActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    CalendarView CalendarioView;
    TextView TxtMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_alimentos);
        CalendarioView = (CalendarView) findViewById(R.id.CalendarioView);
        TxtMain = (TextView) findViewById(R.id.TxtMain);
        CalendarioView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                //Mes = (i1 +1)
                //Dia = i2
                //Ano = i

                String date = i2 + "/" + i1 + "/" + i;

                switch (i1) {
                    case 1:
                        TxtMain.setText(date);
                        TxtMain.setText("JANUARIO");

                        break;
                    case 2:
                        TxtMain.setText(date);
                        TxtMain.setText("FEVEREIRO");

                        break;
                    case 3:
                        TxtMain.setText(date);
                        TxtMain.setText("MARÇO");
                        break;
                    case 4:
                        TxtMain.setText(date);
                        TxtMain.setText("ABRIL");
                        break;
                    case 5:
                        TxtMain.setText(date);
                        TxtMain.setText("MAIO");
                        break;
                    case 6:
                        TxtMain.setText(date);
                        TxtMain.setText("JUNHO");
                        break;
                    case 7:
                        TxtMain.setText(date);
                        TxtMain.setText("AGOSTO");
                        break;
                    case 8:
                        TxtMain.setText(date);
                        TxtMain.setText("SETEMBRO");
                        break;
                    case 9:
                        TxtMain.setText(date);
                        TxtMain.setText("OUTUBRO");
                        break;
                    case 10:
                        TxtMain.setText(date);
                        TxtMain.setText("NOVEMBRO");
                        break;
                    case 11:
                        TxtMain.setText(date);
                        TxtMain.setText("DEZEMBRO");
                        break;
                    case 12:
                        TxtMain.setText(date);
                        TxtMain.setText("JANUARIO");
                        break;

                    default:


                }


            }
        });

        listView = (ListView) findViewById(R.id.list_alimentos);

        String[] values = new String[] { "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);

         listView.setAdapter(adapter);

        listView.setOnItemClickListener((new OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               int itemPosition = position;

               String itemvalue = (String) listView.getItemAtPosition(position);

               Toast.makeText(getApplicationContext(), itemvalue,  Toast.LENGTH_LONG).show();

          }
         }));


    }
}
