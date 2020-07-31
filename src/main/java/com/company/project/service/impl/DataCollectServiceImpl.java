package com.company.project.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.company.project.common.Tablepar;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ChronDiag;
import com.company.project.model.Cyxyqt;
import com.company.project.model.Cyzyzz;
import com.company.project.model.DataCollect;
import com.company.project.model.DrgsTitle;
import com.company.project.model.HospiDiag;
import com.company.project.model.MedicCharge;
import com.company.project.model.PageResult;
import com.company.project.model.Patienbase;
import com.company.project.model.Sjczqt;
import com.company.project.model.Zdlb;
import com.company.project.model.Zzjh;
import com.company.project.service.ChronDiagService;
import com.company.project.service.CyxyqtService;
import com.company.project.service.CyzyzzService;
import com.company.project.service.DataCollectService;
import com.company.project.service.DrgsTitleService;
import com.company.project.service.HospiDiagService;
import com.company.project.service.MedicChargeService;
import com.company.project.service.PatienbaseService;
import com.company.project.service.SjczqtService;
import com.company.project.service.ZdlbService;
import com.company.project.service.ZzjhService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Resource
    DrgsTitleService drgsTitleService;

    @Resource
    PatienbaseService patienbaseService;

    @Resource
    ChronDiagService ChronDiagService; 

    @Resource
    MedicChargeService medicChargeService;

    @Resource
    HospiDiagService  HospiDiagService;
    
    @Resource
    ZdlbService ZdlbService; 

    @Resource
    CyxyqtService CyxyqtService;

    @Resource
    CyzyzzService CyzyzzService;

    @Resource
    SjczqtService SjczqtService;

    @Resource
    ZzjhService ZzjhService;
    @Override
    public Result insert(final String info) {
        JSONObject json=JSONObject.parseObject(info);
        if(json.containsKey("drgsTitle")&& json.get("drgsTitle")!=null){
            DrgsTitle drgsTitle =json.toJavaObject((JSONObject)JSON.toJSON(json.get("drgsTitle")), DrgsTitle.class);
            drgsTitleService.insertSelective(drgsTitle);
        }
        if(json.containsKey("patientBase")&& json.get("patientBase")!=null){
            Patienbase patienbase =json.toJavaObject((JSONObject)JSON.toJSON(json.get("patientBase")), Patienbase.class);
            patienbaseService.insertSelective(patienbase);
        }
        if(json.containsKey("chronDiag")&& json.get("chronDiag")!=null){
            ChronDiag chronDiag =json.toJavaObject((JSONObject)JSON.toJSON(json.get("chronDiag")), ChronDiag.class);
            ChronDiagService.insertSelective(chronDiag);
        }
        if(json.containsKey("medicCharge")&& json.get("medicCharge")!=null){
            MedicCharge medicCharge =json.toJavaObject((JSONObject)JSON.toJSON(json.get("medicCharge")), MedicCharge.class);
            medicChargeService.insertSelective(medicCharge);
        }
        if(json.containsKey("hospiDiag")&& json.get("hospiDiag")!=null){
            HospiDiag hospiDiag  =json.toJavaObject((JSONObject)JSON.toJSON(json.get("hospiDiag")), HospiDiag.class);
            HospiDiagService.insertSelective(hospiDiag);
        }
        if(json.containsKey("zdlb")&& json.get("zdlb")!=null){
            Zdlb zdlb =json.toJavaObject((JSONObject)JSON.toJSON(json.get("zdlb")), Zdlb.class);
            ZdlbService.insertSelective(zdlb);
        }
        if(json.containsKey("cyxyqt")&& json.get("cyxyqt")!=null){
            Cyxyqt cyxyqt =json.toJavaObject((JSONObject)JSON.toJSON(json.get("cyxyqt")), Cyxyqt.class);
            CyxyqtService.insertSelective(cyxyqt);
        }
        if(json.containsKey("cyzyzz")&& json.get("cyzyzz")!=null){
            Cyzyzz cyzyzz =json.toJavaObject((JSONObject)JSON.toJSON(json.get("cyzyzz")), Cyzyzz.class);
            CyzyzzService.insertSelective(cyzyzz);
        }
        if(json.containsKey("sjczqt")&& json.get("sjczqt")!=null){
            Sjczqt sjczqt =json.toJavaObject((JSONObject)JSON.toJSON(json.get("sjczqt")), Sjczqt.class);
            SjczqtService.insertSelective(sjczqt);
        }

        if(json.containsKey("zzjh")&& json.get("zzjh")!=null){
            Zzjh zzjh=json.toJavaObject((JSONObject)JSON.toJSON(json.get("zzjh")), Zzjh.class);
            ZzjhService.insertSelective(zzjh);
        }
        // mongoTemplate.insert(info, "DataCollect");
        return ResultGenerator.genSuccessResult();
    }

    @Override
    public Map<Object,List> queryData(final String info) {
        Tablepar Tablepar =new Tablepar();
        Tablepar.setIsAsc("desc");
        Tablepar.setPageNum(1);
        Tablepar.setPageSize(10);
        Tablepar.setOrderByColumn("id");
        final PageResult<DataCollect> result = new PageResult<>();
        JSONObject json=JSONObject.parseObject(info);
        Map map=new HashMap<Object,List>();
        if(json.containsKey("drgsTitle")&& json.get("drgsTitle")!=null){
            DrgsTitle drgsTitle =json.toJavaObject((JSONObject)JSON.toJSON(json.get("drgsTitle")), DrgsTitle.class);
            map.put("drgsTitle", drgsTitleService.list(Tablepar,drgsTitle));
        }
        if(json.containsKey("patientBase")&& json.get("patientBase")!=null){
            Patienbase patienbase =json.toJavaObject((JSONObject)JSON.toJSON(json.get("patientBase")), Patienbase.class);
            map.put("patientBase", patienbaseService.list(Tablepar,patienbase));
        }
        if(json.containsKey("chronDiag")&& json.get("chronDiag")!=null){
            ChronDiag chronDiag =json.toJavaObject((JSONObject)JSON.toJSON(json.get("chronDiag")), ChronDiag.class);
            map.put("chronDiag", ChronDiagService.list(Tablepar,chronDiag));
        }
        if(json.containsKey("medicCharge")&& json.get("medicCharge")!=null){
            MedicCharge medicCharge =json.toJavaObject((JSONObject)JSON.toJSON(json.get("medicCharge")), MedicCharge.class);
            map.put("medicCharge", medicChargeService.list(Tablepar,medicCharge));
        }
        if(json.containsKey("hospiDiag")&& json.get("hospiDiag")!=null){
            HospiDiag hospiDiag  =json.toJavaObject((JSONObject)JSON.toJSON(json.get("hospiDiag")), HospiDiag.class);
            map.put("hospiDiag", HospiDiagService.list(Tablepar,hospiDiag));
        }
        if(json.containsKey("zdlb")&& json.get("zdlb")!=null){
            Zdlb zdlb =json.toJavaObject((JSONObject)JSON.toJSON(json.get("zdlb")), Zdlb.class);
            map.put("hospiDiag",  ZdlbService.list(Tablepar,zdlb));
        }
        if(json.containsKey("cyxyqt")&& json.get("cyxyqt")!=null){
            Cyxyqt cyxyqt =json.toJavaObject((JSONObject)JSON.toJSON(json.get("cyxyqt")), Cyxyqt.class);
            map.put("cyxyqt",  CyxyqtService.list(Tablepar,cyxyqt));
        }
        if(json.containsKey("cyzyzz")&& json.get("cyzyzz")!=null){
            Cyzyzz cyzyzz =json.toJavaObject((JSONObject)JSON.toJSON(json.get("cyzyzz")), Cyzyzz.class);
            map.put("cyzyzz",  CyzyzzService.list(Tablepar,cyzyzz));
        }
        if(json.containsKey("sjczqt")&& json.get("sjczqt")!=null){
            Sjczqt sjczqt =json.toJavaObject((JSONObject)JSON.toJSON(json.get("sjczqt")), Sjczqt.class);
            map.put("sjczqt", SjczqtService.list(Tablepar,sjczqt));
        }
        if(json.containsKey("zzjh")&& json.get("zzjh")!=null){
            Zzjh zzjh=json.toJavaObject((JSONObject)JSON.toJSON(json.get("zzjh")), Zzjh.class);
            map.put("zzjh", ZzjhService.list(Tablepar,zzjh));
        }
        return map;
        // final PageResult<DataCollect> result = new PageResult<>();
        // final Criteria criteria = new Criteria();
        // final Query query = new Query(criteria);
        // final JSONObject jsonObject = JSON.parseObject(info);
        // final String pageNo = StringUtils.defaultIfEmpty(jsonObject.getString("pageNo"), "1");
        // final String pageSize = StringUtils.defaultIfEmpty(jsonObject.getString("pageSize"), "10");
        // addCriterias(criteria, jsonObject);
        // final long totalCount = mongoTemplate.count(query, DataCollect.class);
        // query.skip((Integer.parseInt(pageNo) - 1) * Integer.parseInt(pageSize));
        // query.limit(Integer.parseInt(pageSize));
        // final List<DataCollect> list = mongoTemplate.find(query, DataCollect.class);
        // result.setResult(list);
        // result.setPageNo(Integer.parseInt(pageNo));
        // result.setPageSize(Integer.parseInt(pageSize));
        // result.setTotalCount(totalCount);
    }

    // private void addCriterias(final Criteria criteria, final JSONObject jsonObject) {
    //     addCriteria(criteria, jsonObject, "ybbm");
    //     addCriteria(criteria, jsonObject, "babm");
    //     addCriteria(criteria, jsonObject, "yljgmc");
    //     addCriteria(criteria, jsonObject, "yljgdm");
    //     addCriteria(criteria, jsonObject, "ybjsdj");
    //     addCriteria(criteria, jsonObject, "sbsj");
    //     addCriteria(criteria, jsonObject, "tbbm");
    //     addCriteria(criteria, jsonObject, "tbr");
    // }

    // private void addCriteria(Criteria criteria, JSONObject jsonObject, String field) {
    //     if(StringUtils.isNotEmpty(jsonObject.getString(field))){
    //         criteria.and(field).is(jsonObject.get(field));
    //     }else{
    //         return;
    //     }
    // }
}