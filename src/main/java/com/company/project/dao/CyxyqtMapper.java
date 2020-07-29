package com.company.project.dao;

import java.util.List;

import com.company.project.model.Cyxyqt;
import com.company.project.model.CyxyqtExample;

import org.apache.ibatis.annotations.Param;

/**
 *  CyxyqtMapper
 * @author SWJ
 */
public interface CyxyqtMapper {
      	   	      	      	      	      	      	      
    long countByExample(CyxyqtExample example);

    int deleteByExample(CyxyqtExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(Cyxyqt record);

    int insertSelective(Cyxyqt record);

    List<Cyxyqt> selectByExample(CyxyqtExample example);
		
    Cyxyqt selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") Cyxyqt record, @Param("example") CyxyqtExample example);

    int updateByExample(@Param("record") Cyxyqt record, @Param("example") CyxyqtExample example); 
		
    int updateByPrimaryKeySelective(Cyxyqt record);

    int updateByPrimaryKey(Cyxyqt record);
  	  	
}