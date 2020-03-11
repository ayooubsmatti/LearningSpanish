package com.example.learningspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "roja"));
        words.add(new Word("mustard yellow", "Amarillo mostaza"));
        words.add(new Word("dusty yellow", "Amarillo polvoriento"));
        words.add(new Word("green", "verde"));
        words.add(new Word("brown", "marrón"));
        words.add(new Word("gray", "gris"));
        words.add(new Word("black", "negro"));
        words.add(new Word("white", "blanco"));




        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
