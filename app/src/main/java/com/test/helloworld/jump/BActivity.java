package com.test.helloworld.jump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.test.helloworld.R;

public class BActivity extends AppCompatActivity {
    private TextView mTvNameAndAge;

    private Button mBtnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        mBtnChange = findViewById(R.id.btn_change);
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Bundle bundle1 = new Bundle();
                bundle1.putString("title","I'm Back");
                intent.putExtras(bundle1);
                setResult(RESULT_OK,intent);
                finish();
            }
        });

        mTvNameAndAge = findViewById(R.id.tv_name_age);
        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        int age = bundle.getInt("age");

        mTvNameAndAge.setText(name+","+age);
    }
}
