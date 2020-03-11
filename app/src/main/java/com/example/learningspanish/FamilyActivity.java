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
        words.add(new Word("father", "padre",R.drawable.family_father));
        words.add(new Word("mother", "madre",R.drawable.family_mother));
        words.add(new Word("son", "hijo",R.drawable.family_son));
        words.add(new Word("daughter", "hija",R.drawable.family_daughter));
        words.add(new Word("older brother", "hermano mayor",R.drawable.family_older_brother));
        words.add(new Word("younger brother", "hermano más joven",R.drawable.family_younger_brother));
        words.add(new Word("older sister", "hermana mayor",R.drawable.family_older_sister));
        words.add(new Word("younger sister", "hermana menor",R.drawable.family_younger_sister));
        words.add(new Word("grandmother ", "abuela",R.drawable.family_grandmother));
        words.add(new Word("grandfather", "abuelo",R.drawable.family_grandfather));




        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
