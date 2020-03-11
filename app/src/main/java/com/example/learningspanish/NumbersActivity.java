package com.example.learningspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("zero","cero"));
        words.add(new Word("one","una"));
        words.add(new Word("two","dos"));
        words.add(new Word("three","tres"));
        words.add(new Word("four","cuatro"));
        words.add(new Word("five","cinco"));
        words.add(new Word("six","seis"));
        words.add(new Word("seven","seite"));
        words.add(new Word("eight","ocho"));
        words.add(new Word("nine","neuve"));
        words.add(new Word("ten","diez"));




        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
