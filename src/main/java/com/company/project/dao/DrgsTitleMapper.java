package com.company.project.dao;

import java.util.List;

import com.company.project.model.DrgsTitle;
import com.company.project.model.DrgsTitleExample;

import org.apache.ibatis.annotations.Param;

/**
 *  DrgsTitleMapper
 * @author SWJ
 * @date 2020-07-29 10:22:10
 */
public interface DrgsTitleMapper {
      	   	      	      	      	      	      	      	      	      	      	      	      
    long countByExample(DrgsTitleExample example);

    int deleteByExample(DrgsTitleExample example);
		
    int deleteByPrimaryKey(Long id);
		
    int insert(DrgsTitle record);

    int insertSelective(DrgsTitle record);

    List<DrgsTitle> selectByExample(DrgsTitleExample example);
		
    DrgsTitle selectByPrimaryKey(Long id);
		
    int updateByExampleSelective(@Param("record") DrgsTitle record, @Param("example") DrgsTitleExample example);

    int updateByExample(@Param("record") DrgsTitle record, @Param("example") DrgsTitleExample example); 
		
    int updateByPrimaryKeySelective(DrgsTitle record);

    int updateByPrimaryKey(DrgsTitle record);
  	  	
}