package com.hdl.util;

/**
 * Created by ant on 2015/3/26.
 */
public interface UHttpFutureCallback {

    void completed(String content) ;

     void failed(String err);

}
