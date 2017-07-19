package com.jihf.joke;

import com.jihf.lib.app.BaseApplication;
import com.jihf.lib.constans.UrlBean;
import com.jihf.lib.share.ShareBean;

/**
 * Func：
 * Desc:
 * Author：JHF
 * Data：2017-07-13 11:12
 * Mail：jihaifeng@raiyi.com
 */

public class MyApplication extends BaseApplication {

  @Override public void onCreate() {
    super.onCreate();
  }

  @Override public UrlBean initUrl() {
    return null;
  }

  @Override public ShareBean initShare() {
    return null;
  }

  @Override public String initUmengAppKey() {
    return null;
  }

  @Override public String initUpdateTag() {
    return null;
  }
}