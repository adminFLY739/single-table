package com.fly.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    /**
     * 增删改的成功响应
     *
     * @return
     */
    public static Result success() {
        return new Result(1, "success", null);
    }

    /**
     * 查的成功响应
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {
        return new Result(1, "success", data);
    }

    /**
     * 失败的响应
     *
     * @param msg
     * @return
     */
    public static Result error(String msg) {
        return new Result(0, msg, null);
    }
}
