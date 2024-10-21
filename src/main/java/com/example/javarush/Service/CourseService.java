package com.example.javarush.Service;

import com.example.javarush.Entity.Dto.CourseDto;
import com.example.javarush.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {

    List<CourseDto> getAllCourses();
    CourseDto getCourseById(Long id);
    void saveCourse(CourseDto courseDto);
    void deleteCourse(Long id);

}
