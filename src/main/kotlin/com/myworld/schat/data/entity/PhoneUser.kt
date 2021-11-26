package com.myworld.schat.data.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "phone_user")
data class PhoneUser(
    /**
     * wid即idDetail, 放在token中的
     */
    @javax.persistence.Id
    var wid: String,
    /**
     * 即手机号，昵称，头像
     */
    var username: String? = null,
    var nickname: String? = null,

    /**
     * 用户角色简单分类CLIENT, BANKER,使用逗号分隔
     */
    var playerType: String? = null,
    /**
     * 如果是银行人员，则其提供的服务
     * WEALTH, LOANPERSON, LOANCOMPANY
     */
    var offer: String? = null
) : Serializable
