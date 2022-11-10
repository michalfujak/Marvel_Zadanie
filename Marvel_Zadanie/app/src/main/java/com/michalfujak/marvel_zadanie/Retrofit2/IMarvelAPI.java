package com.michalfujak.marvel_zadanie.Retrofit2;

import com.michalfujak.marvel_zadanie.DataDTO.Character;
import com.michalfujak.marvel_zadanie.DataDTO.CharacterDataWrapper;
import com.michalfujak.marvel_zadanie.Modul.Characters;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IMarvelAPI
{

    @GET("/v1/public/characters")
    Observable<List<Characters>> getCharactersMarvel(
            @Query("ts") String ts,
            @Query("apikey") String apikey,
            @Query("hash") String hash
    );
}
