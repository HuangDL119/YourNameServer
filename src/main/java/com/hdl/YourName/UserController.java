package com.hdl.YourName;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hdl.YourName.dto.constant.ErrorCode;
import com.hdl.YourName.dto.constant.MatchState;
import com.hdl.YourName.dto.constant.SexType;
import com.hdl.YourName.dto.cs.CSEditUserProfile;
import com.hdl.YourName.dto.cs.CSLogin;
import com.hdl.YourName.dto.cs.CSRecovery;
import com.hdl.YourName.dto.cs.CSRegist;
import com.hdl.YourName.dto.sc.SCEditUserProfile;
import com.hdl.YourName.dto.sc.SCLogin;
import com.hdl.YourName.dto.vo.VoUserSimple;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by HuangDL on 2016/12/22.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //    http://localhost:7901/user/Regist
    @RequestMapping(value = "/Regist", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String Regist(@RequestBody CSRegist request) {
        SCLogin responseBody = createSCLogin();
        responseBody.errorCode= ErrorCode.SUC;
        return JSON.toJSONString(responseBody, SerializerFeature.WriteNonStringValueAsString);
    }



    //    http://localhost:7901/user/CLogin
    @RequestMapping(value = "/CLogin", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String CLogin(@RequestBody CSLogin request) {
        String userKey=request.userKey;
        SCLogin responseBody = createSCLogin();
        responseBody.errorCode= ErrorCode.SUC;
        return JSON.toJSONString(responseBody, SerializerFeature.WriteNonStringValueAsString);
    }
    //    http://localhost:7901/user/EditUserProfile
    @RequestMapping(value = "/EditUserProfile", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String EditUserProfile(@RequestBody CSEditUserProfile request) {
        SCEditUserProfile responseBody= new SCEditUserProfile();
        responseBody.user.avator=request.avator;
        responseBody.user.userId=1;
        responseBody.user.nickName=request.nickName;
        responseBody.user.sex=request.sex;
        responseBody.errorCode= ErrorCode.SUC;
        return JSON.toJSONString(responseBody, SerializerFeature.WriteNonStringValueAsString);
    }

    //    http://localhost:7901/user/Recovery
    @RequestMapping(value = "/Recovery", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String Recovery(@RequestBody CSRecovery request) {
        SCLogin responseBody=createSCLogin();
        responseBody.errorCode= ErrorCode.SUC;
        return JSON.toJSONString(responseBody, SerializerFeature.WriteNonStringValueAsString);
    }

    private SCLogin createSCLogin() {
        SCLogin responseBody =new SCLogin();

        //用于本次登录后的所有会话
        responseBody.session="测试用SESSION";
        //当前登录用户资料
        VoUserSimple testUser=new VoUserSimple();
        testUser.userId=1;//用户ID
        testUser.nickName="用户昵称测试-1";//昵称
        testUser.avator="头像ur-l";//头像url
        testUser.sex= SexType.MALE;//性别
        responseBody.user=testUser;


        VoUserSimple testUser2=new VoUserSimple();
        testUser2.userId=2;//用户ID
        testUser2.nickName="用户昵称测试-2";//昵称
        testUser2.avator="头像url-2";//头像url
        testUser2.sex= SexType.FEMALE;//性别

        //交换用户信息，可能为NULL
        responseBody.matchUser=testUser2;
        responseBody.matchState= MatchState.MATCHING;//用户当前状态//正常，交换中，等等
        responseBody.synchronous=50;//同步率

        return responseBody;
    }
}
