package com.bawei.wangxueshi.ttxw;

import android.app.Activity;
import android.os.Bundle;

import com.bawei.wangxueshi.ttxw.LeftRightFragment.LeftFragment;
import com.bawei.wangxueshi.ttxw.LeftRightFragment.RightFragment;
import com.bwei.slidingmenu.SlidingMenu;
import com.bwei.slidingmenu.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity {

    private SlidingMenu slidingMenu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LeftFragment leftFragment=new LeftFragment();



      setBehindContentView(R.layout.left);

        getSupportFragmentManager().beginTransaction().replace(R.id.left,leftFragment).commit();
        slidingMenu = getSlidingMenu();
        // 设置slidingmenu滑动的方式//注意左和右 与左右是不同的
        slidingMenu.setMode(SlidingMenu.LEFT_RIGHT);

        // 设置触摸屏幕的模式
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
        // 设置阴影的宽度
        slidingMenu.setShadowWidthRes(R.dimen.shadow_width);
        // 设置slidingmenu边界的阴影图片
        slidingMenu.setShadowDrawable(R.drawable.shadow);
        // 设置滑动菜单视图的宽度
        slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        // 设置渐入渐出效果的值
        slidingMenu.setFadeDegree(0.35f);
        RightFragment rightFragment = new RightFragment();

         slidingMenu.setSecondaryMenu(R.layout.right);
        getSupportFragmentManager().beginTransaction().replace(R.id.right,rightFragment).commit();

    }
}
