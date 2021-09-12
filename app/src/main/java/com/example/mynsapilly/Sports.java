package com.example.mynsapilly;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Sports extends Fragment {
    String apikey="f7a4dd0a58304e1ea78191c48bc7f3aa";
    ArrayList<ModelClass> modelClassArrayList;
    rAdapter adapter;
    String country = "in";
    private RecyclerView recyclerViewofsports;

    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sportsfragment,null);
        recyclerViewofsports = v.findViewById(R.id.sportsrecylerview);
        modelClassArrayList = new ArrayList<>();
        recyclerViewofsports.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new rAdapter(getContext(),modelClassArrayList);
        recyclerViewofsports.setAdapter(adapter);
        findnews();
        return v;

    }
    public void findnews()
    {
        ApiClass.getApiInterfae().getCategoryNews(country,"sports",100,apikey).enqueue(new Callback<mainNews>() {
            @Override
            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
                if(response.isSuccessful())
                {
                    modelClassArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<mainNews> call, Throwable t) {

            }
        });
    }

}
