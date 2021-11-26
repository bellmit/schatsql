package com.myworld.schat.data.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "show_panel_photo")
class ShowPanelPhoto(
    @javax.persistence.Id
    var id: String,
    var fileName: String,
    var extensionType: String,
    @Column(name = "file_byte", columnDefinition = "LONGBLOB COMMENT '文件格式'")
    var fileByte: ByteArray
) : Serializable
