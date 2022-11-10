package com.michalfujak.marvel_zadanie.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.michalfujak.marvel_zadanie.Authorization.Auth;
import com.michalfujak.marvel_zadanie.DataDTO.Character;
import com.michalfujak.marvel_zadanie.DataDTO.CharacterDataWrapper;
import com.michalfujak.marvel_zadanie.Modul.Characters;
import com.michalfujak.marvel_zadanie.R;
import com.michalfujak.marvel_zadanie.Retrofit2.IMarvelAPI;
import com.michalfujak.marvel_zadanie.Utils.Common;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public Auth objAuth;

    IMarvelAPI serviceMarvelAPI;
    //RX Java
    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objAuth = new Auth();

        serviceMarvelAPI = Common.getMarvelAPI();

        // LoadList

        compositeDisposable.add(serviceMarvelAPI.getCharactersMarvel(objAuth.timeStamp, objAuth.PUBLIC_KEY, objAuth.hashData())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<Characters>>() {
                    @Override
                    public void accept(List<Characters> characters) throws Exception {

                        // viewAdapterTest(characters);
                    }
                })
        );



    }

    private void viewAdapterTest(List<Characters> characters)
    {
        Log.d("Out: ", characters.toString());
    }
}