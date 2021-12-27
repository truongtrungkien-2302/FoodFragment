package com.android45.truongtrungkien_buoi6_adr45.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.adapter.NewAdapter;
import com.android45.truongtrungkien_buoi6_adr45.adapter.RecommendedAdapter;
import com.android45.truongtrungkien_buoi6_adr45.data.NewData;
import com.android45.truongtrungkien_buoi6_adr45.data.RecommendedData;
import com.android45.truongtrungkien_buoi6_adr45.databinding.HomeFragmentBinding;
import com.android45.truongtrungkien_buoi6_adr45.model.New;
import com.android45.truongtrungkien_buoi6_adr45.model.Recommended;
import com.android45.truongtrungkien_buoi6_adr45.my_interface.IOnClickItemNew;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    HomeFragmentBinding homeFragmentBinding;

    NewData newData = new NewData();
    RecyclerView rvNew;
    NewAdapter newAdapter;
    List<New> newList = newData.getNewList();
    List<New> newListBuy = new ArrayList<New>();

    RecommendedData recommendedData = new RecommendedData();
    RecyclerView rvRecommended;
    RecommendedAdapter recommendedAdapter;
    List<Recommended> recommendedList = recommendedData.getRecommendedList();
    List<Recommended> recommendedListBuy = new ArrayList<Recommended>();

    View view;

    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false);

        view = inflater.inflate(R.layout.home_fragment, container, false);
        addRecycleViewRecommended();
        addRecycleViewNew();
        clickItem();
        return view;

    }

    private void clickItem() {
//        newAdapter.setiOnClickItemNew(new IOnClickItemNew() {
//            @Override
//            public void onClickAddItem(New aNew) {
//                Toast.makeText(getBaseContext(), aNew.getTvNameFoodNew() + "added to cart", Toast.LENGTH_LONG);
//            }
//        });
    }

    private void addRecycleViewNew() {
        rvNew = view.findViewById(R.id.rvNew);
        rvNew.setLayoutManager(new GridLayoutManager(getBaseContext(), 1, RecyclerView.HORIZONTAL, false));
        newAdapter = new NewAdapter(newList);
        rvNew.setAdapter(newAdapter);
    }

    private void addRecycleViewRecommended() {
        rvRecommended = view.findViewById(R.id.rvRecommended);
        rvRecommended.setLayoutManager(new GridLayoutManager(getBaseContext(), 1, RecyclerView.HORIZONTAL, false));
        recommendedAdapter = new RecommendedAdapter(recommendedList);
        rvRecommended.setAdapter(recommendedAdapter);
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
