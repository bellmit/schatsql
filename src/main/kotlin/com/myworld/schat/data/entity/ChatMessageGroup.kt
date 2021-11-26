package com.myworld.schat.data.entity

import java.io.Serializable
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

// Id格式与chatMessage保持一致，如：用户wid-GROUP-TEXT-1580026603426
// toNames格式为：wid1,wid2,wid3,
// ackTimes格式为：wid1=ackTime1, wid2=ackTime2, wid3=ackTime3,

@Entity
@Table(name = "chat_message_group")
data class ChatMessageGroup(
    /**
     * 单聊 id的格式如：未分类-ABC123456789-PAIR-TEXT-1580184911951
     * 群聊 id的格式如：groupId-ABC123456789-GROUP-TEXT-1580184911951
     * fromName即为groupId, 格式为：群创建人wid+GROUP+createTime，无“+”号
     * toNames为群成员wids
     * ackTimes为群成员分别ack的时间，{wid1=ackTime1, wid2=ackTime2,}
     */
    @javax.persistence.Id
    var id: String = "",

    var fromName: String = "",
    @Column(name = "to_names", columnDefinition = "MEDIUMTEXT")
    var toNames: String = "",

    var sendTime: Long = Date().time,
    @Column(name = "ack_times", columnDefinition = "MEDIUMTEXT")
    var ackTimes: String = "",

    var type: String = "",
    @Column(name = "content", columnDefinition = "MEDIUMTEXT")
    var content: String? = null,
    var link: String? = null
) : Serializable {


}
