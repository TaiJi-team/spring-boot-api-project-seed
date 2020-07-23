package com.company.project.service;

import java.util.Map;

import com.company.project.core.Result;

import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author swj
 */
public interface datacollectService {
    /**
     * 插入mongodb
     */
    Result insert(String info);

    Map<String, Object> find(String info);


}
