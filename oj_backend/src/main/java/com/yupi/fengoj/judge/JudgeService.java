package com.yupi.fengoj.judge;

import com.yupi.fengoj.model.entity.QuestionSubmit;

public interface JudgeService {
    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}
