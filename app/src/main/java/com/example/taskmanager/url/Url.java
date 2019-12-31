package com.example.taskmanager.url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Url {

    // if you are connecting your real device then use your laptop ipaddress and mobile or tablet
    // should be in same network

    // public static final String base_url = "http://192.168.1.11:3000/";
    public static final String base_url = "http://10.0.2.2:3000/";
    // public static final String base_url = "http://172.100.100.5:3000/";

    public static String token = "Bearer ";

    public static Retrofit getInstance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}