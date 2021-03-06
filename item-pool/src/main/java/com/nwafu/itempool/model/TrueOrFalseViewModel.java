package com.nwafu.itempool.model;

import com.nwafu.itempool.beans.TrueOrFalse;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
public class TrueOrFalseViewModel {
    private int  serialNumber;
    private String question;
    private String answer;
    private int score;
    private int id;

    public TrueOrFalseViewModel(TrueOrFalse trueOrFalse) {
        this.id = trueOrFalse.getId();
        this.question = trueOrFalse.getQuestion();
        this.answer = trueOrFalse.getAnswer();
        this.score = trueOrFalse.getScore();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
