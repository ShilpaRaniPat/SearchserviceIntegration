package com.stackroute.service;

import com.stackroute.Exceptions.ConceptNotFoundException;
import com.stackroute.domain.Question;
import com.stackroute.domain.Topic;
import com.stackroute.model.QuestionDTO;
import com.stackroute.repository.SearchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



@Service

public class SearchServiceImpl implements SearchService {
    private SearchRepository searchRepository;

    @Autowired
    public SearchServiceImpl(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    //Overrided method for saving searched questions//
    @Override
    public void saveTopic(Topic topic) { searchRepository.save(topic); }

    //Overrided method for getAllTopics//
    @Override
    public List<Topic> getAllTopics()  {
        return searchRepository.findAll();
    }

    //Overrided method for getQuestionsByTopic//
    @Override
    public List<Topic> getQuestionsByTopic(String topic)  {
        return searchRepository.findByTopic(topic);
    }

    //Overrided method for getQuestion//

    @Override
    public List<Topic> getQuestion(String topic) throws ConceptNotFoundException{
        System.out.println(searchRepository.findByQuestions(topic));
        if (!searchRepository.existsById(topic)){
            throw new ConceptNotFoundException("Result not found");
        }
        return searchRepository.findByTopic(topic);

    }
    @Override
    public Question Question(Question question) {
        return searchRepository.findByTopic()

    }

    /*
    for getting question object based on topic and question
     */
    @Override
    public List<Question> questionOfTopic(String topic, String question) throws ConceptNotFoundException {

        if (!searchRepository.existsById(topic)){
            throw new ConceptNotFoundException("Result not found");
        }
        Topic topics = searchRepository.findById(topic).get();
        List<Question> questionLists = topics.getQuestions();
        List<Question> questions = new ArrayList<Question>();
        for (Question questionList: questionLists) {
            if(questionList.getQuestion().contains(question.toString())){
                questions.add(questionList);
            }
        }

        return questions;
    }
//    @Override
//    public QuestionDTO saveQuestionDTO(QuestionDTO questionDTO)throws  {
//        if(searchRepository.existsById(questionDTO.getQuestion())){
//
//        }
//        QuestionDTO questionDTO1= searchRepository.save(questionDTO);
//
//        return questionDTO1;
//    }

//    @Override
//    public List<Question> questionOfPost(String question) {
//        return null;
//    }

    @Override
    public List<Question> questionOfPost(QuestionDTO questionDTO) {

        List<Question> ques=null;
        questionDTO.getQuestion().toLowerCase();

        List<String> topics=questionDTO.getTopics();


        System.out.println("abccsdshbd");
        for(String t:topics)
        {
//             System.out.println("zakkkkkkkkkkkkkkkkkkkkkkkk");
            System.out.println(t.toLowerCase());

//             System.out.println("udayyyyyyyyyyyyyyyyyyyyy");
        }


        String ques1=questionDTO.getQuestion();
        System.out.println("abcbchvh"+ques1.toLowerCase());

//        for(int i=0;i<questionDTO.getTopics().size();i++){
//            System.out.println(questionDTO.getTopics());
//            questionDTO.set(i,questionDTO.get(i).toLowerCase());
//        }


        List<String> topicList=questionDTO.getTopics();
        for (String topicName:topicList
        ) {
            if( topicName.equals(searchRepository.findById(topicName))){
                Topic topicDomain = searchRepository.findById(topicName).get();
                List<Question> questionDomainList = topicDomain.getQuestions();
//               List<Question> questionPost = new ArrayList<Question>();
                for (Question questionSearchFromDomain:questionDomainList
                ) {

                    if(questionDTO.getQuestion().equals(questionSearchFromDomain)){

                        topicDomain savedDomain = searchRepository.save();



                    }

                }



            }

        }
        return ques;
    }

}
