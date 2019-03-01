package com.zzw.usermanagebase.yc;

/**
 * @description:
 * @version: 1.0
 * @author: x.x@hand-china.com
 * @date: 2019/3/1
 */
public class XmException extends Exception {

    public XmException(){
        super();
    }

    public XmException(String msg){
        super(msg);
    }

    public XmException(XmError msg){
        super(msg.toString());
    }
}
