package com.myworld.schat.data.repository

import com.myworld.schat.data.entity.ChatFile
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
interface ChatFileRepository : JpaRepository<ChatFile, String>
