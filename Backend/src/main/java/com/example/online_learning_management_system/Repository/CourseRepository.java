package com.example.online_learning_management_system.Repository;
import com.example.online_learning_management_system.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
}
