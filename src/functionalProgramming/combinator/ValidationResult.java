package combinator;

public enum ValidationResult {

    Success("This is a valid customer."),
    Invalid_Email("Email must contain '@' symbol."),
    Invalid_Phone_Number("Phone numbers must start with +91."),
    Not_An_Adult("This person is %d years old, hence not an adult.");

    private String resultMsg;

    ValidationResult(String resultMsg) {

        this.resultMsg = resultMsg;
    }

    public ValidationResult setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }

    @Override
    public String toString() {
        return this.resultMsg;
    }
}
