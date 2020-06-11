# 跳跃header footer for SmartRefresh

# 集成
 implementation 'androidx.appcompat:appcompat:1.1.0'
 implementation 'com.scwang.smart:refresh-layout-kernel:2.0.1'
 implementation 'com.airbnb.android:lottie:3.4.0'
 implementation 'com.github.NBXXF:xxf_jumpRefreshHeaderFooter:1.0.0'
 
 
## 全局配置
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
