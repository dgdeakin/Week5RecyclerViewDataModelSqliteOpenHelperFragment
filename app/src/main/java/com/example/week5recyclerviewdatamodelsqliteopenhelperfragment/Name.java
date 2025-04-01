package com.example.week5recyclerviewdatamodelsqliteopenhelperfragment;

public class Name {

    private int id;
    private String nameText;

    public Name(String nameText) {
        this.nameText = nameText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameText() {
        return nameText;
    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
    }
}
