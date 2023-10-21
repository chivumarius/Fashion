package com.chivumarius.fashion;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;



public class RecyclerViewAdaptery extends
        RecyclerView.Adapter<RecyclerViewAdaptery.ImageViewHolder> {


    // ▬ DECLARATION OF "VARIABLES" ▬
    Context mContext;
    List<row> mData;



    // ▬ "CONSTRUCTOR" ▬
    public RecyclerViewAdaptery(Context mContext, List<row> mData) {
        // ▼ THIS.VARIABLE = PARAMETER ▼
        this.mContext = mContext;
        this.mData = mData;
    }



    // ▬ "ON CREATE VIEW HOLDER()" ▬
    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // ▼ "INFLATING" RECYCLERVIEW ITEM ▼
        View view = LayoutInflater.from(mContext)
                .inflate(
                        R.layout.recyclerview_item,
                        parent,
                        false
                );
        return new ImageViewHolder(view);
    }



    // ▬ "ON BIND VIEW HOLDER()" ▬
    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int i) {

        // Binding image here
        // ▼ USING "GLIDE" LIBRARY → TO LOAD "IMAGES" ▼
        Glide.with(mContext)
                .load(mData.get(i).getImg())
                .into(holder.img);


        // ▼ "BINDING TEXTVIEW" WITH "DATA" ▼
        holder.title.setText(mData.get(i).getTitle());
    }




    // ▬ "GET ITEM COUNT()" METHOD ▬
    @Override
    public int getItemCount() {
        return mData.size();
    }





    // ▬ "IMAGE VIEW HOLDERS" SUB-CLASS ▬
    public class ImageViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener{

        // ▼ "DECLARATION" OF "VARIABLES" ▼
        ImageView img;
        TextView title;



        // ▬ "CONSTRUCTOR" ▬
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);

            // ▼ INITIALIZING "VARIABLES" ▼
            img = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.textView2);


            // ▼ "SET ON CLICK LISTENER" ▼
            itemView.setOnClickListener(this);

        }



        // ▬ "ON CLICK()" METHOD ▬
        @Override
        public void onClick(View view) {

            // ▼ CLICK EVENTS ON CARDS ▼
            if (getLayoutPosition() == 0){
                // ▼ DISPLAY "TOAST MESSAGE" ▼
                Toast.makeText(
                        mContext,
                        "You Clicked first Item",
                        Toast.LENGTH_SHORT
                ).show();
            }

        }

    }















}
