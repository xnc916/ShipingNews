package com.fuicuiedu.xc.videonew_20170309.ui.news;

import android.content.Context;
import android.util.AttributeSet;

import com.fuicuiedu.xc.videonew_20170309.bombapi.entity.NewsEntity;
import com.fuicuiedu.xc.videonew_20170309.bombapi.result.QueryResult;
import com.fuicuiedu.xc.videonew_20170309.ui.base.BaseResourceView;

import retrofit2.Call;

/**
 * Created by Administrator on 2017/3/22 0022.
 */

public class NewsListView extends BaseResourceView<NewsEntity,NewsItemView>{
    public NewsListView(Context context) {
        super(context);
    }

    public NewsListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NewsListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected Call<QueryResult<NewsEntity>> queryData(int limit, int skip) {
        return newsApi.getVideoNewsList(limit, skip);
    }

    @Override
    protected int getLimit() {
        return 5;
    }

    @Override
    protected NewsItemView createItemView() {
        return new NewsItemView(getContext());
    }
}
