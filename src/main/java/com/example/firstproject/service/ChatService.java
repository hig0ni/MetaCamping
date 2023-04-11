package com.example.firstproject.service;

import com.example.firstproject.dto.ChatMessageDTO;
import com.example.firstproject.entity.ChatMessage;
import com.example.firstproject.repository.ChatRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ChatService {

    private final ChatRepository chatRepository;

<<<<<<< HEAD
    public ChatMessage saveChat(ChatMessageDTO messageDTO) {
        ChatMessage chatMessage = new ChatMessage(messageDTO);
        return chatRepository.save(chatMessage);
=======
    public void saveChat(ChatMessageDTO messageDTO) {
        ChatMessage chatMessage = new ChatMessage(messageDTO);
        chatRepository.save(chatMessage);
>>>>>>> 5b38ca2db68537814b28a1547cbdb713040b6742
    }
}

