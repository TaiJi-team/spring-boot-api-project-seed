package com.company.project.model;

import java.io.Serializable;


import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  HospiDiag 
 * @author SWJ
 * @date 2020-07-29 10:21:50
 */
 
public class HospiDiag implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/

	private Long id;
		
	/** 医保编号 **/

	private String ybbm;
		
	/** 病案号 **/

	private String babm;
		
	/** 住院医院类型 **/

	private Integer zyyllx;
		
	/** 入院途径 **/

	private Integer rytj;
		
	/** 治疗类别 **/

	private Integer zllb;
		
	/** 入院时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")

	private Date rysj;
		
	/** 入院科别 **/

	private Integer rykb;
		
	/** 转科科别 **/

	private Integer zkkb;
		
	/** 出院时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")

	private Date cysj;
		
	/** 出院科别 **/

	private Integer cykb;
		
	/** 实际住院天数 **/

	private Integer sjzyts;
		
		
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
	 
			
	public Integer getZyyllx() {
        return zyyllx;
    }

    public void setZyyllx(Integer zyyllx) {
        this.zyyllx = zyyllx;
    }
	 
			
	public Integer getRytj() {
        return rytj;
    }

    public void setRytj(Integer rytj) {
        this.rytj = rytj;
    }
	 
			
	public Integer getZllb() {
        return zllb;
    }

    public void setZllb(Integer zllb) {
        this.zllb = zllb;
    }
	 
			
	public Date getRysj() {
        return rysj;
    }

    public void setRysj(Date rysj) {
        this.rysj = rysj;
    }
	 
			
	public Integer getRykb() {
        return rykb;
    }

    public void setRykb(Integer rykb) {
        this.rykb = rykb;
    }
	 
			
	public Integer getZkkb() {
        return zkkb;
    }

    public void setZkkb(Integer zkkb) {
        this.zkkb = zkkb;
    }
	 
			
	public Date getCysj() {
        return cysj;
    }

    public void setCysj(Date cysj) {
        this.cysj = cysj;
    }
	 
			
	public Integer getCykb() {
        return cykb;
    }

    public void setCykb(Integer cykb) {
        this.cykb = cykb;
    }
	 
			
	public Integer getSjzyts() {
        return sjzyts;
    }

    public void setSjzyts(Integer sjzyts) {
        this.sjzyts = sjzyts;
    }
	 
			
	public HospiDiag() {
        super();
    }
    
																																																														
	public HospiDiag(Long id,String ybbm,String babm,Integer zyyllx,Integer rytj,Integer zllb,Date rysj,Integer rykb,Integer zkkb,Date cysj,Integer cykb,Integer sjzyts) {
	
		this.id = id;
		this.ybbm = ybbm;
		this.babm = babm;
		this.zyyllx = zyyllx;
		this.rytj = rytj;
		this.zllb = zllb;
		this.rysj = rysj;
		this.rykb = rykb;
		this.zkkb = zkkb;
		this.cysj = cysj;
		this.cykb = cykb;
		this.sjzyts = sjzyts;
		
	}
	
}