package com.company.project.service.impl;

import javax.annotation.Resource;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.service.datacollectService;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @author swj
 */
@Service
public class datacollectServiceImpl implements datacollectService{

    @Resource
    MongoTemplate mongoTemplate;
    
    @Override
    public Result insert(String info) {
        mongoTemplate.insert(info, "datacollect");
        return ResultGenerator.genSuccessResult();
    }

    
   
}
