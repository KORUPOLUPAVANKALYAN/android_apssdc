package svlevents.pavan.android.rectrofitapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Covid19interface {
    @GET("/dayone/country/IN")
    Call<String> getData();


}
