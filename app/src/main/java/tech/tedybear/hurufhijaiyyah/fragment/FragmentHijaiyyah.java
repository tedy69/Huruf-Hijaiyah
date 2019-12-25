package tech.tedybear.hurufhijaiyyah.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import tech.tedybear.hurufhijaiyyah.R;

public class FragmentHijaiyyah extends Fragment {
    public FragmentHijaiyyah() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hijaiyyah, container, false);

        return view;
    }
}
