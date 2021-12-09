package com.android45.truongtrungkien_buoi6_adr45.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import com.android45.truongtrungkien_buoi6_adr45.R;

public class FavortieFragment extends Fragment {
    ViewDataBinding favortieFragment;
    View view;

    public static FavortieFragment newInstance() {
        
        Bundle args = new Bundle();
        
        FavortieFragment fragment = new FavortieFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        favortieFragment = DataBindingUtil.inflate(inflater, R.layout.menu_fragment, container, false);
//        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.salads);
//        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);
//        menuFragmentBinding.imgSalad.setImageBitmap(circularBitmap);
        return favortieFragment.getRoot();
    }
}
