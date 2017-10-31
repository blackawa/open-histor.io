package io.openhistor.frontweb.domain.history.subject.event

class Name(private val name: String) {
    init {
        assert(name.length < 140, { "name is too long. [$name]" })
    }
}