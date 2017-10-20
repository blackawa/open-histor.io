package io.openhistor.frontweb.domain.user.attribute

class Username(private val name: String) {
    init {
        assert(name.isNotEmpty(), { "username is empty." })
        assert(name.length < 100, { "username is too long. [$name]" })
    }
}