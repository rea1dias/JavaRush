package com.example.javarush.Controller;

import ch.qos.logback.core.model.Model;
import com.example.javarush.Entity.Dto.CourseDto;
import com.example.javarush.Service.CourseService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/info")
    public String infoCourse(Model model) {
        return "course/course_info";
    }

    @GetMapping("signup")
    public String signupCourse(Model model) {
        return "course/course_signup";
    }

    @GetMapping
    public List<CourseDto> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseDto getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public void saveCourse(@RequestBody CourseDto courseDto) {
        courseService.saveCourse(courseDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

}
