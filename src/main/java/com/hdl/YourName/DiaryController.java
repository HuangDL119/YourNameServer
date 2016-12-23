package com.hdl.YourName;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hdl.YourName.dto.constant.ErrorCode;
import com.hdl.YourName.dto.cs.CSDeleteDiary;
import com.hdl.YourName.dto.cs.CSDiaryList;
import com.hdl.YourName.dto.cs.CSEditDiary;
import com.hdl.YourName.dto.sc.SCDeleteDiary;
import com.hdl.YourName.dto.sc.SCDiaryList;
import com.hdl.YourName.dto.sc.SCEditDiary;
import com.hdl.YourName.dto.vo.VoDiary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by HuangDL on 2016/12/22.
 */
@Controller
@RequestMapping("/diary")
public class DiaryController {

    static long id=0;

    public String EditDiary="http://localhost:7901/diary/EditDiary";
    @RequestMapping(value = "/EditDiary", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String EditDiary(@RequestBody CSEditDiary request) {
        SCEditDiary responseBody =new SCEditDiary();

        VoDiary voDiary=request.diary;

        voDiary.id=++id;
        responseBody.diary=voDiary;
        responseBody.errorCode= ErrorCode.SUC;
        return JSON.toJSONString(responseBody, SerializerFeature.WriteNonStringValueAsString);
    }
    //    http://localhost:7901/diary/DiaryList
    @RequestMapping(value = "/DiaryList", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String DiaryList(@RequestBody CSDiaryList request) {

        SCDiaryList responseBody= new SCDiaryList();
        responseBody.entires=new ArrayList<VoDiary>();
        responseBody.entires.add(this.newDirary());
        responseBody.entires.add(this.newDirary());
        responseBody.currentpage=1;
        responseBody.maxpage=1;
        responseBody.errorCode= ErrorCode.SUC;
        return JSON.toJSONString(responseBody, SerializerFeature.WriteNonStringValueAsString);
    }
    //    http://localhost:7901/diary/DeleteDiary
    @RequestMapping(value = "/DeleteDiary", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String DeleteDiary(@RequestBody CSDeleteDiary request) {
        SCDeleteDiary responseBody= new SCDeleteDiary();
        responseBody.diaryId=request.diaryId;
        responseBody.errorCode= ErrorCode.SUC;
        return JSON.toJSONString(responseBody, SerializerFeature.WriteNonStringValueAsString);
    }


    VoDiary newDirary(){
        VoDiary result=new VoDiary();
        result.id=++id;
        result.modifyDate=new Date().getTime();//最近一次修改的时间timestamp
        result.createDate=new Date().getTime();//写日记的时间timestamp
        result.ownerUserId=1;//日记拥有者ID
        result.writerUserId=1;//写这篇日记时候的userId
        result.writerUserName="测试用户1";//写这篇日记的人的名称
        result.title="日记标题";//日记标题
        result.content="日记内容";//日记内容
        result.image="日记配图url";//日记配图url
        result.location="定位坐标，（或者可以自定义文字）";//定位坐标，（或者可以自定义文字）
        result.feeling=1;//心情
        result.weather=2;//天气
        //其他参数待定
        return  result;
    }
}
