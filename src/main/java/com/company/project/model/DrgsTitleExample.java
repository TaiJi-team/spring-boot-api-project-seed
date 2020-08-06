package com.company.project.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.company.project.common.StringUtils;

/**
 * DrgsTitleExample
 * 
 * @author SWJ
 * @date 2020-07-29 10:22:10
 */
public class DrgsTitleExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrgsTitleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
        System.out.println(this.orderByClause);
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(Long value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(Long value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYbbmIsNull() {
            addCriterion("ybbm is null");
            return (Criteria) this;
        }

        public Criteria andYbbmIsNotNull() {
            addCriterion("ybbm is not null");
            return (Criteria) this;
        }

        public Criteria andYbbmEqualTo(String value) {
            addCriterion("ybbm =", value, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmNotEqualTo(String value) {
            addCriterion("ybbm <>", value, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmGreaterThan(String value) {
            addCriterion("ybbm >", value, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmGreaterThanOrEqualTo(String value) {
            addCriterion("ybbm >=", value, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmLessThan(String value) {
            addCriterion("ybbm <", value, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmLessThanOrEqualTo(String value) {
            addCriterion("ybbm <=", value, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmLike(String value) {
            addCriterion("ybbm like", value, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmNotLike(String value) {
            addCriterion("ybbm not like", value, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmIn(List<String> values) {
            addCriterion("ybbm in", values, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmNotIn(List<String> values) {
            addCriterion("ybbm not in", values, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmBetween(String value1, String value2) {
            addCriterion("ybbm between", value1, value2, "ybbm");
            return (Criteria) this;
        }

        public Criteria andYbbmNotBetween(String value1, String value2) {
            addCriterion("ybbm not between", value1, value2, "ybbm");
            return (Criteria) this;
        }

        public Criteria andBabmIsNull() {
            addCriterion("babm is null");
            return (Criteria) this;
        }

        public Criteria andBabmIsNotNull() {
            addCriterion("babm is not null");
            return (Criteria) this;
        }

        public Criteria andBabmEqualTo(String value) {
            addCriterion("babm =", value, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmNotEqualTo(String value) {
            addCriterion("babm <>", value, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmGreaterThan(String value) {
            addCriterion("babm >", value, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmGreaterThanOrEqualTo(String value) {
            addCriterion("babm >=", value, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmLessThan(String value) {
            addCriterion("babm <", value, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmLessThanOrEqualTo(String value) {
            addCriterion("babm <=", value, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmLike(String value) {
            addCriterion("babm like", value, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmNotLike(String value) {
            addCriterion("babm not like", value, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmIn(List<String> values) {
            addCriterion("babm in", values, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmNotIn(List<String> values) {
            addCriterion("babm not in", values, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmBetween(String value1, String value2) {
            addCriterion("babm between", value1, value2, "babm");
            return (Criteria) this;
        }

        public Criteria andBabmNotBetween(String value1, String value2) {
            addCriterion("babm not between", value1, value2, "babm");
            return (Criteria) this;
        }

        public Criteria andYljgmcIsNull() {
            addCriterion("yljgmc is null");
            return (Criteria) this;
        }

        public Criteria andYljgmcIsNotNull() {
            addCriterion("yljgmc is not null");
            return (Criteria) this;
        }

        public Criteria andYljgmcEqualTo(String value) {
            addCriterion("yljgmc =", value, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcNotEqualTo(String value) {
            addCriterion("yljgmc <>", value, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcGreaterThan(String value) {
            addCriterion("yljgmc >", value, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcGreaterThanOrEqualTo(String value) {
            addCriterion("yljgmc >=", value, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcLessThan(String value) {
            addCriterion("yljgmc <", value, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcLessThanOrEqualTo(String value) {
            addCriterion("yljgmc <=", value, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcLike(String value) {
            addCriterion("yljgmc like", value, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcNotLike(String value) {
            addCriterion("yljgmc not like", value, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcIn(List<String> values) {
            addCriterion("yljgmc in", values, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcNotIn(List<String> values) {
            addCriterion("yljgmc not in", values, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcBetween(String value1, String value2) {
            addCriterion("yljgmc between", value1, value2, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgmcNotBetween(String value1, String value2) {
            addCriterion("yljgmc not between", value1, value2, "yljgmc");
            return (Criteria) this;
        }

        public Criteria andYljgdmIsNull() {
            addCriterion("yljgdm is null");
            return (Criteria) this;
        }

        public Criteria andYljgdmIsNotNull() {
            addCriterion("yljgdm is not null");
            return (Criteria) this;
        }

        public Criteria andYljgdmEqualTo(String value) {
            addCriterion("yljgdm =", value, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmNotEqualTo(String value) {
            addCriterion("yljgdm <>", value, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmGreaterThan(String value) {
            addCriterion("yljgdm >", value, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmGreaterThanOrEqualTo(String value) {
            addCriterion("yljgdm >=", value, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmLessThan(String value) {
            addCriterion("yljgdm <", value, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmLessThanOrEqualTo(String value) {
            addCriterion("yljgdm <=", value, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmLike(String value) {
            addCriterion("yljgdm like", value, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmNotLike(String value) {
            addCriterion("yljgdm not like", value, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmIn(List<String> values) {
            addCriterion("yljgdm in", values, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmNotIn(List<String> values) {
            addCriterion("yljgdm not in", values, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmBetween(String value1, String value2) {
            addCriterion("yljgdm between", value1, value2, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYljgdmNotBetween(String value1, String value2) {
            addCriterion("yljgdm not between", value1, value2, "yljgdm");
            return (Criteria) this;
        }

        public Criteria andYbjsdjIsNull() {
            addCriterion("ybjsdj is null");
            return (Criteria) this;
        }

        public Criteria andYbjsdjIsNotNull() {
            addCriterion("ybjsdj is not null");
            return (Criteria) this;
        }

        public Criteria andYbjsdjEqualTo(Integer value) {
            addCriterion("ybjsdj =", value, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjNotEqualTo(Integer value) {
            addCriterion("ybjsdj <>", value, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjGreaterThan(Integer value) {
            addCriterion("ybjsdj >", value, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjGreaterThanOrEqualTo(Integer value) {
            addCriterion("ybjsdj >=", value, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjLessThan(Integer value) {
            addCriterion("ybjsdj <", value, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjLessThanOrEqualTo(Integer value) {
            addCriterion("ybjsdj <=", value, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjLike(Integer value) {
            addCriterion("ybjsdj like", value, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjNotLike(Integer value) {
            addCriterion("ybjsdj not like", value, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjIn(List<Integer> values) {
            addCriterion("ybjsdj in", values, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjNotIn(List<Integer> values) {
            addCriterion("ybjsdj not in", values, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjBetween(Integer value1, Integer value2) {
            addCriterion("ybjsdj between", value1, value2, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andYbjsdjNotBetween(Integer value1, Integer value2) {
            addCriterion("ybjsdj not between", value1, value2, "ybjsdj");
            return (Criteria) this;
        }

        public Criteria andSbsjIsNull() {
            addCriterion("sbsj is null");
            return (Criteria) this;
        }

        public Criteria andSbsjIsNotNull() {
            addCriterion("sbsj is not null");
            return (Criteria) this;
        }

        public Criteria andSbsjEqualTo(Date value) {
            addCriterion("sbsj =", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjNotEqualTo(Date value) {
            addCriterion("sbsj <>", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjGreaterThan(Date value) {
            addCriterion("sbsj >", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjGreaterThanOrEqualTo(Date value) {
            addCriterion("sbsj >=", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjLessThan(Date value) {
            addCriterion("sbsj <", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjLessThanOrEqualTo(Date value) {
            addCriterion("sbsj <=", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjLike(Date value) {
            addCriterion("sbsj like", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjNotLike(Date value) {
            addCriterion("sbsj not like", value, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjIn(List<Date> values) {
            addCriterion("sbsj in", values, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjNotIn(List<Date> values) {
            addCriterion("sbsj not in", values, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjBetween(Date value1, Date value2) {
            addCriterion("sbsj between", value1, value2, "sbsj");
            return (Criteria) this;
        }

        public Criteria andSbsjNotBetween(Date value1, Date value2) {
            addCriterion("sbsj not between", value1, value2, "sbsj");
            return (Criteria) this;
        }

        public Criteria andTbbmIsNull() {
            addCriterion("tbbm is null");
            return (Criteria) this;
        }

        public Criteria andTbbmIsNotNull() {
            addCriterion("tbbm is not null");
            return (Criteria) this;
        }

        public Criteria andTbbmEqualTo(String value) {
            addCriterion("tbbm =", value, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmNotEqualTo(String value) {
            addCriterion("tbbm <>", value, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmGreaterThan(String value) {
            addCriterion("tbbm >", value, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmGreaterThanOrEqualTo(String value) {
            addCriterion("tbbm >=", value, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmLessThan(String value) {
            addCriterion("tbbm <", value, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmLessThanOrEqualTo(String value) {
            addCriterion("tbbm <=", value, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmLike(String value) {
            addCriterion("tbbm like", value, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmNotLike(String value) {
            addCriterion("tbbm not like", value, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmIn(List<String> values) {
            addCriterion("tbbm in", values, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmNotIn(List<String> values) {
            addCriterion("tbbm not in", values, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmBetween(String value1, String value2) {
            addCriterion("tbbm between", value1, value2, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbbmNotBetween(String value1, String value2) {
            addCriterion("tbbm not between", value1, value2, "tbbm");
            return (Criteria) this;
        }

        public Criteria andTbrIsNull() {
            addCriterion("tbr is null");
            return (Criteria) this;
        }

        public Criteria andTbrIsNotNull() {
            addCriterion("tbr is not null");
            return (Criteria) this;
        }

        public Criteria andTbrEqualTo(String value) {
            addCriterion("tbr =", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrNotEqualTo(String value) {
            addCriterion("tbr <>", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrGreaterThan(String value) {
            addCriterion("tbr >", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrGreaterThanOrEqualTo(String value) {
            addCriterion("tbr >=", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrLessThan(String value) {
            addCriterion("tbr <", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrLessThanOrEqualTo(String value) {
            addCriterion("tbr <=", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrLike(String value) {
            addCriterion("tbr like", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrNotLike(String value) {
            addCriterion("tbr not like", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrIn(List<String> values) {
            addCriterion("tbr in", values, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrNotIn(List<String> values) {
            addCriterion("tbr not in", values, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrBetween(String value1, String value2) {
            addCriterion("tbr between", value1, value2, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrNotBetween(String value1, String value2) {
            addCriterion("tbr not between", value1, value2, "tbr");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(Date value) {
            addCriterion("createtime like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(Date value) {
            addCriterion("createtime not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(Date value) {
            addCriterion("updatetime like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(Date value) {
            addCriterion("updatetime not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andLikeQuery(DrgsTitle record) {
            List<String> list = new ArrayList<String>();
            List<String> list2 = new ArrayList<String>();
            List<String> list3 = new ArrayList<String>();
            StringBuffer buffer = new StringBuffer();
            StringBuffer sb=new StringBuffer();
            if (record.getId() != null && StringUtils.isNotEmpty(record.getId().toString())) {
                list.add("ifnull(id,'')");
            }
            if (record.getYbbm() != null && StringUtils.isNotEmpty(record.getYbbm().toString())) {
                list.add("ifnull(ybbm,'')");
            }
            if (record.getBabm() != null && StringUtils.isNotEmpty(record.getBabm().toString())) {
                list.add("ifnull(babm,'')");
            }
            if (record.getYljgmc() != null && StringUtils.isNotEmpty(record.getYljgmc().toString())) {
                list.add("ifnull(yljgmc,'')");
            }
            if (record.getYljgdm() != null && StringUtils.isNotEmpty(record.getYljgdm().toString())) {
                list.add("ifnull(yljgdm,'')");
            }
            if (record.getYbjsdj() != null && StringUtils.isNotEmpty(record.getYbjsdj().toString())) {
                list.add("ifnull(ybjsdj,'')");
            }
            // if (record.getSbsj() != null && StringUtils.isNotEmpty(record.getSbsj().toString())) {
            //     list.add("ifnull(sbsj,'')");
            // }
            if (record.getTbbm() != null && StringUtils.isNotEmpty(record.getTbbm().toString())) {
                list.add("ifnull(tbbm,'')");
            }
            if (record.getTbr() != null && StringUtils.isNotEmpty(record.getTbr().toString())) {
                list.add("ifnull(tbr,'')");
            }

            if (record.getSbsj() != null && StringUtils.isNotEmpty(record.getSbsj().toString())) {
                list.add("ifnull(sbsj,'')");
            }
            if (record.getCreatetime() != null && StringUtils.isNotEmpty(record.getCreatetime().toString())) {
                list.add("ifnull(createtime,'')");
            }
            if (record.getUpdatetime() != null && StringUtils.isNotEmpty(record.getUpdatetime().toString())) {
                list.add("ifnull(updatetime,'')");
            }
           
            if (record.getId() != null && StringUtils.isNotEmpty(record.getId().toString())) {
                list2.add("'%" + record.getId() + "%'");
            }
            if (record.getYbbm() != null && StringUtils.isNotEmpty(record.getYbbm().toString())) {
                list2.add("'%" + record.getYbbm() + "%'");
            }
            if (record.getBabm() != null && StringUtils.isNotEmpty(record.getBabm().toString())) {
                list2.add("'%" + record.getBabm() + "%'");
            }
            if (record.getYljgmc() != null && StringUtils.isNotEmpty(record.getYljgmc().toString())) {
                list2.add("'%" + record.getYljgmc() + "%'");
            }
            if (record.getYljgdm() != null && StringUtils.isNotEmpty(record.getYljgdm().toString())) {
                list2.add("'%" + record.getYljgdm() + "%'");
            }
            if (record.getYbjsdj() != null && StringUtils.isNotEmpty(record.getYbjsdj().toString())) {
                list2.add("'%" + record.getYbjsdj() + "%'");
            }
          
			 if(record.getTbbm()!=null&&StringUtils.isNotEmpty(record.getTbbm().toString())) {
        			list2.add("'%"+record.getTbbm()+"%'");
                 }
            
			if(record.getTbr()!=null&&StringUtils.isNotEmpty(record.getTbr().toString())) {
        			list2.add("'%"+record.getTbr()+"%'");
                 }
            if (record.getSbsj() != null && StringUtils.isNotEmpty(record.getSbsj().toString())) {
                         sb.append("and DATE_FORMAT(sbsj,'%Y-%m-%d') ='"+record.getSbsj()+"'");          
                        //list2.add("DATE_FORMAT(sbsj,'%Y-%m-%d') BETWEEN '"+record.getSbsj()+ "' and '" +record.getSbsj()+"'");
                }        
			if(record.getCreatetime()!=null&&StringUtils.isNotEmpty(record.getCreatetime().toString())) {
                    sb.append(" and DATE_FORMAT(createtime,'%Y-%m-%d') ='"+record.getCreatetime()+"'");
        		 }
			if(record.getUpdatetime()!=null&&StringUtils.isNotEmpty(record.getUpdatetime().toString())) {
                    sb.append("and DATE_FORMAT(updatetime,'%Y-%m-%d') ='"+record.getUpdatetime()+"'");
        		 }
			        	
        	buffer.append(" CONCAT(");
	        buffer.append(StringUtils.join(' ',list));
        	buffer.append(")");
        	buffer.append("like CONCAT(");
        	buffer.append(StringUtils.join(' ',list2));
            buffer.append(")");
            buffer.append(StringUtils.join(' ',sb));
            String str=buffer.toString();
            str=str.replace('[', ' ');
            str=str.replace(']', ' ');
            System.out.println(str);
        	if(!" CONCAT()like CONCAT()".equals(str)) {
        		addCriterion(str);
            }
        	return (Criteria) this;
        }
        
}
	
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}