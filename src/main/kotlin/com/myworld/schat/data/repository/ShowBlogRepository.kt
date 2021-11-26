package com.myworld.schat.data.repository

import com.myworld.schat.data.entity.ShowBlog
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
interface ShowBlogRepository : JpaRepository<ShowBlog, String> {
    fun findByUserWid(userWid: String, pageable: Pageable): Page<ShowBlog>?
    fun findByOpenToWidsContaining(userWid: String, pageable: Pageable): Page<ShowBlog>?
}
