package io.openhistor.frontweb.domain.user

import io.openhistor.frontweb.domain.user.authorization.Role

/**
 * 編纂者権限を持つユーザー.
 */
class Compiler(private val user: User) {
    private val role = Role.COMPILER
}