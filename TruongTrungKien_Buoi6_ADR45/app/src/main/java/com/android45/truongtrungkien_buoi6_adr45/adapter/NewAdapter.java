package com.android45.truongtrungkien_buoi6_adr45.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.model.New;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.Viewholder> {
    List<New> newList;

    public NewAdapter(List<New> newList) {
        this.newList = newList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_home_fragment2, parent, false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewAdapter.Viewholder holder, int position) {
//        New aNew = newList.get(position);
        holder.imgFoodNew.setImageResource(newList.get(position).getImgFoodNew());
        holder.imgFavoriteNew.setImageResource(newList.get(position).getImgFavoriteNew());
        holder.tvNameFoodNew.setText(newList.get(position).getTvNameFoodNew());
        holder.rbStarNew.setRating(newList.get(position).getRbStarNew());
        holder.tvMoneyNew.setText(newList.get(position).getTvMoneyNew());
    }

    @Override
    public int getItemCount() {
        return newList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        CircleImageView imgFoodNew;
        ImageView imgFavoriteNew;
        TextView tvNameFoodNew;
        RatingBar rbStarNew;
        TextView tvMoneyNew;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imgFoodNew = itemView.findViewById(R.id.imgFoodNew);
            imgFavoriteNew = itemView.findViewById(R.id.imgFavoriteNew);
            tvNameFoodNew = itemView.findViewById(R.id.tvNameFoodNew);
            rbStarNew = itemView.findViewById(R.id.rbStarNew);
            tvMoneyNew = itemView.findViewById(R.id.tvMoneyNew);
        }
    }
}
