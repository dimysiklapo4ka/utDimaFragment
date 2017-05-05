package ua.init.team.fragments.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ua.init.team.fragments.R;
import ua.init.team.fragments.models.Student;

/**
 * Created by dev on 05.05.17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.TestViewHolder> {


    private Context context;
    private ArrayList<Student> students;

    public RecyclerViewAdapter(Context context, ArrayList<Student> students) {
        this.context = context;
        this.students = students;
    }

    @Override
    public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.init_card_view,parent, false);

        return new TestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TestViewHolder holder, int position) {

        Student student = students.get(position);

        holder.tvName.setText(student.getName());
        holder.tvAge.setText(student.getAge());
        holder.tvSkils.setText(student.getSkils());


    }



    @Override
    public int getItemCount() {
        return students.size();
    }


    public class TestViewHolder extends RecyclerView.ViewHolder{

        TextView tvName, tvAge, tvSkils;

        public TestViewHolder(View itemView) {
            super(itemView);

            tvAge = (TextView)  itemView.findViewById(R.id.tv_age);
            tvName = (TextView)  itemView.findViewById(R.id.tv_name);
            tvSkils = (TextView)  itemView.findViewById(R.id.tv_skils);

        }
    }

}
