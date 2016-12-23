package com.hdl.YourName.test;

import com.alibaba.fastjson.JSONObject;
import com.hdl.util.Log;
import com.hdl.util.UHttpAgent;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HuangDL on 2016/12/23.
 */
public class TestRequset
{

    @Test
    public void testSendRequest(){

//        Map<String, String> params = new HashMap<>();
//        params.put("userID", ""+userID);
//        params.put("token", token);
//        params.put("sign", sign);
//        String content= UHttpAgent.newInstance().post(AUTH_URL, params);
//        AuthResult result = JSONUtil.toObject(content, AuthResult.class);
//        if (result.getState() == StateCode.CODE_SUCCESS) {
//            Log.user.debug("login game server success. return account info ...");
//            JSONObject jsonObject = new JSONObject();
//            jsonObject.put("accountID", 1);
//            jsonObject.put("accountName", "game-account-01");
//        }
    }
}
