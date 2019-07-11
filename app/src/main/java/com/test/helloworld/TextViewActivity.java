package com.test.helloworld;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        textView3 = findViewById(R.id.tv_3);
        textView3.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        textView3.getPaint().setAntiAlias(true);

        textView4=findViewById(R.id.tv_4);
        textView4.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);


        textView5 = findViewById(R.id.tv_5);
        textView5.setText(Html.fromHtml("<u>testMessage</u>"));

        textView6 = findViewById(R.id.tv_6);
        textView6.setSelected(true);
        //设置之后不需要点击也可以跑马灯
    }
}
