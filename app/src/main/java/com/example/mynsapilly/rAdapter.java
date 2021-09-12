package com.example.mynsapilly;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class rAdapter extends RecyclerView.Adapter<rAdapter.ViewHolder> {
    Context context;
    ArrayList<ModelClass> modelClassArrayList;

    public rAdapter(Context context, ArrayList<ModelClass> modelClassArrayList) {
        this.context = context;
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull

    @Override
    public rAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardvoew,null,false);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull rAdapter.ViewHolder holder, int position) {
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,webview.class);
                intent.putExtra("url",modelClassArrayList.get(position).getUrl());
                context.startActivity(intent);
            }
        });
    holder.mpublish.setText("Published At:-"+modelClassArrayList.get(position).getPublishedAt());
    holder.mauthor.setText("Author "+modelClassArrayList.get(position).getAuthor());
    holder.mheading.setText(modelClassArrayList.get(position).getTitle());
//    holder.mcontent.setText(modelClassArrayList.get(position).getDescription());
    Glide.with(context).load(modelClassArrayList.get(position).getUrlToImage()).into(holder.mimage);
    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mheading,mauthor,mpublish,mcategory;
        CardView card;
        ImageView mimage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mheading=itemView.findViewById(R.id.title);
//            mcontent=itemView.findViewById(R.id.decrpition);
            mauthor=itemView.findViewById(R.id.author);
            mpublish=itemView.findViewById(R.id.publishedat);
            mimage=itemView.findViewById(R.id.image);
            card = itemView.findViewById(R.id.cardview);

        }
    }
}
