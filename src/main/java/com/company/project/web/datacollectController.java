package com.company.project.web;

import javax.annotation.Resource;
import com.company.project.core.Result;
import com.company.project.service.datacollectService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据采集
 * 
 * @author swj
 */

@RestController
@RequestMapping("/test")
public class datacollectController{
    @Resource
    private datacollectService datacollectService;
    @Resource
    MongoTemplate mongoTemplate;
    @PostMapping("/datacollect")
    public Result datacollect(@RequestBody String str) throws Exception {
        return datacollectService.insert(str);
    }

    @PostMapping("/dataselect")
    public Result dataselect(@RequestBody String str) throws Exception {
        Result result=new Result();
        result.setData(datacollectService.find(str));
        return result;
    }


}
