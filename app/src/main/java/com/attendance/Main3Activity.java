package com.attendance;                     // Warden page

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    CheckBox ch, ch2, ch3, ch4, ch5, ch6, ch7, ch8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ch = (CheckBox)findViewById(R.id.checkBox);
        ch2 = (CheckBox)findViewById(R.id.checkBox2);
        ch3 = (CheckBox)findViewById(R.id.checkBox3);
        ch4 = (CheckBox)findViewById(R.id.checkBox4);
        ch5 = (CheckBox)findViewById(R.id.checkBox5);
        ch6 = (CheckBox)findViewById(R.id.checkBox6);
        ch7 = (CheckBox)findViewById(R.id.checkBox7);
        ch8 = (CheckBox)findViewById(R.id.checkBox8);
        Button btn = (Button)findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected Courses";
                if(ch.isChecked()){
                    result += "\n1";
                }
                if(ch2.isChecked()){
                    result += "\n2";
                }
                if(ch3.isChecked()){
                    result += "\n3";
                }
                if(ch4.isChecked()){
                    result += "\n4";
                }
                if(ch5.isChecked()){
                    result += "\n5";
                }
                if(ch6.isChecked()){
                    result += "\n6";
                }
                if(ch7.isChecked()){
                    result += "\n7";
                }
                if(ch8.isChecked()){
                    result += "\n8";
                }
                Toast.makeText(getApplicationContext(),"Saved successfully", Toast.LENGTH_SHORT).show();
                SharedPreferences.Editor editor = getSharedPreferences("toShare", MODE_PRIVATE).edit();
                editor.putString("name", result);
                editor.apply();
                Intent intent = new Intent(Main3Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void asd(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                str = checked?"1 Selected":"1 Deselected";
                break;
            case R.id.checkBox2:
                str = checked?"2 Selected":"2 Deselected";
                break;
            case R.id.checkBox3:
                str = checked?"3 Selected":"3 Deselected";
                break;
            case R.id.checkBox4:
                str = checked?"4 Selected":"4 Deselected";
                break;
            case R.id.checkBox5:
                str = checked?"5 Selected":"5 Deselected";
                break;
            case R.id.checkBox6:
                str = checked?"6 Selected":"6 Deselected";
                break;
            case R.id.checkBox7:
                str = checked?"7 Selected":"7 Deselected";
                break;
            case R.id.checkBox8:
                str = checked?"8 Selected":"8 Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}