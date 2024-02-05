package org.example;

class Lang {
    private Integer id;
    private String welcomeMsg;
    private LangCodes code;

    public Lang(Integer id, String welcomeMsg, LangCodes code) {
        this.id = id;
        this.welcomeMsg = welcomeMsg;
        this.code = code;
    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public LangCodes getCode() {
        return code;
    }

    public void setCode(LangCodes code) {
        this.code = code;
    }

    public Integer getId() {
        return id;
    }
}
