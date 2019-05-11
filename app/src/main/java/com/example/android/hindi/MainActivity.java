/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.hindi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        TextView Numbers = (TextView) findViewById(R.id.numbers);
        Numbers.setOnClickListener(new View.OnClickListener()

        {//the code in this method will be executed
            @Override
            public void onClick(View view){
            Intent numbersIntent = new Intent(MainActivity.this, numbers.class);
            startActivity(numbersIntent);
        }

        });
        TextView Colors = (TextView) findViewById(R.id.colors);
        Colors.setOnClickListener(new View.OnClickListener()

        {//the code in this method will be executed
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(numbersIntent);
            }

        });
        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener()

        {//the code in this method will be executed
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this, Phrases.class);
                startActivity(numbersIntent);
            }

        });
        TextView FamilyMembers = (TextView) findViewById(R.id.family);
        FamilyMembers.setOnClickListener(new View.OnClickListener()

        {//the code in this method will be executed
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this, FamilyMembers.class);
                startActivity(numbersIntent);
            }

        });
    }
}

