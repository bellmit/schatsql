package com.myworld.schat.data.entity

import java.io.Serializable
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "show_photo")
class ShowPhoto(
    @javax.persistence.Id
    var id: String,
    var fileName: String,
    var extensionType: String,

    var userWid: String,
    var blogIdDetail: String,

    @Column(name = "file_byte", columnDefinition = "LONGBLOB COMMENT '文件格式'")
    var fileByte: ByteArray,
    var createTime: Long = Date().time
) : Serializable
