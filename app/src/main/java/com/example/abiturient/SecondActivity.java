package com.example.abiturient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button btnVoiti2;
    Button btnzparo2;
    Button btnzreg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnVoiti2 = (Button) findViewById(R.id.btnVoiti2);
        btnzparo2 = (Button) findViewById(R.id.btnzparol2);
        btnzreg2 = (Button) findViewById(R.id.btnzreg2);
    }
}
