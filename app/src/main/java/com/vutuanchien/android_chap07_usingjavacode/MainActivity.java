package com.vutuanchien.android_chap07_usingjavacode;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        set the title bar text for this app
        this.setTitle("First Android Application");
//        define and create a relative layout contains a button and a textview
        LinearLayout activity_main;
        activity_main = new LinearLayout(this);
        activity_main.setOrientation(LinearLayout.VERTICAL);

//        define a textview contains content of what we show,
//        and then set some properties for this
        TextView tvContent;
        tvContent = new TextView(this);
        tvContent.setText("I am using JavaCode to design User Interface");
        tvContent.setGravity(Gravity.CENTER);
        tvContent.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);
        tvContent.setTextSize(25);
        tvContent.setTextColor(Color.BLUE);

//        define a button in order to use onclick event,
//        and then set some properties for this
        Button btnExcute;
        btnExcute = new Button(this);
        btnExcute.setText("Click me !");
        btnExcute.setBackgroundColor(Color.YELLOW);
//        add textview and button into activity_main
        activity_main.addView(tvContent);
        activity_main.addView(btnExcute);

//        define the LayoutParams for the TextView
//        Width and height are 2 properties that have to have in our code
        android.widget.LinearLayout.LayoutParams tvLayoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
//        set the LayoutParams
        tvContent.setLayoutParams(tvLayoutParams);
//        define the LayoutParams for the Button
//        Width and height are 2 properties that have to have in our code
        android.widget.LinearLayout.LayoutParams btnLayoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
//        set the LayoutParams
        btnExcute.setLayoutParams(btnLayoutParams);

        activity_main.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        this.setContentView(activity_main);
    }
}
