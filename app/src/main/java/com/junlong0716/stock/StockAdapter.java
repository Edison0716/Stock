package com.junlong0716.stock;

import android.os.Build;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * @Author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 下午6:41 2017/10/24
 * @Modified By:
 */
public class StockAdapter extends BaseQuickAdapter<StockBean.ResultBean, BaseViewHolder> {
    public StockAdapter(@LayoutRes int layoutResId, @Nullable List<StockBean.ResultBean> data) {
        super(layoutResId, data);

    }

    @Override
    protected void convert(BaseViewHolder helper, StockBean.ResultBean item) {
        helper.setText(R.id.tv_stock_name, item.getData().getName());
        double increasePre = Double.parseDouble(item.getData().getIncrePer());
        if (increasePre < 0) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                helper.setTextColor(R.id.tv_stock_increase_precent, mContext.getColor(R.color.green));
            }
        } else if (increasePre > 0) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                helper.setTextColor(R.id.tv_stock_increase_precent, mContext.getColor(R.color.red));
            }
        }
        helper.setText(R.id.tv_stock_increase_precent, item.getData().getIncrePer()+"%");
    }
}
