package com.test.helloworld.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.test.helloworld.R;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder> {

    private Context mContext;

    private OnItemClickListener mListener;
    private OnItemLongClickListener mLongListener;

    public HorizontalAdapter(Context mContext, OnItemClickListener mListener, OnItemLongClickListener mLongListener) {
        this.mContext = mContext;
        this.mListener = mListener;
        this.mLongListener = mLongListener;
    }

    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new HorizontalViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_horizontal_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(HorizontalViewHolder viewHolder, final int i) {

        viewHolder.textView.setText("Hello Horizontal World!");
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

    class HorizontalViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    interface OnItemClickListener {
        void onClick(int position);
    }

    interface OnItemLongClickListener{
        void onClick(int position);
    }
}
