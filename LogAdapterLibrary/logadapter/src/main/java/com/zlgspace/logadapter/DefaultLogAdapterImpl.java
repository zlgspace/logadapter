package com.zlgspace.logadapter;

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

    private static class Log{
        public static void v(String tag, String msg){
            print("V",tag,msg);
        }
        public static void d(String tag, String msg){
            print("D",tag,msg);
        }
        public static void i(String tag, String msg){
            print("I",tag,msg);
        }
        public static void w(String tag, String msg){
            print("W",tag,msg);
        }
        public static void e(String tag, String msg){
            print("E",tag,msg);
        }
        public static void e(String tag, String msg, Throwable tr){
            print("E",tag,msg+"\n"+tr.toString());
        }

        private static void print(String lvl,String tag,String msg){
            System.out.println(lvl+"/"+tag+": "+msg);
        }
    }
}
