package com.var.attendancetracker;

import androidx.annotation.Nullable;

public class Model {

    @Nullable
    String studentName, subject, date, noOfHours, status;

    public Model(@Nullable String studentName, @Nullable String subject, @Nullable String date, @Nullable String noOfHours, @Nullable String status) {
        this.studentName = studentName;
        this.subject = subject;
        this.date = date;
        this.noOfHours = noOfHours;
        this.status = status;
    }

    @Nullable
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(@Nullable String studentName) {
        this.studentName = studentName;
    }

    @Nullable
    public String getSubject() {
        return subject;
    }

    public void setSubject(@Nullable String subject) {
        this.subject = subject;
    }

    @Nullable
    public String getDate() {
        return date;
    }

    public void setDate(@Nullable String date) {
        this.date = date;
    }

    @Nullable
    public String getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(@Nullable String noOfHours) {
        this.noOfHours = noOfHours;
    }

    @Nullable
    public String getStatus() {
        return status;
    }

    public void setStatus(@Nullable String status) {
        this.status = status;
    }
}
