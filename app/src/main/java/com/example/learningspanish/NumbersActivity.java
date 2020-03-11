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
        words.add(new Word("one","una",R.drawable.number_one));
        words.add(new Word("two","dos",R.drawable.number_two));
        words.add(new Word("three","tres",R.drawable.number_three));
        words.add(new Word("four","cuatro",R.drawable.number_four));
        words.add(new Word("five","cinco",R.drawable.number_five));
        words.add(new Word("six","seis",R.drawable.number_six));
        words.add(new Word("seven","seite",R.drawable.number_seven));
        words.add(new Word("eight","ocho",R.drawable.number_eight));
        words.add(new Word("nine","neuve",R.drawable.number_nine));
        words.add(new Word("ten","diez",R.drawable.number_ten));


        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
