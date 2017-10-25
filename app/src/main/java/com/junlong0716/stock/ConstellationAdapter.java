package com.junlong0716.stock;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.junlong.framecorelibrary.glide.GlideUtil;

import java.util.List;

/**
 * @Author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 上午9:14 2017/10/25
 * @Modified By:
 */
public class ConstellationAdapter extends BaseQuickAdapter<ConstellationBean,BaseViewHolder> {
    public ConstellationAdapter(@LayoutRes int layoutResId, @Nullable List<ConstellationBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ConstellationBean item) {
        helper.setText(R.id.tv_constellation,item.getConstellationName());
        GlideUtil.loadImage(mContext,item.getConstellationPic(),helper.getView(R.id.iv_constellation));
    }
}
