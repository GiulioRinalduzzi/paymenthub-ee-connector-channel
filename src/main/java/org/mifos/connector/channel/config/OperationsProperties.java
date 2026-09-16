package org.mifos.connector.channel.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * How this connector reaches the operations service: {@code operations.*}.
 *
 * @param url
 *            base URL of the operations API
 * @param authEnabled
 *            whether calls to the operations API carry an authorization header
 * @param endpoint
 *            the paths under the base URL, {@code operations.endpoint.*}
 */

@ConfigurationProperties(prefix = "operations")
public record OperationsProperties(String url, @DefaultValue("false") boolean authEnabled, @DefaultValue Endpoint endpoint) {

    /**
     * Paths under the operations base URL: {@code operations.endpoint.*}.
     *
     * @param transfers
     *            the transfers query path
     * @param transactionReq
     *            the transaction requests query path
     */
    public record Endpoint(String transfers, String transactionReq) {
    }
}
