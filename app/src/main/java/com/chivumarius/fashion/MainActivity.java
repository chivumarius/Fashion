package com.chivumarius.fashion;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;




public class MainActivity extends AppCompatActivity {


    // ▼ "DECLARATION" OF "WIDGETS" AND "VARIABLES" ▼
    private RecyclerView staggeredRV;
    private RecyclerViewAdaptery adapter;
    private StaggeredGridLayoutManager manager;
    private List<row> appList;



    // ▼ "IMAGES" FOR "CARDS" ▼
    int[] covers = new int[]{
            R.drawable.fash1,
            R.drawable.fash2,
            R.drawable.fash3,
            R.drawable.fash4,
            R.drawable.fash5,
            R.drawable.fash6
    };




    // ▬ "ON CREATE()" METHOD ▬
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // ▼ 1- "INITIALIZING RECYCLERVIEW" ▼
        staggeredRV = findViewById(R.id.recyclerView);


        // ▼ 2- GETTING "DATA" ▼
        appList = new ArrayList<>();


        // ▼ 3- CREATING "ADAPTER" ▼
        adapter = new RecyclerViewAdaptery(this, appList);

        // ▼  CREATING "MANAGER" ▼
        manager = new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL);


        // ▼ 4- SETTING "LAYOUT MANAGER" ▼
        staggeredRV.setLayoutManager(manager);


        // ▼ 5- SETTING "ADAPTER" AS "ADAPTER" ▼
        staggeredRV.setAdapter(adapter);


        // ▼ 6- INSERTING "DATA" ▼
        InitializeDataIntoRecyclerView();
    }




    // ▬ "ON START()" METHOD ▬
    @SuppressLint("NotifyDataSetChanged")
    private void InitializeDataIntoRecyclerView() {

        row a = new row(covers[0] , "Box Tee");
        appList.add(a);

        a = new row(covers[1],"Boyfriend Tee");
        appList.add(a);

        a = new row(covers[2], "Boyfriend Tee");
        appList.add(a);

        a = new row(covers[3], "Shirt Sleeve");
        appList.add(a);

        a = new row(covers[4], "Boyfriend Tee");
        appList.add(a);

        a = new row(covers[5], "Shirt Sleeve");
        appList.add(a);

        adapter.notifyDataSetChanged();
    }

}