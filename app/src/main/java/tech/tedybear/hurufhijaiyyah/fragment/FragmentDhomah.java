package tech.tedybear.hurufhijaiyyah.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import tech.tedybear.hurufhijaiyyah.R;

public class FragmentDhomah extends Fragment {
    public FragmentDhomah() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dhomah, container, false);

        return view;
    }
}
