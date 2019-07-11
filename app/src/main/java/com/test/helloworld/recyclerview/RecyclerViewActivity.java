package com.test.helloworld.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.test.helloworld.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private Button mBtnLinear;
    private Button mBtnHorizontal;
    private Button mBtnGird;
    private Button mBtnStaggered;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        mBtnLinear = findViewById(R.id.btn_lrv);
        mBtnHorizontal = findViewById(R.id.btn_hrv);
        mBtnGird = findViewById(R.id.btn_gridrv);
        mBtnStaggered = findViewById(R.id.btn_sgrv);
        setListener();

    }

    //统一注册监听事件

    private void setListener() {
        OnCLick onCLick = new OnCLick();
        mBtnLinear.setOnClickListener(onCLick);
        mBtnHorizontal.setOnClickListener(onCLick);
        mBtnGird.setOnClickListener(onCLick);
        mBtnStaggered.setOnClickListener(onCLick);
    }

    private class OnCLick implements View.OnClickListener {
        private Intent intent;

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_lrv:
                    intent = new Intent(RecyclerViewActivity.this, LinearRecyclerViewActivity.class);
                    break;
                case R.id.btn_hrv:
                    intent = new Intent(RecyclerViewActivity.this, HorRecyclerViewActivity.class);
                    break;
                case R.id.btn_gridrv:
                    intent = new Intent(RecyclerViewActivity.this, GridRecyclerViewActivity.class);
                    break;
                case R.id.btn_sgrv:
                    intent = new Intent(RecyclerViewActivity.this, StaggeredGridRecycledViewActivity.class);
                    break;

            }
            startActivity(intent);
        }
    }
}
