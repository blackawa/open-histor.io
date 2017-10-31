package io.openhistor.frontweb.domain.history.subject

import io.openhistor.frontweb.domain.history.subject.event.Events

/**
 * 時代を描写する対象物.
 */
class Subject (
    private val name: Name,
    private val annotation: Annotation,
    private val events: Events
)