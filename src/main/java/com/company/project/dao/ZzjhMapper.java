package com.company.project.dao;

import java.util.List;

import com.company.project.model.Zzjh;
import com.company.project.model.ZzjhExample;

import org.apache.ibatis.annotations.Param;

/**
 *  ZzjhMapper
 * @author SWJ
 * @date 2020-07-29 11:14:17
 */
public interface ZzjhMapper {
      	   	      	      	      	      	      	      
    long countByExample(ZzjhExample example);

    int deleteByExample(ZzjhExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(Zzjh record);

    int insertSelective(Zzjh record);

    List<Zzjh> selectByExample(ZzjhExample example);
		
    Zzjh selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") Zzjh record, @Param("example") ZzjhExample example);

    int updateByExample(@Param("record") Zzjh record, @Param("example") ZzjhExample example); 
		
    int updateByPrimaryKeySelective(Zzjh record);

    int updateByPrimaryKey(Zzjh record);
  	  	
}