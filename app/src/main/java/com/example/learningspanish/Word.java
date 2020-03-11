package com.example.learningspanish;

public class Word {
    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mDefaultTranslation;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mSpanishTranslation;

    // Drawable resource ID
//    private int mImageResourceId;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Word(String DefaultTranslation, String SpanishTranslation)
    {
        mDefaultTranslation = DefaultTranslation;
        mSpanishTranslation = SpanishTranslation;
//      mImageResourceId = imageResourceId;
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
//    public int getImageResourceId() {
//        return mImageResourceId;
//    }
}
