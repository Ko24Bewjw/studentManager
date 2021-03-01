package com.stu.user.service;

import com.stu.user.dao.AFLDao;
import com.stu.user.dao.RewardPunishDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Allen wan on 2020/4/27.
 */


@Service
@Transactional
public class AFLService {
    @Autowired
    private AFLDao aflDao;

    public Map<String,Object>getStuAFL(int stuId,int page, int rows)
    {
        Map<String,Object> result = new HashMap<String,Object>();
        List<Map<String,Object>> data = new ArrayList<>();
        int begin = (page-1)*rows;
        int count = aflDao.getStuAFLCount(stuId);
        data=aflDao.getStuAFL(stuId,begin,rows);
        result.put("total",count);
        result.put("rows",data);
        return result;
    }

    public Map<String,Object>addStuAFL(String stuId,String reason,String start_time,String end_time)
    {
        Map<String,Object> result = new HashMap<String,Object>();
        aflDao.addStuAFL(stuId,reason,start_time,end_time);
        result.put("code",true);
        return result;
    }
}
