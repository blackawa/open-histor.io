package io.openhistor.frontweb.domain.history.subject.event

import io.openhistor.frontweb.domain.time.Date

class Event(
    private val name: Name,
    private val time: Date,
    private val description: Description
)