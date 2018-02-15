package com.example.user.analoganddigitalclocks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;

public class MainActivity extends AppCompatActivity {
    private static Button button_sbm;
    private static AnalogClock analogClock;
    private static DigitalClock digitalClock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickListner();
    }

    public void onButtonClickListner(){
        button_sbm = (Button)findViewById(R.id.button);
        analogClock = (AnalogClock)findViewById(R.id.analogClock);
        digitalClock = (DigitalClock)findViewById(R.id.digitalClock);

        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (digitalClock.getVisibility() == DigitalClock.GONE){
                            digitalClock.setVisibility(DigitalClock.VISIBLE);
                            analogClock.setVisibility(AnalogClock.GONE);
                        }else{
                            digitalClock.setVisibility(DigitalClock.GONE);
                            analogClock.setVisibility(AnalogClock.VISIBLE);
                        }
                    }
                }
        );
    }
}
