package com.classpractice.foodmandu.Bll;

import android.util.Log;


import com.classpractice.foodmandu.Api.RetrofitC;
import com.classpractice.foodmandu.Api.UserAPI;
import com.classpractice.foodmandu.Response.SignUpResponse;
import com.classpractice.foodmandu.Url.Url;
import java.io.IOException;
import retrofit2.Call;
import retrofit2.Response;
import android.util.Log;

public class LoginBll {
    boolean isSuccess = false;

    public boolean checkUser(String username, String password) {

        UserAPI userAPI = RetrofitC.getInstance().create(UserAPI.class);
        Call<SignUpResponse> usersCall = userAPI.checkUser(username, password);

        try {
            Response<SignUpResponse> loginResponse = usersCall.execute();
            if (loginResponse.isSuccessful() &&
                    loginResponse.body().getStatus().equals("Login success!")) {

                Url.token += loginResponse.body().getToken();
                // Url.Cookie = imageResponseResponse.headers().get("Set-Cookie");
                Log.d("token received", "checkUser: " + Url.token);
                isSuccess = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}
