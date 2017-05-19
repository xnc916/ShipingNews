package com.fuicuiedu.xc.videonew_20170309;

import android.app.Application;

import com.fuicuiedu.xc.videonew_20170309.commons.ToastUtils;

/**
 * Created by Administrator on 2017/3/15 0015.
 */

public class VideoNewsApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化吐丝工具类
        ToastUtils.init(this);
    }
}
