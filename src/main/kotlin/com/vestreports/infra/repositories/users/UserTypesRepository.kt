package com.vestreports.infra.repositories.users

import com.vestreports.infra.models.users.UserTypeModel
import org.springframework.data.repository.CrudRepository

interface UserTypesRepository : CrudRepository<UserTypeModel, Int> {

}
