package com.adarsh.day_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText input;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        input = findViewById(R.id.input);
        result = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = 0;
                String s = input.getText().toString();
                if(s.length()==0){
                    Toast.makeText(MainActivity.this, "Enter some value", Toast.LENGTH_SHORT).show();
                    return;
                }
                String [] arr = s.split("\\+");
               for(String s1 :arr){
//                   result.setText(res);
                   try{
                       int num = Integer.parseInt(s1);
                       res+=num;
                   }
                   catch(Exception e){
                       Toast.makeText(MainActivity.this, "Character not allowed", Toast.LENGTH_SHORT).show();
                       return;
                   }

               }

               result.setText(Integer.toString(res));
            }
        });
    }
}