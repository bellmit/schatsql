package com.myworld.schat.data.entity

import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "show_blog_comment")
class ShowBlogComment(
    @javax.persistence.Id
    val id: String,
    val idAt: String,
    val comment: String,
    val commenterWid: String,
    val commentAtWid: String,
    val createTime: Long = Date().time
) : Serializable
