package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.ConvertUtil;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.ZdlbMapper;
import com.company.project.model.Zdlb;
import com.company.project.model.ZdlbExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 *  ZdlbService
 * @Title: ZdlbService.java 
 * @Package com.fc.test.service 
 * @author SWJ
 * @date 2020-07-29 10:22:18  
 **/
@Service
public class ZdlbService implements BaseService<Zdlb, ZdlbExample>{
	@Autowired
	private ZdlbMapper zdlbMapper;
	
      	   	      	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Zdlb> list(Tablepar tablepar,Zdlb record){
	        ZdlbExample testExample=new ZdlbExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Zdlb> list= zdlbMapper.selectByExample(testExample);
	        PageInfo<Zdlb> pageInfo = new PageInfo<Zdlb>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ZdlbExample example=new ZdlbExample();
			example.createCriteria().andIdIn(stringB);
			return zdlbMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public Zdlb selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return zdlbMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Zdlb record) {
		return zdlbMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Zdlb record) {
				
		record.setId(null);
		
				
		return zdlbMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Zdlb record, ZdlbExample example) {
		
		return zdlbMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Zdlb record, ZdlbExample example) {
		
		return zdlbMapper.updateByExample(record, example);
	}

	@Override
	public List<Zdlb> selectByExample(ZdlbExample example) {
		
		return zdlbMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ZdlbExample example) {
		
		return zdlbMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ZdlbExample example) {
		
		return zdlbMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param zdlb
	 * @return
	 */
	public int checkNameUnique(Zdlb zdlb){
		ZdlbExample example=new ZdlbExample();
		example.createCriteria().andYbbmEqualTo(zdlb.getYbbm());
		List<Zdlb> list=zdlbMapper.selectByExample(example);
		return list.size();
	}


}
