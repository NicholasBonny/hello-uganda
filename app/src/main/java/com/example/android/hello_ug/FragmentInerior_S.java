package com.example.android.hello_ug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 7/6/2018.
 */

public class FragmentInerior_S extends Fragment {

    View v;

    public FragmentInerior_S() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.s_interior_fragment, container, false);
        return v;
    }
}
