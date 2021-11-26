package com.myworld.schat.data.repository

import com.myworld.schat.data.entity.ChatGroup
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
interface ChatGroupRepository : JpaRepository<ChatGroup, String> {
    fun countByWidsContains(userWid: String): Int?
    fun findByIdAndCreator(id: String, creator: String): ChatGroup?
}
