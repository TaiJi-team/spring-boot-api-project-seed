package com.company.project.service.impl;

import com.company.project.dao.ExTaskMapper;
import com.company.project.model.ExTask;
import com.company.project.service.ExTaskService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/07/19.
 */
@Service
@Transactional
public class ExTaskServiceImpl extends AbstractService<ExTask> implements ExTaskService {
    @Resource
    private ExTaskMapper exTaskMapper;

}
