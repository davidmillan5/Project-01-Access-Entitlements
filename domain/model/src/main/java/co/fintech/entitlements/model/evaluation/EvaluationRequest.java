package co.fintech.entitlements.model.evaluation;

import co.fintech.entitlements.model.accessentitlement.Channel;
import co.fintech.entitlements.model.accessentitlement.CustomerId;
import co.fintech.entitlements.model.accessentitlement.OperationType;
import co.fintech.entitlements.model.share.Money;

public class EvaluationRequest {

    private CustomerId customerId;
    private String productId;
    private OperationType operation;
    private Channel channel;
    private Money amount;



}
