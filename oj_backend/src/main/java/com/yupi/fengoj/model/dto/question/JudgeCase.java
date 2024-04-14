package com.yupi.fengoj.model.dto.question;
import lombok.Data;

@Data
/**
 *  题目用例
 */
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;
    /**
     * 输出用例
     */
    private String output;

}
