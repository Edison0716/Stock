package com.junlong0716.stock;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.junlong.framecorelibrary.base.BaseMvcFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 巴黎没有摩天轮Li
 * @Description:
 * @Date: Created in 下午3:35 2017/10/24
 * @Modified By:
 */
public class ConstellationFragment extends BaseMvcFragment {

    private RecyclerView mRvConstellation;
    private List<ConstellationBean> mConstellationBeanList;
    @Override
    protected void showLoading() {

    }

    @Override
    protected void hideLoading() {

    }

    @Override
    protected void initData() {
        mConstellationBeanList = new ArrayList<>();
        mConstellationBeanList.add(new ConstellationBean("水瓶座","https://www.baidu.com/aladdin/img/stars/shuiping.png"));
        mConstellationBeanList.add(new ConstellationBean("双鱼座","https://www.baidu.com/aladdin/img/stars/shuangyu.png"));
        mConstellationBeanList.add(new ConstellationBean("白羊座","https://www.baidu.com/aladdin/img/stars/baiyang.png"));
        mConstellationBeanList.add(new ConstellationBean("金牛座","https://www.baidu.com/aladdin/img/stars/jinniu.png"));
        mConstellationBeanList.add(new ConstellationBean("双子座","https://www.baidu.com/aladdin/img/stars/shuangzi.png"));
        mConstellationBeanList.add(new ConstellationBean("巨蟹座","https://www.baidu.com/aladdin/img/stars/juxie.png"));
        mConstellationBeanList.add(new ConstellationBean("狮子座","https://www.baidu.com/aladdin/img/stars/shizi.png"));
        mConstellationBeanList.add(new ConstellationBean("处女座","https://www.baidu.com/aladdin/img/stars/chunv.png"));
        mConstellationBeanList.add(new ConstellationBean("天秤座","https://www.baidu.com/aladdin/img/stars/tianping.png"));
        mConstellationBeanList.add(new ConstellationBean("天蝎座","https://www.baidu.com/aladdin/img/stars/tianxie.png"));
        mConstellationBeanList.add(new ConstellationBean("射手座","https://www.baidu.com/aladdin/img/stars/sheshou.png"));
        mConstellationBeanList.add(new ConstellationBean("魔羯座","https://www.baidu.com/aladdin/img/stars/mojie.png"));
    }

    @Override
    protected void initView() {
        mRvConstellation = bindView(R.id.rv_constellation_list);
        mRvConstellation.setLayoutManager(new GridLayoutManager(getContext(),2));
        mRvConstellation.setAdapter(new ConstellationAdapter(R.layout.item_constellation_layout,mConstellationBeanList));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_constellation;
    }
}
