package com.yupi.fengoj.judge.strategy;

import com.yupi.fengoj.model.dto.question.JudgeCase;
import com.yupi.fengoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.fengoj.model.entity.Question;
import com.yupi.fengoj.model.entity.QuestionSubmit;
import lombok.Data;
import lombok.Setter;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    @Setter
    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
