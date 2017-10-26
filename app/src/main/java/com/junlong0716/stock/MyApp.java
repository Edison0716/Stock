package com.junlong0716.stock;

import com.baidu.mapapi.SDKInitializer;
import com.junlong.framecorelibrary.BaseApplication;
import com.junlong0716.retrofitutils.BaseRetrofitClient;

/**
 * @author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 下午3:27 2017/10/24
 * @Modified By:
 */
public class MyApp extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        BaseRetrofitClient.getInstance().setBaseUrl("http://web.juhe.cn:8080/").init(this);
        SDKInitializer.initialize(this);
    }

}
