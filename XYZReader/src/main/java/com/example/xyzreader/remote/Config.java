package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

class Config {
    static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json");
        } catch (MalformedURLException ignored) {
            Log.e(TAG, "Please check your internet connection. Error is - " + ignored);
        }
        BASE_URL = url;
    }
}