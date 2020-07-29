package com.company.project.model;

import java.io.Serializable;


import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  Sjczqt 
 * @author SWJ
 * @date 2020-07-29 11:14:10
 */
 
public class Sjczqt implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/

	private Long id;
		
	/** 医保编号 **/
	private String ybbm;
		
	/** 病案号 **/
	private String babm;
		
	/** 操作名称 **/
	private String czmc;
		
	/** 手术操作代码 **/
	private String ssczdm;
		
	/** 操作日期 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date czrq;
		
	/** 麻醉方式 **/
	private Integer mzfs;
		
	/** 术者医师姓名 **/
	private String ssysxm;
		
	/** 术者医师代码 **/
	private String ssysdm;
		
	/** 麻醉医师姓名 **/
	private String mzysxm;
		
	/** 麻醉医师代码 **/
	private String mzysdm;
		
		
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
	 
			
	public String getCzmc() {
        return czmc;
    }

    public void setCzmc(String czmc) {
        this.czmc = czmc;
    }
	 
			
	public String getSsczdm() {
        return ssczdm;
    }

    public void setSsczdm(String ssczdm) {
        this.ssczdm = ssczdm;
    }
	 
			
	public Date getCzrq() {
        return czrq;
    }

    public void setCzrq(Date czrq) {
        this.czrq = czrq;
    }
	 
			
	public Integer getMzfs() {
        return mzfs;
    }

    public void setMzfs(Integer mzfs) {
        this.mzfs = mzfs;
    }
	 
			
	public String getSsysxm() {
        return ssysxm;
    }

    public void setSsysxm(String ssysxm) {
        this.ssysxm = ssysxm;
    }
	 
			
	public String getSsysdm() {
        return ssysdm;
    }

    public void setSsysdm(String ssysdm) {
        this.ssysdm = ssysdm;
    }
	 
			
	public String getMzysxm() {
        return mzysxm;
    }

    public void setMzysxm(String mzysxm) {
        this.mzysxm = mzysxm;
    }
	 
			
	public String getMzysdm() {
        return mzysdm;
    }

    public void setMzysdm(String mzysdm) {
        this.mzysdm = mzysdm;
    }
	 
			
	public Sjczqt() {
        super();
    }
    
																																																									
	public Sjczqt(Long id,String ybbm,String babm,String czmc,String ssczdm,Date czrq,Integer mzfs,String ssysxm,String ssysdm,String mzysxm,String mzysdm) {
	
		this.id = id;
		this.ybbm = ybbm;
		this.babm = babm;
		this.czmc = czmc;
		this.ssczdm = ssczdm;
		this.czrq = czrq;
		this.mzfs = mzfs;
		this.ssysxm = ssysxm;
		this.ssysdm = ssysdm;
		this.mzysxm = mzysxm;
		this.mzysdm = mzysdm;
		
	}
	
}