package com.example.kt_hoangquocviet_22115141122125.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kt_hoangquocviet_22115141122125.bookmarkAdapter;
import com.example.kt_hoangquocviet_22115141122125.R;
import com.example.kt_hoangquocviet_22115141122125.bookmark;


import java.util.ArrayList;
import java.util.List;

public class BookMarkFragment extends Fragment {

    private RecyclerView recyclerView;
    private bookmarkAdapter bookmarkAdapter;
    private List<bookmark> bookmarkList;

    public BookMarkFragment() {
        // Required empty public constructor
    }

    public static BookMarkFragment newInstance(String param1, String param2) {
        BookMarkFragment fragment = new BookMarkFragment();
        Bundle args = new Bundle();
        args.putString("param1", param1);
        args.putString("param2", param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // Xử lý các tham số truyền vào nếu cần
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book_mark, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Liên kết RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView_bookmarks);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Tạo danh sách dữ liệu mẫu
        bookmarkList = new ArrayList<>();
        bookmarkList.add(new bookmark("Bookmark 1", "This is the first bookmark."));
        bookmarkList.add(new bookmark("Bookmark 2", "This is the second bookmark."));
        bookmarkList.add(new bookmark("Bookmark 3", "This is the third bookmark."));

        // Gắn Adapter
        bookmarkAdapter = new bookmarkAdapter(bookmarkList);
        recyclerView.setAdapter(bookmarkAdapter);
    }
}
