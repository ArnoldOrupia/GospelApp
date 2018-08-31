package in.thegeekybaniya.GospelSongs2017;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Kabir on 04/06/2017.
 */

public interface GetFileUrl {


    @GET("fetch/?format=JSON")
    Call<in.thegeekybaniya.GospelSongs2017.Link> linkYou(@Query("video") String link);
}
