package com.example.tfc.projectred;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.myViewHolder> {

    public Context mContext;
    public  List<item> mData;

    public Adapter2(Context mContext, List<item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.card_item,viewGroup,false);
        return new myViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

        myViewHolder.background_img.setImageResource(mData.get(i).getBackground());
        myViewHolder.tv_title.setText(mData.get(i).getFoodTitle());
        myViewHolder.tv_point.setText(mData.get(i).getNbFollowers()+"Points");

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView background_img;
        TextView tv_title , tv_point;

        public myViewHolder(View itemView){
            super(itemView);

            background_img = itemView.findViewById(R.id.card_background);
            tv_title = itemView.findViewById(R.id.card_title);
            tv_point = itemView.findViewById(R.id.card_point);
        }
    }
}
