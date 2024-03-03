package com.yupi.fengoj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.fengoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.fengoj.model.entity.QuestionSubmit;
import com.yupi.fengoj.model.entity.User;

/**
 * @author 李鱼皮
 * @description 针对表【question_submit(题目提交)】的数据库操作Service
 * @createDate 2023-08-07 20:58:53
 */
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);



}
