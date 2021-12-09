package com.android45.truongtrungkien_buoi6_adr45.data;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.model.New;

import java.util.ArrayList;
import java.util.List;

public class NewData {
    List<New> newList;

    public List<New> getNewList() {
//        rvNew = view.findViewById(R.id.rvNew);
//        rvNew.setLayoutManager(new GridLayoutManager(getBaseContext(), 1, RecyclerView.HORIZONTAL, false));

        newList = new ArrayList<>();
        newList.add(new New(R.drawable.chicken, R.drawable.ic_baseline_favorite2_border_24, "Chicken Salad", 4, "7.5"));
        //favor
        newList.add(new New(R.drawable.salamipizza, R.drawable.ic_baseline_favorite2_border_24, "Pizza Salami", 5, "11.5"));
        //favor
        newList.add(new New(R.drawable.eggtoast, R.drawable.ic_baseline_favorite2_border_24, "Egg Toast", 3.5F, "5.5"));
        newList.add(new New(R.drawable.fudgecake, R.drawable.ic_baseline_favorite2_border_24, "Fudge Cake", 4.5F, "6.5"));
        //favor
        newList.add(new New(R.drawable.orangejuice, R.drawable.ic_baseline_favorite2_border_24, "Orange Juice", 4, "3.5"));

//        newAdapter = new NewAdapter(newList);
//        rvNew.setAdapter(newAdapter);

        return newList;
    }

    public void setNewList(List<New> newList){
        this.newList = newList;
    }
}
