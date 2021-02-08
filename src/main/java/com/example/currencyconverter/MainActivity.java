package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void ClickFunction(View view)
    {

        EditText editText=(EditText)findViewById(R.id.editText);



        float dollar= (float) (Float.parseFloat(editText.getText().toString())*85.33);
        Log.i("dollar",Float.toString(dollar));

        Toast.makeText(this,"Amout is ",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}