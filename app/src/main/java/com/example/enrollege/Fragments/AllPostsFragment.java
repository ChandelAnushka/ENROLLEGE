package com.example.enrollege.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.enrollege.Adapters.RecyclerAdapterPosts;
import com.example.enrollege.Classes.Posts;
import com.example.enrollege.R;

import java.util.ArrayList;
import java.util.List;

public class AllPostsFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerAdapterPosts recyclerAdapterPosts ;

    @Override
    public void onStart() {
        super.onStart();
        Log.i("on", "start");
        Toast.makeText(getActivity().getApplicationContext(),"AllPosts fragment",Toast.LENGTH_SHORT).show();

        List<Posts> postsList;
        postsList = new ArrayList<>();
        Posts post = new Posts();
        post.setTextViewDate("bhjb");
        post.setTextViewName("vbnv");
        post.setTextViewTime("njmnj");
        post.setTextViewUserName("nmb");
        postsList.add(post);
        recyclerView = getView().findViewById(R.id.viewpagerRecycler);
        LinearLayoutManager mlayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mlayoutManager);
        recyclerAdapterPosts= new RecyclerAdapterPosts(postsList);
        recyclerView.setAdapter(recyclerAdapterPosts);
        Log.i("value of recycler", "hh");


        //TODO first you have to assign variables here and than you can use setonclicklistener in onstart
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_posts,container,false);
        Log.i("on","create");
        return rootView;
    }
}
