package com.example.learningspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    /** Handles playback of all the sound files */
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "roja",R.drawable.color_red,R.raw.color_red));
        words.add(new Word("mustard yellow", "Amarillo mostaza",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        words.add(new Word("dusty yellow", "Amarillo polvoriento",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word("green", "verde",R.drawable.color_green,R.raw.color_green));
        words.add(new Word("brown", "marrón",R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("gray", "gris",R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word("black", "negro",R.drawable.color_black,R.raw.color_black));
        words.add(new Word("white", "blanco",R.drawable.color_white,R.raw.color_white));




        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });

    }
}
