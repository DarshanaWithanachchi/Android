package com.example.user.imageviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static ImageView imageview;
    private static Button change_image_button;

    private int current_image_index;
    int[] image = {R.drawable.android_logo1,R.drawable.android_robot2,R.drawable.android_logo_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickListner();
    }

    public void onButtonClickListner(){
        imageview = (ImageView)findViewById(R.id.imageView);
        change_image_button = (Button)findViewById(R.id.button);

        change_image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image_index++;
                current_image_index = current_image_index%image.length;
                imageview.setImageResource(image[current_image_index]);
            }
        });
    }
}
