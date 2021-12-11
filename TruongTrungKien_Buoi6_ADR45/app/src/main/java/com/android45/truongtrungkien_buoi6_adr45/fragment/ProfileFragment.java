package com.android45.truongtrungkien_buoi6_adr45.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.android45.truongtrungkien_buoi6_adr45.R;
import com.android45.truongtrungkien_buoi6_adr45.databinding.ProfileFragmentBinding;

public class ProfileFragment extends Fragment {
ProfileFragmentBinding profileFragmentBinding;

    public static ProfileFragment newInstance() {

        Bundle args = new Bundle();

        ProfileFragment fragment = new ProfileFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        profileFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.profile_fragment, container, false);
//        clickBackHome();
        return profileFragmentBinding.getRoot();
    }

    private void clickBackHome() {
        profileFragmentBinding.imgProfileBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), HomeFragment.class);
                startActivity(intent);
            }
        });
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
