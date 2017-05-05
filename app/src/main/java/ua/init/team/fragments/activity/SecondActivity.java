package ua.init.team.fragments.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import ua.init.team.fragments.R;

/**
 * Created by dev on 05.05.17.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String text = getIntent().getStringExtra("init");
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
