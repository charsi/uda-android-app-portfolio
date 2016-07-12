package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void btn1Msg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will launch the Popular Movies app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void btn2Msg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will launch the Stock Hawk app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void btn3Msg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will launch the Build it Bigger app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void btn4Msg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will launch the Make Your App Material app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void btn5Msg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will launch the Go Ubiquitous app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void btn6Msg(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This will launch the Capstone app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}



