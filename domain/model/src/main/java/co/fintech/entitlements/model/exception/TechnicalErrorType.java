package co.fintech.entitlements.model.exception;

public enum TechnicalErrorType {

    DATABASE_UNAVAILABLE("AE-T001", "Service temporarily unavailable"),
    UNEXPECTED("AE-T999", "Unexpected error");

    private final String code;
    private final String title;

    TechnicalErrorType(String code, String title) {
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
