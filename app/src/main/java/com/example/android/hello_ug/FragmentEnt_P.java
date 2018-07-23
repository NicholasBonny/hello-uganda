package com.example.android.hello_ug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 7/7/2018.
 */

public class FragmentEnt_P extends Fragment {

    View v;

    public FragmentEnt_P() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.p_ent_fragment, container, false);
        return v;
    }

}
