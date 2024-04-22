package com.curso.spring3.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;

@Getter
@Setter
@ToString
public class Posts {

    @JsonProperty(value = "user id")
    private  int userId;
    private int id;
    private String title;
    private boolean completed;


/*    "userId": 1
            "id": 2
            "title": "Quis ut nam facilis et offcia qui"
            "completed": false
  */
}
