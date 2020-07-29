package com.company.project.dao;

import java.util.List;

import com.company.project.model.Zdlb;
import com.company.project.model.ZdlbExample;

import org.apache.ibatis.annotations.Param;

/**
 *  ZdlbMapper
 * @author SWJ
 * @date 2020-07-29 10:22:18
 */
public interface ZdlbMapper {
      	   	      	      	      	      	      	      	      
    long countByExample(ZdlbExample example);

    int deleteByExample(ZdlbExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(Zdlb record);

    int insertSelective(Zdlb record);

    List<Zdlb> selectByExample(ZdlbExample example);
		
    Zdlb selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") Zdlb record, @Param("example") ZdlbExample example);

    int updateByExample(@Param("record") Zdlb record, @Param("example") ZdlbExample example); 
		
    int updateByPrimaryKeySelective(Zdlb record);

    int updateByPrimaryKey(Zdlb record);
  	  	
}