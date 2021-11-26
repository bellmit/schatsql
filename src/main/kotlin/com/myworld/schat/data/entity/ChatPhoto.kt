package com.myworld.schat.data.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "chat_photo")
class ChatPhoto : Serializable {
    /**
     * PHOTO-fromName-sendTime
     */
    @javax.persistence.Id
    var id: String? = null
    var fileName: String? = null
    var extensionType: String? = null
    @Column(name = "file_byte", columnDefinition = "LONGBLOB COMMENT '文件格式'")
    var fileByte: ByteArray? = null

    var fromName: String? = null
    /**
     * 收图片的，可以是1个人，也可以是多人，用逗号分隔
     */
    @Column(name = "to_names", columnDefinition = "MEDIUMTEXT")
    var toNames: String? = null
    var sendTime: Long? = null
}
