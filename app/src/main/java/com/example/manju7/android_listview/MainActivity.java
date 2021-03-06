package com.example.manju7.android_listview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ListviewAdaptor listviewAdaptor;
    String[] title;
    String[] description;
    int[] icon;
    ArrayList<Model> arrayList=new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("MNC List");



        title=new String[]{"Google","Facebook","Instagram","Amazon","Apple","Flipkart"};
        description=new String[]{"Internet-related services and products","Online social media","Photo and video-sharing","Electronic commerce","Electronics","Electronic commerce"};
        icon=new int[]{R.drawable.google,R.drawable.facebook,R.drawable.insta,R.drawable.amazon,R.drawable.apple,R.drawable.flipkart};

        listView=(ListView)findViewById(R.id.listview);

        for (int i=0; i<title.length; i++){

            Model model=new Model(icon[i],title[i],description[i]);
            arrayList.add(model);
        }

        listviewAdaptor=new ListviewAdaptor(this,arrayList);
        listView.setAdapter(listviewAdaptor);
    }
}
