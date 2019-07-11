package com.test.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LifeCycleActivity extends AppCompatActivity {

    private Button TURN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        TURN = findViewById(R.id.btn_lc);
        TURN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LifeCycleActivity.this, LifeCycleTurnActivity.class);
                startActivity(intent);
            }
        });
        Log.d("LifeCycle:","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle:","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle:","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle:","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle:","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle:","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle:","onDestroy");
    }
}
