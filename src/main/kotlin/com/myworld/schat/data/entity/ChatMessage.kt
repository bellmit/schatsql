package com.myworld.schat.data.entity

import java.io.Serializable
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "chat_message")
class ChatMessage(
    /**
     * 单聊 id的格式如：未分类-ABC123456789-PAIR-TEXT-1580184911951
     * 群聊 id的格式如：groupId-ABC123456789-GROUP-TEXT-1580184911951
     * groupId的格式为：群创建人wid+GROUP+createTime，无“+”号
     */
    @javax.persistence.Id
    var id: String = "",
    var type: String = "",

    var fromName: String = "",
    var toName: String = "",
    @Column(name = "content", columnDefinition = "MEDIUMTEXT")
    var content: String? = null,
    var link: String? = null,
    var sendTime: Long = Date().time,
    var ackTime: Long? = null
) : Serializable, Comparable<ChatMessage> {

    /**
     * 设置为升序排列，即小的在前，大的在后
     */
    override fun compareTo(other: ChatMessage): Int {
        return sendTime.compareTo(other.sendTime)
    }

}
