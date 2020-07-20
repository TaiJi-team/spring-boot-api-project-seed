package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "t_test")
@JacksonXmlRootElement(localName = "exTask")
public class TTest {
    /**
     * 主键
     */
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(generator = "UUID")
    private String id;

    /**
     * 名称
     */
    @JacksonXmlProperty(localName = "name")
    private String name;

    /**
     * 性别
     */
    @JacksonXmlProperty(localName = "age")
    private Integer age;

    /**
     * 创建时间
     */
    @Column(name = "crate_time")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date crateTime;

    /**
     * 名字
     */
    @Column(name = "tes_name")
    @JacksonXmlProperty(localName = "tes_name")
    private String tesName;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return age - 性别
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置性别
     *
     * @param age 性别
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取创建时间
     *
     * @return crate_time - 创建时间
     */
    public Date getCrateTime() {
        return crateTime;
    }

    /**
     * 设置创建时间
     *
     * @param crateTime 创建时间
     */
    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    /**
     * 获取名字
     *
     * @return tes_name - 名字
     */
    public String getTesName() {
        return tesName;
    }

    /**
     * 设置名字
     *
     * @param tesName 名字
     */
    public void setTesName(String tesName) {
        this.tesName = tesName;
    }
}