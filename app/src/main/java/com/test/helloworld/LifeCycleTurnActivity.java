package com.test.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LifeCycleTurnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_turn);
        Log.d("TurnLifeCycle:","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TurnLifeCycle:","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TurnLifeCycle:","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TurnLifeCycle:","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TurnLifeCycle:","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TurnLifeCycle:","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TurnLifeCycle:","onDestroy");
    }
}
