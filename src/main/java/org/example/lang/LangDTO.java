package org.example.lang;

class LangDTO {
    private Integer id;
    private String code;

    LangDTO(Lang lang) {
        this.id = lang.getId();
        this.code = lang.getCode();
    }

    void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


}
