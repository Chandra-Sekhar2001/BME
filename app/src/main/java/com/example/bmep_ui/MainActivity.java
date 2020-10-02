package com.example.bmep_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> mImageIds = new ArrayList <>(Arrays.asList(
            R.drawable.abhinandan_k_18ch8060,R.drawable.abhishek_k_18cs8036,R.drawable.kritika_r_18ch8012));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        GridView gridView = findViewById(R.id.myGrid);
        gridView.setAdapter(new ImageAdaptor(mImageIds,this));
//
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item_pos = mImageIds.get(position);
                Intent i = new Intent(MainActivity.this,full_image_view.class);
                i.putExtra("img_id",item_pos);
                startActivity(i);

            }
        });





    }

    //public void ShowDialogBox(int item_pos){
        //Dialog dialog = new Dialog(this);
        //dialog.setContentView();
    //}
}
