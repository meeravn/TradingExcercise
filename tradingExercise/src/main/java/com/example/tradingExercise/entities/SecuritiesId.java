package com.example.tradingExercise.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SecuritiesId implements Serializable {

    private String securityIdentifier;
    private String tradingAccount;

    public String getSecurityIdentifier() {
        return securityIdentifier;
    }

    public void setSecurityIdentifier(String securityIdentifier) {
        this.securityIdentifier = securityIdentifier;
    }

    public String getTradingAccount() {
        return tradingAccount;
    }

    public void setTradingAccount(String tradingAccount) {
        this.tradingAccount = tradingAccount;
    }
}
