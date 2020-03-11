package com.example.learningspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father", "padre"));
        words.add(new Word("mother", "madre"));
        words.add(new Word("son", "hijo"));
        words.add(new Word("daughter", "hija"));
        words.add(new Word("older brother", "hermano mayor"));
        words.add(new Word("younger brother", "hermano más joven"));
        words.add(new Word("older sister", "hermana mayor"));
        words.add(new Word("younger sister", "hermana menor"));
        words.add(new Word("grandmother ", "abuela"));
        words.add(new Word("grandfather", "abuelo"));




        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
