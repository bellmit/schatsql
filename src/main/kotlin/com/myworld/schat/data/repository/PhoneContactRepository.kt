package com.myworld.schat.data.repository

import com.myworld.schat.data.entity.PhoneContact
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
interface PhoneContactRepository : JpaRepository<PhoneContact, String> {
    fun findByUserWid(userWid: String): List<PhoneContact>?
    fun findByUserWidAndTargetWid(userWid: String, targetWid: String): PhoneContact?
    fun findByUserWidAndTag(userWid: String, tag: String): List<PhoneContact>?
    fun countByUserWidAndTag(userWid: String, tag: String): Int
}
