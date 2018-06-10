package com.example.manju7.android_listview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListviewAdaptor extends BaseAdapter {


    Context context;
    LayoutInflater layoutInflater;
    List<Model> modelList;
    ArrayList<Model> arrayList;


    public ListviewAdaptor(Context context, List<Model> modelList) {
        this.context = context;
        this.modelList = modelList;
        layoutInflater=LayoutInflater.from(context);
        this.arrayList=new ArrayList<Model>();
        this.arrayList.addAll(modelList);
    }

    public class ViewHolder{

        TextView title1,desc1;
        ImageView icon1;


    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView==null){

            viewHolder=new ViewHolder();
            convertView=layoutInflater.inflate(R.layout.list_row,null);


            viewHolder.icon1=convertView.findViewById(R.id.icon);
            viewHolder.title1=convertView.findViewById(R.id.title);
            viewHolder.desc1=convertView.findViewById(R.id.description);

            convertView.setTag(viewHolder);
        }else {

            viewHolder=(ViewHolder)convertView.getTag();
        }

            viewHolder.icon1.setImageResource(modelList.get(position).getIcon());
            viewHolder.title1.setText(modelList.get(position).getTitle());
            viewHolder.desc1.setText(modelList.get(position).getDescription());


            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(modelList.get(position).getTitle().equals("Google")){

                        Intent intent=new Intent(context,NewActivity.class);
                        intent.putExtra("actionBarTitle","Google");
                        intent.putExtra("content","online advertising technologies, search engine, cloud computing, software, and hardware");
                        context.startActivity(intent);
                    }

                    if(modelList.get(position).getTitle().equals("Facebook")){

                        Intent intent=new Intent(context,NewActivity.class);
                        intent.putExtra("actionBarTitle","Facebook");
                        intent.putExtra("content","Online social media and social networking service");
                        context.startActivity(intent);
                    }

                    if(modelList.get(position).getTitle().equals("Instagram")){

                        Intent intent=new Intent(context,NewActivity.class);
                        intent.putExtra("actionBarTitle","Instagram");
                        intent.putExtra("content","Photo and video-sharing social networking service");
                        context.startActivity(intent);
                    }

                    if(modelList.get(position).getTitle().equals("Amazon")){

                        Intent intent=new Intent(context,NewActivity.class);
                        intent.putExtra("actionBarTitle","Amazon");
                        intent.putExtra("content","Electronic commerce and cloud computing company");
                        context.startActivity(intent);
                    }

                    if(modelList.get(position).getTitle().equals("Apple")){

                        Intent intent=new Intent(context,NewActivity.class);
                        intent.putExtra("actionBarTitle","Apple");
                        intent.putExtra("content","Designs, develops, and sells consumer electronics, computer software, and online services");
                        context.startActivity(intent);
                    }

                    if(modelList.get(position).getTitle().equals("Flipkart")){

                        Intent intent=new Intent(context,NewActivity.class);
                        intent.putExtra("actionBarTitle","Flipkart");
                        intent.putExtra("content","Electronic commerce company based in Bengaluru");
                        context.startActivity(intent);
                    }

                }


            });


        return convertView;
    }



}
