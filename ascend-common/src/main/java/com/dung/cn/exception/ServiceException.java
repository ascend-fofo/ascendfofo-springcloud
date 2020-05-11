package com.dung.cn.exception;



import com.dung.cn.enums.IErrorCode;
import lombok.Data;

import java.io.Serializable;

@Data
public class ServiceException extends RuntimeException implements Serializable {

    private IErrorCode iErrorCode;
    private String errorCode;
    private String errorMessage;

    public ServiceException(IErrorCode iErrorCode) {
        super(iErrorCode.getErrorMessage());
        this.errorCode = iErrorCode.getErrorCode();
    }

    public ServiceException(String code, String errorMessage) {
        super(errorMessage);
        this.errorCode = code;
    }

}
