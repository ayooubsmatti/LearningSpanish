package com.example.learningspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    /** Handles playback of all the sound files */
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one","uno",R.drawable.number_one,R.raw.numero_one));
        words.add(new Word("two","dos",R.drawable.number_two,R.raw.numero_two));
        words.add(new Word("three","tres",R.drawable.number_three,R.raw.numero_thres));
        words.add(new Word("four","cuatro",R.drawable.number_four,R.raw.numero_four));
        words.add(new Word("five","cinco",R.drawable.number_five,R.raw.numero_five));
        words.add(new Word("six","seis",R.drawable.number_six,R.raw.numero_six));
        words.add(new Word("seven","seite",R.drawable.number_seven,R.raw.numero_seven));
        words.add(new Word("eight","ocho",R.drawable.number_eight,R.raw.numero_eight));
        words.add(new Word("nine","neuve",R.drawable.number_nine,R.raw.numero_nine));
        words.add(new Word("ten","diez",R.drawable.number_ten,R.raw.numero_ten));


        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });


    }
}
