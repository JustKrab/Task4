package com.example.auth.entitys;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String message;
    private LocalTime time=LocalTime.now();
    private String author;
    private Integer sisCounter=0;
    private Integer broCounter=0;


    public String getAuthorName() {
        return author != null ? "Sent by "+ author +" at " + time : "Sent by unknown "+" at " + time;
    }


    public Message(String message, String author) {
        this.author = author;
        this.message = message;
    }

    public Message() {
    }
}
