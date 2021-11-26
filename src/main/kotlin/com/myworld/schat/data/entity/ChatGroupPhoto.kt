package com.myworld.schat.data.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

// id就是chatGroup的Id, 因为一个chatGroup只能有一个头像

@Entity
@Table(name = "chat_group_photo")
data class ChatGroupPhoto(
    @javax.persistence.Id
    var id: String,
    var updater: String,
    var fileName: String?,
    var extensionType: String?
) : Serializable {
    @Column(name = "file_byte", columnDefinition = "LONGBLOB COMMENT '文件格式'")
    var fileByte: ByteArray? = null
}
