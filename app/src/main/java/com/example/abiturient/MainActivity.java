package com.example.abiturient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnVoiti;
    Button btnzparol;
    Button btnzreg;
    Button btnabit;
    Button btnpar;
    Button btnkol;
    TextView changerole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnabit = (Button) findViewById(R.id.btnabit);
     //   btnpar = (Button) findViewById(R.id.btnpar);
        btnkol = (Button) findViewById(R.id.btnkol);
        btnabit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);finish();
            }
        });
    }
}
