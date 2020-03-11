package com.example.learningspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "¿A dónde vas?"));
        words.add(new Word("What is your name?", "¿Cuál es tu nombre?"));
        words.add(new Word("My name is...", "Me llamo..."));
        words.add(new Word("How are you feeling?", "¿Como te sientes?"));
        words.add(new Word("I’m feeling good.", "Me siento bien"));
        words.add(new Word("Are you coming?", "¿Vienes?"));
        words.add(new Word("Yes, I’m coming.", "Si, voy para allá."));
        words.add(new Word("I’m coming.", "Ya voy."));
        words.add(new Word("Let’s go.", "Vamonos."));
        words.add(new Word("Come here.", "Ven aca."));




        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
