package com.bezkoder.springbootjpah2.repositories;

import com.bezkoder.springbootjpah2.models.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IChatMessageRepository extends JpaRepository<ChatMessage,Long> {
}
