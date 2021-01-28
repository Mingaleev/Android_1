package com.minga.android_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.tv_top);
        EditText editTextName = findViewById(R.id.etName);
        Button btn_start = findViewById(R.id.btn_start);
        Switch swi = findViewById(R.id.swi);
        CheckBox checkBox = findViewById(R.id.checkbox);
        ToggleButton toggleButton = findViewById(R.id.tb_background);

    }
}