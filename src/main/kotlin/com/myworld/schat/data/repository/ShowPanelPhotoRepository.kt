package com.myworld.schat.data.repository

import com.myworld.schat.data.entity.ShowPanelPhoto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional
@Repository
interface ShowPanelPhotoRepository : JpaRepository<ShowPanelPhoto, String>
