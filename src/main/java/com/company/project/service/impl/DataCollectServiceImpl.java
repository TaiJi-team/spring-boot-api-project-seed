package com.company.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.DataCollect;
import com.company.project.model.PageResult;
import com.company.project.service.DataCollectService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


/**
 * @author swj
 */
@Service
public class DataCollectServiceImpl implements DataCollectService {

    @Resource
    MongoTemplate mongoTemplate;

    @Override
    public Result insert(final String info) {
        mongoTemplate.insert(info, "DataCollect");
        return ResultGenerator.genSuccessResult();
    }

    @Override
    public PageResult<DataCollect> queryData(final String info) {
        final PageResult<DataCollect> result = new PageResult<>();
        final Criteria criteria = new Criteria();
        final Query query = new Query(criteria);
        final JSONObject jsonObject = JSON.parseObject(info);
        final String pageNo = StringUtils.defaultIfEmpty(jsonObject.getString("pageNo"), "1");
        final String pageSize = StringUtils.defaultIfEmpty(jsonObject.getString("pageSize"), "10");
        addCriterias(criteria, jsonObject);
        final long totalCount = mongoTemplate.count(query, DataCollect.class);
        query.skip((Integer.parseInt(pageNo) - 1) * Integer.parseInt(pageSize));
        query.limit(Integer.parseInt(pageSize));
        final List<DataCollect> list = mongoTemplate.find(query, DataCollect.class);
        result.setResult(list);
        result.setPageNo(Integer.parseInt(pageNo));
        result.setPageSize(Integer.parseInt(pageSize));
        result.setTotalCount(totalCount);
        return result;
    }

    private void addCriterias(final Criteria criteria, final JSONObject jsonObject) {
        addCriteria(criteria, jsonObject, "ybbm");
        addCriteria(criteria, jsonObject, "babm");
        addCriteria(criteria, jsonObject, "yljgmc");
        addCriteria(criteria, jsonObject, "yljgdm");
        addCriteria(criteria, jsonObject, "ybjsdj");
        addCriteria(criteria, jsonObject, "sbsj");
        addCriteria(criteria, jsonObject, "tbbm");
        addCriteria(criteria, jsonObject, "tbr");
    }

    private void addCriteria(Criteria criteria, JSONObject jsonObject, String field) {
        if(StringUtils.isNotEmpty(jsonObject.getString(field))){
            criteria.and(field).is(jsonObject.get(field));
        }else{
            return;
        }
    }
}