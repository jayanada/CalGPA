package com.company;

public class Student {
    String name;
    double gpa;
    String subject = "oop";
    int marksoop = 56;
    int marksdata = 46;
    int marksstat;
    int markseng;
    int marksflash;
    int markssad;
    int marksethics;
    int marksdcn;
    double gp;

    public double getGrade(String subject, double gp) {
        this.gp = gp;
        this.subject = subject;
       if (subject.equals("oop")) {
           if (marksoop >= 70) {
               gp = 4;
           } else if (marksoop >= 65) {
               gp = 3.7;
           } else if (marksoop >= 60) {
               gp = 3.3;
           } else if (marksoop >= 55) {
               gp = 3;
           } else if (marksoop >= 50) {
               gp = 2.7;
           } else if (marksoop >= 45) {
               gp = 2.3;
           } else if (marksoop >= 40) {
               gp = 2;
           } else if (marksoop >= 35) {
               gp = 1.7;
           } else if (marksoop >= 30) {
               gp = 1.3;
           } else if (marksoop <= 25) {
               gp = 1;
           } else {
               gp = 0;
           }
       }

           if (subject.equals("data")) {
               if (marksdata >= 70) {
                   gp = 4;
               } else if (marksdata >= 65) {
                   gp = 3.7;
               } else if (marksdata >= 60) {
                   gp = 3.3;
               } else if (marksdata >= 55) {
                   gp = 3;
               } else if (marksdata >= 50) {
                   gp = 2.7;
               } else if (marksdata >= 45) {
                   gp = 2.3;
               } else if (marksdata >= 40) {
                   gp = 2;
               } else if (marksdata >= 35) {
                   gp = 1.7;
               } else if (marksdata >= 30) {
                   gp = 1.3;
               } else if (marksdata <= 25) {
                   gp = 1;
               } else {
                   gp = 0;
               }
           }
          return gp;

        }


    }


