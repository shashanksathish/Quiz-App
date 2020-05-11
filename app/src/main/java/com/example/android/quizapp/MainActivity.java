package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcScore(View view) throws InterruptedException {
        RadioButton answer1 = (RadioButton) findViewById(R.id.question_1_a1);
        RadioButton answer2 = (RadioButton) findViewById(R.id.question_2_a1);
        RadioButton answer3 = (RadioButton) findViewById(R.id.question_3_a2);
        RadioButton answer4 = (RadioButton) findViewById(R.id.question_4_a2);
        RadioButton answer5 = (RadioButton) findViewById(R.id.question_5_a1);
        RadioButton answer6 = (RadioButton) findViewById(R.id.question_6_a2);
        CheckBox answer7_a = (CheckBox) findViewById(R.id.trivia_a1);
        CheckBox answer7_c = (CheckBox) findViewById(R.id.trivia_a3);
        CheckBox answer7_b = (CheckBox) findViewById(R.id.trivia_a2);
        boolean ans1 = answer1.isChecked();
        boolean ans2 = answer2.isChecked();
        boolean ans3 = answer3.isChecked();
        boolean ans4 = answer4.isChecked();
        boolean ans5 = answer5.isChecked();
        boolean ans6 = answer6.isChecked();
        boolean ansTa = answer7_a.isChecked();
        boolean ansTc = answer7_c.isChecked();
        if (ans1)
            score+=5;
        if (ans2)
            score+=5;
        if (ans3)
            score+=5;
        if (ans4)
            score+=5;
        if (ans5)
            score+=5;
        if (ans6)
            score+=5;
        if (ansTa == true && ansTc == true)
            score+=20;

        CharSequence finalScore = "You scored " + score;
        Toast.makeText(getApplicationContext(),finalScore,Toast.LENGTH_LONG).show();
        score=0;

        RadioGroup ques1 = (RadioGroup) findViewById(R.id.question1);
        RadioGroup ques2 = (RadioGroup) findViewById(R.id.question2);
        RadioGroup ques3 = (RadioGroup) findViewById(R.id.question3);
        RadioGroup ques4 = (RadioGroup) findViewById(R.id.question4);
        RadioGroup ques5 = (RadioGroup) findViewById(R.id.question5);
        RadioGroup ques6 = (RadioGroup) findViewById(R.id.question6);

        ques1.clearCheck();
        ques2.clearCheck();
        ques3.clearCheck();
        ques4.clearCheck();
        ques5.clearCheck();
        ques6.clearCheck();
        answer7_a.setChecked(false);
        answer7_b.setChecked(false);
        answer7_c.setChecked(false);
    }
}
