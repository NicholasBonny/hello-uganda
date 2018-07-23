package com.example.android.hello_ug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 7/3/2018.
 */

public class FragmentBus_T extends Fragment {

    View v;

    public FragmentBus_T() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.t_bus_fragment, container, false);
        return v;
    }
}
