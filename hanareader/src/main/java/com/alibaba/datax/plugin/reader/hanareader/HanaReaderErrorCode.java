package com.alibaba.datax.plugin.reader.hanareader;

import com.alibaba.datax.common.spi.ErrorCode;

public enum HanaReaderErrorCode implements ErrorCode {
    HINT_ERROR("Hanareader-00", "您的 Hint 配置出错."),

    ;

    private final String code;
    private final String description;

    private HanaReaderErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return String.format("Code:[%s], Description:[%s]. ", this.code,
                this.description);
    }
}
