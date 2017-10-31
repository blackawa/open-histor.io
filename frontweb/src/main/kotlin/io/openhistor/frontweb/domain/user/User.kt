package io.openhistor.frontweb.domain.user

import io.openhistor.frontweb.domain.user.epoch.Epochs
import io.openhistor.frontweb.domain.user.authentication.OAuthToken

class User(
    private val token: OAuthToken,
    private val username: Username,
    private val emailAddress: EmailAddress,
    private val epochs: Epochs
)