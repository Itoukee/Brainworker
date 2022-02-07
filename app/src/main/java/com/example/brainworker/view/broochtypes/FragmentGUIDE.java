package com.example.brainworker.view.broochtypes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.brainworker.R;

public class FragmentGUIDE extends Fragment {
    View mView;

    public FragmentGUIDE() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.guidebrooch_fragment,container,false);
        return mView;
    }


}




