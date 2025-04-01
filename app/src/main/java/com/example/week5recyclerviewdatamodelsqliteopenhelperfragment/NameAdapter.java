package com.example.week5recyclerviewdatamodelsqliteopenhelperfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameViewHolder> {
    private List<Name> nameList;
    private NameListFragment fragment;

    public NameAdapter(List<Name> nameList, NameListFragment fragment) {
        this.nameList = nameList;
        this.fragment = fragment;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1, parent, false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {
        Name name = nameList.get(position);
        holder.textView.setText(name.getNameText());
        holder.itemView.setOnClickListener(v -> fragment.onItemClicked(name));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public void updateList(List<Name> newList) {
        nameList = newList;
        notifyDataSetChanged();
    }

    static class NameViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public NameViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(android.R.id.text1);
        }
    }
}