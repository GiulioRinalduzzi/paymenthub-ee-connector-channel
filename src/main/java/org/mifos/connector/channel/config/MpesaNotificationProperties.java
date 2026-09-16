package org.mifos.connector.channel.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

/**
 * Whether the connector notifies the mpesa notification service: {@code mpesa.notification.*}.
 *
 * <p>
 * Neither group has a default. These two flags decide whether a payment result is announced at all, and they are read
 * into the workflow in {@code ChannelRouteBuilder}, so a group that quietly went missing would turn notifications off
 * without anyone noticing. The deployment sets both, so a missing one means something went wrong and startup should say
 * so.
 * </p>
 *
 * @param success
 *            settings for the success notification
 * @param failure
 *            settings for the failure notification
 */

@ConfigurationProperties(prefix = "mpesa.notification")
public record MpesaNotificationProperties(@DefaultValue Success success, @DefaultValue Failure failure) {

    /**
     * Success notification: {@code mpesa.notification.success.*}.
     *
     * @param enabled
     *            whether the success notification is sent
     */
    public record Success(@DefaultValue("false") boolean enabled) {
    }

    /**
     * Failure notification: {@code mpesa.notification.failure.*}.
     *
     * @param enabled
     *            whether the failure notification is sent
     */
    public record Failure(@DefaultValue("false") boolean enabled) {
    }
}
