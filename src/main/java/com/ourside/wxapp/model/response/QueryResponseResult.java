package com.ourside.wxapp.model.response;

import com.ourside.wxapp.model.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * @Author Czz
 * @Description 查询结果集(封装查询列表和总数)
 * @Date 2019-03-30 12:07
 * @Version 1.0
 */
@Data
@ToString
public class QueryResponseResult extends ResponseResult {

    QueryResult queryResult;

    public QueryResponseResult(ResultCode resultCode, QueryResult queryResult) {
        super(resultCode);
        this.queryResult = queryResult;

    }
}
