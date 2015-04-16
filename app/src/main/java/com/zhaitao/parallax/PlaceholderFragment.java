package com.zhaitao.parallax;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zhaitao on 15/4/16.
 */
public class PlaceholderFragment extends Fragment {

    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle arg = new Bundle();
        arg.putInt("num", sectionNumber);
        fragment.setArguments(arg);
        return fragment;
    }

    public PlaceholderFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int anInt = getArguments().getInt("num");
        int resource;
        switch (anInt) {
            case 0:
            default:
                resource = R.layout.fragment_parallax_alicante;
                break;
            case 1:
                resource = R.layout.fragment_parallax_barcelona;
                break;
        }
        View rootView = inflater.inflate(resource, container, false);
        return rootView;
    }
}
