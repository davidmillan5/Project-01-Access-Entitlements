package co.fintech.entitlements.model.exception;

public enum BusinessErrorType {

    MONETARY_VALUE_REQUIRED("AE-B001", "Monetary value required"),
    MONETARY_VALUE_NOT_ALLOWED("AE-B002", "Monetary value not allowed"),
    LIMIT_EXCEEDS_CEILING("AE-B003", "Limit exceeds operation ceiling"),
    INVALID_VALIDITY_PERIOD("AE-B004", "Invalid validity period"),
    OPERATION_NOT_AVAILABLE_ON_CHANNEL("AE-B005", "Operation not available on channel"),
    UNSUPPORTED_CURRENCY("AE-B006", "Unsupported currency"),
    OPERATION_NOT_SUPPORTED_FOR_PRODUCT("AE-B007", "Operation not supported for product type"),
    INVALID_AMOUNT("AE-B008", "Invalid amount"),
    DUPLICATE_ENTITLEMENT("AE-C001", "Duplicate entitlement"),
    INVALID_STATUS_TRANSITION("AE-C002", "Invalid status transition"),
    CONCURRENT_MODIFICATION("AE-C003", "Concurrent modification"),
    ENTITLEMENT_NOT_ACTIVE("AE-C004", "Entitlement not active"),
    ENTITLEMENT_NOT_FOUND("AE-N001", "Entitlement not found");

    private final String code;
    private final String title;


    BusinessErrorType(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

}
