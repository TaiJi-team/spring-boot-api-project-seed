package com.company.project.model;

import java.io.Serializable;


import java.lang.Long;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.lang.Integer;

/**
 *  Patienbase 
 * @author SWJ
 * @date 2020-07-29 10:21:58
 */

public class Patienbase implements Serializable {

	private static final long serialVersionUID = 1L;
	
		
	/**  **/

	private Long id;
		
	/** 医保编号 **/

	private String ybbm;
		
	/** 病案号 **/
	private String babm;
		
	/** 姓名 **/
	private String xm;
		
	/** 性别 **/
	private Integer xb;
		
	/** 出生日期 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date csrq;
		
	/** 年龄 **/
	private Integer nl;
		
	/** 国籍 **/
	private String gj;
		
	/** 年龄(不满1岁) **/
	private String bzzsnl;
		
	/** 名族 **/
	private Integer mz;
		
	/** 证件类别 **/
	private String zjlb;
		
	/** 证件号码 **/
	private String zjhm;
		
	/** 职业 **/
	private String zy;
		
	/** 现住址 **/
	private String xzz;
		
	/** 工作单位名称 **/
	private String dwmc;
		
	/** 工作单位地址 **/
	private String dwdz;
		
	/** 单位电话 **/
	private String dwdh;
		
	/** 邮编 **/
	private String dwyb;
		
	/** 联系人姓名 **/
	private String lxr;
		
	/** 关系 **/
	private String gx;
		
	/** 地址 **/
	private String lxrdz;
		
	/** 电话 **/
	private String lxrdh;
		
	/** 医保类型 **/
	private String yblx;
		
	/** 特殊人员类型 **/
	private String tsrylx;
		
	/** 参保地 **/
	private String cbddm;
		
	/** 新生儿入院类型 **/
	private String xserylx;
		
	/** 新生儿出生体重 **/
	private String xsecstz;
		
	/** 新生儿入院体重 **/
	private String xserytz;
		
	/** 创建时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date createtime;
		
	/** 更新时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date updatetime;
		
		
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
	 
			
	public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }
	 
			
	public Integer getXb() {
        return xb;
    }

    public void setXb(Integer xb) {
        this.xb = xb;
    }
	 
			
	public Date getCsrq() {
        return csrq;
    }

    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }
	 
			
	public Integer getNl() {
        return nl;
    }

    public void setNl(Integer nl) {
        this.nl = nl;
    }
	 
			
	public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }
	 
			
	public String getBzzsnl() {
        return bzzsnl;
    }

    public void setBzzsnl(String bzzsnl) {
        this.bzzsnl = bzzsnl;
    }
	 
			
	public Integer getMz() {
        return mz;
    }

    public void setMz(Integer mz) {
        this.mz = mz;
    }
	 
			
	public String getZjlb() {
        return zjlb;
    }

    public void setZjlb(String zjlb) {
        this.zjlb = zjlb;
    }
	 
			
	public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }
	 
			
	public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }
	 
			
	public String getXzz() {
        return xzz;
    }

    public void setXzz(String xzz) {
        this.xzz = xzz;
    }
	 
			
	public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc;
    }
	 
			
	public String getDwdz() {
        return dwdz;
    }

    public void setDwdz(String dwdz) {
        this.dwdz = dwdz;
    }
	 
			
	public String getDwdh() {
        return dwdh;
    }

    public void setDwdh(String dwdh) {
        this.dwdh = dwdh;
    }
	 
			
	public String getDwyb() {
        return dwyb;
    }

    public void setDwyb(String dwyb) {
        this.dwyb = dwyb;
    }
	 
			
	public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }
	 
			
	public String getGx() {
        return gx;
    }

    public void setGx(String gx) {
        this.gx = gx;
    }
	 
			
	public String getLxrdz() {
        return lxrdz;
    }

    public void setLxrdz(String lxrdz) {
        this.lxrdz = lxrdz;
    }
	 
			
	public String getLxrdh() {
        return lxrdh;
    }

    public void setLxrdh(String lxrdh) {
        this.lxrdh = lxrdh;
    }
	 
			
	public String getYblx() {
        return yblx;
    }

    public void setYblx(String yblx) {
        this.yblx = yblx;
    }
	 
			
	public String getTsrylx() {
        return tsrylx;
    }

    public void setTsrylx(String tsrylx) {
        this.tsrylx = tsrylx;
    }
	 
			
	public String getCbddm() {
        return cbddm;
    }

    public void setCbddm(String cbddm) {
        this.cbddm = cbddm;
    }
	 
			
	public String getXserylx() {
        return xserylx;
    }

    public void setXserylx(String xserylx) {
        this.xserylx = xserylx;
    }
	 
			
	public String getXsecstz() {
        return xsecstz;
    }

    public void setXsecstz(String xsecstz) {
        this.xsecstz = xsecstz;
    }
	 
			
	public String getXserytz() {
        return xserytz;
    }

    public void setXserytz(String xserytz) {
        this.xserytz = xserytz;
    }
	 
			
	public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
	 
			
	public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
	 
			
	public Patienbase() {
        super();
    }
    
																																																																																																																																																								
	public Patienbase(Long id,String ybbm,String babm,String xm,Integer xb,Date csrq,Integer nl,String gj,String bzzsnl,Integer mz,String zjlb,String zjhm,String zy,String xzz,String dwmc,String dwdz,String dwdh,String dwyb,String lxr,String gx,String lxrdz,String lxrdh,String yblx,String tsrylx,String cbddm,String xserylx,String xsecstz,String xserytz,Date createtime,Date updatetime) {
	
		this.id = id;
		this.ybbm = ybbm;
		this.babm = babm;
		this.xm = xm;
		this.xb = xb;
		this.csrq = csrq;
		this.nl = nl;
		this.gj = gj;
		this.bzzsnl = bzzsnl;
		this.mz = mz;
		this.zjlb = zjlb;
		this.zjhm = zjhm;
		this.zy = zy;
		this.xzz = xzz;
		this.dwmc = dwmc;
		this.dwdz = dwdz;
		this.dwdh = dwdh;
		this.dwyb = dwyb;
		this.lxr = lxr;
		this.gx = gx;
		this.lxrdz = lxrdz;
		this.lxrdh = lxrdh;
		this.yblx = yblx;
		this.tsrylx = tsrylx;
		this.cbddm = cbddm;
		this.xserylx = xserylx;
		this.xsecstz = xsecstz;
		this.xserytz = xserytz;
		this.createtime = createtime;
		this.updatetime = updatetime;
		
	}
	
}