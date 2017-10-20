package io.openhistor.frontweb.domain.user

import io.openhistor.frontweb.domain.user.authorization.Role

/**
 * 閲覧権限を持つユーザー.
 */
class Reader(private val user: User) {
    private val role = Role.READER
}