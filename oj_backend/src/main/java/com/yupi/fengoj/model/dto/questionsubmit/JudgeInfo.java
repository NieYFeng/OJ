package com.yupi.fengoj.model.dto.questionsubmit;
import lombok.Data;
/**
 * 题目用例
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private long message;
    /**
     * 消耗内存=kb
     */
    private long memory;
    /**
     * 消耗的时间
     */
    private long time;
}
