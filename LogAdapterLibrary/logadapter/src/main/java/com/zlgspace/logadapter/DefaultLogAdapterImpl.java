package com.zlgspace.logadapter;

import android.util.Log;

class DefaultLogAdapterImpl implements LogAdapter {
    @Override
    public void v(String tag, String msg) {
        Log.v(tag,msg);
    }

    @Override
    public void d(String tag, String msg) {
        Log.d(tag,msg);
    }

    @Override
    public void i(String tag, String msg) {
        Log.i(tag,msg);
    }

    @Override
    public void w(String tag, String msg) {
        Log.w(tag,msg);
    }

    @Override
    public void e(String tag, String msg) {
        Log.e(tag,msg);
    }

    @Override
    public void e(String tag, String msg, Throwable tr) {
        Log.e(tag,msg,tr);
    }
}
