package com.sds.study.project4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    HorizontalScrollView time_scroll,grid_scroll_hor,grid_scroll_hor1,grid_scroll_hor2,grid_scroll_hor3,grid_scroll_hor4;
    ImageView time_inner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time_scroll=(HorizontalScrollView)findViewById(R.id.time_scroll);
        grid_scroll_hor=(HorizontalScrollView)findViewById(R.id.grid_scroll_hor);
        grid_scroll_hor1=(HorizontalScrollView)findViewById(R.id.grid_scroll_hor1);
        grid_scroll_hor2=(HorizontalScrollView)findViewById(R.id.grid_scroll_hor2);
        grid_scroll_hor3=(HorizontalScrollView)findViewById(R.id.grid_scroll_hor3);
        grid_scroll_hor4=(HorizontalScrollView)findViewById(R.id.grid_scroll_hor4);

        time_inner= (ImageView)findViewById(R.id.time_inner);

        time_scroll.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            public void onScrollChanged() {
                /*int grid_width=grid_scroll_ver.getWidth();
                int width=grid_inner.getWidth();
                int percent=width/grid_width;*/

                int scrollX = time_scroll.getScrollX(); // For HorizontalScrollView
                grid_scroll_hor.setScrollX(scrollX);
                grid_scroll_hor1.setScrollX(scrollX);
                grid_scroll_hor2.setScrollX(scrollX);
                grid_scroll_hor3.setScrollX(scrollX);
                grid_scroll_hor4.setScrollX(scrollX);
            }
        });

    }


}
