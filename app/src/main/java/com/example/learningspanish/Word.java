package com.example.learningspanish;

public class Word {
    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mDefaultTranslation;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mSpanishTranslation;

    // audio resource ID
    private int mAudioResourceId;

    // Drawable resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED= -1;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Word(String DefaultTranslation, String SpanishTranslation,int imageResourceId, int AudioResourceId)
    {
        mDefaultTranslation = DefaultTranslation;
        mSpanishTranslation = SpanishTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId    = AudioResourceId;
    }
    public Word(String DefaultTranslation, String SpanishTranslation,int AudioResourceId)
    {
        mDefaultTranslation = DefaultTranslation;
        mSpanishTranslation = SpanishTranslation;
        mAudioResourceId    = AudioResourceId;
    }

    /**
     * Get the name of the Android version
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Android version number
     */
    public String getSpanishTranslation() {
        return mSpanishTranslation;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the audio resource ID
     */
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    public Boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
