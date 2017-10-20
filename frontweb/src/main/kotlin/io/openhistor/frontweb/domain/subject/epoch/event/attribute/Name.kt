package io.openhistor.frontweb.domain.subject.epoch.event.attribute

class Name(private val name: String) {
    init {
        assert(name.length < 140, { "name is too long. [$name]" })
    }
}