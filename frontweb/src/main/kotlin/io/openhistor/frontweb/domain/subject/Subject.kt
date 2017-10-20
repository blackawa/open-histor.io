package io.openhistor.frontweb.domain.subject

import io.openhistor.frontweb.domain.subject.epoch.Epochs
import io.openhistor.frontweb.domain.subject.epoch.event.Events

/**
 * 時代を描写する対象物.
 */
class Subject (
    private val events: Events,
    private val epochs: Epochs
)