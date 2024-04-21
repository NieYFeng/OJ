package com.yupi.fengoj.model.enums;

import org.apache.commons.lang3.ObjectUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 判题信息消息枚举
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public enum JudgeInfoMessageEnum {

    ACCEPTED("成功", "Accepted"),
    WRONG_ANSWER("答案错误", "Wrong Answer"),
    COMPILE_ERROR("Compile Error", "编译错误"),
    MEMORY_LIMIT_EXCEEDED("", "内存溢出"),
    TIME_LIMIT_EXCEEDED("Time Limit Exceeded", "超时"),
    PRESENTATION_ERROR("Presentation Error", "展示错误"),
    WAITING("Waiting", "等待中"),
    OUTPUT_LIMIT_EXCEEDED("Output Limit Exceeded", "输出溢出"),
    DANGEROUS_OPERATION("Dangerous Operation", "危险操作"),
    RUNTIME_ERROR("Runtime Error", "运行错误"),
    SYSTEM_ERROR("System Error", "系统错误");

    private final String text;

    private final String value;

    JudgeInfoMessageEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<String> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value
     * @return
     */
    public static JudgeInfoMessageEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (JudgeInfoMessageEnum anEnum : JudgeInfoMessageEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    /**
     * 主类（项目启动入口）
     *
     * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
     * @from <a href="https://yupi.icu">编程导航知识星球</a>
     */
    // todo 如需开启 Redis，须移除 exclude 中的内容
    @SpringBootApplication(exclude = {RedisAutoConfiguration.class})
    @MapperScan("com.yupi.fengoj.mapper")
    @EnableScheduling
    @EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
    public static class MainApplication {

        public static void main(String[] args) {
            SpringApplication.run(MainApplication.class, args);
        }

    }
}
