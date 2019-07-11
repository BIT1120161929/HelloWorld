package com.test.helloworld.recyclerview;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.test.helloworld.R;

public class HorRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRvHorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_recycler_view);

        mRvHorizontal = findViewById(R.id.rv_hrv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(HorRecyclerViewActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        mRvHorizontal.addItemDecoration(new MyDecoration());

        mRvHorizontal.setLayoutManager(linearLayoutManager);
        mRvHorizontal.setAdapter(new HorizontalAdapter(HorRecyclerViewActivity.this, new HorizontalAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(HorRecyclerViewActivity.this,"CLick..."+position,Toast.LENGTH_SHORT).show();

            }
        }, new HorizontalAdapter.OnItemLongClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(HorRecyclerViewActivity.this,"LongCLick..."+position,Toast.LENGTH_SHORT).show();
            }
        }));

    }
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight),0);
        }
    }
}
