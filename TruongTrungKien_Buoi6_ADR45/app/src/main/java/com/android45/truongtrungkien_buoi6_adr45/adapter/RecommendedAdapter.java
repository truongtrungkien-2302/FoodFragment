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
import com.android45.truongtrungkien_buoi6_adr45.model.Recommended;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.Viewholder> {
    List<Recommended> recommendedList;

    public RecommendedAdapter(List<Recommended> recommendedList) {
        this.recommendedList = recommendedList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_home_fragment, parent, false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.imgFoodRecommended.setImageResource(recommendedList.get(position).getImgFoodRecommended());
        holder.imgFavoriteRecommended.setImageResource(recommendedList.get(position).getImgFavoriteRecommended());
        holder.tvNameFoodRecommended.setText(recommendedList.get(position).getTvNameFoodRecommended());
        holder.rbStarRecommended.setRating(recommendedList.get(position).getRbStarRecommended());
        holder.tvMoneyRecommended.setText(recommendedList.get(position).getTvMoneyRecommended());
    }

    @Override
    public int getItemCount() {
        return recommendedList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        CircleImageView imgFoodRecommended;
        ImageView imgFavoriteRecommended;
        TextView tvNameFoodRecommended;
        RatingBar rbStarRecommended;
        TextView tvMoneyRecommended;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imgFoodRecommended = itemView.findViewById(R.id.imgFoodRecommended);
            imgFavoriteRecommended = itemView.findViewById(R.id.imgFavoriteRecommended);
            tvNameFoodRecommended = itemView.findViewById(R.id.tvNameFoodRecommended);
            rbStarRecommended = itemView.findViewById(R.id.rbStarRecommended);
            tvMoneyRecommended = itemView.findViewById(R.id.tvMoneyRecommended);
        }
    }
}
