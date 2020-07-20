package com.company.project.service.impl;

import com.company.project.dao.ExResultMapper;
import com.company.project.model.ExResult;
import com.company.project.service.ExResultService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/07/19.
 */
@Service
@Transactional
public class ExResultServiceImpl extends AbstractService<ExResult> implements ExResultService {
    @Resource
    private ExResultMapper exResultMapper;

}
