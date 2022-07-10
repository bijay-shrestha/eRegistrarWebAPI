package edu.miu.eregistrarwebapi.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author bijayshrestha on 7/10/22
 * @project eRegistrarWebAPI
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @NotNull
    @NotBlank(message = "Student Number Field cannot be null or blank")
    @NotEmpty(message = "Student Number Field cannot be empty")
    @Column(nullable = false)
    private String studentNumber;
    @NotNull
    @NotBlank(message = "Firstname Field cannot be null or blank")
    @NotEmpty(message = "Firstname Field cannot be empty")
    @Column(nullable = false)
    private String firstName;
    private String middleName;
    @NotNull
    @NotBlank(message = "Lastname Field cannot be null or blank")
    @NotEmpty(message = "Lastname Field cannot be empty")
    @Column(nullable = false)
    private String lastName;
    private double cgpa;
    @Column(nullable = false)
    private LocalDate enrollmentDate;
    @NotNull
    @NotBlank(message = "Is International Field cannot be null or blank")
    @NotEmpty(message = "Is International Field cannot be empty")
    @Column(nullable = false)
    private String isInternational;

    public Student(String studentNumber, String firstName, String middleName, String lastName,
                   double cgpa, LocalDate enrollmentDate,
                   String isInternational) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }
}
