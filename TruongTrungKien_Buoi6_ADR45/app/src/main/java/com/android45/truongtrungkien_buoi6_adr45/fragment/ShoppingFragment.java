package com.android45.truongtrungkien_buoi6_adr45.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.databinding.ShoppingFragmentBinding;

public class ShoppingFragment extends Fragment {
    ShoppingFragmentBinding shoppingFragmentBinding;

    public static ShoppingFragment newInstance() {

        Bundle args = new Bundle();

        ShoppingFragment fragment = new ShoppingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        shoppingFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.shopping_fragment, container, false);
        return shoppingFragmentBinding.getRoot();
    }
}
