package io.openhistor.frontweb.domain.history.subject

class Name(private val name: String) {
    init {
        assert(name.isNotEmpty(), { "name is empty." })
        assert(name.length < 100, { "name is too long. [$name]" })
    }
}