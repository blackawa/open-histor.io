package io.openhistor.frontweb.layer.presentation.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AuthenticationController {
    @GetMapping("/users/session/new")
    fun new(): String = "users/session/new"
}