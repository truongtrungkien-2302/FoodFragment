package com.android45.truongtrungkien_buoi6_adr45.activity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.databinding.ActivityFragmentBinding;
import com.android45.truongtrungkien_buoi6_adr45.databinding.ShoppingFragmentBinding;
import com.android45.truongtrungkien_buoi6_adr45.fragment.FavortieFragment;
import com.android45.truongtrungkien_buoi6_adr45.fragment.HomeFragment;
import com.android45.truongtrungkien_buoi6_adr45.fragment.MenuFragment;
import com.android45.truongtrungkien_buoi6_adr45.fragment.ShoppingFragment;

public class FragmentActivity extends AppCompatActivity {
    ActivityFragmentBinding activityFragmentBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        activityFragmentBinding = DataBindingUtil.setContentView(this, R.layout.activity_fragment);

        getFragment(HomeFragment.newInstance());

        activityFragmentBinding.imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(HomeFragment.newInstance());
                activityFragmentBinding.imgHome.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN: {
                                ImageView view = (ImageView) v;
                                view.invalidate();
                                view.getDrawable().setColorFilter(Color.BLACK, PorterDuff.Mode.MULTIPLY);
                                break;
                            }
                            case MotionEvent.ACTION_UP:
                            case MotionEvent.ACTION_CANCEL: {
                                ImageView view = (ImageView) v;
                                view.getDrawable().clearColorFilter();
                                view.invalidate();
                                break;
                            }
                        }
                        return false;
                    }
                });
            }
        });

        activityFragmentBinding.imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(MenuFragment.newInstance());
                activityFragmentBinding.imgMenu.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN: {
                                ImageView view = (ImageView) v;
                                view.invalidate();
                                view.getDrawable().setColorFilter(Color.BLACK, PorterDuff.Mode.MULTIPLY);
                                break;
                            }
                            case MotionEvent.ACTION_UP:
                            case MotionEvent.ACTION_CANCEL: {
                                ImageView view = (ImageView) v;
                                view.getDrawable().clearColorFilter();
                                view.invalidate();
                                break;
                            }
                        }
                        return false;
                    }
                });
            }
        });


        activityFragmentBinding.imgShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(ShoppingFragment.newInstance());
                activityFragmentBinding.imgShopping.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN: {
                                ImageView view = (ImageView) v;
                                view.invalidate();
                                view.getDrawable().setColorFilter(Color.BLACK, PorterDuff.Mode.MULTIPLY);
                                break;
                            }
                            case MotionEvent.ACTION_UP:
                            case MotionEvent.ACTION_CANCEL: {
                                ImageView view = (ImageView) v;
                                view.getDrawable().clearColorFilter();
                                view.invalidate();
                                break;
                            }
                        }
                        return false;
                    }
                });
            }
        });

        activityFragmentBinding.imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(FavortieFragment.newInstance());
                activityFragmentBinding.imgFavorite.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN: {
                                ImageView view = (ImageView) v;
                                view.invalidate();
                                view.getDrawable().setColorFilter(Color.BLACK, PorterDuff.Mode.MULTIPLY);
                                break;
                            }
                            case MotionEvent.ACTION_UP:
                            case MotionEvent.ACTION_CANCEL: {
                                ImageView view = (ImageView) v;
                                view.getDrawable().clearColorFilter();
                                view.invalidate();
                                break;
                            }
                        }
                        return false;
                    }
                });
            }
        });

        activityFragmentBinding.imgChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(MenuFragment.newInstance());
                activityFragmentBinding.imgChat.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN: {
                                ImageView view = (ImageView) v;
                                view.invalidate();
                                view.getDrawable().setColorFilter(Color.BLACK, PorterDuff.Mode.MULTIPLY);
                                break;
                            }
                            case MotionEvent.ACTION_UP:
                            case MotionEvent.ACTION_CANCEL: {
                                ImageView view = (ImageView) v;
                                view.getDrawable().clearColorFilter();
                                view.invalidate();
                                break;
                            }
                        }
                        return false;
                    }
                });
            }
        });
    }

    private void getFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentID, fragment).commit();
    }
}