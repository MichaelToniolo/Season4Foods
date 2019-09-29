package com.example.season4foods;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    CalendarView CalendarioView;
    TextView TxtMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarioView = (CalendarView) findViewById(R.id.CalendarioView);
        TxtMain = (TextView) findViewById(R.id.TxtMain);
        CalendarioView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {

                //Mes = (i1 +1)
                //Dia = i2
                //Ano = i

                String date = i2 + "/" + i1 + "/" + i;

                switch (i1){
                    case 1 :
                        TxtMain.setText(date);
                        TxtMain.setText("JANUARIO");
                        break;
                    case 2 :
                        TxtMain.setText(date);
                        TxtMain.setText("FEVEREIRO");
                        break;
                    case 3 :
                        TxtMain.setText(date);
                        TxtMain.setText("MARÇO");
                        break;
                    case 4 :
                        TxtMain.setText(date);
                        TxtMain.setText("ABRIL");
                        break;
                    case 5 :
                        TxtMain.setText(date);
                        TxtMain.setText("MAIO");
                        break;
                    case 6 :
                        TxtMain.setText(date);
                        TxtMain.setText("JUNHO");
                        break;
                    case 7 :
                        TxtMain.setText(date);
                        TxtMain.setText("AGOSTO");
                        break;
                    case 8 :
                        TxtMain.setText(date);
                        TxtMain.setText("SETEMBRO");
                        break;
                    case 9 :
                        TxtMain.setText(date);
                        TxtMain.setText("OUTUBRO");
                        break;
                    case 10 :
                        TxtMain.setText(date);
                        TxtMain.setText("NOVEMBRO");
                        break;
                    case 11 :
                        TxtMain.setText(date);
                        TxtMain.setText("DEZEMBRO");
                        break;
                    case 12 :
                        TxtMain.setText(date);
                        TxtMain.setText("JANUARIO");
                        break;

                    default:


                }
            }
        });





    }
}
