package com.yupi.fengoj.judge;

import com.yupi.fengoj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.fengoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yupi.fengoj.judge.strategy.JudgeContext;
import com.yupi.fengoj.judge.strategy.JudgeStrategy;
import com.yupi.fengoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.fengoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
