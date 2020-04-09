package com.zlgspace.logadapter;

public interface LogAdapter {
      void v(String tag, String msg);

      void d(String tag, String msg);

      void i(String tag, String msg);

      void w(String tag, String msg);

      void e(String tag, String msg);
      void e(String tag, String msg, Throwable tr);


    final class Factory {
        private Factory() {}
        public static LogAdapter newDefaultLogAdapter() {
            return new DefaultLogAdapterImpl();
        }
    }
}
