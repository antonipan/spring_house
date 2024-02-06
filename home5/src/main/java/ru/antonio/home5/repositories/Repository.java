package ru.antonio.home5.repositories;

import ru.antonio.home5.model.Questionnaire;

import java.util.List;

public interface Repository {

    void save (Questionnaire test);
    List<Questionnaire> saveAll (List<Questionnaire> testList);


    Questionnaire download (String name);
    List <Questionnaire> downloadAll ();

    void downloadFromJsonFile();
}
