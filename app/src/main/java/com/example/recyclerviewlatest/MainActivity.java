package com.example.recyclerviewlatest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> imageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBitmaps();
    }

    private void initBitmaps() {

        imageUrls.add("https://www.gstatic.com/webp/gallery/1.jpg");
        names.add("tab");

        imageUrls.add("https://www.gstatic.com/webp/gallery/3.jpg");
        names.add("Harry Potter Villa");

        imageUrls.add("http://tineye.com/images/widgets/mona.jpg");
        names.add("Girl Pose");

        imageUrls.add("https://picsum.photos/id/237/200/300");
        names.add("Bud");

        imageUrls.add("https://images.unsplash.com/photo-1595053826328-8960421772e9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        names.add("Laptop");

        imageUrls.add("https://picsum.photos/seed/picsum/200/300");
        names.add("Building");

        imageUrls.add("https://picsum.photos/200/300?grayscale");
        names.add("Basket ball");

        imageUrls.add("https://picsum.photos/200/300/?blur");
        names.add("Good food Good Life");

        initRecyclerView();;
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.rv_list);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(names, imageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

     }

}
