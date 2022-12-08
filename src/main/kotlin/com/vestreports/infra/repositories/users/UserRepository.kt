package com.vestreports.infra.repositories.users

import com.vestreports.infra.models.users.UserModel
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserModel, Int> {

}
