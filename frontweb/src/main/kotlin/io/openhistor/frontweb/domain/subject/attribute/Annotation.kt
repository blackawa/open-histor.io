package io.openhistor.frontweb.domain.subject.attribute

class Annotation(private val annotation: String) {
    init {
        assert(annotation.isNotEmpty(), { "annotation is empty." })
        assert(annotation.length < 100, { "annotation is too long. [$annotation]" })
    }
}