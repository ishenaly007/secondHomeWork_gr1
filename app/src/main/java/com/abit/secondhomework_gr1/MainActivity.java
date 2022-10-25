package com.abit.secondhomework_gr1;



import androidx.appcompat.app.AppCompatActivity;

import androidx.constraintlayout.widget.ConstraintLayout;


import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText text, text1;
private ConstraintLayout container;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        text = findViewById(R.id.editText);
        text1 = findViewById(R.id.editText2);
        container = findViewById(R.id.container);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if ( text1.getText().toString().length() >=1 || text.getText().toString().length() >=1){
                    button.setBackgroundColor(button.getContext().getResources().getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(button.getContext().getResources().getColor(R.color.gray));
                }
            }
        });

        text1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if ( text1.getText().toString().length() >=1 || text.getText().toString().length() >=1){
                    button.setBackgroundColor(button.getContext().getResources().getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(button.getContext().getResources().getColor(R.color.gray));
                }
            }
        });


        button.setOnClickListener(e -> {
            if(text.getText().toString().equals("admin") && text1.getText().toString().equals("admin")) {
                container.setVisibility(View.GONE);
                Toast.makeText(this,"Вы успешно зарегестрировались",Toast.LENGTH_SHORT).show();
            } else {
                container.setVisibility(View.VISIBLE);
                Toast.makeText(this,"Неправильно введён логин или пароль",Toast.LENGTH_SHORT).show();
            }
        });
    }
}