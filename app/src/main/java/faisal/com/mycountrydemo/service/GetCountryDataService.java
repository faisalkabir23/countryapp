package faisal.com.mycountrydemo.service;

import faisal.com.mycountrydemo.model.Info;

import retrofit2.Call;
import retrofit2.http.GET;


public interface GetCountryDataService {



      @GET("country/get/all")
      Call<Info> getResults();








}
