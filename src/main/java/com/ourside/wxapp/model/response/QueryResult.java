package com.ourside.wxapp.model.response;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Author Czz
 * @Description 查询列表结果
 * @Date 2019-03-30 12:04
 * @Version 1.0
 */
@Data
@ToString
public class QueryResult<T> {
    //数据列表
    private List<T> list;
    //数据总数
    private long queryTotal;
}
