package com.example.android.hindi;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
       final ArrayList<Words> words=new ArrayList<Words>();
        words.add(new Words("father", "पिता",R.drawable.family_father));
        words.add(new Words("mother", "मां",R.drawable.family_mother));
        words.add(new Words("son", "\n" +
                "बेटा",R.drawable.family_son));
        words.add(new Words("daughter", "बेटी",R.drawable.family_daughter));
        words.add(new Words("older brother", "\n" +
                "बड़ा भाई",R.drawable.family_older_brother));
        words.add(new Words("younger brother", "\n" +
                "छोटा भाई",R.drawable.family_younger_brother));
        words.add(new Words("older sister", "बड़ी बहन",R.drawable.family_older_sister));
        words.add(new Words("younger sister", "\n" +
                "छोटी बहन",R.drawable.family_younger_sister));
        words.add(new Words
                ("grandmother", "\n" +
                        "दादी मा",R.drawable.family_grandmother));
        words.add(new Words("grandfather", "\n" +
                "दादा",R.drawable.family_grandfather));
        WordAdapter adapter=new WordAdapter(this,words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}


