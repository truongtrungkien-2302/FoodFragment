package com.android45.truongtrungkien_buoi6_adr45.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.adapter.NewAdapter;
import com.android45.truongtrungkien_buoi6_adr45.adapter.RecommendedAdapter;
import com.android45.truongtrungkien_buoi6_adr45.databinding.HomeFragmentBinding;
import com.android45.truongtrungkien_buoi6_adr45.model.New;
import com.android45.truongtrungkien_buoi6_adr45.model.Recommended;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    HomeFragmentBinding homeFragmentBinding;
    RecyclerView rvRecommended;
    List<Recommended> recommendedList;
    RecommendedAdapter recommendedAdapter;
    RecyclerView rvNew;
    List<New> newList;
    NewAdapter newAdapter;
    View view;

    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        homeFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false);
//        return homeFragmentBinding.getRoot();
        view = inflater.inflate(R.layout.home_fragment, container, false);
        addRecycleViewRecommended();
        addRecycleViewNew();
        return view;

    }

    private void addRecycleViewRecommended() {
        rvRecommended = view.findViewById(R.id.rvRecommended);
        rvRecommended.setLayoutManager(new GridLayoutManager(getBaseContext(), 1, RecyclerView.HORIZONTAL, false));

        recommendedList = new ArrayList<>();
        recommendedList.add(new Recommended(R.drawable.steak2, R.drawable.ic_baseline_favorite2_border_24, "Rebeye Steak", 5, "12.5"));
        //favor
        recommendedList.add(new Recommended(R.drawable.salmonsalad, R.drawable.ic_baseline_favorite2_border_24, "Salad Salmon", 4, "14.8"));
        recommendedList.add(new Recommended(R.drawable.bugerbacon, R.drawable.ic_baseline_favorite2_border_24, "Beef Buger & Bacon", 4.5F, "10"));
        recommendedList.add(new Recommended(R.drawable.maki, R.drawable.ic_baseline_favorite2_border_24, "Maki", 3.5F, "8.8"));
        //favor
        recommendedList.add(new Recommended(R.drawable.fruityoghurt, R.drawable.ic_baseline_favorite2_border_24, "Fruit Yoghurt", 5, "5.5"));

        recommendedAdapter = new RecommendedAdapter(recommendedList);
        rvRecommended.setAdapter(recommendedAdapter);
    }

    private void addRecycleViewNew() {
        rvNew = view.findViewById(R.id.rvNew);
        rvNew.setLayoutManager(new GridLayoutManager(getBaseContext(), 1, RecyclerView.HORIZONTAL, false));

        newList = new ArrayList<>();
        newList.add(new New(R.drawable.chicken, R.drawable.ic_baseline_favorite2_border_24, "Chicken Salad", 4, "7.5"));
        //favor
        newList.add(new New(R.drawable.salamipizza, R.drawable.ic_baseline_favorite2_border_24, "Pizza Salami", 5, "11.5"));
        //favor
        newList.add(new New(R.drawable.eggtoast, R.drawable.ic_baseline_favorite2_border_24, "Egg Toast", 3.5F, "5.5"));
        newList.add(new New(R.drawable.fudgecake, R.drawable.ic_baseline_favorite2_border_24, "Fudge Cake", 4.5F, "6.5"));
        //favor
        newList.add(new New(R.drawable.orangejuice, R.drawable.ic_baseline_favorite2_border_24, "Orange Juice", 4, "3.5"));

        newAdapter = new NewAdapter(newList);
        rvNew.setAdapter(newAdapter);
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

}
