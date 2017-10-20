package io.openhistor.frontweb.domain.user.attribute

class EmailAddress(private val emailAddress: String) {
    init {
        assert(
            emailAddress.matches(Regex("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")),
            { "email address is not valid. [$emailAddress]" }
        )
    }
}