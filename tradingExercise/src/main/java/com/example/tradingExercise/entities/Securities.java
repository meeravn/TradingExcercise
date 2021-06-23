package com.example.tradingExercise.entities;

import com.example.tradingExercise.enums.EventEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
public class Securities implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private int eventId;
    private EventEnum event;
    private String securityIdentifier;
    private String tradingAccount;
    private int count;

    public Securities(){};

    public Securities(int eventId, String event, String securityIdentifier, String tradingAccount, int count) {
        this.eventId = eventId;
        this.event = EventEnum.getEvent(event);
        this.securityIdentifier = securityIdentifier;
        this.tradingAccount = tradingAccount;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public EventEnum getEvent() {
        return event;
    }

    public void setEvent(EventEnum event) {
        this.event = event;
    }

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

    @Override
    public String toString() {
        return "[Id :"+eventId+ ","+event.toString()+","+tradingAccount+","+securityIdentifier+","+count+"]";
    }
}
