package com.company.project.dao;

import java.util.List;

import com.company.project.model.Cyzyzz;
import com.company.project.model.CyzyzzExample;

import org.apache.ibatis.annotations.Param;

/**
 *  CyzyzzMapper
 * @author SWJ
 * @date 2020-07-29 10:23:20
 */
public interface CyzyzzMapper {
      	   	      	      	      	      	      	      
    long countByExample(CyzyzzExample example);

    int deleteByExample(CyzyzzExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(Cyzyzz record);

    int insertSelective(Cyzyzz record);

    List<Cyzyzz> selectByExample(CyzyzzExample example);
		
    Cyzyzz selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") Cyzyzz record, @Param("example") CyzyzzExample example);

    int updateByExample(@Param("record") Cyzyzz record, @Param("example") CyzyzzExample example); 
		
    int updateByPrimaryKeySelective(Cyzyzz record);

    int updateByPrimaryKey(Cyzyzz record);
  	  	
}