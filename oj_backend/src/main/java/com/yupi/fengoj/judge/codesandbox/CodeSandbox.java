package com.yupi.fengoj.judge.codesandbox;

import com.yupi.fengoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.fengoj.judge.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
