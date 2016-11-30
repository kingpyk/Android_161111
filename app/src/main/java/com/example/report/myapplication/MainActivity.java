package com.example.report.myapplication;

import android.graphics.Color;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    RatingBar RB1;
    RadioButton rbtn1,rbtn2;
    CalendarView CV1;
    CheckBox CB1;
    LinearLayout L1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        RB1 = (RatingBar) findViewById(R.id.ratingBar);
        rbtn1 = (RadioButton)findViewById(R.id.radioButton);
        rbtn2 = (RadioButton)findViewById(R.id.radioButton2);
        CV1 = (CalendarView)findViewById(R.id.calendarView);
        CB1 = (CheckBox)findViewById(R.id.checkBox2);
        L1 = (LinearLayout)findViewById(R.id.LL) ;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hello world~!",Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"제 이름은 201344036 최우형입니다",Toast.LENGTH_SHORT).show();
            }
        });
        rbtn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(getApplicationContext(),"여자입니다",Toast.LENGTH_SHORT).show();
            }
        });
        rbtn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(getApplicationContext(),"남자입니다",Toast.LENGTH_SHORT).show();
            }
        });
        RB1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getApplicationContext(),RB1.getRating()+"점을 주셨습니다.",Toast.LENGTH_SHORT).show();
            }
        });
        CB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                L1.setBackgroundColor(Color.BLUE);
                else
                    L1.setBackgroundColor(Color.WHITE);

            }
        });
        CV1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView cal_view, int year, int month, int dayOfMonth){
                Toast.makeText(getApplicationContext(),""+ year + "/" + (month+1) +"/" + dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
