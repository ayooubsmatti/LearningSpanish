package com.example.learningspanish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    /** Handles playback of all the sound files */
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "¿A dónde vas?",R.raw.where_are_you_going));
        words.add(new Word("What is your name?", "¿Cuál es tu nombre?",R.raw.what_is_your_name));
        words.add(new Word("My name is...", "Me llamo...",R.raw.my_name_is));
        words.add(new Word("How are you feeling?", "¿Como te sientes?",R.raw.how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "Me siento bien",R.raw.im_feeling_good));
        words.add(new Word("Are you coming?", "¿Vienes?",R.raw.are_you_coming));
        words.add(new Word("Yes, I’m coming.", "Si, voy para allá.",R.raw.yes_im_coming));
        words.add(new Word("I’m coming.", "Ya voy.",R.raw.im_coming));
        words.add(new Word("Let’s go.", "Vamonos.",R.raw.lets_go));
        words.add(new Word("Come here.", "Ven aca.",R.raw.come_here));




        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });

    }
}
