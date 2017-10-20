package io.openhistor.frontweb.domain.subject.epoch.event.time

class Span(private val start: Date, private val end: Date) {
    init {
        assert(start <= end, { "start date[$start] must be earlier than end date[$end]" })
    }
}