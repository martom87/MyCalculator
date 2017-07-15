package com.example.sda.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    public EditText newNumber, result;
    float a, b;
    public Button numb0, numb1, numb2, numb3, numb4, numb5, numb6, numb7, numb8, numb9;
    public Button buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonDecimal, buttonEquals, buttonDelete;
    boolean addition, subtraction, multiplication, dividing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numb0 = (Button) findViewById(R.id.numb0);
        numb1 = (Button) findViewById(R.id.numb1);
        numb2 = (Button) findViewById(R.id.numb2);
        numb3 = (Button) findViewById(R.id.numb3);
        numb4 = (Button) findViewById(R.id.numb4);
        numb5 = (Button) findViewById(R.id.numb5);
        numb6 = (Button) findViewById(R.id.numb6);
        numb7 = (Button) findViewById(R.id.numb7);
        numb8 = (Button) findViewById(R.id.numb8);
        numb9 = (Button) findViewById(R.id.numb9);
        result = (EditText) findViewById(R.id.result);
        newNumber = (EditText) findViewById(R.id.newNumber);
        final Operations addNumbers = new Operations();
        final Operations subtractNumbers = new Operations();
        final Operations multiplyNumbers = new Operations();
        final Operations divideNumbers = new Operations();
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        numb0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "0");

            }
        });
        numb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "1");
            }
        });
        numb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "2");
            }
        });
        numb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "3");
            }
        });
        numb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "4");
            }
        });
        numb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "5");
            }
        });
        numb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "6");
            }
        });
        numb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "7");
            }
        });
        numb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "8");
            }
        });
        numb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText() + "9");
            }
        });


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (newNumber == null) {
                    newNumber.setText("");

                } else {
                    a = Float.parseFloat(newNumber.getText() + "");
                    addition = true;
                    newNumber.setText(null);
                }
            }
        });


        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Float.parseFloat(newNumber.getText() + "");
                subtraction = true;
                newNumber.setText(null);

            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Float.parseFloat(newNumber.getText() + "");
                multiplication = true;
                newNumber.setText(null);

            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a = Float.parseFloat(newNumber.getText() + "");
                dividing = true;
                newNumber.setText(null);

            }
        });


        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = Float.parseFloat(newNumber.getText() + "");

                if (addition == true) {
                    result.setText(Float.toString(addNumbers.add(a, b)));
                    addition = false;
                }
                if (subtraction == true) {
                    result.setText(Float.toString(subtractNumbers.subtract(a, b)));
                    subtraction = false;
                }
                if (multiplication == true) {
                    result.setText(Float.toString(multiplyNumbers.multiply(a, b)));
                    multiplication = false;
                }
                if (dividing == true) {
                    result.setText(Float.toString(divideNumbers.divide(a, b)));
                    dividing = false;
                }


            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText("");
                result.setText("");
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newNumber.setText(newNumber.getText()+".");

            }
        });


    }
}
