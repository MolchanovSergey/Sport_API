package ru.netology.molchanov.Sport.domain;

public class Sport {

    String number;
    String name;
    String subject;
    String address;
    String date;

//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }

    public Sport(String number, String name, String subject, String address, String date) {
        this.number = number;
        this.name = name;
        this.subject = subject;
        this.address = address;
        this.date = date;

    }
    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
