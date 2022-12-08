package com.vestreports.infra.models.users

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import java.time.LocalDateTime

@Entity(name = "users")
data class UserModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    var idUser: Int? = null,

    @JoinColumn(name = "id_user_type")
    var userType: UserTypeModel? = null,

    @Column
    var name: String,

    @Column
    var email: String,

    @Column
    var password: String,

    @Column(name = "created_at")
    val createdAt: LocalDateTime,

    @Column(name = "updated_at")
    val updatedAt: LocalDateTime,

    @Column(name = "finished_at")
    val finishedAt: LocalDateTime
)
