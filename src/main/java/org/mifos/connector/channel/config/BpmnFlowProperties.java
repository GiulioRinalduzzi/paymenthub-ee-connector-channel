package org.mifos.connector.channel.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The BPMN process ids this connector starts: {@code bpmn.flows.*}.
 *
 * <p>
 * The property names are the ones the deployment sets as environment variables and must not be renamed.
 * </p>
 *
 * @param paymentTransfer
 *            the payer fund transfer flow
 * @param specialPaymentTransfer
 *            the special payer fund transfer flow
 * @param transactionRequest
 *            the payee transaction request flow
 * @param partyRegistration
 *            the party registration flow
 * @param inboundTransactionReqFlow
 *            the inbound transaction request flow
 * @param gsmaBaseTransaction
 *            the GSMA base transaction flow
 * @param gsmaIntTransfer
 *            the GSMA international transfer flow
 * @param gsmaPayeeProcess
 *            the GSMA payee process flow
 * @param gsmaBillPayment
 *            the GSMA bill payment flow
 * @param gsmaLinkBasedPayment
 *            the GSMA link based transfer flow
 * @param internationalRemittancePayee
 *            the international remittance payee flow
 * @param internationalRemittancePayer
 *            the international remittance payer flow
 */

@ConfigurationProperties(prefix = "bpmn.flows")
public record BpmnFlowProperties(String paymentTransfer, String specialPaymentTransfer, String transactionRequest, String partyRegistration,
        String inboundTransactionReqFlow, String gsmaBaseTransaction, String gsmaIntTransfer, String gsmaPayeeProcess,
        String gsmaBillPayment, String gsmaLinkBasedPayment, String internationalRemittancePayee, String internationalRemittancePayer) {
}
