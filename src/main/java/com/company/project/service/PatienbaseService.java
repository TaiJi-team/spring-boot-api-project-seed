package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.ConvertUtil;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.PatienbaseMapper;
import com.company.project.model.Patienbase;
import com.company.project.model.PatienbaseExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 *  PatienbaseService
 * @Title: PatienbaseService.java 
 * @author SWJ
 * @date 2020-07-30 16:46:33  
 **/
@Service
public class PatienbaseService implements BaseService<Patienbase, PatienbaseExample>{
	@Autowired
	private PatienbaseMapper patienbaseMapper;
	
      	   	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Patienbase> list(Tablepar tablepar,Patienbase record){
	        PatienbaseExample testExample=new PatienbaseExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Patienbase> list= patienbaseMapper.selectByExample(testExample);
	        PageInfo<Patienbase> pageInfo = new PageInfo<Patienbase>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			PatienbaseExample example=new PatienbaseExample();
			example.createCriteria().andIdIn(stringB);
			return patienbaseMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public Patienbase selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return patienbaseMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Patienbase record) {
		return patienbaseMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Patienbase record) {
				
		record.setId(null);
		
				
		return patienbaseMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Patienbase record, PatienbaseExample example) {
		
		return patienbaseMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Patienbase record, PatienbaseExample example) {
		
		return patienbaseMapper.updateByExample(record, example);
	}

	@Override
	public List<Patienbase> selectByExample(PatienbaseExample example) {
		
		return patienbaseMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(PatienbaseExample example) {
		
		return patienbaseMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(PatienbaseExample example) {
		
		return patienbaseMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param patienbase
	 * @return
	 */
	public int checkNameUnique(Patienbase patienbase){
		PatienbaseExample example=new PatienbaseExample();
		example.createCriteria().andYbbmEqualTo(patienbase.getYbbm());
		List<Patienbase> list=patienbaseMapper.selectByExample(example);
		return list.size();
	}


}
