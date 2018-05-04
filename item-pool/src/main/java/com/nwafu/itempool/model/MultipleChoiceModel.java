package com.nwafu.itempool.model;

import com.nwafu.itempool.beans.MultipleChoice;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
public class MultipleChoiceModel {
    private int  serialNumber;
    private String question;
    private String answer;
    private int score;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public MultipleChoiceModel(MultipleChoice multipleChoice) {
        this.question = multipleChoice.getQuestion();
        this.answer = multipleChoice.getAnswer();
        this.score = multipleChoice.getScore();
        this.a = multipleChoice.getA();
        this.b = multipleChoice.getB();
        this.c = multipleChoice.getC();
        this.d = multipleChoice.getD();
        this.e =multipleChoice.getE();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }
}
