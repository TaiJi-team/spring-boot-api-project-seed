package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.project.common.StringUtils;

/**
 *  SjczqtExample
 * @author SWJ
 * @date 2020-07-29 11:14:10
 */
public class SjczqtExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SjczqtExample() {
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
        
			
        public Criteria andCzmcIsNull() {
            addCriterion("czmc is null");
            return (Criteria) this;
        }

        public Criteria andCzmcIsNotNull() {
            addCriterion("czmc is not null");
            return (Criteria) this;
        }

        public Criteria andCzmcEqualTo(String value) {
            addCriterion("czmc =", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotEqualTo(String value) {
            addCriterion("czmc <>", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcGreaterThan(String value) {
            addCriterion("czmc >", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcGreaterThanOrEqualTo(String value) {
            addCriterion("czmc >=", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcLessThan(String value) {
            addCriterion("czmc <", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcLessThanOrEqualTo(String value) {
            addCriterion("czmc <=", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcLike(String value) {
            addCriterion("czmc like", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotLike(String value) {
            addCriterion("czmc not like", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcIn(List<String> values) {
            addCriterion("czmc in", values, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotIn(List<String> values) {
            addCriterion("czmc not in", values, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcBetween(String value1, String value2) {
            addCriterion("czmc between", value1, value2, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotBetween(String value1, String value2) {
            addCriterion("czmc not between", value1, value2, "czmc");
            return (Criteria) this;
        }
        
			
        public Criteria andSsczdmIsNull() {
            addCriterion("ssczdm is null");
            return (Criteria) this;
        }

        public Criteria andSsczdmIsNotNull() {
            addCriterion("ssczdm is not null");
            return (Criteria) this;
        }

        public Criteria andSsczdmEqualTo(String value) {
            addCriterion("ssczdm =", value, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmNotEqualTo(String value) {
            addCriterion("ssczdm <>", value, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmGreaterThan(String value) {
            addCriterion("ssczdm >", value, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmGreaterThanOrEqualTo(String value) {
            addCriterion("ssczdm >=", value, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmLessThan(String value) {
            addCriterion("ssczdm <", value, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmLessThanOrEqualTo(String value) {
            addCriterion("ssczdm <=", value, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmLike(String value) {
            addCriterion("ssczdm like", value, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmNotLike(String value) {
            addCriterion("ssczdm not like", value, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmIn(List<String> values) {
            addCriterion("ssczdm in", values, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmNotIn(List<String> values) {
            addCriterion("ssczdm not in", values, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmBetween(String value1, String value2) {
            addCriterion("ssczdm between", value1, value2, "ssczdm");
            return (Criteria) this;
        }

        public Criteria andSsczdmNotBetween(String value1, String value2) {
            addCriterion("ssczdm not between", value1, value2, "ssczdm");
            return (Criteria) this;
        }
        
			
        public Criteria andCzrqIsNull() {
            addCriterion("czrq is null");
            return (Criteria) this;
        }

        public Criteria andCzrqIsNotNull() {
            addCriterion("czrq is not null");
            return (Criteria) this;
        }

        public Criteria andCzrqEqualTo(Date value) {
            addCriterion("czrq =", value, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqNotEqualTo(Date value) {
            addCriterion("czrq <>", value, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqGreaterThan(Date value) {
            addCriterion("czrq >", value, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("czrq >=", value, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqLessThan(Date value) {
            addCriterion("czrq <", value, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqLessThanOrEqualTo(Date value) {
            addCriterion("czrq <=", value, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqLike(Date value) {
            addCriterion("czrq like", value, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqNotLike(Date value) {
            addCriterion("czrq not like", value, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqIn(List<Date> values) {
            addCriterion("czrq in", values, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqNotIn(List<Date> values) {
            addCriterion("czrq not in", values, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqBetween(Date value1, Date value2) {
            addCriterion("czrq between", value1, value2, "czrq");
            return (Criteria) this;
        }

        public Criteria andCzrqNotBetween(Date value1, Date value2) {
            addCriterion("czrq not between", value1, value2, "czrq");
            return (Criteria) this;
        }
        
			
        public Criteria andMzfsIsNull() {
            addCriterion("mzfs is null");
            return (Criteria) this;
        }

        public Criteria andMzfsIsNotNull() {
            addCriterion("mzfs is not null");
            return (Criteria) this;
        }

        public Criteria andMzfsEqualTo(Integer value) {
            addCriterion("mzfs =", value, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsNotEqualTo(Integer value) {
            addCriterion("mzfs <>", value, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsGreaterThan(Integer value) {
            addCriterion("mzfs >", value, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsGreaterThanOrEqualTo(Integer value) {
            addCriterion("mzfs >=", value, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsLessThan(Integer value) {
            addCriterion("mzfs <", value, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsLessThanOrEqualTo(Integer value) {
            addCriterion("mzfs <=", value, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsLike(Integer value) {
            addCriterion("mzfs like", value, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsNotLike(Integer value) {
            addCriterion("mzfs not like", value, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsIn(List<Integer> values) {
            addCriterion("mzfs in", values, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsNotIn(List<Integer> values) {
            addCriterion("mzfs not in", values, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsBetween(Integer value1, Integer value2) {
            addCriterion("mzfs between", value1, value2, "mzfs");
            return (Criteria) this;
        }

        public Criteria andMzfsNotBetween(Integer value1, Integer value2) {
            addCriterion("mzfs not between", value1, value2, "mzfs");
            return (Criteria) this;
        }
        
			
        public Criteria andSsysxmIsNull() {
            addCriterion("ssysxm is null");
            return (Criteria) this;
        }

        public Criteria andSsysxmIsNotNull() {
            addCriterion("ssysxm is not null");
            return (Criteria) this;
        }

        public Criteria andSsysxmEqualTo(String value) {
            addCriterion("ssysxm =", value, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmNotEqualTo(String value) {
            addCriterion("ssysxm <>", value, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmGreaterThan(String value) {
            addCriterion("ssysxm >", value, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmGreaterThanOrEqualTo(String value) {
            addCriterion("ssysxm >=", value, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmLessThan(String value) {
            addCriterion("ssysxm <", value, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmLessThanOrEqualTo(String value) {
            addCriterion("ssysxm <=", value, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmLike(String value) {
            addCriterion("ssysxm like", value, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmNotLike(String value) {
            addCriterion("ssysxm not like", value, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmIn(List<String> values) {
            addCriterion("ssysxm in", values, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmNotIn(List<String> values) {
            addCriterion("ssysxm not in", values, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmBetween(String value1, String value2) {
            addCriterion("ssysxm between", value1, value2, "ssysxm");
            return (Criteria) this;
        }

        public Criteria andSsysxmNotBetween(String value1, String value2) {
            addCriterion("ssysxm not between", value1, value2, "ssysxm");
            return (Criteria) this;
        }
        
			
        public Criteria andSsysdmIsNull() {
            addCriterion("ssysdm is null");
            return (Criteria) this;
        }

        public Criteria andSsysdmIsNotNull() {
            addCriterion("ssysdm is not null");
            return (Criteria) this;
        }

        public Criteria andSsysdmEqualTo(String value) {
            addCriterion("ssysdm =", value, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmNotEqualTo(String value) {
            addCriterion("ssysdm <>", value, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmGreaterThan(String value) {
            addCriterion("ssysdm >", value, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmGreaterThanOrEqualTo(String value) {
            addCriterion("ssysdm >=", value, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmLessThan(String value) {
            addCriterion("ssysdm <", value, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmLessThanOrEqualTo(String value) {
            addCriterion("ssysdm <=", value, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmLike(String value) {
            addCriterion("ssysdm like", value, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmNotLike(String value) {
            addCriterion("ssysdm not like", value, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmIn(List<String> values) {
            addCriterion("ssysdm in", values, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmNotIn(List<String> values) {
            addCriterion("ssysdm not in", values, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmBetween(String value1, String value2) {
            addCriterion("ssysdm between", value1, value2, "ssysdm");
            return (Criteria) this;
        }

        public Criteria andSsysdmNotBetween(String value1, String value2) {
            addCriterion("ssysdm not between", value1, value2, "ssysdm");
            return (Criteria) this;
        }
        
			
        public Criteria andMzysxmIsNull() {
            addCriterion("mzysxm is null");
            return (Criteria) this;
        }

        public Criteria andMzysxmIsNotNull() {
            addCriterion("mzysxm is not null");
            return (Criteria) this;
        }

        public Criteria andMzysxmEqualTo(String value) {
            addCriterion("mzysxm =", value, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmNotEqualTo(String value) {
            addCriterion("mzysxm <>", value, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmGreaterThan(String value) {
            addCriterion("mzysxm >", value, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmGreaterThanOrEqualTo(String value) {
            addCriterion("mzysxm >=", value, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmLessThan(String value) {
            addCriterion("mzysxm <", value, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmLessThanOrEqualTo(String value) {
            addCriterion("mzysxm <=", value, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmLike(String value) {
            addCriterion("mzysxm like", value, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmNotLike(String value) {
            addCriterion("mzysxm not like", value, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmIn(List<String> values) {
            addCriterion("mzysxm in", values, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmNotIn(List<String> values) {
            addCriterion("mzysxm not in", values, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmBetween(String value1, String value2) {
            addCriterion("mzysxm between", value1, value2, "mzysxm");
            return (Criteria) this;
        }

        public Criteria andMzysxmNotBetween(String value1, String value2) {
            addCriterion("mzysxm not between", value1, value2, "mzysxm");
            return (Criteria) this;
        }
        
			
        public Criteria andMzysdmIsNull() {
            addCriterion("mzysdm is null");
            return (Criteria) this;
        }

        public Criteria andMzysdmIsNotNull() {
            addCriterion("mzysdm is not null");
            return (Criteria) this;
        }

        public Criteria andMzysdmEqualTo(String value) {
            addCriterion("mzysdm =", value, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmNotEqualTo(String value) {
            addCriterion("mzysdm <>", value, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmGreaterThan(String value) {
            addCriterion("mzysdm >", value, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmGreaterThanOrEqualTo(String value) {
            addCriterion("mzysdm >=", value, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmLessThan(String value) {
            addCriterion("mzysdm <", value, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmLessThanOrEqualTo(String value) {
            addCriterion("mzysdm <=", value, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmLike(String value) {
            addCriterion("mzysdm like", value, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmNotLike(String value) {
            addCriterion("mzysdm not like", value, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmIn(List<String> values) {
            addCriterion("mzysdm in", values, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmNotIn(List<String> values) {
            addCriterion("mzysdm not in", values, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmBetween(String value1, String value2) {
            addCriterion("mzysdm between", value1, value2, "mzysdm");
            return (Criteria) this;
        }

        public Criteria andMzysdmNotBetween(String value1, String value2) {
            addCriterion("mzysdm not between", value1, value2, "mzysdm");
            return (Criteria) this;
        }
        
		
		 public Criteria andLikeQuery(Sjczqt record) {
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
						 if(record.getCzmc()!=null&&StringUtils.isNotEmpty(record.getCzmc().toString())) {
    			 list.add("ifnull(czmc,'')");
    		 }
						 if(record.getSsczdm()!=null&&StringUtils.isNotEmpty(record.getSsczdm().toString())) {
    			 list.add("ifnull(ssczdm,'')");
    		 }
						 if(record.getCzrq()!=null&&StringUtils.isNotEmpty(record.getCzrq().toString())) {
    			 list.add("ifnull(czrq,'')");
    		 }
						 if(record.getMzfs()!=null&&StringUtils.isNotEmpty(record.getMzfs().toString())) {
    			 list.add("ifnull(mzfs,'')");
    		 }
						 if(record.getSsysxm()!=null&&StringUtils.isNotEmpty(record.getSsysxm().toString())) {
    			 list.add("ifnull(ssysxm,'')");
    		 }
						 if(record.getSsysdm()!=null&&StringUtils.isNotEmpty(record.getSsysdm().toString())) {
    			 list.add("ifnull(ssysdm,'')");
    		 }
						 if(record.getMzysxm()!=null&&StringUtils.isNotEmpty(record.getMzysxm().toString())) {
    			 list.add("ifnull(mzysxm,'')");
    		 }
						 if(record.getMzysdm()!=null&&StringUtils.isNotEmpty(record.getMzysdm().toString())) {
    			 list.add("ifnull(mzysdm,'')");
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
							 if(record.getCzmc()!=null&&StringUtils.isNotEmpty(record.getCzmc().toString())) {
        			list2.add("'%"+record.getCzmc()+"%'");
        		 }
							 if(record.getSsczdm()!=null&&StringUtils.isNotEmpty(record.getSsczdm().toString())) {
        			list2.add("'%"+record.getSsczdm()+"%'");
        		 }
							 if(record.getCzrq()!=null&&StringUtils.isNotEmpty(record.getCzrq().toString())) {
        			list2.add("'%"+record.getCzrq()+"%'");
        		 }
							 if(record.getMzfs()!=null&&StringUtils.isNotEmpty(record.getMzfs().toString())) {
        			list2.add("'%"+record.getMzfs()+"%'");
        		 }
							 if(record.getSsysxm()!=null&&StringUtils.isNotEmpty(record.getSsysxm().toString())) {
        			list2.add("'%"+record.getSsysxm()+"%'");
        		 }
							 if(record.getSsysdm()!=null&&StringUtils.isNotEmpty(record.getSsysdm().toString())) {
        			list2.add("'%"+record.getSsysdm()+"%'");
        		 }
							 if(record.getMzysxm()!=null&&StringUtils.isNotEmpty(record.getMzysxm().toString())) {
        			list2.add("'%"+record.getMzysxm()+"%'");
        		 }
							 if(record.getMzysdm()!=null&&StringUtils.isNotEmpty(record.getMzysdm().toString())) {
        			list2.add("'%"+record.getMzysdm()+"%'");
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