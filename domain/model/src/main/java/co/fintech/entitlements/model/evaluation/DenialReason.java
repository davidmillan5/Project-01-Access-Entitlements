package co.fintech.entitlements.model.evaluation;

public enum DenialReason {

    NO_ENTITLEMENT,
    ENTITLEMENT_SUSPENDED,
    ENTITLEMENT_NOT_YET_VALID,
    ENTITLEMENT_EXPIRED,
    AMOUNT_EXCEEDS_LIMIT

}
