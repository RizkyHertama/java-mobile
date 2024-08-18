package com.example.javaretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

//Ini adalah interface yang mendefinisikan endpoint API yang akan digunakan dengan Retrofit.
public interface JSONPlaceholder {

    //posts didapatkan dari endpoint API https://jsonplaceholder.typicode.com/posts
    @GET("posts")
    Call<List<Post>> getPost();
}
