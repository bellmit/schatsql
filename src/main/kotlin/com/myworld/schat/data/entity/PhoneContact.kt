package com.myworld.schat.data.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "phone_contact")
class PhoneContact : Serializable {
    @javax.persistence.Id
    var id: String? = null

    // 所有者信息
    var userWid: String? = null
    var tag: String? = null
    // 联系人信息，只记录联系人不会变的信息，联系人的phoneNumber, nickname, avatar都会有变化
    var targetWid: String? = null
    // 联系人 displayName 由 所有者修改并保存
    var displayName: String? = null

}
