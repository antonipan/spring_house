package ru.antonio.questionnaires.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.antonio.questionnaires.model.Questionnaire;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, Long> {
}
