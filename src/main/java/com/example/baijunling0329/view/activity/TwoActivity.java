package com.example.baijunling0329.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.baijunling0329.R;
import com.example.baijunling0329.model.JsonBean;
import com.example.baijunling0329.presenter.MainPresenter;

import com.example.baijunling0329.view.adapter.MyAdapter;
import com.example.baijunling0329.view.interfaces.IMainView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.Arrays;


public class TwoActivity extends AppCompatActivity implements IMainView {

    private XRecyclerView xRecyclerView;
    private MainPresenter mainPresenter;
   int page=1;
    private LinearLayoutManager linearLayoutManager;
    private MyAdapter myAdapter;
    private Banner banner;
    public String[] urlpic =
            {
                    "https://ws1.sinaimg.cn/large/0065oQSqgy1fy58bi1wlgj30sg10hguu.jpg",
                    "https://ws1.sinaimg.cn/large/0065oQSqgy1fxno2dvxusj30sf10nqcm.jpg",
                    "https://ws1.sinaimg.cn/large/0065oQSqgy1fxd7vcz86nj30qo0ybqc1.jpg",
                    "https://ws1.sinaimg.cn/large/0065oQSqgy1fwyf0wr8hhj30ie0nhq6p.jpg",
                    "https://ws1.sinaimg.cn/large/0065oQSqgy1fwgzx8n1syj30sg15h7ew.jpg"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
                 initView();
                 initData();
    }

    private void initView() {
        xRecyclerView = findViewById(R.id.Xrecycler);
       xRecyclerView.setLoadingMoreEnabled(true);
       xRecyclerView.setPullRefreshEnabled(true);
        linearLayoutManager = new LinearLayoutManager(TwoActivity.this);
         linearLayoutManager.setOrientation(OrientationHelper.VERTICAL);
         xRecyclerView.setLayoutManager(linearLayoutManager);


        banner = findViewById(R.id.banner);



    }
    private void initData() {
        mainPresenter = new MainPresenter(this);
        mainPresenter.ShowData();
        mainPresenter.setView(this);
        xRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        xRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                page=1;
                mainPresenter.ShowData();
                xRecyclerView.refreshComplete();
                myAdapter.notifyDataSetChanged();

            }

            @Override
            public void onLoadMore() {
                page++;
                mainPresenter.ShowData();
                xRecyclerView.loadMoreComplete();
                myAdapter.notifyDataSetChanged();

            }
        });

        banner.isAutoPlay(true);
        banner.setDelayTime(2000);
        banner.setImages(Arrays.asList(urlpic));
  banner.setImageLoader(new ImageLoader() {
      @Override
      public void displayImage(Context context, Object path, ImageView imageView) {
          Glide.with(context).load(path).into(imageView);

      }
  }).start();
    }



    @Override
    public void onSeccuss(Object o) {
        JsonBean jsonBean =(JsonBean)o;
        myAdapter = new MyAdapter(TwoActivity.this,jsonBean);
        xRecyclerView.setAdapter(myAdapter);

    }

    @Override
    public void onFail(String Err) {

    }
}
