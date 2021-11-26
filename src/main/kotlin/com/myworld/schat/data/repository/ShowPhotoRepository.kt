package com.myworld.schat.data.repository

import com.myworld.schat.data.entity.ShowPhoto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
interface ShowPhotoRepository : JpaRepository<ShowPhoto, String> {
    fun countByBlogIdDetail(blogIdDetail: String): Int
    fun deleteAllByBlogIdDetail(blogIdDetail: String)
}
