package com.example.nagesh.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<String> countries;
    private ArrayList<String> countries1;
    private ArrayList<String> countries2;
    private ArrayList<String> countries3;
    private ArrayList<String> countries4;



    public DataAdapter(ArrayList<String> countries,ArrayList<String> countries1,ArrayList<String> countries2,ArrayList<String> countries3,ArrayList<String> countries4) {
        this.countries = countries;
        this.countries1=countries1;
        this.countries2=countries2;
        this.countries3=countries3;
        this.countries4=countries4;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cards_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.txtName.setText(countries.get(i));
        viewHolder.txtBookingId.setText(countries1.get(i));
        viewHolder.txtBookingDate.setText(countries2.get(i));
        viewHolder.txtStatus.setText(countries3.get(i));
        viewHolder.txtService.setText(countries4.get(i));
    }

    @Override
    public int getItemCount() {
        return countries.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName ;
        TextView txtBookingId;
        TextView txtBookingDate;
        TextView txtStatus;
        TextView txtService;
        public ViewHolder(View view) {
            super(view);
            txtName = (TextView)view.findViewById(R.id.textView);
            txtService = (TextView)view.findViewById(R.id.textView1);
            txtBookingId = (TextView)view.findViewById(R.id.textView2);
            txtBookingDate = (TextView)view.findViewById(R.id.textView3);
            txtStatus = (TextView)view.findViewById(R.id.textView4);


        }
    }

}