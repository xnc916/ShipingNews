package com.fuicuiedu.xc.videonew_20170309.ui.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fuicuiedu.xc.videonew_20170309.R;
import com.fuicuiedu.xc.videoplayer.list.MediaPlayerManager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/3/15 0015.
 */

public class NewsFragment extends Fragment{
    @BindView(R.id.newsListView)
    NewsListView newsListView;

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (view == null){
            view = inflater.inflate(R.layout.fragment_news,container,false);
        }
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);
        //首次进来，自动刷新
        newsListView.post(new Runnable() {
            @Override
            public void run() {
                newsListView.autoRefresh();
            }
        });
    }

    //初始化Mediaplayer
    @Override
    public void onResume() {
        super.onResume();
        MediaPlayerManager.getsInstance(getContext()).onResume();
    }

    //Mediaplayer释放
    @Override
    public void onPause() {
        super.onPause();
        MediaPlayerManager.getsInstance(getContext()).onPause();
    }

    //移除View
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((ViewGroup)view.getParent()).removeView(view);
    }

    //清楚所有监听（不再需要Ui交互）
    @Override
    public void onDestroy() {
        super.onDestroy();
        MediaPlayerManager.getsInstance(getContext()).removeAllListeners();
    }
}
