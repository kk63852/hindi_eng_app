package com.example.android.hindi;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
       final ArrayList<Words> words=new ArrayList<Words>();
        words.add(new Words("Where are you going?", "\n" +
                "तुम कहाँ जा रहे हो?"));
        words.add(new Words("What is your name?", "तुम्हारा नाम क्या हे?"));
        words.add(new Words("My name is...",
                "मेरा नाम है..."));
        words.add(new Words("How are you feeling?", "\n" +
                "आप कैसा महसूस कर रहे हैं?"));
        words.add(new Words("I’m feeling good.", "\n" +
                "मैं अच्छा महसूस कर रहा हूँ।"));
        words.add(new Words("Are you coming?", "क्या तुम आ रहे हो?"));
        words.add(new Words("Yes, I’m coming.",
                "\n" +
                        "हाँ, आ रहा हूं।"));
        words.add(new Words("I’m coming.", "मैं आ रहा हूँ"));
        words.add(new Words
                ("Let’s go.", "\n" +
                        "चलिए चलते हैं।"));
        words.add(new Words("Come here.", "\n" + "यहाँ आओ।"));
        WordAdapter adapter=new WordAdapter(this,words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
    @Override
    protected void onStop() {
        super.onStop();

    }


}


