package com.android45.truongtrungkien_buoi6_adr45.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.databinding.MenuFragmentBinding;

public class MenuFragment extends Fragment {
    MenuFragmentBinding menuFragmentBinding;

    public static MenuFragment newInstance() {

        Bundle args = new Bundle();
        
        MenuFragment fragment = new MenuFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        menuFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.menu_fragment, container, false);
        return menuFragmentBinding.getRoot();
    }
}
