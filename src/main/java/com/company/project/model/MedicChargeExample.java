package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.project.common.StringUtils;

/**
 *  MedicChargeExample
 * @author SWJ
 * @date 2020-07-30 16:46:21
 */
public class MedicChargeExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicChargeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
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
        
			
        public Criteria andYwlshIsNull() {
            addCriterion("ywlsh is null");
            return (Criteria) this;
        }

        public Criteria andYwlshIsNotNull() {
            addCriterion("ywlsh is not null");
            return (Criteria) this;
        }

        public Criteria andYwlshEqualTo(String value) {
            addCriterion("ywlsh =", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshNotEqualTo(String value) {
            addCriterion("ywlsh <>", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshGreaterThan(String value) {
            addCriterion("ywlsh >", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshGreaterThanOrEqualTo(String value) {
            addCriterion("ywlsh >=", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshLessThan(String value) {
            addCriterion("ywlsh <", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshLessThanOrEqualTo(String value) {
            addCriterion("ywlsh <=", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshLike(String value) {
            addCriterion("ywlsh like", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshNotLike(String value) {
            addCriterion("ywlsh not like", value, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshIn(List<String> values) {
            addCriterion("ywlsh in", values, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshNotIn(List<String> values) {
            addCriterion("ywlsh not in", values, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshBetween(String value1, String value2) {
            addCriterion("ywlsh between", value1, value2, "ywlsh");
            return (Criteria) this;
        }

        public Criteria andYwlshNotBetween(String value1, String value2) {
            addCriterion("ywlsh not between", value1, value2, "ywlsh");
            return (Criteria) this;
        }
        
			
        public Criteria andJsqjksrqIsNull() {
            addCriterion("jsqjksrq is null");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqIsNotNull() {
            addCriterion("jsqjksrq is not null");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqEqualTo(Date value) {
            addCriterion("jsqjksrq =", value, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqNotEqualTo(Date value) {
            addCriterion("jsqjksrq <>", value, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqGreaterThan(Date value) {
            addCriterion("jsqjksrq >", value, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqGreaterThanOrEqualTo(Date value) {
            addCriterion("jsqjksrq >=", value, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqLessThan(Date value) {
            addCriterion("jsqjksrq <", value, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqLessThanOrEqualTo(Date value) {
            addCriterion("jsqjksrq <=", value, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqLike(Date value) {
            addCriterion("jsqjksrq like", value, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqNotLike(Date value) {
            addCriterion("jsqjksrq not like", value, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqIn(List<Date> values) {
            addCriterion("jsqjksrq in", values, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqNotIn(List<Date> values) {
            addCriterion("jsqjksrq not in", values, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqBetween(Date value1, Date value2) {
            addCriterion("jsqjksrq between", value1, value2, "jsqjksrq");
            return (Criteria) this;
        }

        public Criteria andJsqjksrqNotBetween(Date value1, Date value2) {
            addCriterion("jsqjksrq not between", value1, value2, "jsqjksrq");
            return (Criteria) this;
        }
        
			
        public Criteria andJsqjjsrqIsNull() {
            addCriterion("jsqjjsrq is null");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqIsNotNull() {
            addCriterion("jsqjjsrq is not null");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqEqualTo(Date value) {
            addCriterion("jsqjjsrq =", value, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqNotEqualTo(Date value) {
            addCriterion("jsqjjsrq <>", value, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqGreaterThan(Date value) {
            addCriterion("jsqjjsrq >", value, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("jsqjjsrq >=", value, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqLessThan(Date value) {
            addCriterion("jsqjjsrq <", value, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqLessThanOrEqualTo(Date value) {
            addCriterion("jsqjjsrq <=", value, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqLike(Date value) {
            addCriterion("jsqjjsrq like", value, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqNotLike(Date value) {
            addCriterion("jsqjjsrq not like", value, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqIn(List<Date> values) {
            addCriterion("jsqjjsrq in", values, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqNotIn(List<Date> values) {
            addCriterion("jsqjjsrq not in", values, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqBetween(Date value1, Date value2) {
            addCriterion("jsqjjsrq between", value1, value2, "jsqjjsrq");
            return (Criteria) this;
        }

        public Criteria andJsqjjsrqNotBetween(Date value1, Date value2) {
            addCriterion("jsqjjsrq not between", value1, value2, "jsqjjsrq");
            return (Criteria) this;
        }
        
			
        public Criteria andYbzffsIsNull() {
            addCriterion("ybzffs is null");
            return (Criteria) this;
        }

        public Criteria andYbzffsIsNotNull() {
            addCriterion("ybzffs is not null");
            return (Criteria) this;
        }

        public Criteria andYbzffsEqualTo(Integer value) {
            addCriterion("ybzffs =", value, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsNotEqualTo(Integer value) {
            addCriterion("ybzffs <>", value, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsGreaterThan(Integer value) {
            addCriterion("ybzffs >", value, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ybzffs >=", value, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsLessThan(Integer value) {
            addCriterion("ybzffs <", value, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsLessThanOrEqualTo(Integer value) {
            addCriterion("ybzffs <=", value, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsLike(Integer value) {
            addCriterion("ybzffs like", value, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsNotLike(Integer value) {
            addCriterion("ybzffs not like", value, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsIn(List<Integer> values) {
            addCriterion("ybzffs in", values, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsNotIn(List<Integer> values) {
            addCriterion("ybzffs not in", values, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsBetween(Integer value1, Integer value2) {
            addCriterion("ybzffs between", value1, value2, "ybzffs");
            return (Criteria) this;
        }

        public Criteria andYbzffsNotBetween(Integer value1, Integer value2) {
            addCriterion("ybzffs not between", value1, value2, "ybzffs");
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
        
			
        public Criteria andJyxmlbIsNull() {
            addCriterion("jyxmlb is null");
            return (Criteria) this;
        }

        public Criteria andJyxmlbIsNotNull() {
            addCriterion("jyxmlb is not null");
            return (Criteria) this;
        }

        public Criteria andJyxmlbEqualTo(String value) {
            addCriterion("jyxmlb =", value, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbNotEqualTo(String value) {
            addCriterion("jyxmlb <>", value, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbGreaterThan(String value) {
            addCriterion("jyxmlb >", value, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbGreaterThanOrEqualTo(String value) {
            addCriterion("jyxmlb >=", value, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbLessThan(String value) {
            addCriterion("jyxmlb <", value, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbLessThanOrEqualTo(String value) {
            addCriterion("jyxmlb <=", value, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbLike(String value) {
            addCriterion("jyxmlb like", value, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbNotLike(String value) {
            addCriterion("jyxmlb not like", value, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbIn(List<String> values) {
            addCriterion("jyxmlb in", values, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbNotIn(List<String> values) {
            addCriterion("jyxmlb not in", values, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbBetween(String value1, String value2) {
            addCriterion("jyxmlb between", value1, value2, "jyxmlb");
            return (Criteria) this;
        }

        public Criteria andJyxmlbNotBetween(String value1, String value2) {
            addCriterion("jyxmlb not between", value1, value2, "jyxmlb");
            return (Criteria) this;
        }
        
			
        public Criteria andJjzfIsNull() {
            addCriterion("jjzf is null");
            return (Criteria) this;
        }

        public Criteria andJjzfIsNotNull() {
            addCriterion("jjzf is not null");
            return (Criteria) this;
        }

        public Criteria andJjzfEqualTo(String value) {
            addCriterion("jjzf =", value, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfNotEqualTo(String value) {
            addCriterion("jjzf <>", value, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfGreaterThan(String value) {
            addCriterion("jjzf >", value, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfGreaterThanOrEqualTo(String value) {
            addCriterion("jjzf >=", value, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfLessThan(String value) {
            addCriterion("jjzf <", value, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfLessThanOrEqualTo(String value) {
            addCriterion("jjzf <=", value, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfLike(String value) {
            addCriterion("jjzf like", value, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfNotLike(String value) {
            addCriterion("jjzf not like", value, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfIn(List<String> values) {
            addCriterion("jjzf in", values, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfNotIn(List<String> values) {
            addCriterion("jjzf not in", values, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfBetween(String value1, String value2) {
            addCriterion("jjzf between", value1, value2, "jjzf");
            return (Criteria) this;
        }

        public Criteria andJjzfNotBetween(String value1, String value2) {
            addCriterion("jjzf not between", value1, value2, "jjzf");
            return (Criteria) this;
        }
        
			
        public Criteria andGrzfIsNull() {
            addCriterion("grzf is null");
            return (Criteria) this;
        }

        public Criteria andGrzfIsNotNull() {
            addCriterion("grzf is not null");
            return (Criteria) this;
        }

        public Criteria andGrzfEqualTo(String value) {
            addCriterion("grzf =", value, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfNotEqualTo(String value) {
            addCriterion("grzf <>", value, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfGreaterThan(String value) {
            addCriterion("grzf >", value, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfGreaterThanOrEqualTo(String value) {
            addCriterion("grzf >=", value, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfLessThan(String value) {
            addCriterion("grzf <", value, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfLessThanOrEqualTo(String value) {
            addCriterion("grzf <=", value, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfLike(String value) {
            addCriterion("grzf like", value, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfNotLike(String value) {
            addCriterion("grzf not like", value, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfIn(List<String> values) {
            addCriterion("grzf in", values, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfNotIn(List<String> values) {
            addCriterion("grzf not in", values, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfBetween(String value1, String value2) {
            addCriterion("grzf between", value1, value2, "grzf");
            return (Criteria) this;
        }

        public Criteria andGrzfNotBetween(String value1, String value2) {
            addCriterion("grzf not between", value1, value2, "grzf");
            return (Criteria) this;
        }
        
		
		 public Criteria andLikeQuery(MedicCharge record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getId()!=null&&StringUtils.isNotEmpty(record.getId().toString())) {
    			 list.add("ifnull(id,'')");
    		 }
						 if(record.getYbbm()!=null&&StringUtils.isNotEmpty(record.getYbbm().toString())) {
    			 list.add("ifnull(ybbm,'')");
    		 }
						 if(record.getBabm()!=null&&StringUtils.isNotEmpty(record.getBabm().toString())) {
    			 list.add("ifnull(babm,'')");
    		 }
						 if(record.getYwlsh()!=null&&StringUtils.isNotEmpty(record.getYwlsh().toString())) {
    			 list.add("ifnull(ywlsh,'')");
    		 }
						 if(record.getJsqjksrq()!=null&&StringUtils.isNotEmpty(record.getJsqjksrq().toString())) {
    			 list.add("ifnull(jsqjksrq,'')");
    		 }
						 if(record.getJsqjjsrq()!=null&&StringUtils.isNotEmpty(record.getJsqjjsrq().toString())) {
    			 list.add("ifnull(jsqjjsrq,'')");
    		 }
						 if(record.getYbzffs()!=null&&StringUtils.isNotEmpty(record.getYbzffs().toString())) {
    			 list.add("ifnull(ybzffs,'')");
    		 }
						 if(record.getCreatetime()!=null&&StringUtils.isNotEmpty(record.getCreatetime().toString())) {
    			 list.add("ifnull(createtime,'')");
    		 }
						 if(record.getUpdatetime()!=null&&StringUtils.isNotEmpty(record.getUpdatetime().toString())) {
    			 list.add("ifnull(updatetime,'')");
    		 }
						 if(record.getJyxmlb()!=null&&StringUtils.isNotEmpty(record.getJyxmlb().toString())) {
    			 list.add("ifnull(jyxmlb,'')");
    		 }
						 if(record.getJjzf()!=null&&StringUtils.isNotEmpty(record.getJjzf().toString())) {
    			 list.add("ifnull(jjzf,'')");
    		 }
						 if(record.getGrzf()!=null&&StringUtils.isNotEmpty(record.getGrzf().toString())) {
    			 list.add("ifnull(grzf,'')");
    		 }
										 if(record.getId()!=null&&StringUtils.isNotEmpty(record.getId().toString())) {
        			list2.add("'%"+record.getId()+"%'");
        		 }
							 if(record.getYbbm()!=null&&StringUtils.isNotEmpty(record.getYbbm().toString())) {
        			list2.add("'%"+record.getYbbm()+"%'");
        		 }
							 if(record.getBabm()!=null&&StringUtils.isNotEmpty(record.getBabm().toString())) {
        			list2.add("'%"+record.getBabm()+"%'");
        		 }
							 if(record.getYwlsh()!=null&&StringUtils.isNotEmpty(record.getYwlsh().toString())) {
        			list2.add("'%"+record.getYwlsh()+"%'");
        		 }
							 if(record.getJsqjksrq()!=null&&StringUtils.isNotEmpty(record.getJsqjksrq().toString())) {
        			list2.add("'%"+record.getJsqjksrq()+"%'");
        		 }
							 if(record.getJsqjjsrq()!=null&&StringUtils.isNotEmpty(record.getJsqjjsrq().toString())) {
        			list2.add("'%"+record.getJsqjjsrq()+"%'");
        		 }
							 if(record.getYbzffs()!=null&&StringUtils.isNotEmpty(record.getYbzffs().toString())) {
        			list2.add("'%"+record.getYbzffs()+"%'");
        		 }
							 if(record.getCreatetime()!=null&&StringUtils.isNotEmpty(record.getCreatetime().toString())) {
        			list2.add("'%"+record.getCreatetime()+"%'");
        		 }
							 if(record.getUpdatetime()!=null&&StringUtils.isNotEmpty(record.getUpdatetime().toString())) {
        			list2.add("'%"+record.getUpdatetime()+"%'");
        		 }
							 if(record.getJyxmlb()!=null&&StringUtils.isNotEmpty(record.getJyxmlb().toString())) {
        			list2.add("'%"+record.getJyxmlb()+"%'");
        		 }
							 if(record.getJjzf()!=null&&StringUtils.isNotEmpty(record.getJjzf().toString())) {
        			list2.add("'%"+record.getJjzf()+"%'");
        		 }
							 if(record.getGrzf()!=null&&StringUtils.isNotEmpty(record.getGrzf().toString())) {
        			list2.add("'%"+record.getGrzf()+"%'");
        		 }
			        	
        	buffer.append(" CONCAT(");
	        buffer.append(StringUtils.join("",list));
        	buffer.append(")");
        	buffer.append("like CONCAT(");
        	
        	
        	buffer.append(StringUtils.join("",list2));
        	
        	buffer.append(")");
        	if(!" CONCAT()like CONCAT()".equals(buffer.toString())) {
        		addCriterion(buffer.toString());
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