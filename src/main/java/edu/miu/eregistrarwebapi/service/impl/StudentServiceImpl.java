package edu.miu.eregistrarwebapi.service.impl;

import edu.miu.eregistrarwebapi.model.Student;
import edu.miu.eregistrarwebapi.repository.StudentRepository;
import edu.miu.eregistrarwebapi.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author bijayshrestha on 7/10/22
 * @project eRegistrarWebAPI
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> addNewStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    @Override
    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElseThrow(() -> {
            return new IllegalArgumentException("Student Not Found");
        });
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        Student toBeUpdateStudent = studentRepository.findById(studentId).orElseThrow(IllegalArgumentException::new);
        student.setStudentId(toBeUpdateStudent.getStudentId());
        return studentRepository.save(student);

    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
