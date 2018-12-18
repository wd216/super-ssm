package com.nf147.ssms.vo;

import com.github.pagehelper.Page;

import java.util.List;

public class Result<T>  {
    private int code;
    private String errMsg;
    private T data;
    private Page<T> pager;

    private List<ErrorDetail> errors;
    private long dataTimestamp;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Page<T> getPager() {
        return pager;
    }

    public void setPager(Page<T> pager) {
        this.pager = pager;
    }

    public List<ErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDetail> errors) {
        this.errors = errors;
    }

    public long getDataTimestamp() {
        return dataTimestamp;
    }

    public void setDataTimestamp(long dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
    }
}

class ErrorDetail {
    private String type;
    private String message;
    private int code;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

/*result = new Result();
errors = new ArrayList();
        errors.add(new ErrorDetail())
        errors.add(new ErrorDetail())
        errors.add(new ErrorDetail())
result.setErrors(errors)
result.seterrMsg(_)
result.setStatusCode();

        Result.status(444).errMsg("kkksdfksjf")
                .addError("mis", "ksfjksdjfks")
                .addError("ksdjfksdjf");

        Result.data("ksjdfksjdfks");*/