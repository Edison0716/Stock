package com.junlong0716.stock;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.junlong.framecorelibrary.base.BaseMvcFragment;
import com.junlong.framecorelibrary.rx.rxbus.RxBus;
import com.junlong.framecorelibrary.rx.rxbus.Subscribe;
import com.junlong.framecorelibrary.rx.rxbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 下午3:35 2017/10/24
 * @Modified By:
 */
public class StockFragment extends BaseMvcFragment {
    private List<StockBean.ResultBean> mStockList;
    private StockAdapter mStockAdapter;
    private Intent mIntent;
    private MaterialDialog mDialog;

    //EventBus 3.0 回调
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void eventBus(StockEvent s) {
        if (s.getFlag().equals("STOCK_GET_SUCCESS")) {
            mStockList.clear();
            mStockList.addAll(s.getStockList());
            mStockAdapter.notifyDataSetChanged();
            mDialog.dismiss();
        }
    }

    @Override
    protected void showLoading() {

    }

    @Override
    protected void hideLoading() {

    }

    @Override
    protected void initData() {

        mDialog = new MaterialDialog.Builder(getActivity())
                .content("数据加载中...")
                .progress(true, 0)
                .progressIndeterminateStyle(true)
                .show();


        mStockList = new ArrayList<>();
    }

    @Override
    protected void initView() {
        RxBus.getDefault().register(this);
        RecyclerView rvStockList = bindView(R.id.rv_stock_list);
        rvStockList.setLayoutManager(new LinearLayoutManager(getContext()));
        mStockAdapter = new StockAdapter(R.layout.item_stock_layout, mStockList);
        rvStockList.setAdapter(mStockAdapter);
        mIntent = new Intent(getContext(), RequestService.class);
        getContext().startService(mIntent);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_stock;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getContext().stopService(mIntent);
    }

    @Override
    public void onResume() {
        super.onResume();
        getContext().startService(mIntent);
    }

    @Override
    public void onStop() {
        super.onStop();
        getContext().stopService(mIntent);
    }
}
