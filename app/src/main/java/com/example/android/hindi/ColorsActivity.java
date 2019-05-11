package com.example.android.hindi;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("red", "लाल", R.drawable.color_red));
        words.add(new Words("green", "\n" +
                "हरा", R.drawable.color_green));
        words.add(new Words("brown", "\n" +
                "भूरा", R.drawable.color_brown));
        words.add(new Words("gray", "\n" +
                "धूसर", R.drawable.color_gray));
        words.add(new Words("black", "\n" +
                "काली", R.drawable.color_black));
        words.add(new Words("white", "\n" +
                "सफेद", R.drawable.color_white));
        words.add(new Words("dusty yellow", "\n" +
                "धूल भरा पीला", R.drawable.color_dusty_yellow));
        words.add(new Words("mustard yellow", "\n" +
                "सरसों का पीला", R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
    @Override
    protected void onStop() {
        super.onStop();
    }

}


