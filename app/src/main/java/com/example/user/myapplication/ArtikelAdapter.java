package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ArtikelAdapter extends RecyclerView.Adapter<ArtikelAdapter.ImageViewHolder>{

    private Context mContext;
    private List<Artikel> mData;

    public ArtikelAdapter(Context mContext, List<Artikel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.list_artikel, parent, false);
        return new ImageViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, final int position) {

        holder.JudulArtikel.setText(mData.get(position).getTittle());
        holder.GambarArtikel.setImageResource(mData.get(position).getThumbnail());

        //set click listener
        holder.artikelList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //passing data to the artikel activity
                Intent intent = new Intent(mContext, artikel_detail.class);
                intent.putExtra("Title", mData.get(position).getTittle());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                intent.putExtra("Category", mData.get(position).getCategory());
                intent.putExtra("Tgl", mData.get(position).getTgl());


                //start the activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder{

        ImageView GambarArtikel;
        TextView JudulArtikel;
        LinearLayout artikelList;

        public ImageViewHolder(View itemView) {
            super(itemView);
            GambarArtikel = itemView.findViewById(R.id.artikel_gmbr);
            JudulArtikel = itemView.findViewById(R.id.judul);
            artikelList = itemView.findViewById(R.id.artikel_list);

        }
    }
}