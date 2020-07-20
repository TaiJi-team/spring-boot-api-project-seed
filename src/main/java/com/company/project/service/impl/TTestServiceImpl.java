package com.company.project.service.impl;

import com.company.project.dao.TTestMapper;
import com.company.project.model.TTest;
import com.company.project.service.TTestService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/07/19.
 */
@Service
@Transactional
public class TTestServiceImpl extends AbstractService<TTest> implements TTestService {
    @Resource
    private TTestMapper tTestMapper;

}
