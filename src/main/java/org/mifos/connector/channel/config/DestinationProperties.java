package org.mifos.connector.channel.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The default destination DFSP: {@code destination.*}.
 *
 * @param dfspid
 *            id of the DFSP a request is sent to when the caller does not name one
 */

@ConfigurationProperties(prefix = "destination")
public record DestinationProperties(String dfspid) {
}
