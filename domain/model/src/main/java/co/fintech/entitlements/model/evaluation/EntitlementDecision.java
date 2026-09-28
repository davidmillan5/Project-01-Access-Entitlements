package co.fintech.entitlements.model.evaluation;

import co.fintech.entitlements.model.accessentitlement.EntitlementId;
import co.fintech.entitlements.model.share.Money;

import java.time.Instant;

public class EntitlementDecision {

    private Decision decision;
    private DenialReason reason;
    private EntitlementId entitlementId;
    private Money applicablelimit;
    private Instant evaluatedAt;


}
