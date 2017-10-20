package io.openhistor.frontweb.domain.subject.epoch.event

import io.openhistor.frontweb.domain.subject.epoch.event.attribute.Description
import io.openhistor.frontweb.domain.subject.epoch.event.attribute.Name
import io.openhistor.frontweb.domain.subject.epoch.event.attribute.time.Date

class Event(
    private val name: Name,
    private val time: Date,
    private val description: Description
)