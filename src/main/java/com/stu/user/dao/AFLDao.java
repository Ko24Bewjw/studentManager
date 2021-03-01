package com.stu.user.dao;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Allen wan on 2020/4/27.
 */


@Component
public interface AFLDao {

    List<Map<String,Object>>getStuAFL(int stuId, int begin, int rows);

    int getStuAFLCount(int stuId);

    void addStuAFL(String stuId,String reason,String start_time,String end_time);
}
