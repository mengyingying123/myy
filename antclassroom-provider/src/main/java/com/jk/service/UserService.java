package com.jk.service;

import com.alibaba.dubbo.common.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/14 0014.
 */
public interface UserService {
    //登录
    Map<String,Object> querystaff(String staffname, String staffpass);



}
