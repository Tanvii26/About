package com.example.portfolioapp.portfolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
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
public class PortfolioFragment extends Fragment {


    List<PortfolioItem> mdata;
    RecyclerView rv_portfolio;
    PortfolioAdapter portfolioAdapter;
    public PortfolioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_portfolio = view.findViewById(R.id.rv_portfolio);

        //List of item
        mdata = new ArrayList<>();
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());

        portfolioAdapter = new PortfolioAdapter(mdata);
        rv_portfolio.setLayoutManager(new GridLayoutManager(getActivity(),3));
        rv_portfolio.setAdapter(portfolioAdapter);
    }
}