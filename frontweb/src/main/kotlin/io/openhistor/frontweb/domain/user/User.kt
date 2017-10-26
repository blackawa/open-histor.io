package io.openhistor.frontweb.domain.user

import io.openhistor.frontweb.domain.subject.epoch.Epochs
import io.openhistor.frontweb.domain.user.attribute.EmailAddress
import io.openhistor.frontweb.domain.user.attribute.Username
import io.openhistor.frontweb.domain.user.authentication.OAuthToken

class User(
    private val token: OAuthToken,
    private val username: Username,
    private val emailAddress: EmailAddress,
    private val epochs: Epochs
)