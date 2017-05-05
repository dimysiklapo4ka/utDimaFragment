package ua.init.team.fragments.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ua.init.team.fragments.R;

/**
 * Created by dev on 05.05.17.
 */



public class UtFragment extends Fragment {

    String name;

    public static UtFragment getIntstance(String name){

        UtFragment utFragment = new UtFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ut", name);
        utFragment.setArguments(bundle);
        return utFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        name = getArguments().getString("ut");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ut_fragment, container, false);
        initUI(view);
        return view;
    }

    private void initUI(View view){


        TextView textView = (TextView) view.findViewById(R.id.tv_fragment_name);
        if (name != null)
        textView.setText(name);

    }
}
