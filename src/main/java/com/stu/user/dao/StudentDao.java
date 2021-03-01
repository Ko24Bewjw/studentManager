package com.stu.user.dao;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Allen wan on 2020/4/27.
 */


@Component
public interface StudentDao {
    Map<String,Object> getStuMsg(int stuId);    //获取学生信息

    void updateMsg(int stuId, String idcard, String sex, String phone, String qq, String email, String address);

    int getSwitch();

    int getUserName(String username);

    void createUser(String username, String password, int stuId);

    void updateStudnetFlag(int stuId);
}
