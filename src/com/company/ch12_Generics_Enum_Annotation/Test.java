package com.company.ch12_Generics_Enum_Annotation;

public enum Test {
    TASK_WAIT("wait"),
    TASK_START("start"),
    TASK_PROCEEDING("proceeding"),
    TASK_COMPLETION("completion"),
    TASK_FAILED("failed"),
    TASK_FORCE_START("force_start"),
    TASK_FORCE_FAILED("force_failed");

    final String val;
    Test(String val) {
        this.val = val;
    }

    public String get(){
        return val;
    }
}
