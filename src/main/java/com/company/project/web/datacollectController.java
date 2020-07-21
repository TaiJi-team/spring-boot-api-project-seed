package com.company.project.web;

import javax.annotation.Resource;

import com.company.project.core.Result;
import com.company.project.service.datacollectService;
import com.company.project.service.impl.datacollectServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
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
public class datacollectController {
    @Resource
    private datacollectService datacollectService;


    @PostMapping("/datacollect")
    public Result datacollect(@RequestBody String str) throws Exception {
        return datacollectService.insert(str);
    }
}
