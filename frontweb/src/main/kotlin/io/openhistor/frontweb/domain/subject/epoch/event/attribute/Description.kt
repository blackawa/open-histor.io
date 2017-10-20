package io.openhistor.frontweb.domain.subject.epoch.event.attribute

class Description(private val description: String) {
    init {
        assert(description.length < 1000, { "description is too long. [$description]" })
    }
}