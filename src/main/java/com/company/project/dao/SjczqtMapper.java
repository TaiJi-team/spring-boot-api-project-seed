package com.company.project.dao;

import java.util.List;

import com.company.project.model.Sjczqt;
import com.company.project.model.SjczqtExample;

import org.apache.ibatis.annotations.Param;

/**
 *  SjczqtMapper
 * @author SWJ
 * @date 2020-07-29 11:14:10
 */
public interface SjczqtMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(SjczqtExample example);

    int deleteByExample(SjczqtExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(Sjczqt record);

    int insertSelective(Sjczqt record);

    List<Sjczqt> selectByExample(SjczqtExample example);
		
    Sjczqt selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") Sjczqt record, @Param("example") SjczqtExample example);

    int updateByExample(@Param("record") Sjczqt record, @Param("example") SjczqtExample example); 
		
    int updateByPrimaryKeySelective(Sjczqt record);

    int updateByPrimaryKey(Sjczqt record);
  	  	
}