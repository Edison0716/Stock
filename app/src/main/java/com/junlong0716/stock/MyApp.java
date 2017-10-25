package com.junlong0716.stock;

import android.app.Application;
import android.widget.Toast;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.navisdk.adapter.BaiduNaviManager;
import com.junlong.framecorelibrary.util.Utils;
import com.junlong0716.retrofitutils.BaseRetrofitClient;

/**
 * @Author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 下午3:27 2017/10/24
 * @Modified By:
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        BaseRetrofitClient.getInstance().setBaseUrl("http://web.juhe.cn:8080/").init(this);
        SDKInitializer.initialize(this);
    }

}
