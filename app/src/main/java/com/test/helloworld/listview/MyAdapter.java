package com.test.helloworld.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.test.helloworld.R;

import java.util.zip.Inflater;

public class MyAdapter extends BaseAdapter {

    private Context mycontext;
    private LayoutInflater myLayoutInflater;

    public MyAdapter(Context mycontext) {
        this.mycontext = mycontext;
        this.myLayoutInflater = LayoutInflater.from(mycontext);
    }

    @Override
    public int getCount() {
        return 10;
    }

    /**
     * 用的很少
     */
    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    static class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle;
        public TextView tvTime;
        public TextView tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if(convertView == null){
            convertView = myLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv_image);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            holder.tvTime = convertView.findViewById(R.id.tv_time);
            holder.tvContent = convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.tvTitle.setText("Title");
        holder.tvTime.setText("2088-08-08");
        holder.tvContent.setText("Context");
        Glide.with(mycontext).load("https://img-blog.csdnimg.cn/20190707181529879.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzNjUyNTAw,size_16,color_FFFFFF,t_70").into(holder.imageView);


        return convertView;
    }
}
