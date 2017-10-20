package io.openhistor.frontweb.domain.subject.epoch

import io.openhistor.frontweb.domain.subject.epoch.event.Events
import io.openhistor.frontweb.domain.subject.epoch.event.attribute.time.Span

/**
 * ある対象が経てきた1つの時代.
 */
class Epoch(
    private val span: Span,
    private val events: Events
)