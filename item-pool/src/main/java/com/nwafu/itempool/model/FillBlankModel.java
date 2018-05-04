package com.nwafu.itempool.model;

import com.nwafu.itempool.beans.FillBlank;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
public class FillBlankModel {
    private int  serialNumber;
    private int id;
    private String question;
    private String answer;
    private int score;

    public FillBlankModel(FillBlank fillBlank) {
        this.id = fillBlank.getId();
        this.question = fillBlank.getQuestion();
        this.answer = fillBlank.getAnswer();
        this.score = fillBlank.getScore();
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
