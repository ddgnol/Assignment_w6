package com.example.listviewexample_dtl;

public class MailModel {
    String fullname;
    String subject;
    String content;
    boolean isSelected;

    public MailModel(String fullname, String subject, String content, boolean isSelected) {
        this.fullname = fullname;
        this.subject = subject;
        this.content = content;
        this.isSelected = isSelected;
    }

    public MailModel() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
