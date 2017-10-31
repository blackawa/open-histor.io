package io.openhistor.frontweb.domain.user.epoch

import io.openhistor.frontweb.domain.history.subject.event.Events
import io.openhistor.frontweb.domain.time.Span

class Epoch(
    private val span: Span,
    private val events: Events
)