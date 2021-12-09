package com.android45.truongtrungkien_buoi6_adr45.data;

import androidx.appcompat.app.AppCompatActivity;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.model.Recommended;

import java.util.ArrayList;
import java.util.List;

public class RecommendedData extends AppCompatActivity {
    List<Recommended> recommendedList;

    public List<Recommended> getRecommendedList() {

        recommendedList = new ArrayList<>();
        recommendedList.add(new Recommended(R.drawable.steak2, R.drawable.ic_baseline_favorite2_border_24, "Rebeye Steak", 5, "12.5"));
        //favor
        recommendedList.add(new Recommended(R.drawable.salmonsalad, R.drawable.ic_baseline_favorite2_border_24, "Salad Salmon", 4, "14.8"));
        recommendedList.add(new Recommended(R.drawable.bugerbacon, R.drawable.ic_baseline_favorite2_border_24, "Beef Buger & Bacon", 4.5F, "10"));
        recommendedList.add(new Recommended(R.drawable.maki, R.drawable.ic_baseline_favorite2_border_24, "Maki", 3.5F, "8.8"));
        //favor
        recommendedList.add(new Recommended(R.drawable.fruityoghurt, R.drawable.ic_baseline_favorite2_border_24, "Fruit Yoghurt", 5, "5.5"));

        return recommendedList;
    }

    public void setRecommendedList(List<Recommended> recommendedList){
        this.recommendedList = recommendedList;
    }
}
