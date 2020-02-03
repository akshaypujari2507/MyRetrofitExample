package com.retrofit.exapmle.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.retrofit.exapmle.network.modules.MyResponse;
import com.retrofit.exapmle.network.modules.MyResponseDeserializer;

import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {

        retrofit = new Retrofit.Builder()
                .baseUrl("https://cricket.yahoo.net/sifeeds/cricket/live/json/")
                .addConverterFactory(createGsonConverter())
                .build();



        return retrofit;
    }

    private static Converter.Factory createGsonConverter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MyResponse.class, new MyResponseDeserializer());
        Gson gson = gsonBuilder.create();
        return GsonConverterFactory.create(gson);
    }
}
