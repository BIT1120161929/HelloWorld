package com.test.helloworld.jump;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.test.helloworld.R;

public class AActivity extends AppCompatActivity {

    private Button mBtnJumpb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        mBtnJumpb = findViewById(R.id.btn_jumpb);
        mBtnJumpb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式跳转
//                Intent intent = new Intent(AActivity.this,BActivity.class);
//                startActivity(intent);

                //隐式跳转
                Intent intent = new Intent();
                intent.setAction("com.test.B");
                Bundle bundle = new Bundle();//利用bundle传递数据
                bundle.putString("name","qsj");
                bundle.putInt("age",18);
                intent.putExtras(bundle);//让intent携带bundle
//                startActivity(intent);
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(AActivity.this,data.getExtras().getString("title"),Toast.LENGTH_SHORT).show();
    }
}
