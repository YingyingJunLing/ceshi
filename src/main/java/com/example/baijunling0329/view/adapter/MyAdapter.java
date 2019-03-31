package com.example.baijunling0329.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.baijunling0329.R;
import com.example.baijunling0329.model.JsonBean;


import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    Context context;
    JsonBean jsonBean;


    public MyAdapter(Context context, JsonBean jsonBean) {
        this.context=context;
        this.jsonBean=jsonBean;
    }

    @Override
    public int getItemViewType(int position) {
        return position%2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.ilist, parent, false);
        ViewHolder holder = new ViewHolder(inflate);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
          int type =getItemViewType(position);
          switch (type){
              case 0:
                  holder.name1.setText(jsonBean.getData().getData().get(position).getTitle());
                  Glide.with(context)
                         .load("http://img.365jia.cn/uploads/"
                                 +jsonBean.getData().getData().get(position).getPics().get(0))
                          .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                          .into(holder.img1);

                  break;
              case 1:
                  holder.name2.setText(jsonBean.getData().getData().get(position).getTitle());

                  Glide.with(context)
                          .load("http://img.365jia.cn/uploads/"
                  +jsonBean.getData().getData().get(position).getPics().get(0))
                          .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                          .into(holder.img2);;
                  break;
          }
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                jsonBean.getData().getData().remove(position);
                Toast.makeText(context,"删除成功",Toast.LENGTH_SHORT).show();
                notifyDataSetChanged();
                return false;
            }
        });

    }
    @Override
    public int getItemCount() {

      return  jsonBean.getData().getData().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

      ImageView img1;
       ImageView img2;
       TextView name1;
       TextView name2;

        public ViewHolder(View itemView) {
            super(itemView);
            img1 = itemView.findViewById(R.id.img1);
            img2 = itemView.findViewById(R.id.img2);
            name1 = itemView.findViewById(R.id.name1);
            name2 = itemView.findViewById(R.id.name2);
        }
    }
}
