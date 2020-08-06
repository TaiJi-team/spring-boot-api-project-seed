package com.company.project.model;

import java.io.Serializable;


import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  DrgsTitle 
 * @author SWJ
 * @date 2020-07-29 10:22:10
 */

public class DrgsTitle implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/

	private Long id;
		
	/** 医保编号 **/

	private String ybbm;
		
	/** 病案号 **/

	private String babm;
		
	/** 定点医疗机构名称 **/

	private String yljgmc;
		
	/** 医疗机构代码 **/

	private String yljgdm;
		
	/** 医保结算等级 **/

	private Integer ybjsdj;
		
	/** 申报时间 **/
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private String sbsj;
		
	/** 填报部门 **/

	private String tbbm;
		
	/** 填报人 **/

	private String tbr;
		
	/** 创建时间 **/
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private String createtime;
		
	/** 更新时间 **/
	//@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private String updatetime;
		
		
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	 
			
	public String getYbbm() {
        return ybbm;
    }

    public void setYbbm(String ybbm) {
        this.ybbm = ybbm;
    }
	 
			
	public String getBabm() {
        return babm;
    }

    public void setBabm(String babm) {
        this.babm = babm;
    }
	 
			
	public String getYljgmc() {
        return yljgmc;
    }

    public void setYljgmc(String yljgmc) {
        this.yljgmc = yljgmc;
    }
	 
			
	public String getYljgdm() {
        return yljgdm;
    }

    public void setYljgdm(String yljgdm) {
        this.yljgdm = yljgdm;
    }
	 
			
	public Integer getYbjsdj() {
        return ybjsdj;
    }

    public void setYbjsdj(Integer ybjsdj) {
        this.ybjsdj = ybjsdj;
    }
	 
			
	public String getSbsj() {
        return sbsj;
    }

    public void setSbsj(String sbsj) {
        this.sbsj = sbsj;
    }
	 
			
	public String getTbbm() {
        return tbbm;
    }

    public void setTbbm(String tbbm) {
        this.tbbm = tbbm;
    }
	 
			
	public String getTbr() {
        return tbr;
    }

    public void setTbr(String tbr) {
        this.tbr = tbr;
    }
	 
			
	public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
	 
			
	public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
	 
			
	public DrgsTitle() {
        super();
    }
    
																																																									
	public DrgsTitle(Long id,String ybbm,String babm,String yljgmc,String yljgdm,Integer ybjsdj,String sbsj,String tbbm,String tbr,String createtime,String updatetime) {
	
		this.id = id;
		this.ybbm = ybbm;
		this.babm = babm;
		this.yljgmc = yljgmc;
		this.yljgdm = yljgdm;
		this.ybjsdj = ybjsdj;
		this.sbsj = sbsj;
		this.tbbm = tbbm;
		this.tbr = tbr;
		this.createtime = createtime;
		this.updatetime = updatetime;
		
	}
	
}