package com.example.tanush.registrationmodule;

import java.util.ArrayList;

public class WorkshopUser {
    String participant1;

    public WorkshopUser(String participant1, String volunteer, String mail, String contact, String collegeName, String slot, ArrayList<String> events, int cost) {
        this.participant1 = participant1;
        this.volunteer = volunteer;
        this.mail = mail;
        this.contact = contact;
        this.collegeName = collegeName;
        this.slot = slot;
        this.events = events;
        this.cost = cost;
    }

    public String getParticipant1() {
        return participant1;
    }

    public void setParticipant1(String participant1) {
        this.participant1 = participant1;
    }

    public String getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(String volunteer) {
        this.volunteer = volunteer;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public ArrayList<String> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<String> events) {
        this.events = events;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    String volunteer;
    String mail;
    String contact;
    String collegeName;
    String slot;
    ArrayList<String> events;
    int cost;

}
