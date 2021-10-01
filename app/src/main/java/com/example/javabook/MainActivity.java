package com.example.javabook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private Button buttonAdd;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view){
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        buttonAdd = (Button)findViewById(R.id.buttonAdd);
        result = (TextView)findViewById(R.id.result);

        String string1 = editText1.getText().toString();
        String string2 = editText2.getText().toString();
        result.setText(String.valueOf(Integer.parseInt(string1)+Integer.parseInt(string2)) );
        Toast.makeText(getApplicationContext(),result.getText(), Toast.LENGTH_LONG).show();

    }
}