package com.myworld.schat.data.entity

import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "contact_tag")
class ContactTag(
    @javax.persistence.Id
    var id: String,

    var userWid: String? = null,
    var username: String? = null,
    var name: String? = null,
    var nums: Int? = null,
    var orderClass: Int? = null,

    var createTime: Long = Date().time,
    var updateTime: Long = Date().time
) : Serializable
