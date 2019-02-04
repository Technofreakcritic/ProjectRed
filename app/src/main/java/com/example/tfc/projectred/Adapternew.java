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

public class Adapternew extends RecyclerView.Adapter<Adapternew.myViewHoldernew>  {


  Context mContextnew;
  List<itemnew> mDatanew;

    public Adapternew(Context mContextnew, List<itemnew> mDatanew) {
        this.mContextnew = mContextnew;
        this.mDatanew = mDatanew;
    }

    @Override
    public myViewHoldernew onCreateViewHolder( ViewGroup viewGroup, int i) {

        LayoutInflater inflaternew = LayoutInflater.from(mContextnew);
        View vnew = inflaternew.inflate(R.layout.card_itemnew,viewGroup,false);


        return new myViewHoldernew(vnew);
    }

    @Override
    public void onBindViewHolder(myViewHoldernew viewHolder, int i) {
        viewHolder.background_imgnew.setImageResource(mDatanew.get(i).getBackgroundnew());
        viewHolder.profile_photonew.setImageResource(mDatanew.get(i).getProfilePhotonew());
        viewHolder.tv_titlenew.setText(mDatanew.get(i).getProfileNamenew());
        viewHolder.tv_nbFollowersnew.setText(mDatanew.get(i).getNbfollowersnew()+ " Na+ Points");

    }

    @Override
    public int getItemCount() { return mDatanew.size(); }

    public class myViewHoldernew extends RecyclerView.ViewHolder{

         ImageView profile_photonew,background_imgnew;

         TextView tv_titlenew,tv_nbFollowersnew;


        public myViewHoldernew(@NonNull View itemView) {
            super(itemView);
            profile_photonew = itemView.findViewById(R.id.profile_imgnew);
            background_imgnew = itemView.findViewById(R.id.card_background);
            tv_titlenew = itemView.findViewById(R.id.card_titlenew);
            tv_nbFollowersnew = itemView.findViewById(R.id.card_nb_followernew);


        }
    }
}
