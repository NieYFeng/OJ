package com.yupi.fengoj.exception;

import com.yupi.fengoj.common.BaseResponse;
import com.yupi.fengoj.common.ErrorCode;
import com.yupi.fengoj.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;

/**
 * 全局异常处理器
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }
    /**
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");
    }
    */
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException occurred", e);
        log.error("Exception message: {}", e.getMessage());
        log.error("Exception stack trace: {}", Arrays.toString(e.getStackTrace()));

        // 返回一个带有详细信息的错误响应
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误，请查看日志了解更多信息。");
    }

}
