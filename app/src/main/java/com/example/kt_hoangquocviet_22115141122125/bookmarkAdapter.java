package com.example.kt_hoangquocviet_22115141122125;

// BookmarkAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class bookmarkAdapter extends RecyclerView.Adapter<bookmarkAdapter.BookmarkViewHolder>
{

    private List<bookmark> bookmarkList;

    public bookmarkAdapter(List<bookmark> bookmarkList) {
        this.bookmarkList = bookmarkList;
    }

    @NonNull
    @Override
    public BookmarkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bookmark, parent, false);
        return new BookmarkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookmarkViewHolder holder, int position) {
        bookmark bookmark = bookmarkList.get(position);
        holder.titleTextView.setText(bookmark.getTitle());
        holder.descriptionTextView.setText(bookmark.getDescription());
    }

    @Override
    public int getItemCount() {
        return bookmarkList.size();
    }

    static class BookmarkViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, descriptionTextView;

        public BookmarkViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.tv_title);
            descriptionTextView = itemView.findViewById(R.id.tv_description);
        }
    }
}

