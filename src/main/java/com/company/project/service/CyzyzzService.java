package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.ConvertUtil;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.CyzyzzMapper;
import com.company.project.model.Cyzyzz;
import com.company.project.model.CyzyzzExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 *  CyzyzzService
 * @Title: CyzyzzService.java 
 * @author SWJ
 * @date 2020-07-29 10:23:20  
 **/
@Service
public class CyzyzzService implements BaseService<Cyzyzz, CyzyzzExample>{
	@Autowired
	private CyzyzzMapper cyzyzzMapper;
	
      	   	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Cyzyzz> list(Tablepar tablepar,Cyzyzz record){
	        CyzyzzExample testExample=new CyzyzzExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Cyzyzz> list= cyzyzzMapper.selectByExample(testExample);
	        PageInfo<Cyzyzz> pageInfo = new PageInfo<Cyzyzz>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			CyzyzzExample example=new CyzyzzExample();
			example.createCriteria().andIdIn(stringB);
			return cyzyzzMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public Cyzyzz selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return cyzyzzMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Cyzyzz record) {
		return cyzyzzMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Cyzyzz record) {
				
		record.setId(null);
		
				
		return cyzyzzMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Cyzyzz record, CyzyzzExample example) {
		
		return cyzyzzMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Cyzyzz record, CyzyzzExample example) {
		
		return cyzyzzMapper.updateByExample(record, example);
	}

	@Override
	public List<Cyzyzz> selectByExample(CyzyzzExample example) {
		
		return cyzyzzMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(CyzyzzExample example) {
		
		return cyzyzzMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(CyzyzzExample example) {
		
		return cyzyzzMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param cyzyzz
	 * @return
	 */
	public int checkNameUnique(Cyzyzz cyzyzz){
		CyzyzzExample example=new CyzyzzExample();
		example.createCriteria().andYbbmEqualTo(cyzyzz.getYbbm());
		List<Cyzyzz> list=cyzyzzMapper.selectByExample(example);
		return list.size();
	}


}
