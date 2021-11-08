package com.example.auth.entitys;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalTime;

@Getter
@Setter
public class Message {

    private String message;
    private LocalTime time=LocalTime.now();
    private String author;



    public String getAuthorName() {
        return author != null ? "Sent by "+ author +" at " + time : "Sent by unknown "+" at " + time;
    }


    public Message(String message, String author) {
        this.author = author;
        this.message = message;
    }

}
