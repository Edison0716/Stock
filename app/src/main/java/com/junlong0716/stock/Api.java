package com.junlong0716.stock;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @Author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 下午4:30 2017/10/24
 * @Modified By:
 */
public interface Api {
    @GET("finance/stock/hs")
    Observable<ResponseBody> getStockInfo(@Query("key") String key, @Query("type") int type);

    @GET("finance/stock/hs")
    Observable<ResponseBody> getStockInfo(@Query("key") String key, @Query("gid") String gid);
}
