package com.zlgspace.logadapter;

public final class LogPrint{

    private static LogAdapter mLogAdapter = LogAdapter.Factory.newDefaultLogAdapter();

    private LogPrint(){}

    public static void init(LogAdapter logAdapter){
        if(logAdapter!=null)
            mLogAdapter = logAdapter;
    }

    public static void v(String tag, String msg) {
        mLogAdapter.v(tag,msg);
    }

    public static void d(String tag, String msg) {
        mLogAdapter.d(tag,msg);
    }

    public static void i(String tag, String msg) {
        mLogAdapter.i(tag,msg);
    }

    public static void w(String tag, String msg) {
        mLogAdapter.w(tag,msg);
    }

    public static void e(String tag, String msg) {
        mLogAdapter.e(tag,msg);
    }

    public static void e(String tag, String msg, Throwable tr) {
        mLogAdapter.e(tag,msg,tr);
    }
}
