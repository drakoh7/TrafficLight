package ru.alexandr.pc.traffic_light;

import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constrainLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);

        Button yellowButton = (Button) findViewById(R.id.buttonYellow);
        Button greenButton = (Button) findViewById(R.id.buttonGreen);
        Button redButton = (Button) findViewById(R.id.buttonRed);

        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
        redButton.setOnClickListener(this);

        /*yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.yellow);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));
            }
        });*/

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonGreen:
                mInfoTextView.setText(R.string.green);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.greenColor));
                break;
            case R.id.buttonYellow:
                mInfoTextView.setText(R.string.yellow + " " + this.getClass());
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));
                break;
            case R.id.buttonRed:
                mInfoTextView.setText(R.string.red);
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.redColor));
                break;
        }
    }

    /*public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.redColor));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }*/


}
