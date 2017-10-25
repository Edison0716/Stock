package com.junlong0716.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 下午7:29 2017/10/24
 * @Modified By:
 */
public class StockEvent {
    private String flag;
    private List<StockBean.ResultBean> mStockList;

    public StockEvent(String flag, List<StockBean.ResultBean> stockList) {
        this.flag = flag;
        mStockList = stockList;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<StockBean.ResultBean> getStockList() {
        return mStockList;
    }

    public void setStockList(ArrayList<StockBean.ResultBean> stockList) {
        mStockList = stockList;
    }
}
