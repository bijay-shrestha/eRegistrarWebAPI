package edu.miu.eregistrarwebapi;

import edu.miu.eregistrarwebapi.model.Student;
import edu.miu.eregistrarwebapi.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ERegistrarWebApiApplication implements CommandLineRunner {

    private final StudentService studentService;

    public ERegistrarWebApiApplication(StudentService studentService) {
        this.studentService = studentService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ERegistrarWebApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student alex = new Student("611112",
                "Robert",
                "Benjamin",
                "Martin",
                4.0,
                LocalDate.of(2022, 1, 1),
                "Yes");
        Student dave = new Student("611113",
                "Joe",
                "",
                "Rogan",
                3.9,
                LocalDate.of(2021, 1, 1),
                "No");

        Student wayne = new Student("611114",
                "Wayne",
                "",
                "Rooney",
                3.8,
                LocalDate.of(2020, 2, 11),
                "No");

        Student christiano = new Student("611115",
                "Christiano",
                "",
                "Ronaldo",
                4.0,
                LocalDate.of(2020, 12, 12),
                "Yes");

        Student ryan = new Student("611116",
                "Ryan",
                "Mathew",
                "Holiday",
                2.0,
                LocalDate.of(2021, 7, 7),
                "No");


        List<Student> students = studentService.addNewStudents(List.of(alex, dave, wayne, christiano, ryan));
    }
}
