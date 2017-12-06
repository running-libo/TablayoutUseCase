package com.example.tablayoutusecase.setstyle;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.tablayoutusecase.R;

public class SetStyleActivity extends AppCompatActivity {
    private TabLayout tab1,tab2,tab3;
    private TabLayout tabLayout,tabLayout2,tabLayout3;
    private String[] titles = new String[]{"最新","热门","我的"};
    private String[] longTitles = new String[]{"推荐","热点","北京","视频","社会","图片","娱乐","科技","汽车"};
    private int[] pics = new int[]{R.mipmap.subtitle_left_roll_h,R.mipmap.subtitle_middle_roll_h,R.mipmap.subtitle_right_roll_h};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usecase);

        setTab1();
        setTab2();
        setTab3();
        setDefaultIcon();
        setCustomIcon();
        setScroll();
    }

    private void setTab1(){
        tab1 = (TabLayout) findViewById(R.id.tab1);
        for(int i=0;i<titles.length;i++){
            tab1.addTab(tab1.newTab());
            tab1.getTabAt(i).setText(titles[i]);
        }
    }

    private void setTab2(){
        tab2 = (TabLayout) findViewById(R.id.tab2);
        for(int i=0;i<titles.length;i++){
            tab2.addTab(tab2.newTab());
            tab2.getTabAt(i).setText(titles[i]);
        }
    }

    private void setTab3(){
        tab3 = (TabLayout) findViewById(R.id.tab3);
        for(int i=0;i<titles.length;i++){
            tab3.addTab(tab3.newTab());
            tab3.getTabAt(i).setText(titles[i]);
        }

        tab3.post(new Runnable() {
            @Override
            public void run() {
                IndicatorLineUtil.setIndicator(tab3, 40, 40);
            }
        });
    }

    /**
     * 设置默认图标
     */
    private void setDefaultIcon() {

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        for(int i=0;i<titles.length;i++){
            tabLayout.addTab(tabLayout.newTab());
        }

        for(int i=0;i<titles.length;i++){
            tabLayout.getTabAt(i).setText(titles[i]).setIcon(pics[i]);
        }
    }

    /**
     * 设置自定义位置图标
     */
    private void setCustomIcon() {

        tabLayout2 = (TabLayout) findViewById(R.id.tablayout2);
        for(int i=0;i<titles.length;i++){
            tabLayout2.addTab(tabLayout2.newTab());
        }

        for(int i=0;i<titles.length;i++){
            tabLayout2.getTabAt(i).setCustomView(makeTabView(i));
        }
    }

    private void setScroll(){
        tabLayout3 = (TabLayout) findViewById(R.id.tablayout3);
        for(int i=0;i<longTitles.length;i++){
            tabLayout3.addTab(tabLayout3.newTab());
        }

        for(int i=0;i<longTitles.length;i++){
            tabLayout3.getTabAt(i).setText(longTitles[i]);
        }
    }

    /**
     * 引入布局设置图标和标题
     * @param position
     * @return
     */
    private View makeTabView(int position){
        View tabView = LayoutInflater.from(this).inflate(R.layout.tab_text_icon,null);
        TextView textView = tabView.findViewById(R.id.textview);
        ImageView imageView = tabView.findViewById(R.id.imageview);
        textView.setText(titles[position]);
        imageView.setImageResource(pics[position]);

        return tabView;
    }

}
