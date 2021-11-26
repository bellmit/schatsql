package com.myworld.schat.data.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import java.io.Serializable
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "show_blog")
data class ShowBlog(
    @javax.persistence.Id
    var id: String,

    var userWid: String,
    var content: String = "",
    var createTime: Long = Date().time
) : Serializable, Comparable<ShowBlog> {

    @JsonIgnore
    @Column(name = "open_to_wids", columnDefinition = "MEDIUMTEXT")
    var openToWids: String? = null

    @Column(name = "show_photos", columnDefinition = "MEDIUMTEXT")
    var showPhotos: String? = null

    @Column(name = "show_blog_comments", columnDefinition = "MEDIUMTEXT")
    var showBlogComments: String? = null

    /**
     * 设置为升序排列，即小的在前，大的在后
     */
    override fun compareTo(other: ShowBlog): Int {
        return createTime.compareTo(other.createTime)
    }

}
