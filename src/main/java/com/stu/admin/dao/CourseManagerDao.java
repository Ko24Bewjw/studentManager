package com.stu.admin.dao;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Allen wan on 2020/4/27.
 */


@Component
public interface CourseManagerDao {
    int getTotal(String keyword);

    List<Map<String,Object>> getAllcourse(String keyword, int begin, int rows);

    List<Map<String,Object>> getCombox();

    void addCourse(String name, String type, String score);

    int getTotalByCourseId(int id);

    List<Map<String,Object>> getStuByCourse(int id, int page, int rows);

    void addCourseType(String typeName);

    void delCourse(int id);

    void delCourseAndStu(int id);

    List<Map<String,Object>> getStudentCombox();

    void addStuToCourse(int courseId, int stuId);

    List<Integer> getAllStuByCourse(int courseId);

    int getStuGradeCount(String keywords, int courseId);

    List<Map<String,Object>> getStuGradeGrid(String keywords, int courseId, int begin, int rows);

    void addStuGrade(int stuId, int courseId, String score);
}
