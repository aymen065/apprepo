package com.bezkoder.springbootjpah2.controllers;

import com.bezkoder.springbootjpah2.models.ChatMessage;
import com.bezkoder.springbootjpah2.repositories.IChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @Autowired
    IChatMessageRepository chatMessageRepository;
    @MessageMapping("/chat/{roomId}")
    @SendTo("/topic/{roomId}")
    public ChatMessage chat(@DestinationVariable String roomId, ChatMessage message) {
        //System.out.println(message);
        return chatMessageRepository.save( new ChatMessage(message.getMessage(), message.getUser()));
    }


}
