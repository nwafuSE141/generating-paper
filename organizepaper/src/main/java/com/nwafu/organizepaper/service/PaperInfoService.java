package com.nwafu.organizepaper.service;

import com.nwafu.itempool.beans.*;
import com.nwafu.itempool.mapper.*;
import com.nwafu.itempool.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author TinChiWay
 * @data 2018/5/3
 */
@Service
public class PaperInfoService {
    @Autowired
    private PaperInfoMapper paperInfoMapper;

    @Autowired
    private SingleChoicMapper  singleChoicMapper;//10001

    @Autowired
    private MultipleChoiceMapper multipleChoiceMapper;//10002

    @Autowired
    private FillBlankMapper fillBlankMapper;//10003

    @Autowired
    private TrueOrFalseMapper trueOrFalseMapper;//10004

    @Autowired
    private QuesAndAnsMapper quesAndAnsMapper;//10005

    public List getPaperInfo(Integer paperId){
        return paperInfoMapper.getPaperInfo(paperId);
    }

    //获取paper详细信息
    public PaperInfoModel getPapercompleteInfo(Integer paperId){

        List<PaperInfo> infoList = paperInfoMapper.getPaperInfo(paperId);

        PaperInfoModel paperInfoModel = new PaperInfoModel();
        for (PaperInfo info : infoList){
            if (info.getTypeId() == 10001){
                SingleChoic singleChoic = singleChoicMapper.selectByPrimaryKey(info.getQuestionId());
                SingleChoicModel model = new SingleChoicModel(singleChoic);
                model.setSerialNumber(info.getSerialNumber());
                paperInfoModel.addSingChioice(model);
            }
            if (info.getTypeId() == 10002){
                MultipleChoice multipleChoice = multipleChoiceMapper.selectByPrimaryKey(info.getQuestionId());
                MultipleChoiceModel model = new MultipleChoiceModel(multipleChoice);
                model.setSerialNumber(info.getSerialNumber());
                paperInfoModel.addMultipleChoice(model);
            }
            if (info.getTypeId() == 10003){
                FillBlank fillBlank = fillBlankMapper.selectByPrimaryKey(info.getQuestionId());
                FillBlankModel model = new FillBlankModel(fillBlank);
                model.setSerialNumber(info.getSerialNumber());
                paperInfoModel.addFillBlank(model);
            }
            if (info.getTypeId() == 10004){
                TrueOrFalse trueOrFalse = trueOrFalseMapper.selectByPrimaryKey(info.getQuestionId());
                TrueOrFalseModel model = new TrueOrFalseModel(trueOrFalse);
                model.setSerialNumber(info.getSerialNumber());
                paperInfoModel.addTrueOrFalse(model);
            }
            if (info.getTypeId() == 10005){
                QuesAndAns quesAndAns = quesAndAnsMapper.selectByPrimaryKey(info.getQuestionId());
                QuesAndAnsModel model = new QuesAndAnsModel(quesAndAns);
                model.setSerialNumber(info.getSerialNumber());
                paperInfoModel.addQuesAndAns(model);
            }
        }

        return paperInfoModel;

    }

}
