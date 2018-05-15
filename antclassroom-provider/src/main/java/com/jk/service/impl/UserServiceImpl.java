package com.jk.service.impl;

import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.UserDao;
import com.jk.model.Staff;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/14 0014.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public Map<String,Object> querystaff(String staffname, String staffpass) {


        Map<String,Object>  map=new HashMap<String,Object>();
        String mas="";
        if(staffname!=null && staffpass!=null){
            //查询用户是否存在
            Staff staff=userDao.querystaffname(staffname);
            if(staff!=null){
                //用户存在
                if(""!=staff.getStaffpass() & staffpass.equals(staff.getStaffpass())){
                   //登录成功
                    map.put("staff",staff);
                    mas="success";
                }else{
                    //密码错误
                    mas="errorpass";
                }
            }else{
                //用户不存在
                mas="errorname";
            }
        }
        map.put("mas",mas);


      ;
        return map;
    }
}
