package com.junlong.framecorelibrary;

import android.app.Application;
import android.content.Context;

import com.junlong.framecorelibrary.util.Utils;

/**
 * Created by ${巴黎没有摩天轮Li} on 2017/7/13.
 */

public class BaseApplication extends Application {
    public static Context mContext;//全局上下文
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        Utils.init(this);//初始化工具类
    }
}
