package com.myworld.schat.data.repository

import com.myworld.schat.data.entity.PhoneUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
interface PhoneUserRepository : JpaRepository<PhoneUser, String> {

    fun findByUsername(username: String): PhoneUser?
    fun findByWid(wid: String): PhoneUser?
    fun findByNickname(nickname: String): List<PhoneUser>?
}
