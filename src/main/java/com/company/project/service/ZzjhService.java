package com.company.project.service;

import java.util.List;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.common.BaseService;
import com.company.project.common.ConvertUtil;
import com.company.project.common.StringUtils;
import com.company.project.common.Tablepar;
import com.company.project.dao.ZzjhMapper;
import com.company.project.model.Zzjh;
import com.company.project.model.ZzjhExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 *  ZzjhService
 * @Title: ZzjhService.java 
 * @Package com.fc.test.service 
 * @author SWJ
 * @date 2020-07-29 11:14:17  
 **/
@Service
public class ZzjhService implements BaseService<Zzjh, ZzjhExample>{
	@Autowired
	private ZzjhMapper zzjhMapper;
	
      	   	      	      	      	      	      	      	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	 public PageInfo<Zzjh> list(Tablepar tablepar,Zzjh record){
	        ZzjhExample testExample=new ZzjhExample();
	        testExample.createCriteria().andLikeQuery(record);
	        testExample.setOrderByClause("id ASC");
			if(StringUtils.isNotEmpty(tablepar.getOrderByColumn())) {
	        	testExample.setOrderByClause(StringUtils.toUnderScoreCase(tablepar.getOrderByColumn()) +" "+tablepar.getIsAsc());
	        }
	        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
	        List<Zzjh> list= zzjhMapper.selectByExample(testExample);
	        PageInfo<Zzjh> pageInfo = new PageInfo<Zzjh>(list);
	        return  pageInfo;
	 }

	@Override
	public int deleteByPrimaryKey(String ids) {
				
			Long[] integers = ConvertUtil.toLongArray(",", ids);
			List<Long> stringB = Arrays.asList(integers);
			ZzjhExample example=new ZzjhExample();
			example.createCriteria().andIdIn(stringB);
			return zzjhMapper.deleteByExample(example);
		
				
	}
	
	
	@Override
	public Zzjh selectByPrimaryKey(String id) {
				
			Long id1 = Long.valueOf(id);
			return zzjhMapper.selectByPrimaryKey(id1);
			
				
	}

	
	@Override
	public int updateByPrimaryKeySelective(Zzjh record) {
		return zzjhMapper.updateByPrimaryKeySelective(record);
	}
	
	
	/**
	 * 添加
	 */
	@Override
	public int insertSelective(Zzjh record) {		
		return zzjhMapper.insertSelective(record);
	}
	
	
	@Override
	public int updateByExampleSelective(Zzjh record, ZzjhExample example) {
		
		return zzjhMapper.updateByExampleSelective(record, example);
	}

	
	@Override
	public int updateByExample(Zzjh record, ZzjhExample example) {
		
		return zzjhMapper.updateByExample(record, example);
	}

	@Override
	public List<Zzjh> selectByExample(ZzjhExample example) {
		
		return zzjhMapper.selectByExample(example);
	}

	
	@Override
	public long countByExample(ZzjhExample example) {
		
		return zzjhMapper.countByExample(example);
	}

	
	@Override
	public int deleteByExample(ZzjhExample example) {
		
		return zzjhMapper.deleteByExample(example);
	}
	
	/**
	 * 检查name
	 * @param zzjh
	 * @return
	 */
	public int checkNameUnique(Zzjh zzjh){
		ZzjhExample example=new ZzjhExample();
		example.createCriteria().andYbbmEqualTo(zzjh.getYbbm());
		List<Zzjh> list=zzjhMapper.selectByExample(example);
		return list.size();
	}


}
