package com.company.project.dao;

import java.util.List;

import com.company.project.model.Patienbase;
import com.company.project.model.PatienbaseExample;

import org.apache.ibatis.annotations.Param;

/**
 *  PatienbaseMapper
 * @author SWJ
 * @date 2020-07-29 10:21:58
 */
public interface PatienbaseMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(PatienbaseExample example);

    int deleteByExample(PatienbaseExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(Patienbase record);

    int insertSelective(Patienbase record);

    List<Patienbase> selectByExample(PatienbaseExample example);
		
    Patienbase selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") Patienbase record, @Param("example") PatienbaseExample example);

    int updateByExample(@Param("record") Patienbase record, @Param("example") PatienbaseExample example); 
		
    int updateByPrimaryKeySelective(Patienbase record);

    int updateByPrimaryKey(Patienbase record);
  	  	
}