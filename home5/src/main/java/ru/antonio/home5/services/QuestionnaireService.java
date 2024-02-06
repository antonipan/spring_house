package ru.antonio.home5.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.antonio.home5.model.Questionnaire;
import ru.antonio.home5.repositories.QuestionnaireRepositoryFile;

import java.util.List;

@Service
public class QuestionnaireService {
    private QuestionnaireRepositoryFile qrf;

    @Autowired
    public QuestionnaireService (QuestionnaireRepositoryFile qrf) {
        this.qrf = qrf;
    }

    public List <Questionnaire> saveAllQuestionnaire (List<Questionnaire> questionnaireList ) {
        return qrf.saveToList(questionnaireList);
    }

    public List <Questionnaire> getAllQuestionnaire () {
        return qrf.getListQuestionnaires();
    }

    public Questionnaire getQuestionnaireById(Long id) {
        return qrf.getQuestionnaireById(id);
    }

    public List <Questionnaire> getCollections() {
        return qrf.getListQuestionnaires();
    }
}
