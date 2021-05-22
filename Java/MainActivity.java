package com.....

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Developed by hammerinformation
    Button a, b, c;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.button_a);
        b = findViewById(R.id.button_b);
        c = findViewById(R.id.button_c);
        question = findViewById(R.id.text_view_question);
        newQuestion();

    }

    private void newQuestion() {
        System.out.println("Method called");
        int first = Questions.getInstance().randomNumber(10, 1);
        int second = Questions.getInstance().randomNumber(10, 1);
        int _a = Questions.getInstance().randomNumber(100, 1);
        int _b = Questions.getInstance().randomNumber(100, 1);
        int _c = Questions.getInstance().randomNumber(100, 1);


       final int result = first * second;
       String _question = first + "x"+second;
        question.setText(_question);
        int randomNumber = Questions.getInstance().randomNumber(3, 1);
        if (randomNumber == 1) {
            _a = result;
        }
        if (randomNumber == 2) {
            _b = result;
        }
        if (randomNumber == 3) {
            _c = result;
        }

        a.setText(String.valueOf(_a));
        b.setText(String.valueOf(_b));
        c.setText(String.valueOf(_c));

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a.getText().toString() == String.valueOf(result)) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("True");
                   // alert.show();
                    newQuestion();
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b.getText().toString() == String.valueOf(result)) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("True");
                    //alert.show();
                    newQuestion();

                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c.getText().toString() == String.valueOf(result)) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("True");
                    //alert.show();
                    newQuestion();

                }
            }
        });
    }
}