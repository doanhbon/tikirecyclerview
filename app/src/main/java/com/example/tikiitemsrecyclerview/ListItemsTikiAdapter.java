package com.example.tikiitemsrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListItemsTikiAdapter extends RecyclerView.Adapter<ListItemsTikiAdapter.ItemViewHolder> {
    private final ArrayList<ItemTiki> itemTikis;
    private LayoutInflater layoutInflater;

    public ListItemsTikiAdapter(Context context, ArrayList<ItemTiki> itemTikis) {
        this.itemTikis = itemTikis;
        layoutInflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater.inflate(R.layout.tiki_item, parent, false);

        return new ItemViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemTiki current = itemTikis.get(position);
        holder.imageView.setImageResource(R.drawable.demo);
        holder.textViewName.setText(current.getName());
    }

    @Override
    public int getItemCount() {
        return itemTikis.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView textViewName;
        public final ImageView imageView;
        final ListItemsTikiAdapter listItemsTikiRecycler;

        public ItemViewHolder(View view, ListItemsTikiAdapter listItemsTikiRecycler) {
            super(view);
            imageView = view.findViewById(R.id.imageView);
            textViewName = view.findViewById(R.id.tv_name);
            this.listItemsTikiRecycler = listItemsTikiRecycler;
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
