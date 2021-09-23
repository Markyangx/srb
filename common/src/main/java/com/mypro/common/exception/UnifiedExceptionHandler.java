package com.mypro.common.exception;

import com.mypro.common.result.ResponseEnum;
import com.mypro.common.result.ResultWarrp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @ProjectName: srb
 * @Package: com.mypro.common.exception
 * @ClassName: UnifiedExceptionHandler
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/6 9:48
 * @Version: 1.0
 */
@Slf4j
@Component //Spring容易自动管理
@RestControllerAdvice //在controller层添加通知。如果使用@ControllerAdvice，则方法上需要添加@ResponseBody
public class UnifiedExceptionHandler {

    /**
     * 通用捕获异常
     */
    @ExceptionHandler(value = Exception.class) //当controller中抛出Exception，则捕获
    public ResultWarrp handleException(Exception e) {
        log.error(e.getMessage(), e);
        return ResultWarrp.error();
    }

    /**
     * 捕获异常
     */
    @ExceptionHandler(value = BadSqlGrammarException.class) //当controller中抛出Exception，则捕获
    public ResultWarrp handleException(BadSqlGrammarException e) {
        log.error(e.getMessage(), e);
        return ResultWarrp.setResult(ResponseEnum.BAD_SQL_GRAMMAR_ERROR);
    }

    /**
     * 捕获异常
     */
    @ExceptionHandler(value = BusinessException.class) //当controller中抛出Exception，则捕获
    public ResultWarrp handleException(BusinessException e) {
        log.error(e.getMessage(), e);
        return ResultWarrp.error().message(e.getMessage()).code(e.getCode());
    }


    /**
     * Controller上一层相关异常
     */
    @ExceptionHandler({
            NoHandlerFoundException.class,
            HttpRequestMethodNotSupportedException.class,
            HttpMediaTypeNotSupportedException.class,
            MissingPathVariableException.class,
            MissingServletRequestParameterException.class,
            TypeMismatchException.class,
            HttpMessageNotReadableException.class,
            HttpMessageNotWritableException.class,
            MethodArgumentNotValidException.class,
            HttpMediaTypeNotAcceptableException.class,
            ServletRequestBindingException.class,
            ConversionNotSupportedException.class,
            MissingServletRequestPartException.class,
            AsyncRequestTimeoutException.class
    })
    public ResultWarrp handleServletException(Exception e) {
        log.error(e.getMessage(), e);
        //SERVLET_ERROR(-102, "servlet请求异常"),
        return ResultWarrp.error().message(ResponseEnum.SERVLET_ERROR.getMessage()).code(ResponseEnum.SERVLET_ERROR.getCode());
    }
}
