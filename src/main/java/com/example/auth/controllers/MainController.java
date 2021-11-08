package com.example.auth.controllers;


import com.example.auth.entitys.Message;
import com.example.auth.repos.MessageRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.Map;

@Getter
@Setter
@Controller
public class MainController {

    public Integer sisCounter=0;
    public Integer broCounter=0;

    @Autowired
    private MessageRepo messageRepo;


    @GetMapping ("/main")
    public String mainPage(Map<String, Object> model) {
        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages);
        return "main";
    }

    @PostMapping ("/main")
    public String add(@AuthenticationPrincipal OAuth2User user, String bro, Map<String, Object> model,String sis) {
        String message ="";

        if (bro == null){
        message="SIS!!!";
        sisCounter++;
        }
        if (sis == null){
        message="BRO!";
        broCounter++;
       }
        Message message1 = new Message(message,getPrincipalName(user));
        messageRepo.deleteAll();
        messageRepo.save(message1);
        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages);
        return "main";
    }

    private String getPrincipalName(@AuthenticationPrincipal OAuth2User principal){
        if(principal == null) return "";
        if(principal.getAttribute("name") == null) return principal.getAttribute("login");
        return principal.getAttribute("name");
    }

    @GetMapping
    public String greetings(Map<String, Object> model) {
        model.put("counter", "BRO!: " + Integer.toString(broCounter) + " SIS!!!: " + Integer.toString(sisCounter));
        return "greeting";
    }
}
