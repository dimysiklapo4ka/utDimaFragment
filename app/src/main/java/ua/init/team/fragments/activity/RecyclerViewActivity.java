package ua.init.team.fragments.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import ua.init.team.fragments.R;
import ua.init.team.fragments.adapters.RecyclerViewAdapter;
import ua.init.team.fragments.models.Student;

/**
 * Created by dev on 05.05.17.
 */

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_activity);
        initUI();
    }

    private void initUI(){

        RecyclerView  recyclerView = (RecyclerView) findViewById(R.id.rv_init);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(new RecyclerViewAdapter(this, initMockStudens()));

    }


    private ArrayList<Student> initMockStudens(){

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Макс", "20","JAVA+Android"));
        students.add(new Student("Дима", "23","JAVA+Android"));
        students.add(new Student("Дима", "22","JAVA+Android"));
        students.add(new Student("йцу", "20","IOS"));
        students.add(new Student("фыв", "20","IOS"));
        students.add(new Student("ячс", "20","IOS"));
        return students;

    }

}
