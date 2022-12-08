package com.vestreports.application.controllers.users

import com.vestreports.data.features.users.UserFeature
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserLoginController(
    private val userFeature: UserFeature
) {


}