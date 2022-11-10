package com.michalfujak.marvel_zadanie.Retrofit2;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient
{

    /**
     * object:  Retrofit
     */
    private static Retrofit retrofit = null;

    /**
     * function:  getClient(param)
     * @param urlBase
     * @return retrofit
     */
    public static Retrofit getClient(String urlBase)
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(urlBase)
                    .addConverterFactory(GsonConverterFactory.create())
                    /*.addCallAdapterFactory(RxJava2CallAdapterFactory.create())*/
                    .build();
        }

        return retrofit;
    }
}
