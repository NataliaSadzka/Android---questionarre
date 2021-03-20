package com.example.questionnaire;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button2;
    Button button;
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        textView3 = findViewById(R.id.textView3) ;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == button.getId()) {
            String text = "";
            if(checkBox.isChecked()){
                text = text + ("Odpowiedź 1 = True \n");
            } else {
                text = text + ("Odpowiedź 1 = False \n");
            }

            if(checkBox2.isChecked()){
                text = text + ("Odpowiedź 2 = True \n");
            } else {
                text = text + ("Odpowiedź 2 = False \n");
            }

            if(checkBox3.isChecked()){
                text = text + ("Odpowiedź 3 = True \n");
            } else {
                text = text + ("Odpowiedź 3 = False \n");
            }

            if(checkBox4.isChecked()){
                text = text + ("Odpowiedź 4 = True \n");
            } else {
                text = text + ("Odpowiedź 4 = False \n");
            }

            if(checkBox5.isChecked()){
                text = text + ("Odpowiedź 5 = True \n");
            } else {
                text = text + ("Odpowiedź 5 = False \n");
            }
            textView3.setText(text);
            textView3.setVisibility(View.VISIBLE);
        }

        if (v.getId() == textView3.getId()) {
            textView3.setVisibility(View.INVISIBLE);
        }

        if (v.getId() == button2.getId()) {
            System.exit(0);
        }
    }
}