package com.vestreports.infra.models.users

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity(name = "users")
data class UserTypeModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user_type")
    var idUserType: Int? = null,

    @Column
    var name: String,

    @Column(name = "created_at")
    val createdAt: LocalDateTime,

    @Column(name = "updated_at")
    val updatedAt: LocalDateTime,

    @Column(name = "finished_at")
    val finishedAt: LocalDateTime
)
