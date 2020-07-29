package com.company.project.model;

import java.io.Serializable;


import java.lang.Long;

/**
 *  Cyzyzz 
 * @author SWJ
 * @date 2020-07-29 10:23:20
 */

public class Cyzyzz implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/
	private Long id;
		
	/** 医保编号 **/

	private String ybbm;
		
	/** 病案号 **/

	private String babm;
		
	/** 疾病名称 **/

	private String jbmc;
		
	/** 疾病代码 **/

	private String jbdm;
		
	/** 入院病情 **/

	private String ryxqlb;
		
		
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
	 
			
	public String getJbmc() {
        return jbmc;
    }

    public void setJbmc(String jbmc) {
        this.jbmc = jbmc;
    }
	 
			
	public String getJbdm() {
        return jbdm;
    }

    public void setJbdm(String jbdm) {
        this.jbdm = jbdm;
    }
	 
			
	public String getRyxqlb() {
        return ryxqlb;
    }

    public void setRyxqlb(String ryxqlb) {
        this.ryxqlb = ryxqlb;
    }
	 
			
	public Cyzyzz() {
        super();
    }
    
																																
	public Cyzyzz(Long id,String ybbm,String babm,String jbmc,String jbdm,String ryxqlb) {
	
		this.id = id;
		this.ybbm = ybbm;
		this.babm = babm;
		this.jbmc = jbmc;
		this.jbdm = jbdm;
		this.ryxqlb = ryxqlb;
		
	}
	
}