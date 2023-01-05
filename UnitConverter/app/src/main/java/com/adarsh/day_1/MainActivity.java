package com.adarsh.day_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button resultbutton;
    private EditText inputbox;
    private TextView resultbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultbutton = findViewById(R.id.resultbutton);
        inputbox = findViewById(R.id.inputbox);
        resultbox = findViewById(R.id.resultbox);

        resultbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = inputbox.getText().toString();
                if(s.length() == 0){
                    Toast.makeText(MainActivity.this, "Please Enter value", Toast.LENGTH_SHORT).show();
                    return;
                }
                int val = Integer.parseInt(s)*20;
                resultbox.setText("Your result are "+ val);

                    Toast.makeText(MainActivity.this, "Result released", Toast.LENGTH_SHORT).show();
            }
        });
    }
}