package com.test.helloworld.Fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.test.helloworld.R;

public class ContainerActivity extends AppCompatActivity {

    private Fragment fragment;

    private Button mBtnChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        mBtnChange = findViewById(R.id.btn_change);

        mBtnChange.setOnClickListener(new View.OnClickListener() {
            /**
             * 实现了点击之后切换Fragment的功能
             * @param v
             */
            @Override
            public void onClick(View v) {
                if(!(fragment instanceof BFragment)){
                    fragment = new BFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,fragment).commitAllowingStateLoss();
                    return;
                }else{
                    fragment = new AFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,fragment).commitAllowingStateLoss();
                }

            }
        });

        fragment = new AFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.fl_container,fragment).commitAllowingStateLoss();
    }
}
