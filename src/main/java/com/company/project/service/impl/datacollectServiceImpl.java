package com.company.project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.datacollect;
import com.company.project.service.datacollectService;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


/**
 * @author swj
 */
@Service
public class datacollectServiceImpl implements datacollectService {

    @Resource
    MongoTemplate mongoTemplate;

    @Override
    public Result insert(String info) {
        mongoTemplate.insert(info, "datacollect");  
        return ResultGenerator.genSuccessResult(); 
    }

    @Override
    public Map<String, Object> find(String info) {
        Map<String, Object> result =new HashMap();
        Criteria criteria=new Criteria();
        Query query=new Query(criteria);
        JSONObject jsonObject = JSON.parseObject(info);
        if(!(jsonObject.get("ybbm")).equals("")&&!(jsonObject.get("ybbm")).equals("null")){      
            criteria.and("ybbm").is(jsonObject.get("ybbm"));
        }
        if(!(jsonObject.get("babm")).equals("")&&!(jsonObject.get("babm")).equals("null")){      
            criteria.and("babm").is(jsonObject.get("babm")); 
        }
        //医疗机构名称模糊查
        if(!(jsonObject.get("yljgmc")).equals("")&&!(jsonObject.get("yljgmc")).equals("null")){      
            criteria.and("yljgmc").regex(".*?" + jsonObject.get("yljgmc") + ".*");
        }
        if(!(jsonObject.get("yljgdm")).equals("")&&!(jsonObject.get("yljgdm")).equals("null")){      
            criteria.and("yljgdm").is(jsonObject.get("yljgdm"));
        }
        if(!(jsonObject.get("ybjsdj")).equals("")&&!(jsonObject.get("ybjsdj")).equals("null")){      
            criteria.and("ybjsdj").is(jsonObject.get("ybjsdj")); 
        }
        if(!(jsonObject.get("sbsj")).equals("")&&!(jsonObject.get("sbsj")).equals("null")){      
            criteria.and("sbsj").is(jsonObject.get("sbsj")); 
        }
        if(!(jsonObject.get("tbbm")).equals("")&&!(jsonObject.get("tbbm")).equals("null")){      
            criteria.and("tbbm").is(jsonObject.get("tbbm")); 
        }
        if(!(jsonObject.get("tbr")).equals("")&&!(jsonObject.get("tbr")).equals("null")){      
            criteria.and("tbr").is(jsonObject.get("tbr")); 
        }
        if((!(jsonObject.get("pageNo")).equals("")&&!(jsonObject.get("pageNo")).equals("null"))&&(!(jsonObject.get("pageSize")).equals("")&&!(jsonObject.get("pageSize")).equals("null"))){      
            query.skip(((jsonObject.getInteger("pageNo")) - 1)*jsonObject.getInteger("pageSize"));
		    query.limit(jsonObject.getInteger("pageSize"));
        }else{
               query.skip((1 - 1) * 10);
		       query.limit(10);
        }
        List<datacollect> list =mongoTemplate.find(query, datacollect.class);
        result.put("data", list);
        return result;
    }

   
}
