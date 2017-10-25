package com.junlong0716.stock;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.google.gson.Gson;
import com.junlong.framecorelibrary.rx.rxbus.RxBus;
import com.junlong0716.retrofitutils.RetrofitUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * @Author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 下午7:27 2017/10/24
 * @Modified By:
 */
public class RequestService extends Service {
    private final String key = "f065fbab3b7e671f6e3cf9b1f8214ee2";
    private Disposable mDisposable;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mDisposable = Observable.interval(2, 2, TimeUnit.SECONDS).subscribe(aLong -> RetrofitUtils.createService(Api.class)
                .getStockInfo(key, "sz002375")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                    }

                    @Override
                    public void onNext(@NonNull ResponseBody body) {
                        Gson gson = new Gson();
                        try {
                            StockBean stockBean = gson.fromJson(body.string(), StockBean.class);
                            if (stockBean.getResultcode().equals("200")) {
                                RxBus.getDefault().post(new StockEvent("STOCK_GET_SUCCESS", stockBean.getResult()));
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                }));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mDisposable.dispose();
    }
}
