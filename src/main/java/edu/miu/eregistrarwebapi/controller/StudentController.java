package edu.miu.eregistrarwebapi.controller;

import edu.miu.eregistrarwebapi.model.Student;
import edu.miu.eregistrarwebapi.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author bijayshrestha on 7/10/22
 * @project eRegistrarWebAPI
 */
@RestController
@RequestMapping(value = "eregistrar/api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Student>> getStudents(ModelAndView modelAndView){
        return ResponseEntity.ok(studentService.getStudents());
    }

    @PostMapping(value = "/register")
    public ResponseEntity<Student> addNewStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.addNewStudent(student), HttpStatus.CREATED);
    }

    @GetMapping(value = "/get/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long studentId){
        return ResponseEntity.ok(studentService.getStudentById(studentId));
    }

    @PutMapping(value = "/update/{studentId}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long studentId, @RequestBody Student student){
        return ResponseEntity.ok(studentService.updateStudent(studentId, student));
    }

    @DeleteMapping(value = "/delete/{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
       studentService.deleteStudent(studentId);
    }


}
