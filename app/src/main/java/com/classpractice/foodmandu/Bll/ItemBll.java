package com.classpractice.foodmandu.Bll;

import com.classpractice.foodmandu.Api.ItemApi;
import com.classpractice.foodmandu.Api.RetrofitC;
import com.classpractice.foodmandu.Model.Item;
import com.classpractice.foodmandu.StrictModeClass.StrictModeClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ItemBll {
    List<Item> itemList=  new ArrayList<>();
    Boolean status=false;
    ItemApi itemApi  = RetrofitC.getInstance().create(ItemApi.class);

    public  List<Item> getAllItems() {
        Call<List<Item>> itemsCall = itemApi.getAllItemsLIst();
        StrictModeClass.StrictMode();
        try {
            itemList=  itemsCall.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemList;
    }

    public  Boolean insertItem(Item item){
        Call<Void> voidCall = itemApi.insertItem(item);
        voidCall.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if(response.isSuccessful()){
                    status=true;
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                status=false;
            }
        });
        return  status;
    }

}
