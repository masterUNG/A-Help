package com.example.pareeya.ahelp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {

    //Explicit
    private TextView phone1TextView, phone2TextView, phone3TextView,
            phone4TextView, phone5TextView;
    private ImageView addPhone1ImageView, addPhone2ImageView,
            addPhone3ImageView, addPhone4ImageView, addPhone5ImageView;
    private RadioGroup radioGroup;
    private RadioButton phone1RadioButton, phone2RadioButton,
            phone3RadioButton, phone4RadioButton, phone5RadioButton;
    private ListView listView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //Bind Widget
        bindWidget();


    }//Main Method

    private void bindWidget() {

        phone1TextView = (TextView) findViewById(R.id.textView5);
        phone2TextView = (TextView) findViewById(R.id.textView6);
        phone3TextView = (TextView) findViewById(R.id.textView7);
        phone4TextView = (TextView) findViewById(R.id.textView10);
        phone5TextView = (TextView) findViewById(R.id.textView11);


    }   // bindWidget

    public void clickSetting(View view) {
        //startActivity(new Intent(SettingActivity.this,HomeActivity.class));

    }//clickSetting
}//MAIN Class
