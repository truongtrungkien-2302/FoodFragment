package com.android45.truongtrungkien_buoi6_adr45.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.fragment.FavortieFragment;
import com.android45.truongtrungkien_buoi6_adr45.fragment.MenuFragment;
import com.android45.truongtrungkien_buoi6_adr45.model.Recommended;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.Viewholder> {

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
    List<Recommended> recommendedList;
    List<Recommended> recommendedListBuy = new ArrayList<Recommended>();

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.imgFoodRecommended.setImageResource(recommendedList.get(position).getImgFoodRecommended());
        holder.imgFavoriteRecommended.setImageResource(recommendedList.get(position).getImgFavoriteRecommended());
        holder.tvNameFoodRecommended.setText(recommendedList.get(position).getTvNameFoodRecommended());
        holder.rbStarRecommended.setRating(recommendedList.get(position).getRbStarRecommended());
        holder.tvMoneyRecommended.setText(recommendedList.get(position).getTvMoneyRecommended());

//        holder.btnAddRecommended.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getBaseContext(), FavortieFragment.class);
//                Bundle bundle = new Bundle();
//                bundle.putParcelableArrayList("FoodListBuy", (ArrayList<? extends Parcelable>) recommendedList);
//                intent.putExtras(bundle);
//                mBase.startActivity(intent);
//            }
//        });
    }

    Context mBase;

    public void ContextWrapper(Context base) {
        mBase = base;
    }

    /**
     * Set the base context for this ContextWrapper.  All calls will then be
     * delegated to the base context.  Throws
     * IllegalStateException if a base context has already been set.
     *
     * @param base The new base context for this wrapper.
     */
    protected void attachBaseContext(Context base) {
        if (mBase != null) {
            throw new IllegalStateException("Base context already set");
        }
        mBase = base;
    }

    /**
     * @return the base context as set by the constructor or setBaseContext
     */
    public Context getBaseContext() {
        return mBase;
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
        RelativeLayout btnAddRecommended;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imgFoodRecommended = itemView.findViewById(R.id.imgFoodRecommended);
            imgFavoriteRecommended = itemView.findViewById(R.id.imgFavoriteRecommended);
            tvNameFoodRecommended = itemView.findViewById(R.id.tvNameFoodRecommended);
            rbStarRecommended = itemView.findViewById(R.id.rbStarRecommended);
            tvMoneyRecommended = itemView.findViewById(R.id.tvMoneyRecommended);
            btnAddRecommended = itemView.findViewById(R.id.btnAddRecommended);
        }
    }
}
