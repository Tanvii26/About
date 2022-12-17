package com.example.portfolioapp.cv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolioapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CVFragment extends Fragment {

    RecyclerView RvCv;
    CVAdapter adapter;
    List<CVItem> items;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvCv = view.findViewById(R.id.recyclerview_cv);

        items = new ArrayList<>();
        items.add(new CVItem("Jan 2022", getString(R.string.tnp)));
        items.add(new CVItem("Jan 2022", getString(R.string.gdsc)));
        items.add(new CVItem("Jan 2022", getString(R.string.codechef)));
        items.add(new CVItem("May 2022", getString(R.string.cb)));
        items.add(new CVItem("Jul 2022", getString(R.string.innerve)));
        items.add(new CVItem("Sep 2022", getString(R.string.taarangana)));
        items.add(new CVItem("Sep 2022", getString(R.string.leanin)));

        adapter = new CVAdapter(items);

        RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        RvCv.setAdapter(adapter);

    }

    public CVFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cv, container, false);
    }
}