package com.company.project.web;

import javax.annotation.Resource;

import com.company.project.core.Result;
import com.company.project.model.DataCollect;
import com.company.project.model.PageResult;
import com.company.project.service.DataCollectService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据采集
 * 
 * @author swj
 */

@RestController
public class DataCollectController {
    @Resource
    private DataCollectService dataCollectService;

    /**
     * 医保结算单数据采集
     * @param settleFee 医保结算单信息
     * @return
     * @throws Exception
     */
    @PostMapping("/dataCollect")
    public Result save(@RequestBody String settleFee) throws Exception {
        return dataCollectService.insert(settleFee);
    }

    /**
     * 医保结算单信息查询
     * @param queryParam
     * @return
     * @throws Exception
     */
    @GetMapping("/dataselect")
    public PageResult<DataCollect> getList(@RequestBody String queryParam) throws Exception {
        return dataCollectService.queryData(queryParam);
    }
    
}
