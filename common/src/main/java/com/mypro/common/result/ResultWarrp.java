package com.mypro.common.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: srb
 * @Package: com.mypro.common
 * @ClassName: ResultWarrp
 * @Author: yxl
 * @Description:
 * @Date: 2021/9/5 18:15
 * @Version: 1.0
 */
@Data
public class ResultWarrp {
    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap();

    private ResultWarrp(){}

    /**
     * 响应成功
     * @return
     */
    public static ResultWarrp ok(){
        ResultWarrp resultWarrp = new ResultWarrp();
        resultWarrp.setCode(ResponseEnum.SUCCESS.getCode());
        resultWarrp.setMessage(ResponseEnum.SUCCESS.getMessage());
        return resultWarrp;
    }

    /**
     * 响应失败
     * @return
     */
    public static ResultWarrp error(){
        ResultWarrp resultWarrp = new ResultWarrp();
        resultWarrp.setCode(ResponseEnum.ERROR.getCode());
        resultWarrp.setMessage(ResponseEnum.ERROR.getMessage());
        return resultWarrp;
    }

    /**
     * 设置特定结果
     */
    public static ResultWarrp setResult(ResponseEnum responseEnum){
        ResultWarrp r = new ResultWarrp();
        r.setCode(responseEnum.getCode());
        r.setMessage(responseEnum.getMessage());
        return r;
    }

    public ResultWarrp message(String message){
        this.setMessage(message);
        return this;
    }

    public ResultWarrp code(Integer code){
        this.setCode(code);
        return this;
    }

    public ResultWarrp data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public ResultWarrp data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
