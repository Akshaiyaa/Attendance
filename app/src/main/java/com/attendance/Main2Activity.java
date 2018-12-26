package com.attendance;                // Student page

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.SharedPreferences;

public class Main2Activity extends AppCompatActivity {

    private EditText edit;
    String content;
    Button save_but1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edit = (EditText) findViewById(R.id.editText);
        save_but1 = (Button) findViewById(R.id.button3);
        save_but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               display(v);
            }



            public void display(View v) {

                SharedPreferences prefs = getSharedPreferences("toShare", MODE_PRIVATE);
                String restoredText = prefs.getString("name", null);
                content = edit.getText().toString();
                if(restoredText.contains(content))
                Toast.makeText(getApplicationContext(),"Present",Toast.LENGTH_LONG).show();
                else
                Toast.makeText(getApplicationContext(),"Not Present",Toast.LENGTH_LONG).show();

                }


        });
    }
}


