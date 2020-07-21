package com.company.project.service;

import com.company.project.core.Result;

import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author swj
 */
public interface datacollectService {
    /**
     * 插入mongodb
     */
    Result insert(@RequestBody String info);
}
