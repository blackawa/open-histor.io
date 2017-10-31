package io.openhistor.frontweb.domain.history.subject.event

class Description(private val description: String) {
    init {
        assert(description.length < 1000, { "description is too long. [$description]" })
    }
}