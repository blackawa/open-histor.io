package io.openhistor.frontweb.domain.subject.epoch.event.time

import java.time.LocalDate

class Date(private val date: LocalDate) {
    operator fun compareTo(another: Date): Int = date.compareTo(another.date)
}