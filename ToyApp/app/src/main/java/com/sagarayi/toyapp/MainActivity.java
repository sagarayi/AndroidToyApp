package com.sagarayi.toyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void buttonClicked(View v)
    {

        switch (v.getId())
        {
            case R.id.firstButton:
//            Toast.makeText(MainActivity.this,"hi-one",Toast.LENGTH_SHORT).show();
                Intent newIntent = new Intent(MainActivity.this , TextFieldActivity.class);
                MainActivity.this.startActivity(newIntent);
                break;
            case R.id.secondButton:
                Toast.makeText(MainActivity.this,"hi-two",Toast.LENGTH_SHORT).show();
                break;
            case R.id.thirdButton:
                Toast.makeText(MainActivity.this,"hi-three",Toast.LENGTH_SHORT).show();
                break;
            case R.id.fourthButton:
                Toast.makeText(MainActivity.this,"hi-four",Toast.LENGTH_SHORT).show();
                break;
            case R.id.fifthButton:
                Toast.makeText(MainActivity.this,"hi-five",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sixthButton:
                Toast.makeText(MainActivity.this,"hi-six",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
