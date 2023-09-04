package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// This class is an adapter class
// It's a bridge between your Data (List<Sport>) and the RecyclerView + CardView
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder> {

    private List<Sport> sportList;

    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflating the layout for each item in the recyclerview

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item_layout,
                        parent,
                        false
                );



        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {

        Sport sport = sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imageView.setImageResource(sport.sportImg);
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }


    public static class SportsViewHolder extends RecyclerView.ViewHolder{
        // Holds the references to the views within the item layout

        TextView textView;
        ImageView imageView;


        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageviewCard);
        }
    }


}
