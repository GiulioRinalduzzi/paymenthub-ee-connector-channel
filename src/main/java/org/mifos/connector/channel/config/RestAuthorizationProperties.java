package org.mifos.connector.channel.config;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * The authorization server this connector talks to: {@code rest.authorization.*}.
 *
 * @param enabled
 *            whether endpoint authorization is applied at all
 * @param host
 *            base URL of the authorization server, needed when enabled
 * @param header
 *            the Authorization header value used when asking for a token, needed when enabled
 */

@Validated
@ConfigurationProperties(prefix = "rest.authorization")
public record RestAuthorizationProperties(@NotNull Boolean enabled, @NotNull String host, @NotNull String header) {

    /**
     *
     * @return true when authorization is off, or on and fully configured
     */

}
