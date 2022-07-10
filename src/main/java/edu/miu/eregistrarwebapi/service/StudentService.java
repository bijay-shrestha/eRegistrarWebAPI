package edu.miu.eregistrarwebapi.service;

import edu.miu.eregistrarwebapi.model.Student;

import java.util.List;

/**
 * @author bijayshrestha on 7/10/22
 * @project eRegistrarWebAPI
 */
public interface StudentService {
    List<Student> getStudents();

    List<Student> addNewStudents(List<Student> students);

    Student addNewStudent(Student student);

    Student getStudentById(Long studentId);

    Student updateStudent(Long studentId, Student student);

    void deleteStudent(Long studentId);
}
