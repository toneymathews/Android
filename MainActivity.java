//for toast application. xml needed sa well
package com.example.android.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        EditText myText = (EditText) findViewById(R.id.editText);
        Toast.makeText(getApplicationContext(),"hello"+myText.getText().toString(), Toast.LENGTH_SHORT).show();
        Log.i("Info",myText.getText().toString());
    }
}
