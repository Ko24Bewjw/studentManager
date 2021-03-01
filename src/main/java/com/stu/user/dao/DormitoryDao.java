package com.stu.user.dao;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Allen wan on 2020/4/27.
 */


@Component
public interface DormitoryDao {

    int getTotalStuDormitory(String keyword);

    List<Map<String,Object>> getAllStuDormitory(String keyword, int begin, int rows);

    Map<String, Object> getStuDormitoryInfo(int stuId);

    List<Map<String, Object>> getdormZoneCombox();

    void updateStuDormitoryInfo(String stuId, String zone_id, String building, String room);

    void addStuDormitoryInfo(String stuId, String zone_id, String building, String room);

    void delStuDormitoryInfo(String stuId);

    void addDormiZone(String zoneName);

    void delDormiZone(String zoneId);
}


