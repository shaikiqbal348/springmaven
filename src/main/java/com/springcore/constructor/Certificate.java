package com.springcore.constructor;

public class Certificate {
    private String certificateName;

    public Certificate(String certificateName) {
        this.certificateName = certificateName;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificateName='" + certificateName + '\'' +
                '}';
    }
}
