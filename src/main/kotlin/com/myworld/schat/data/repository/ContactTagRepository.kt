package com.myworld.schat.data.repository

import com.myworld.schat.data.entity.ContactTag
import org.springframework.data.domain.Sort
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
interface ContactTagRepository : JpaRepository<ContactTag, String> {
    fun findByUserWid(userWid: String): List<ContactTag>?
    fun findByUserWid(userWid: String, sort: Sort): List<ContactTag>?
    fun findByUserWidAndName(userWid: String, name: String): ContactTag?
    fun findByUserWidAndId(userWid: String, id: String): ContactTag?
    fun deleteByUserWidAndId(userWid: String, id: String)
    fun countByUserWid(userWid: String): Int
}
