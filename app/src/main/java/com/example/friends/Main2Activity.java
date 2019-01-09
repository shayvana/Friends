
package com.example.friends;

/**
 * Created by sprovine on 11/3/2017.
 *
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import com.example.friends.R;

public class Main2Activity extends AppCompatActivity {
    private RatingBar ratingBar;
    private TextView txtRatingValue;
    private Button btnSubmit;
    private int id;

    @Override
    protected void onCreate(Bundle paramBundle) {

        super.onCreate(paramBundle);
        setContentView(R.layout.activity_main2);

        this.id = getIntent().getIntExtra("id", 0);
        ImageView view = (ImageView) findViewById(R.id.puppy_image_big);
        String[] localObject = getResources().getStringArray(R.array.puppy_details);
        TextView localTextView = (TextView) findViewById(R.id.puppy_detail_text);
        if (this.id == R.id.boy1button) {
            view.setImageResource(R.drawable.matthewgombarbig);
            localTextView.setText(localObject[0]);
        }
        if (this.id == R.id.boy2button) {
            view.setImageResource(R.drawable.rustombig);
            localTextView.setText(localObject[1]);
        }
        if (this.id == R.id.boy3button) {
            view.setImageResource(R.drawable.justinkangbig);
            localTextView.setText(localObject[2]);
        }
        if (this.id == R.id.boy4button) {
            view.setImageResource(R.drawable.matthewstevensbig);
            localTextView.setText(localObject[3]);
        }

    }

}
