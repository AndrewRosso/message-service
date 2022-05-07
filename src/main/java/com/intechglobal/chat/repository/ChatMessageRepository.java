package com.intechglobal.chat.repository;

import com.intechglobal.chat.model.ChatMessage;
import com.intechglobal.chat.model.enums.MessageStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Integer> {

    int countBySenderIdAndRecipientIdAndStatus(int senderId, int recipientId, MessageStatus status);

    List<ChatMessage> findByChatId(int chatId);
}
