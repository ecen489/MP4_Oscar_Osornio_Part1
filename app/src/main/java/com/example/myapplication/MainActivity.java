package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_click(View view) {
        EditText tv = (EditText) findViewById(R.id.editText);
        TextView disp = (TextView) findViewById(R.id.textView);
        String result = tv.getText().toString();
        disp.setText(result);
    }
}
