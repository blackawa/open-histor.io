package io.openhistor.frontweb.domain.subject

import io.openhistor.frontweb.domain.subject.attribute.Name
import io.openhistor.frontweb.domain.subject.epoch.Epochs
import io.openhistor.frontweb.domain.subject.epoch.event.Events

/**
 * 時代を描写する対象物.
 */
class Subject (
    private val name: Name,
    private val annotation: Annotation,
    private val events: Events
)