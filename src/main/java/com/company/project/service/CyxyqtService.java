package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.ConvertUtil;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.CyxyqtMapper;
import com.company.project.model.Cyxyqt;
import com.company.project.model.CyxyqtExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 *  CyxyqtService
 * @Title: CyxyqtService.java 
 * @author SWJ
 * @date 2020-07-29 10:22:41  
 **/
@Service
public class CyxyqtService implements BaseService<Cyxyqt, CyxyqtExample>{
	@Autowired
	private CyxyqtMapper cyxyqtMapper;
	
      	   	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Cyxyqt> list(Tablepar tablepar,Cyxyqt record){
	        CyxyqtExample testExample=new CyxyqtExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Cyxyqt> list= cyxyqtMapper.selectByExample(testExample);
	        PageInfo<Cyxyqt> pageInfo = new PageInfo<Cyxyqt>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			CyxyqtExample example=new CyxyqtExample();
			example.createCriteria().andIdIn(stringB);
			return cyxyqtMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public Cyxyqt selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return cyxyqtMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Cyxyqt record) {
		return cyxyqtMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Cyxyqt record) {
				
		record.setId(null);
		
				
		return cyxyqtMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Cyxyqt record, CyxyqtExample example) {
		
		return cyxyqtMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Cyxyqt record, CyxyqtExample example) {
		
		return cyxyqtMapper.updateByExample(record, example);
	}

	@Override
	public List<Cyxyqt> selectByExample(CyxyqtExample example) {
		
		return cyxyqtMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(CyxyqtExample example) {
		
		return cyxyqtMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(CyxyqtExample example) {
		
		return cyxyqtMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param cyxyqt
	 * @return
	 */
	public int checkNameUnique(Cyxyqt cyxyqt){
		CyxyqtExample example=new CyxyqtExample();
		example.createCriteria().andYbbmEqualTo(cyxyqt.getYbbm());
		List<Cyxyqt> list=cyxyqtMapper.selectByExample(example);
		return list.size();
	}


}
