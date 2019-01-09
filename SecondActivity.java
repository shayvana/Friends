package com.example.npandya.gridlayoutdemo;

/**
 * Created by npandya on 11/3/2017.
 *
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private int id;

    @Override
    protected void onCreate(Bundle paramBundle) {

        super.onCreate(paramBundle);
        setContentView(R.layout.activity_second);

        this.id = getIntent().getIntExtra("id", 0);
        ImageView view = (ImageView) findViewById(R.id.puppy_image_big);
        String[] localObject = getResources().getStringArray(R.array.puppy_details);
        TextView localTextView = (TextView) findViewById(R.id.puppy_detail_text);
        if (this.id == R.id.puppy1button) {
            view.setImageResource(R.drawable.puppy1_big);
            localTextView.setText(localObject[0]);
        }
        if (this.id == R.id.puppy2button) {
            view.setImageResource(R.drawable.puppy2_big);
            localTextView.setText(localObject[1]);
        }
    }
}
