package com.example.normal_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class convertor extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String CODE = "data";
    CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10;
    Intent intent;
    private String mParam1;
    private String mParam2;

    public convertor() {
    }

    public static convertor newInstance(String param1, String param2) {
        convertor fragment = new convertor();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setting_dimensions();
        card1.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 1);
            getActivity().startActivity(intent);
        });
        card2.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 2);
            getActivity().startActivity(intent);
        });
        card3.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 3);
            getActivity().startActivity(intent);
        });
        card4.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 4);
            getActivity().startActivity(intent);
        });
        card5.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 5);
            getActivity().startActivity(intent);
        });
        card6.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 6);
            getActivity().startActivity(intent);
        });
        card7.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 7);
            getActivity().startActivity(intent);
        });
        card8.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 8);
            getActivity().startActivity(intent);
        });
        card9.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 9);
            getActivity().startActivity(intent);
        });
        card10.setOnClickListener(view1 -> {
            intent.putExtra(CODE, 10);
            getActivity().startActivity(intent);
        });

    }

    private void setting_dimensions() {
        card1 = getView().findViewById(R.id.card1);
        card2 = getView().findViewById(R.id.card2);
        card3 = getView().findViewById(R.id.card3);
        card4 = getView().findViewById(R.id.card4);
        card5 = getView().findViewById(R.id.card5);
        card6 = getView().findViewById(R.id.card6);
        card7 = getView().findViewById(R.id.card7);
        card8 = getView().findViewById(R.id.card8);
        card9 = getView().findViewById(R.id.card9);
        card10 = getView().findViewById(R.id.card10);
        intent = new Intent(getActivity(), operation.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_convertor, container, false);
    }
}