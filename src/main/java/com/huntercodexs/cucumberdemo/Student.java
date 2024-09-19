package com.huntercodexs.cucumberdemo;

public class Student {

    private final StudentDTO studentDTO;

    public Student() {
        this.studentDTO = new StudentDTO();
    }

    public void setAverage(int avg) {
        this.studentDTO.setAverage(avg);
    }

    public void setFrequency(int frequency) {
        this.studentDTO.setFrequency(frequency);
        this.setStatus();
    }

    private void setStatus() {
        if (this.studentDTO.getAverage() >= 6 && this.studentDTO.getFrequency() >= 75) {
            this.studentDTO.setStatus(StudentEnum.Approved);
        } else {
            this.studentDTO.setStatus(StudentEnum.Reproved);
        }
    }

    public StudentEnum studentStatus() {
        return this.studentDTO.getStatus();
    }
}
