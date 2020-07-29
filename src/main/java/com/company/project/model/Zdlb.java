package com.company.project.model;

import java.io.Serializable;


import java.lang.Long;

/**
 *  Zdlb 
 * @author SWJ
 * @date 2020-07-29 10:22:18
 */

public class Zdlb implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	private Long id;
		
	/** 医保编号 **/
	private String ybbm;
		
	/** 病案号 **/
	private String babm;
		
	/** 诊断名称 **/
	private String zdmc;
		
	/** 诊断代码 **/
	private String zddm;
		
	/** 手术操作名称 **/
	private String ssczmc;
		
	/** 手术及操作代码 **/
	private String ssczdm;
		
		
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
	 
			
	public String getZdmc() {
        return zdmc;
    }

    public void setZdmc(String zdmc) {
        this.zdmc = zdmc;
    }
	 
			
	public String getZddm() {
        return zddm;
    }

    public void setZddm(String zddm) {
        this.zddm = zddm;
    }
	 
			
	public String getSsczmc() {
        return ssczmc;
    }

    public void setSsczmc(String ssczmc) {
        this.ssczmc = ssczmc;
    }
	 
			
	public String getSsczdm() {
        return ssczdm;
    }

    public void setSsczdm(String ssczdm) {
        this.ssczdm = ssczdm;
    }
	 
			
	public Zdlb() {
        super();
    }
    
																																					
	public Zdlb(Long id,String ybbm,String babm,String zdmc,String zddm,String ssczmc,String ssczdm) {
	
		this.id = id;
		this.ybbm = ybbm;
		this.babm = babm;
		this.zdmc = zdmc;
		this.zddm = zddm;
		this.ssczmc = ssczmc;
		this.ssczdm = ssczdm;
		
	}
	
}