package com.sagarayi.toyapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class TextFieldActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    TextView displayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_text_field);
        Spinner spinner =(Spinner)findViewById(R.id.list_of_options);
        ArrayAdapter<CharSequence> modelData = ArrayAdapter.createFromResource(this,R.array.color_list,android.R.layout.simple_spinner_item);

        modelData.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(modelData);
        spinner.setOnItemSelectedListener(this);

        EditText textField = (EditText)findViewById(R.id.active_text);
        displayText = (TextView)findViewById(R.id.display_text);
        textField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                displayText.setText(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });
    }
    public void onTextChanged(View v)
    {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
         String name =  adapterView.getItemAtPosition(i).toString();

        displayText.setTextColor(Color.parseColor(name));
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
