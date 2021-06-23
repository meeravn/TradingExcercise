package com.example.tradingExercise.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class SecurityTrade implements Serializable {

    @EmbeddedId
    private SecuritiesId id;
    private int count;

    public SecurityTrade(){
    }

    public SecurityTrade(Securities security) {
        this.id = new SecuritiesId();
        this.id.setSecurityIdentifier(security.getSecurityIdentifier());
        this.id.setTradingAccount(security.getTradingAccount());
    }

    public SecurityTrade(String trade,String security,int count) {
        this.id = new SecuritiesId();
        this.id.setSecurityIdentifier(security);
        this.id.setTradingAccount(trade);
        this.count = count;
    }

    public SecuritiesId getId() {
        return id;
    }

    public void setId(SecuritiesId id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return  id.getTradingAccount() + " " + id.getSecurityIdentifier()+
                " " + count;
    }
}
