package com.example.mynsapilly;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClass {
    private static Retrofit retrofit = null;
    public static ApiInterface getApiInterfae()
    {
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build() ;


        }
       return retrofit.create(ApiInterface.class);
    }
    
}
