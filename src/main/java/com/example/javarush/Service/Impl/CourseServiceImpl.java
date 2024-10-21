package com.example.javarush.Service.Impl;


import com.example.javarush.Entity.Course;
import com.example.javarush.Entity.Dto.CourseDto;
import com.example.javarush.Repository.CourseRepository;
import com.example.javarush.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<CourseDto> getAllCourses() {
        return courseRepository.findAll()
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CourseDto getCourseById(Long id) {
        return courseRepository.findById(id)
                .map(this::convertToDto)
                .orElse(null);
    }

    @Override
    public void saveCourse(CourseDto courseDto) {
        Course course = new Course();
        course.setName(courseDto.getName());
        course.setDescription(courseDto.getDescription());
        courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    private CourseDto convertToDto(Course course) {
        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getId());
        courseDto.setName(course.getName());
        courseDto.setDescription(course.getDescription());
        return courseDto;
    }

}
