package com.company.project.service;

import java.util.Map;

import com.company.project.core.Result;
import com.company.project.model.DataCollect;
import com.company.project.model.PageResult;

import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author swj
 */
public interface DataCollectService {
    /**
     * 插入mongodb
     */
    Result insert(String info);

    /**
     * 查询分页数据
     * @param info
     * @return
     */
    PageResult<DataCollect> queryData(String info);


}
