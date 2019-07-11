package com.test.helloworld.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Toast;

import com.test.helloworld.R;

public class StaggeredGridRecycledViewActivity extends AppCompatActivity {

    private RecyclerView mrvSGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered_grid_recycled_view);

        mrvSGV = findViewById(R.id.rv_sgv);
        mrvSGV.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mrvSGV.setAdapter(new StaggeredGridRecycledViewAdapter(StaggeredGridRecycledViewActivity.this, new StaggeredGridRecycledViewAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(StaggeredGridRecycledViewActivity.this,"CLicking"+position,Toast.LENGTH_SHORT).show();
            }
        }, new StaggeredGridRecycledViewAdapter.OnItemLongClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(StaggeredGridRecycledViewActivity.this,"CLicking"+position,Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
