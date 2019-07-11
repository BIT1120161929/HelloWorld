package com.test.helloworld.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.helloworld.R;

public class StaggeredGridRecycledViewAdapter extends RecyclerView.Adapter<StaggeredGridRecycledViewAdapter.StaggeredGridViewHolder> {

    private Context mContext;

    private OnItemClickListener mListener;
    private OnItemLongClickListener mLongListener;

    public StaggeredGridRecycledViewAdapter(Context mContext, OnItemClickListener mListener, OnItemLongClickListener mLongListener) {
        this.mContext = mContext;
        this.mListener = mListener;
        this.mLongListener = mLongListener;
    }

    @Override
    public StaggeredGridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new StaggeredGridViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_staggered_grid_recyclerview_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(StaggeredGridViewHolder viewHolder, final int i) {

        if(i%2!=0){
            viewHolder.imageView.setImageResource(R.drawable.girl);
        }
        else{
            viewHolder.imageView.setImageResource(R.drawable.apple);
        }
        //设置点击事件
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClick(i);
            }
        });
        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mLongListener.onClick(i);
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class StaggeredGridViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;

        public StaggeredGridViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_sg);
        }
    }

    interface OnItemClickListener {
        void onClick(int position);
    }

    interface OnItemLongClickListener{
        void onClick(int position);
    }
}
