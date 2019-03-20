package com.javalearning.springmvc.registration.valid;

public enum ValidatorEnum {

    USERNAME("[a-zA-Z]{2,}", "err_code", "The username should contain at least 3 characters!"),
    PASSWORD("[a-zA-Z]{5,}", "err_code", "The password should contain at least 6 characters!"),
    EMAIL("\"^[A-Z0-9._%+-]+@[A-Z0-9.-}+\\\\.[A-Z]{2,6}$\"", "err_code", "Email format required");

    private String pattern;
    private String errCode;
    private String errMessage;

    ValidatorEnum(String pattern, String errCode, String errMessage) {

        this.pattern = pattern;
        this.errCode = errCode;
        this.errMessage = errMessage;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}
