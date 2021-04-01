package com.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.hjd.applib.base.BaseBindingActivity;
import com.test_1.databinding.ActivityMainBinding;

public class MainActivity extends BaseBindingActivity<ActivityMainBinding> {

    @Override
    public void initView() {
        binding.bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        binding.bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        binding.bottomNavigationBar.setBarBackgroundColor(R.color.white);

        binding.bottomNavigationBar
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "首页").setActiveColorResource(R.color.main_color).setInactiveIconResource(R.mipmap.ic_launcher).setInActiveColorResource(R.color.color_f6))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "资讯").setActiveColorResource(R.color.main_color).setInactiveIconResource(R.mipmap.ic_launcher).setInActiveColorResource(R.color.color_f6))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "我的").setActiveColorResource(R.color.main_color).setInactiveIconResource(R.mipmap.ic_launcher).setInActiveColorResource(R.color.color_f6))
                .setFirstSelectedPosition(0)
                .initialise();

    }
}