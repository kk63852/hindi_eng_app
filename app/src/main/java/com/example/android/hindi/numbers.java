package com.example.android.hindi;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.ListView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

       final ArrayList<Words> words=new ArrayList<Words>();
        words.add(new Words("one", "\n" +
                "एक",R.drawable.number_one));
        words.add(new Words("two", "दो",R.drawable.number_two));
        words.add(new Words("three", "\n" +
                "तीन",R.drawable.number_three));
        words.add(new Words("four", "\n" +
                "चार",R.drawable.number_four));
        words.add(new Words("five", "\n" +
                "पंज",R.drawable.number_five));
        words.add(new Words("six", "\n" +
                "छह",R.drawable.number_six));
        words.add(new Words("seven", "\n" +
                "सात",R.drawable.number_seven));
        words.add(new Words("eight", "\n" +
                "आठ",R.drawable.number_eight));
        words.add(new Words
                ("nine", "\n" +
                        "नौ",R.drawable.number_nine));
        words.add(new Words("ten", "\n" +
                "दस",R.drawable.number_ten));
        WordAdapter adapter=new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        }
    }



