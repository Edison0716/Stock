package com.junlong0716.stock;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.BoolRes;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.junlong.framecorelibrary.base.BaseMvcActivity;
import com.junlong.framecorelibrary.util.StatusBarUtils;

public class HomeActivity extends BaseMvcActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawer;
    private NavigationView mNavigationView;
    private StockFragment mStockFragment;
    private static final String KEY_BOTTOM_NAVIGATION_VIEW_SELECTED_ID = "KEY_BOTTOM_NAVIGATION_VIEW_SELECTED_ID";
    private ConstellationFragment mConstellationFragment;
    private Toolbar mToolbar;
    private String mCurrentMenu = "STOCK";

    @Override
    protected void showLoading() {

    }

    @Override
    protected void hideLoading() {

    }

    @Override
    protected int setScreenOrientation() {
        return 1;
    }

    @Override
    protected void initView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.setDrawerListener(toggle);
        toggle.syncState();
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);
        mNavigationView.setCheckedItem(R.id.nav_stock);
        StatusBarUtils.setColorForDrawerLayout(this, mDrawer, getResources().getColor(R.color.colorPrimaryDark), 0);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragments(savedInstanceState);
        showFragment(mStockFragment);
       /* if (savedInstanceState != null) {
            int id = savedInstanceState.getInt(KEY_BOTTOM_NAVIGATION_VIEW_SELECTED_ID, R.id.nav_timeline);
            switch (id) {
                case R.id.nav_timeline:
                    showFragment(mTimelineFragment);
                    break;
                case R.id.nav_favorites:
                    showFragment(mFavoritesFragment);
                    break;
                case R.id.nav_info:
                    showFragment(mInfoFragment);
                    break;
            }
        } else {
            if (getIntent().getAction().equals(ACTION_FAVORITES)) {
                showFragment(mFavoritesFragment);
                mBottomNavigationView.setSelectedItemId(R.id.nav_favorites);
            } else {
                showFragment(mTimelineFragment);
            }
        }*/
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initStatusBar() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }


    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_add) {
            switch (mCurrentMenu) {
                case "STOCK":
                    showInfoToast("添加股票");
                    break;
                case "CONSTELLATION":
                    showInfoToast("添加星座");
                    break;
            }

            return true;
        }else if (id == R.id.action_location){
            startActivity(new Intent(HomeActivity.this,BaiduLocationActivity.class));;
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        switch (item.getItemId()) {
            case R.id.nav_stock:
                mCurrentMenu = "STOCK";
                mToolbar.setTitle(R.string.title_activity_home_stock);
                showFragment(mStockFragment);
                break;
            case R.id.nav_constellation:
                mCurrentMenu = "CONSTELLATION";
                mToolbar.setTitle(R.string.title_activity_home_constellation);
                showFragment(mConstellationFragment);
                break;
            default:
                break;
        }
        ft.commit();
        mDrawer.closeDrawers();
        return true;
    }

    private void initFragments(Bundle savedInstanceState) {
        FragmentManager fm = getSupportFragmentManager();
        if (savedInstanceState == null) {
            mStockFragment = new StockFragment();
            mConstellationFragment = new ConstellationFragment();
        } else {
            mStockFragment = (StockFragment) fm.getFragment(savedInstanceState, StockFragment.class.getSimpleName());
            mConstellationFragment = (ConstellationFragment) fm.getFragment(savedInstanceState, ConstellationFragment.class.getSimpleName());
        }

        if (!mStockFragment.isAdded()) {
            fm.beginTransaction()
                    .add(R.id.fl_container, mStockFragment, StockFragment.class.getSimpleName())
                    .commit();
        }

        if (!mConstellationFragment.isAdded()) {
            fm.beginTransaction()
                    .add(R.id.fl_container, mConstellationFragment, ConstellationFragment.class.getSimpleName())
                    .commit();
        }

    }

    private void showFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        if (fragment instanceof StockFragment) {
            fm.beginTransaction()
                    .show(mStockFragment)
                    .hide(mConstellationFragment)
                    .commit();
        } else if (fragment instanceof ConstellationFragment) {
            fm.beginTransaction()
                    .show(mConstellationFragment)
                    .hide(mStockFragment)
                    .commit();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_BOTTOM_NAVIGATION_VIEW_SELECTED_ID, mNavigationView.getId());
        FragmentManager fm = getSupportFragmentManager();
        if (mStockFragment.isAdded()) {
            fm.putFragment(outState, StockFragment.class.getSimpleName(), mStockFragment);
        } else if (mConstellationFragment.isAdded()) {
            fm.putFragment(outState, ConstellationFragment.class.getSimpleName(), mConstellationFragment);
        }
    }
}
