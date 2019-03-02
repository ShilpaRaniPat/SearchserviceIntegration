package com.stackroute.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "topic")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Topic {



//    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @Id
    private String topic;
//    @OrderBy(value = "questions", upvotes = Order.DESCENDING)
    private List<Question> questions;
}
