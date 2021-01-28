package com.minga.android_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_start = findViewById(R.id.btn_start);
        final ToggleButton toggleButton = findViewById(R.id.tb_background);
        final LinearLayout linearLayout = findViewById(R.id.view_main);
        final TextView textView = findViewById(R.id.tv_top);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleButton.isChecked();
                if (toggleButton.isChecked()){
                    textView.setText("Не получилось!хаха");
                } else{
                    linearLayout.setBackgroundColor(4294965);
                }
            }
        });



        btn_start.setOnClickListener(new View.OnClickListener() {
            Switch swi = findViewById(R.id.swi);
            CheckBox checkBox = findViewById(R.id.checkbox);

            EditText editTextName = findViewById(R.id.etName);
            @Override
            public void onClick(View v) {
                try {
                    if (swi.isChecked()){
                        if (checkBox.isChecked()){
                            textView.setText("Привет мистер " + editTextName.getText().toString());
                        } else {
                            textView.setText("Привет маленький мистер " + editTextName.getText().toString());
                        }
                    } else {
                        if (checkBox.isChecked()){
                            textView.setText("Привет мисис " + editTextName.getText().toString());
                        } else {
                            textView.setText("Привет маленькая мисис " + editTextName.getText().toString());
                        }
                    }
                } catch (NumberFormatException e){
                    textView.setText("Поля должны быть заполнены");
                }
            }
        });



    }
}