package com.example.xxf_jumpheaderfooter;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;

import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshFooter;
import com.scwang.smart.refresh.layout.api.RefreshHeader;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;
import com.scwang.smart.refresh.layout.listener.DefaultRefreshFooterCreator;
import com.scwang.smart.refresh.layout.listener.DefaultRefreshHeaderCreator;
import com.xxf.jumprefreshheaderfooter.XXFJumpRefreshFooter;
import com.xxf.jumprefreshheaderfooter.XXFJumpRefreshHeader;
import com.xxf.jumprefreshheaderfooter.databinding.XxfJumpRefreshHeaderBinding;

/**
 * @Description: java类作用描述
 * @Author: XGod
 * @CreateDate: 2020/6/11 20:04
 */
public class BaseApplication extends Application {
    {
        //设置全局的Header构建器
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new DefaultRefreshHeaderCreator() {
            @NonNull
            @Override
            public RefreshHeader createRefreshHeader(@NonNull Context context, @NonNull RefreshLayout layout) {
                return new XXFJumpRefreshHeader(context);
            }
        });
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new DefaultRefreshFooterCreator() {
            @NonNull
            @Override
            public RefreshFooter createRefreshFooter(@NonNull Context context, @NonNull RefreshLayout layout) {
                return new XXFJumpRefreshFooter(context);
            }
        });
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
