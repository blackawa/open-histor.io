package io.openhistor.frontweb.domain.time

class Span(private val start: Date, private val end: Date) {
    init {
        assert(start <= end, { "start date[$start] must be earlier than end date[$end]" })
    }
}