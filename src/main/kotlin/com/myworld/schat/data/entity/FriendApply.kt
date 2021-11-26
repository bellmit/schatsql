package com.myworld.schat.data.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "friend_apply")
class FriendApply : Serializable {

    @javax.persistence.Id
    var id: String? = null

    /**
     * 申请状态：等待验证，验证通过，拒绝通过
     */
    var status: String? = null
    var userWid: String? = null
    var userDisplayName: String? = null
    var userPhoneNumber: String? = null
    var applyContent: String? = null
    var applyTime: Long? = null

    var targetWid: String? = null
    var targetDisplayName: String? = null
    var targetPhoneNumber: String? = null
    var targetRemarkName: String? = null
    var targetTagName: String? = null
    var targetContent: String? = null
    var confirmTime: Long? = null
}
