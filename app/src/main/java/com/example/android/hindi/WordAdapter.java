package com.example.android.hindi;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Words>{
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Words> words,int colorResourceId) {
        super(context, 0, words);
        mColorResourceId=colorResourceId;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        Words currentWords = getItem(position);

        TextView hindiTextView = (TextView) listItemView.findViewById(R.id.hindi_text_view );
        hindiTextView.setText(currentWords.getHindiTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWords.getDefaultTranslation());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        if(currentWords.hasImage()){
            iconView.setImageResource(currentWords.getImageResourceId());
        } else {
            iconView.setVisibility(View.GONE);
        }
        View textContainer=listItemView.findViewById(R.id.text_container);
        int color=ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}