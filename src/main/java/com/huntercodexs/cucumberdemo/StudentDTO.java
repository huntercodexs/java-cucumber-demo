package com.huntercodexs.cucumberdemo;

public class StudentDTO {
    private int id;
    private int average;
    private int frequency;
    private StudentEnum status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public StudentEnum getStatus() {
        return status;
    }

    public void setStatus(StudentEnum status) {
        this.status = status;
    }
}
