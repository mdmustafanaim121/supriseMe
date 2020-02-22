package com.mufti.supriseme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt,txt1;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Change from question to answer
        findViewById(R.id.suprise_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.suprise_answer).setVisibility(View.VISIBLE);
                findViewById(R.id.suprise_question).setVisibility(View.INVISIBLE);
            }
        });

        //Change from answer to question
        findViewById(R.id.suprise_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.suprise_answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.suprise_question).setVisibility(View.VISIBLE);
            }
        });
    }
}
