package com.michalfujak.marvel_zadanie.Utils;

import com.michalfujak.marvel_zadanie.Retrofit2.IMarvelAPI;
import com.michalfujak.marvel_zadanie.Retrofit2.RetrofitClient;

public class Common
{
    // base url
    public static final String baseUrl = "https://gateway.marvel.com/";


    /**
     * function:  interface
     * return:    Retrofit.getClient
     */
    public static IMarvelAPI getMarvelAPI()
    {
        return RetrofitClient.getClient(baseUrl).create(IMarvelAPI.class);
    }
}
