package com.stackroute.model;

import com.stackroute.model.Replies;
import com.stackroute.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {
    private String comment;
    private long timestamp;
    private int likes;
    private User user;
    private List<Replies> replies;
}
