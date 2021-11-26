package com.myworld.schat.data.repository

import com.myworld.schat.data.entity.ChatMessage
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
interface ChatMessageRepository : JpaRepository<ChatMessage, String>{
    fun findByFromNameAndToNameOrToNameAndFromName(fromName0: String, toName0: String, toName1: String, fromName1: String): List<ChatMessage>?
}
