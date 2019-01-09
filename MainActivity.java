package com.example.npandya.gridlayoutdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.activity_main);
    }

    public void onClickPuppy(View view)
    {
        Intent localIntent = new Intent(this, SecondActivity.class);
        localIntent.putExtra("id", view.getId());
        startActivity(localIntent);
    }


}