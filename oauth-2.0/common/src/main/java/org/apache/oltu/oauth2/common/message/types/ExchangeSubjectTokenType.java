package org.apache.oltu.oauth2.common.message.types;

public enum ExchangeSubjectTokenType {
    ACCESS_TOKEN("urn:ietf:params:oauth:token-type:access_token"),
    REFRESH_TOKEN("urn:ietf:params:oauth:token-type:refresh_token"),
    ID_TOKEN("urn:ietf:params:oauth:token-type:id_token"),
    SAML_V1("urn:ietf:params:oauth:token-type:saml1"),
    SAML_V2("urn:ietf:params:oauth:token-type:saml2");

    private final String tokenType;

    ExchangeSubjectTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public String toString() {
        return tokenType;
    }
}
