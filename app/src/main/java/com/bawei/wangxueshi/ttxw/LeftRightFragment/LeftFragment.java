package com.bawei.wangxueshi.ttxw.LeftRightFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawei.wangxueshi.ttxw.R;

/**
 * Created by Administrator on 2017/5/9.
 */

public class LeftFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.leftfragment,container,false);
        return view;
    }
}
