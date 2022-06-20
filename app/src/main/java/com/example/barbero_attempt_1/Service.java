package com.example.barbero_attempt_1;

public enum Service {

    MAN("Man"),
    WOMAN("Woman"),
    KID("Kid"),
    BATHING("Bathing"),
    BEARD("Beard"),
    STYLING("Styling"),
    DYE("Dye"),
    SHAVING("Shaving")
    ;

    private String service;

    Service(String service) {
        this.service=service;
    }

    public String getService() {
        return service;
    }
}
