package com.example.tinku.simpsonsretrofit.presenter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tinku.simpsonsretrofit.R;

/**
 * Created by ryellap on 2/23/18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        SimpsonModel listOfDetails = list.get(position);
//        holder.name.setText(listOfDetails.getSimpsonText().toString());
//        Picasso.with(context)
//                .load(listOfDetails.getSimpsonImage())
//                .into(holder.imageview);


    }

    @Override
    public int getItemCount() {
//        return list.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageview;
        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);

            imageview = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
        }
    }
}
