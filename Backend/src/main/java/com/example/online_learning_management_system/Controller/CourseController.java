package com.example.online_learning_management_system.Controller;
import com.example.online_learning_management_system.Model.Course;
import com.example.online_learning_management_system.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }
    @PostMapping
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
    }
}
