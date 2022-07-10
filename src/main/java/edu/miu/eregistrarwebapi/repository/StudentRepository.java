package edu.miu.eregistrarwebapi.repository;

import edu.miu.eregistrarwebapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author bijayshrestha on 7/10/22
 * @project eRegistrarWebAPI
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
