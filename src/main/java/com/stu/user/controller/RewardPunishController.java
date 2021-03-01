package com.stu.user.controller;

import com.stu.user.service.RewardPunishService;
import com.stu.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Allen wan on 2020/4/27.
 */


@Controller
@RequestMapping(value = "/stu/rewardpunish",method = {RequestMethod.POST,RequestMethod.GET})
public class RewardPunishController {
    @Autowired
    private RewardPunishService rewardPunishService;

    @RequestMapping("/getReward.do")
    public void getReward(int stuId, int page, int rows, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Object> result = new HashMap<String,Object>();
        result = rewardPunishService.getStuReward(stuId,page,rows);
        ResponseUtil.returnJson(result,response);
    }

    @RequestMapping("/getPunish.do")
    public void getPunish(int stuId, int page, int rows, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String,Object> result = new HashMap<String,Object>();
        result = rewardPunishService.getStuPunish(stuId,page,rows);
        ResponseUtil.returnJson(result,response);
    }
}
