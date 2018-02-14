package com.example.user.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Button btn;
    private static RatingBar rb;
    private static TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listnerOnRatingBar();
        onButtonListner();
    }
    public  void listnerOnRatingBar(){
        tv = (TextView)findViewById(R.id.textView);
        rb = (RatingBar)findViewById(R.id.ratingBar);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv.setText(String.valueOf(rating));
            }
        });
    }
    public void onButtonListner(){
        btn = (Button)findViewById(R.id.button);
        rb = (RatingBar)findViewById(R.id.ratingBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,String.valueOf(rb.getRating()),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
