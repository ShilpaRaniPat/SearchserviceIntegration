package com.stackroute.service;

import com.stackroute.Exceptions.ConceptNotFoundException;
import com.stackroute.domain.Question;
import com.stackroute.domain.Topic;
import com.stackroute.model.QuestionDTO;

import java.util.List;

public interface SearchService {
    public void saveTopic(Topic topic) ;
//    public Question saveQuestion(Question question);
    public List<Topic> getAllTopics() throws ConceptNotFoundException;
    public List<Topic> getQuestionsByTopic(String topic);
    public List<Topic> getQuestion(String topic) throws ConceptNotFoundException;
    public List<Question> questionOfTopic(String topic,String question) throws ConceptNotFoundException;
    public List<com.stackroute.domain.Question> questionOfPost(QuestionDTO question);
//    public QuestionDTO savequestionDTO(QuestionDTO questionDTO);
//    public List<Question> questionSorted(String topic,String question);
}
