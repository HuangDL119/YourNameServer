package com.hdl.YourName.dto.constant;

/**
 * 匹配状态
 * Created by HuangDL on 2016/12/18.
 */
public class MatchState {
    public static final int NORMAL=0;   //正常状态；
    public static final int MATCHING=1; //匹配查找中；
    public static final int MATCHED=2;  //匹配成功-未角色互换；
    public static final int CHANGED=3;  //匹配成功-角色互换中；
}
