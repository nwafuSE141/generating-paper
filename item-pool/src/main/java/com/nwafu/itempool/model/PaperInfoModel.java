package com.nwafu.itempool.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
public class PaperInfoModel {

    List<SingleChoicModel> singleChoicList = new ArrayList<>();
    List<MultipleChoiceModel> multipleChoicList = new ArrayList<>();
    List<FillBlankModel> fillBlankList = new ArrayList<>();
    List<TrueOrFalseModel>trueOrFalseList = new ArrayList<>();
    List<QuesAndAnsModel>quesAndAnsList = new ArrayList<>();
    int singleChoicScore = 0;
    int multipleChoicScore = 0;
    int fillBlankScore = 0;
    int trueOrFalseScore = 0;
    int quesAndAnsScore = 0;
    int sumScore = 0;


    public void addSingChioice(SingleChoicModel model) {
        this.singleChoicList.add(model);
        this.singleChoicScore += model.getScore();
        this.sumScore += model.getScore();
    }

    public void addMultipleChoice(MultipleChoiceModel model) {
        this.multipleChoicList.add(model);
        this.multipleChoicScore += model.getScore();
        this.sumScore += model.getScore();
    }

    public void addFillBlank(FillBlankModel model) {
        this.fillBlankList.add(model);
        this.fillBlankScore += model.getScore();
        this.sumScore += model.getScore();
    }

    public void addTrueOrFalse(TrueOrFalseModel model) {
        this.trueOrFalseList.add(model);
        this.trueOrFalseScore += model.getScore();
        this.sumScore += model.getScore();
    }

    public void addQuesAndAns(QuesAndAnsModel model) {
        this.quesAndAnsList.add(model);
        this.quesAndAnsScore += model.getScore();
        this.sumScore += model.getScore();
    }

    public int getSumScore() {
        return sumScore;
    }

    public void setSumScore(int sumScore) {
        this.sumScore = sumScore;
    }

    public List<SingleChoicModel> getSingleChoicList() {
        return singleChoicList;
    }

    public void setSingleChoicList(List<SingleChoicModel> singleChoicList) {
        this.singleChoicList = singleChoicList;
    }

    public List<MultipleChoiceModel> getMultipleChoicList() {
        return multipleChoicList;
    }

    public void setMultipleChoicList(List<MultipleChoiceModel> multipleChoicList) {
        this.multipleChoicList = multipleChoicList;
    }

    public List<FillBlankModel> getFillBlankList() {
        return fillBlankList;
    }

    public void setFillBlankList(List<FillBlankModel> fillBlankList) {
        this.fillBlankList = fillBlankList;
    }

    public List<TrueOrFalseModel> getTrueOrFalseList() {
        return trueOrFalseList;
    }

    public void setTrueOrFalseList(List<TrueOrFalseModel> trueOrFalseList) {
        this.trueOrFalseList = trueOrFalseList;
    }

    public List<QuesAndAnsModel> getQuesAndAnsList() {
        return quesAndAnsList;
    }

    public void setQuesAndAnsList(List<QuesAndAnsModel> quesAndAnsList) {
        this.quesAndAnsList = quesAndAnsList;
    }

    public int getSingleChoicScore() {
        return singleChoicScore;
    }

    public void setSingleChoicScore(int singleChoicScore) {
        this.singleChoicScore = singleChoicScore;
    }

    public int getMultipleChoicScore() {
        return multipleChoicScore;
    }

    public void setMultipleChoicScore(int multipleChoicScore) {
        this.multipleChoicScore = multipleChoicScore;
    }

    public int getFillBlankScore() {
        return fillBlankScore;
    }

    public void setFillBlankScore(int fillBlankScore) {
        this.fillBlankScore = fillBlankScore;
    }

    public int getTrueOrFalseScore() {
        return trueOrFalseScore;
    }

    public void setTrueOrFalseScore(int trueOrFalseScore) {
        this.trueOrFalseScore = trueOrFalseScore;
    }

    public int getQuesAndAnsScore() {
        return quesAndAnsScore;
    }

    public void setQuesAndAnsScore(int quesAndAnsScore) {
        this.quesAndAnsScore = quesAndAnsScore;
    }

    @Override
    public String toString() {
        return "PaperInfoModel{" +
                "singleChoicList=" + singleChoicList +
                ", multipleChoicList=" + multipleChoicList +
                ", fillBlankList=" + fillBlankList +
                ", trueOrFalseList=" + trueOrFalseList +
                ", quesAndAnsList=" + quesAndAnsList +
                ", singleChoicScore=" + singleChoicScore +
                ", multipleChoicScore=" + multipleChoicScore +
                ", fillBlankScore=" + fillBlankScore +
                ", trueOrFalseScore=" + trueOrFalseScore +
                ", quesAndAnsScore=" + quesAndAnsScore +
                ", sumScore=" + sumScore +
                '}';
    }
}
