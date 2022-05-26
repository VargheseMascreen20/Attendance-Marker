package com.var.attendancetracker;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class AppViewModel extends BaseObservable {

    private final com.var.attendancetracker.Model model;


    private final String successMessage = "Attendance Marked";

    @Bindable
    private String toastMessage = null;

    public AppViewModel() {
        model = new com.var.attendancetracker.Model("", "", "", "", "");
    }

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @Bindable
    public String getStudentName() {
        return model.getStudentName();
    }

    public void setStudentName(String studentName) {
        model.setStudentName(studentName);
        notifyPropertyChanged(BR.studentName);
    }

    @Bindable
    public String getSubject() {
        return model.getSubject();
    }

    public void setSubject(String subject) {
        model.setSubject(subject);
        notifyPropertyChanged(BR.subject);
    }

    @Bindable
    public String getDate() {
        return model.getDate();
    }

    public void setDate(String date) {
        model.setDate(date);
        notifyPropertyChanged(BR.date);
    }

    @Bindable
    public String getHours() {
        return model.getNoOfHours();
    }

    public void setHours(String hours) {
        model.setNoOfHours(hours);
        notifyPropertyChanged(BR.hours);
    }

    @Bindable
    public String getStatus() {
        return model.getStatus();
    }

    public void setStatus(String status) {
        model.setStatus(status);
        notifyPropertyChanged(BR.status);
    }


    public void onButtonClicked() {
        setToastMessage(successMessage);
    }


}
