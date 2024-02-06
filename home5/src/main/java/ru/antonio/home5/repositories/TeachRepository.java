package ru.antonio.home5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ru.antonio.home5.model.Teacher;

import java.util.List;

@Component
public interface TeachRepository extends JpaRepository<Teacher, Long> {

    List<Teacher> findByExperience(int experience);

    List<Teacher> findBySubject(String subject);
}
