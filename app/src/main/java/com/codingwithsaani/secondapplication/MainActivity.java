package com.codingwithsaani.secondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputOneET,inputTwoET;
    Button showInputBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputOneET =findViewById(R.id.inputOneET);
        showInputBtn=findViewById(R.id.showBtn);

        inputTwoET=findViewById(R.id.inputTwoET);
    }

    public void checkInput(View view)
    {
//        Toast.makeText(this, "Working...", Toast.LENGTH_SHORT).show();

        if(inputOneET.getText().toString().isEmpty() || inputTwoET.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Please enter something in edit text first.", Toast.LENGTH_SHORT).show();
            if(inputOneET.getText().toString().isEmpty()) {
                inputOneET.requestFocus();
            }
            else
            {
                inputTwoET.requestFocus();
            }
        }
        else
        {
            String editTextValue = inputOneET.getText().toString() + inputTwoET.getText().toString();
            inputOneET.setText("");

            inputTwoET.setText("");
            inputOneET.requestFocus();

            Toast.makeText(this, "Input from edit text:" + editTextValue, Toast.LENGTH_SHORT).show();
        }
    }














}