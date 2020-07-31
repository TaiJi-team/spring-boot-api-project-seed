package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.project.common.StringUtils;

/**
 *  PatienbaseExample
 * @author SWJ
 * @date 2020-07-30 16:46:33
 */
public class PatienbaseExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatienbaseExample() {
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
        
			
        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }
        
			
        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(Integer value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(Integer value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(Integer value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(Integer value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(Integer value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(Integer value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(Integer value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(Integer value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<Integer> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<Integer> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(Integer value1, Integer value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(Integer value1, Integer value2) {
            addCriterion("xb not between", value1, value2, "xb");
            return (Criteria) this;
        }
        
			
        public Criteria andCsrqIsNull() {
            addCriterion("csrq is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("csrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterion("csrq =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterion("csrq <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterion("csrq >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("csrq >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterion("csrq <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterion("csrq <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLike(Date value) {
            addCriterion("csrq like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotLike(Date value) {
            addCriterion("csrq not like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterion("csrq in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterion("csrq not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterion("csrq between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterion("csrq not between", value1, value2, "csrq");
            return (Criteria) this;
        }
        
			
        public Criteria andNlIsNull() {
            addCriterion("nl is null");
            return (Criteria) this;
        }

        public Criteria andNlIsNotNull() {
            addCriterion("nl is not null");
            return (Criteria) this;
        }

        public Criteria andNlEqualTo(Integer value) {
            addCriterion("nl =", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlNotEqualTo(Integer value) {
            addCriterion("nl <>", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlGreaterThan(Integer value) {
            addCriterion("nl >", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlGreaterThanOrEqualTo(Integer value) {
            addCriterion("nl >=", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlLessThan(Integer value) {
            addCriterion("nl <", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlLessThanOrEqualTo(Integer value) {
            addCriterion("nl <=", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlLike(Integer value) {
            addCriterion("nl like", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlNotLike(Integer value) {
            addCriterion("nl not like", value, "nl");
            return (Criteria) this;
        }

        public Criteria andNlIn(List<Integer> values) {
            addCriterion("nl in", values, "nl");
            return (Criteria) this;
        }

        public Criteria andNlNotIn(List<Integer> values) {
            addCriterion("nl not in", values, "nl");
            return (Criteria) this;
        }

        public Criteria andNlBetween(Integer value1, Integer value2) {
            addCriterion("nl between", value1, value2, "nl");
            return (Criteria) this;
        }

        public Criteria andNlNotBetween(Integer value1, Integer value2) {
            addCriterion("nl not between", value1, value2, "nl");
            return (Criteria) this;
        }
        
			
        public Criteria andGjIsNull() {
            addCriterion("gj is null");
            return (Criteria) this;
        }

        public Criteria andGjIsNotNull() {
            addCriterion("gj is not null");
            return (Criteria) this;
        }

        public Criteria andGjEqualTo(String value) {
            addCriterion("gj =", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotEqualTo(String value) {
            addCriterion("gj <>", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThan(String value) {
            addCriterion("gj >", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThanOrEqualTo(String value) {
            addCriterion("gj >=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThan(String value) {
            addCriterion("gj <", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThanOrEqualTo(String value) {
            addCriterion("gj <=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLike(String value) {
            addCriterion("gj like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotLike(String value) {
            addCriterion("gj not like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjIn(List<String> values) {
            addCriterion("gj in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotIn(List<String> values) {
            addCriterion("gj not in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjBetween(String value1, String value2) {
            addCriterion("gj between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotBetween(String value1, String value2) {
            addCriterion("gj not between", value1, value2, "gj");
            return (Criteria) this;
        }
        
			
        public Criteria andBzzsnlIsNull() {
            addCriterion("bzzsnl is null");
            return (Criteria) this;
        }

        public Criteria andBzzsnlIsNotNull() {
            addCriterion("bzzsnl is not null");
            return (Criteria) this;
        }

        public Criteria andBzzsnlEqualTo(String value) {
            addCriterion("bzzsnl =", value, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlNotEqualTo(String value) {
            addCriterion("bzzsnl <>", value, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlGreaterThan(String value) {
            addCriterion("bzzsnl >", value, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlGreaterThanOrEqualTo(String value) {
            addCriterion("bzzsnl >=", value, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlLessThan(String value) {
            addCriterion("bzzsnl <", value, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlLessThanOrEqualTo(String value) {
            addCriterion("bzzsnl <=", value, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlLike(String value) {
            addCriterion("bzzsnl like", value, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlNotLike(String value) {
            addCriterion("bzzsnl not like", value, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlIn(List<String> values) {
            addCriterion("bzzsnl in", values, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlNotIn(List<String> values) {
            addCriterion("bzzsnl not in", values, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlBetween(String value1, String value2) {
            addCriterion("bzzsnl between", value1, value2, "bzzsnl");
            return (Criteria) this;
        }

        public Criteria andBzzsnlNotBetween(String value1, String value2) {
            addCriterion("bzzsnl not between", value1, value2, "bzzsnl");
            return (Criteria) this;
        }
        
			
        public Criteria andMzIsNull() {
            addCriterion("mz is null");
            return (Criteria) this;
        }

        public Criteria andMzIsNotNull() {
            addCriterion("mz is not null");
            return (Criteria) this;
        }

        public Criteria andMzEqualTo(Integer value) {
            addCriterion("mz =", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotEqualTo(Integer value) {
            addCriterion("mz <>", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThan(Integer value) {
            addCriterion("mz >", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzGreaterThanOrEqualTo(Integer value) {
            addCriterion("mz >=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThan(Integer value) {
            addCriterion("mz <", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLessThanOrEqualTo(Integer value) {
            addCriterion("mz <=", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzLike(Integer value) {
            addCriterion("mz like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotLike(Integer value) {
            addCriterion("mz not like", value, "mz");
            return (Criteria) this;
        }

        public Criteria andMzIn(List<Integer> values) {
            addCriterion("mz in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotIn(List<Integer> values) {
            addCriterion("mz not in", values, "mz");
            return (Criteria) this;
        }

        public Criteria andMzBetween(Integer value1, Integer value2) {
            addCriterion("mz between", value1, value2, "mz");
            return (Criteria) this;
        }

        public Criteria andMzNotBetween(Integer value1, Integer value2) {
            addCriterion("mz not between", value1, value2, "mz");
            return (Criteria) this;
        }
        
			
        public Criteria andZjlbIsNull() {
            addCriterion("zjlb is null");
            return (Criteria) this;
        }

        public Criteria andZjlbIsNotNull() {
            addCriterion("zjlb is not null");
            return (Criteria) this;
        }

        public Criteria andZjlbEqualTo(String value) {
            addCriterion("zjlb =", value, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbNotEqualTo(String value) {
            addCriterion("zjlb <>", value, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbGreaterThan(String value) {
            addCriterion("zjlb >", value, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbGreaterThanOrEqualTo(String value) {
            addCriterion("zjlb >=", value, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbLessThan(String value) {
            addCriterion("zjlb <", value, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbLessThanOrEqualTo(String value) {
            addCriterion("zjlb <=", value, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbLike(String value) {
            addCriterion("zjlb like", value, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbNotLike(String value) {
            addCriterion("zjlb not like", value, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbIn(List<String> values) {
            addCriterion("zjlb in", values, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbNotIn(List<String> values) {
            addCriterion("zjlb not in", values, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbBetween(String value1, String value2) {
            addCriterion("zjlb between", value1, value2, "zjlb");
            return (Criteria) this;
        }

        public Criteria andZjlbNotBetween(String value1, String value2) {
            addCriterion("zjlb not between", value1, value2, "zjlb");
            return (Criteria) this;
        }
        
			
        public Criteria andZjhmIsNull() {
            addCriterion("zjhm is null");
            return (Criteria) this;
        }

        public Criteria andZjhmIsNotNull() {
            addCriterion("zjhm is not null");
            return (Criteria) this;
        }

        public Criteria andZjhmEqualTo(String value) {
            addCriterion("zjhm =", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotEqualTo(String value) {
            addCriterion("zjhm <>", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThan(String value) {
            addCriterion("zjhm >", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmGreaterThanOrEqualTo(String value) {
            addCriterion("zjhm >=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThan(String value) {
            addCriterion("zjhm <", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLessThanOrEqualTo(String value) {
            addCriterion("zjhm <=", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmLike(String value) {
            addCriterion("zjhm like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotLike(String value) {
            addCriterion("zjhm not like", value, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmIn(List<String> values) {
            addCriterion("zjhm in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotIn(List<String> values) {
            addCriterion("zjhm not in", values, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmBetween(String value1, String value2) {
            addCriterion("zjhm between", value1, value2, "zjhm");
            return (Criteria) this;
        }

        public Criteria andZjhmNotBetween(String value1, String value2) {
            addCriterion("zjhm not between", value1, value2, "zjhm");
            return (Criteria) this;
        }
        
			
        public Criteria andZyIsNull() {
            addCriterion("zy is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("zy is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("zy =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("zy <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("zy >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("zy >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("zy <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("zy <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLike(String value) {
            addCriterion("zy like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotLike(String value) {
            addCriterion("zy not like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("zy in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("zy not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("zy between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("zy not between", value1, value2, "zy");
            return (Criteria) this;
        }
        
			
        public Criteria andXzzIsNull() {
            addCriterion("xzz is null");
            return (Criteria) this;
        }

        public Criteria andXzzIsNotNull() {
            addCriterion("xzz is not null");
            return (Criteria) this;
        }

        public Criteria andXzzEqualTo(String value) {
            addCriterion("xzz =", value, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzNotEqualTo(String value) {
            addCriterion("xzz <>", value, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzGreaterThan(String value) {
            addCriterion("xzz >", value, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzGreaterThanOrEqualTo(String value) {
            addCriterion("xzz >=", value, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzLessThan(String value) {
            addCriterion("xzz <", value, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzLessThanOrEqualTo(String value) {
            addCriterion("xzz <=", value, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzLike(String value) {
            addCriterion("xzz like", value, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzNotLike(String value) {
            addCriterion("xzz not like", value, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzIn(List<String> values) {
            addCriterion("xzz in", values, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzNotIn(List<String> values) {
            addCriterion("xzz not in", values, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzBetween(String value1, String value2) {
            addCriterion("xzz between", value1, value2, "xzz");
            return (Criteria) this;
        }

        public Criteria andXzzNotBetween(String value1, String value2) {
            addCriterion("xzz not between", value1, value2, "xzz");
            return (Criteria) this;
        }
        
			
        public Criteria andDwmcIsNull() {
            addCriterion("dwmc is null");
            return (Criteria) this;
        }

        public Criteria andDwmcIsNotNull() {
            addCriterion("dwmc is not null");
            return (Criteria) this;
        }

        public Criteria andDwmcEqualTo(String value) {
            addCriterion("dwmc =", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotEqualTo(String value) {
            addCriterion("dwmc <>", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThan(String value) {
            addCriterion("dwmc >", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThanOrEqualTo(String value) {
            addCriterion("dwmc >=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThan(String value) {
            addCriterion("dwmc <", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThanOrEqualTo(String value) {
            addCriterion("dwmc <=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLike(String value) {
            addCriterion("dwmc like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotLike(String value) {
            addCriterion("dwmc not like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcIn(List<String> values) {
            addCriterion("dwmc in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotIn(List<String> values) {
            addCriterion("dwmc not in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcBetween(String value1, String value2) {
            addCriterion("dwmc between", value1, value2, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotBetween(String value1, String value2) {
            addCriterion("dwmc not between", value1, value2, "dwmc");
            return (Criteria) this;
        }
        
			
        public Criteria andDwdzIsNull() {
            addCriterion("dwdz is null");
            return (Criteria) this;
        }

        public Criteria andDwdzIsNotNull() {
            addCriterion("dwdz is not null");
            return (Criteria) this;
        }

        public Criteria andDwdzEqualTo(String value) {
            addCriterion("dwdz =", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzNotEqualTo(String value) {
            addCriterion("dwdz <>", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzGreaterThan(String value) {
            addCriterion("dwdz >", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzGreaterThanOrEqualTo(String value) {
            addCriterion("dwdz >=", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzLessThan(String value) {
            addCriterion("dwdz <", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzLessThanOrEqualTo(String value) {
            addCriterion("dwdz <=", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzLike(String value) {
            addCriterion("dwdz like", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzNotLike(String value) {
            addCriterion("dwdz not like", value, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzIn(List<String> values) {
            addCriterion("dwdz in", values, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzNotIn(List<String> values) {
            addCriterion("dwdz not in", values, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzBetween(String value1, String value2) {
            addCriterion("dwdz between", value1, value2, "dwdz");
            return (Criteria) this;
        }

        public Criteria andDwdzNotBetween(String value1, String value2) {
            addCriterion("dwdz not between", value1, value2, "dwdz");
            return (Criteria) this;
        }
        
			
        public Criteria andDwdhIsNull() {
            addCriterion("dwdh is null");
            return (Criteria) this;
        }

        public Criteria andDwdhIsNotNull() {
            addCriterion("dwdh is not null");
            return (Criteria) this;
        }

        public Criteria andDwdhEqualTo(String value) {
            addCriterion("dwdh =", value, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhNotEqualTo(String value) {
            addCriterion("dwdh <>", value, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhGreaterThan(String value) {
            addCriterion("dwdh >", value, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhGreaterThanOrEqualTo(String value) {
            addCriterion("dwdh >=", value, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhLessThan(String value) {
            addCriterion("dwdh <", value, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhLessThanOrEqualTo(String value) {
            addCriterion("dwdh <=", value, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhLike(String value) {
            addCriterion("dwdh like", value, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhNotLike(String value) {
            addCriterion("dwdh not like", value, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhIn(List<String> values) {
            addCriterion("dwdh in", values, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhNotIn(List<String> values) {
            addCriterion("dwdh not in", values, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhBetween(String value1, String value2) {
            addCriterion("dwdh between", value1, value2, "dwdh");
            return (Criteria) this;
        }

        public Criteria andDwdhNotBetween(String value1, String value2) {
            addCriterion("dwdh not between", value1, value2, "dwdh");
            return (Criteria) this;
        }
        
			
        public Criteria andDwybIsNull() {
            addCriterion("dwyb is null");
            return (Criteria) this;
        }

        public Criteria andDwybIsNotNull() {
            addCriterion("dwyb is not null");
            return (Criteria) this;
        }

        public Criteria andDwybEqualTo(String value) {
            addCriterion("dwyb =", value, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybNotEqualTo(String value) {
            addCriterion("dwyb <>", value, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybGreaterThan(String value) {
            addCriterion("dwyb >", value, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybGreaterThanOrEqualTo(String value) {
            addCriterion("dwyb >=", value, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybLessThan(String value) {
            addCriterion("dwyb <", value, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybLessThanOrEqualTo(String value) {
            addCriterion("dwyb <=", value, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybLike(String value) {
            addCriterion("dwyb like", value, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybNotLike(String value) {
            addCriterion("dwyb not like", value, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybIn(List<String> values) {
            addCriterion("dwyb in", values, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybNotIn(List<String> values) {
            addCriterion("dwyb not in", values, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybBetween(String value1, String value2) {
            addCriterion("dwyb between", value1, value2, "dwyb");
            return (Criteria) this;
        }

        public Criteria andDwybNotBetween(String value1, String value2) {
            addCriterion("dwyb not between", value1, value2, "dwyb");
            return (Criteria) this;
        }
        
			
        public Criteria andLxrIsNull() {
            addCriterion("lxr is null");
            return (Criteria) this;
        }

        public Criteria andLxrIsNotNull() {
            addCriterion("lxr is not null");
            return (Criteria) this;
        }

        public Criteria andLxrEqualTo(String value) {
            addCriterion("lxr =", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotEqualTo(String value) {
            addCriterion("lxr <>", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThan(String value) {
            addCriterion("lxr >", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThanOrEqualTo(String value) {
            addCriterion("lxr >=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThan(String value) {
            addCriterion("lxr <", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThanOrEqualTo(String value) {
            addCriterion("lxr <=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLike(String value) {
            addCriterion("lxr like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotLike(String value) {
            addCriterion("lxr not like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrIn(List<String> values) {
            addCriterion("lxr in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotIn(List<String> values) {
            addCriterion("lxr not in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrBetween(String value1, String value2) {
            addCriterion("lxr between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotBetween(String value1, String value2) {
            addCriterion("lxr not between", value1, value2, "lxr");
            return (Criteria) this;
        }
        
			
        public Criteria andGxIsNull() {
            addCriterion("gx is null");
            return (Criteria) this;
        }

        public Criteria andGxIsNotNull() {
            addCriterion("gx is not null");
            return (Criteria) this;
        }

        public Criteria andGxEqualTo(String value) {
            addCriterion("gx =", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotEqualTo(String value) {
            addCriterion("gx <>", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxGreaterThan(String value) {
            addCriterion("gx >", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxGreaterThanOrEqualTo(String value) {
            addCriterion("gx >=", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxLessThan(String value) {
            addCriterion("gx <", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxLessThanOrEqualTo(String value) {
            addCriterion("gx <=", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxLike(String value) {
            addCriterion("gx like", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotLike(String value) {
            addCriterion("gx not like", value, "gx");
            return (Criteria) this;
        }

        public Criteria andGxIn(List<String> values) {
            addCriterion("gx in", values, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotIn(List<String> values) {
            addCriterion("gx not in", values, "gx");
            return (Criteria) this;
        }

        public Criteria andGxBetween(String value1, String value2) {
            addCriterion("gx between", value1, value2, "gx");
            return (Criteria) this;
        }

        public Criteria andGxNotBetween(String value1, String value2) {
            addCriterion("gx not between", value1, value2, "gx");
            return (Criteria) this;
        }
        
			
        public Criteria andLxrdzIsNull() {
            addCriterion("lxrdz is null");
            return (Criteria) this;
        }

        public Criteria andLxrdzIsNotNull() {
            addCriterion("lxrdz is not null");
            return (Criteria) this;
        }

        public Criteria andLxrdzEqualTo(String value) {
            addCriterion("lxrdz =", value, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzNotEqualTo(String value) {
            addCriterion("lxrdz <>", value, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzGreaterThan(String value) {
            addCriterion("lxrdz >", value, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzGreaterThanOrEqualTo(String value) {
            addCriterion("lxrdz >=", value, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzLessThan(String value) {
            addCriterion("lxrdz <", value, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzLessThanOrEqualTo(String value) {
            addCriterion("lxrdz <=", value, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzLike(String value) {
            addCriterion("lxrdz like", value, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzNotLike(String value) {
            addCriterion("lxrdz not like", value, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzIn(List<String> values) {
            addCriterion("lxrdz in", values, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzNotIn(List<String> values) {
            addCriterion("lxrdz not in", values, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzBetween(String value1, String value2) {
            addCriterion("lxrdz between", value1, value2, "lxrdz");
            return (Criteria) this;
        }

        public Criteria andLxrdzNotBetween(String value1, String value2) {
            addCriterion("lxrdz not between", value1, value2, "lxrdz");
            return (Criteria) this;
        }
        
			
        public Criteria andLxrdhIsNull() {
            addCriterion("lxrdh is null");
            return (Criteria) this;
        }

        public Criteria andLxrdhIsNotNull() {
            addCriterion("lxrdh is not null");
            return (Criteria) this;
        }

        public Criteria andLxrdhEqualTo(String value) {
            addCriterion("lxrdh =", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhNotEqualTo(String value) {
            addCriterion("lxrdh <>", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhGreaterThan(String value) {
            addCriterion("lxrdh >", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhGreaterThanOrEqualTo(String value) {
            addCriterion("lxrdh >=", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhLessThan(String value) {
            addCriterion("lxrdh <", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhLessThanOrEqualTo(String value) {
            addCriterion("lxrdh <=", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhLike(String value) {
            addCriterion("lxrdh like", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhNotLike(String value) {
            addCriterion("lxrdh not like", value, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhIn(List<String> values) {
            addCriterion("lxrdh in", values, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhNotIn(List<String> values) {
            addCriterion("lxrdh not in", values, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhBetween(String value1, String value2) {
            addCriterion("lxrdh between", value1, value2, "lxrdh");
            return (Criteria) this;
        }

        public Criteria andLxrdhNotBetween(String value1, String value2) {
            addCriterion("lxrdh not between", value1, value2, "lxrdh");
            return (Criteria) this;
        }
        
			
        public Criteria andYblxIsNull() {
            addCriterion("yblx is null");
            return (Criteria) this;
        }

        public Criteria andYblxIsNotNull() {
            addCriterion("yblx is not null");
            return (Criteria) this;
        }

        public Criteria andYblxEqualTo(String value) {
            addCriterion("yblx =", value, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxNotEqualTo(String value) {
            addCriterion("yblx <>", value, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxGreaterThan(String value) {
            addCriterion("yblx >", value, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxGreaterThanOrEqualTo(String value) {
            addCriterion("yblx >=", value, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxLessThan(String value) {
            addCriterion("yblx <", value, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxLessThanOrEqualTo(String value) {
            addCriterion("yblx <=", value, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxLike(String value) {
            addCriterion("yblx like", value, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxNotLike(String value) {
            addCriterion("yblx not like", value, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxIn(List<String> values) {
            addCriterion("yblx in", values, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxNotIn(List<String> values) {
            addCriterion("yblx not in", values, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxBetween(String value1, String value2) {
            addCriterion("yblx between", value1, value2, "yblx");
            return (Criteria) this;
        }

        public Criteria andYblxNotBetween(String value1, String value2) {
            addCriterion("yblx not between", value1, value2, "yblx");
            return (Criteria) this;
        }
        
			
        public Criteria andTsrylxIsNull() {
            addCriterion("tsrylx is null");
            return (Criteria) this;
        }

        public Criteria andTsrylxIsNotNull() {
            addCriterion("tsrylx is not null");
            return (Criteria) this;
        }

        public Criteria andTsrylxEqualTo(String value) {
            addCriterion("tsrylx =", value, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxNotEqualTo(String value) {
            addCriterion("tsrylx <>", value, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxGreaterThan(String value) {
            addCriterion("tsrylx >", value, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxGreaterThanOrEqualTo(String value) {
            addCriterion("tsrylx >=", value, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxLessThan(String value) {
            addCriterion("tsrylx <", value, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxLessThanOrEqualTo(String value) {
            addCriterion("tsrylx <=", value, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxLike(String value) {
            addCriterion("tsrylx like", value, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxNotLike(String value) {
            addCriterion("tsrylx not like", value, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxIn(List<String> values) {
            addCriterion("tsrylx in", values, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxNotIn(List<String> values) {
            addCriterion("tsrylx not in", values, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxBetween(String value1, String value2) {
            addCriterion("tsrylx between", value1, value2, "tsrylx");
            return (Criteria) this;
        }

        public Criteria andTsrylxNotBetween(String value1, String value2) {
            addCriterion("tsrylx not between", value1, value2, "tsrylx");
            return (Criteria) this;
        }
        
			
        public Criteria andCbddmIsNull() {
            addCriterion("cbddm is null");
            return (Criteria) this;
        }

        public Criteria andCbddmIsNotNull() {
            addCriterion("cbddm is not null");
            return (Criteria) this;
        }

        public Criteria andCbddmEqualTo(String value) {
            addCriterion("cbddm =", value, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmNotEqualTo(String value) {
            addCriterion("cbddm <>", value, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmGreaterThan(String value) {
            addCriterion("cbddm >", value, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmGreaterThanOrEqualTo(String value) {
            addCriterion("cbddm >=", value, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmLessThan(String value) {
            addCriterion("cbddm <", value, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmLessThanOrEqualTo(String value) {
            addCriterion("cbddm <=", value, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmLike(String value) {
            addCriterion("cbddm like", value, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmNotLike(String value) {
            addCriterion("cbddm not like", value, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmIn(List<String> values) {
            addCriterion("cbddm in", values, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmNotIn(List<String> values) {
            addCriterion("cbddm not in", values, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmBetween(String value1, String value2) {
            addCriterion("cbddm between", value1, value2, "cbddm");
            return (Criteria) this;
        }

        public Criteria andCbddmNotBetween(String value1, String value2) {
            addCriterion("cbddm not between", value1, value2, "cbddm");
            return (Criteria) this;
        }
        
			
        public Criteria andXserylxIsNull() {
            addCriterion("xserylx is null");
            return (Criteria) this;
        }

        public Criteria andXserylxIsNotNull() {
            addCriterion("xserylx is not null");
            return (Criteria) this;
        }

        public Criteria andXserylxEqualTo(String value) {
            addCriterion("xserylx =", value, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxNotEqualTo(String value) {
            addCriterion("xserylx <>", value, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxGreaterThan(String value) {
            addCriterion("xserylx >", value, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxGreaterThanOrEqualTo(String value) {
            addCriterion("xserylx >=", value, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxLessThan(String value) {
            addCriterion("xserylx <", value, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxLessThanOrEqualTo(String value) {
            addCriterion("xserylx <=", value, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxLike(String value) {
            addCriterion("xserylx like", value, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxNotLike(String value) {
            addCriterion("xserylx not like", value, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxIn(List<String> values) {
            addCriterion("xserylx in", values, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxNotIn(List<String> values) {
            addCriterion("xserylx not in", values, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxBetween(String value1, String value2) {
            addCriterion("xserylx between", value1, value2, "xserylx");
            return (Criteria) this;
        }

        public Criteria andXserylxNotBetween(String value1, String value2) {
            addCriterion("xserylx not between", value1, value2, "xserylx");
            return (Criteria) this;
        }
        
			
        public Criteria andXsecstzIsNull() {
            addCriterion("xsecstz is null");
            return (Criteria) this;
        }

        public Criteria andXsecstzIsNotNull() {
            addCriterion("xsecstz is not null");
            return (Criteria) this;
        }

        public Criteria andXsecstzEqualTo(String value) {
            addCriterion("xsecstz =", value, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzNotEqualTo(String value) {
            addCriterion("xsecstz <>", value, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzGreaterThan(String value) {
            addCriterion("xsecstz >", value, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzGreaterThanOrEqualTo(String value) {
            addCriterion("xsecstz >=", value, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzLessThan(String value) {
            addCriterion("xsecstz <", value, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzLessThanOrEqualTo(String value) {
            addCriterion("xsecstz <=", value, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzLike(String value) {
            addCriterion("xsecstz like", value, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzNotLike(String value) {
            addCriterion("xsecstz not like", value, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzIn(List<String> values) {
            addCriterion("xsecstz in", values, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzNotIn(List<String> values) {
            addCriterion("xsecstz not in", values, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzBetween(String value1, String value2) {
            addCriterion("xsecstz between", value1, value2, "xsecstz");
            return (Criteria) this;
        }

        public Criteria andXsecstzNotBetween(String value1, String value2) {
            addCriterion("xsecstz not between", value1, value2, "xsecstz");
            return (Criteria) this;
        }
        
			
        public Criteria andXserytzIsNull() {
            addCriterion("xserytz is null");
            return (Criteria) this;
        }

        public Criteria andXserytzIsNotNull() {
            addCriterion("xserytz is not null");
            return (Criteria) this;
        }

        public Criteria andXserytzEqualTo(String value) {
            addCriterion("xserytz =", value, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzNotEqualTo(String value) {
            addCriterion("xserytz <>", value, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzGreaterThan(String value) {
            addCriterion("xserytz >", value, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzGreaterThanOrEqualTo(String value) {
            addCriterion("xserytz >=", value, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzLessThan(String value) {
            addCriterion("xserytz <", value, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzLessThanOrEqualTo(String value) {
            addCriterion("xserytz <=", value, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzLike(String value) {
            addCriterion("xserytz like", value, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzNotLike(String value) {
            addCriterion("xserytz not like", value, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzIn(List<String> values) {
            addCriterion("xserytz in", values, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzNotIn(List<String> values) {
            addCriterion("xserytz not in", values, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzBetween(String value1, String value2) {
            addCriterion("xserytz between", value1, value2, "xserytz");
            return (Criteria) this;
        }

        public Criteria andXserytzNotBetween(String value1, String value2) {
            addCriterion("xserytz not between", value1, value2, "xserytz");
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
        
		
		 public Criteria andLikeQuery(Patienbase record) {
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
						 if(record.getXm()!=null&&StringUtils.isNotEmpty(record.getXm().toString())) {
    			 list.add("ifnull(xm,'')");
    		 }
						 if(record.getXb()!=null&&StringUtils.isNotEmpty(record.getXb().toString())) {
    			 list.add("ifnull(xb,'')");
    		 }
						 if(record.getCsrq()!=null&&StringUtils.isNotEmpty(record.getCsrq().toString())) {
    			 list.add("ifnull(csrq,'')");
    		 }
						 if(record.getNl()!=null&&StringUtils.isNotEmpty(record.getNl().toString())) {
    			 list.add("ifnull(nl,'')");
    		 }
						 if(record.getGj()!=null&&StringUtils.isNotEmpty(record.getGj().toString())) {
    			 list.add("ifnull(gj,'')");
    		 }
						 if(record.getBzzsnl()!=null&&StringUtils.isNotEmpty(record.getBzzsnl().toString())) {
    			 list.add("ifnull(bzzsnl,'')");
    		 }
						 if(record.getMz()!=null&&StringUtils.isNotEmpty(record.getMz().toString())) {
    			 list.add("ifnull(mz,'')");
    		 }
						 if(record.getZjlb()!=null&&StringUtils.isNotEmpty(record.getZjlb().toString())) {
    			 list.add("ifnull(zjlb,'')");
    		 }
						 if(record.getZjhm()!=null&&StringUtils.isNotEmpty(record.getZjhm().toString())) {
    			 list.add("ifnull(zjhm,'')");
    		 }
						 if(record.getZy()!=null&&StringUtils.isNotEmpty(record.getZy().toString())) {
    			 list.add("ifnull(zy,'')");
    		 }
						 if(record.getXzz()!=null&&StringUtils.isNotEmpty(record.getXzz().toString())) {
    			 list.add("ifnull(xzz,'')");
    		 }
						 if(record.getDwmc()!=null&&StringUtils.isNotEmpty(record.getDwmc().toString())) {
    			 list.add("ifnull(dwmc,'')");
    		 }
						 if(record.getDwdz()!=null&&StringUtils.isNotEmpty(record.getDwdz().toString())) {
    			 list.add("ifnull(dwdz,'')");
    		 }
						 if(record.getDwdh()!=null&&StringUtils.isNotEmpty(record.getDwdh().toString())) {
    			 list.add("ifnull(dwdh,'')");
    		 }
						 if(record.getDwyb()!=null&&StringUtils.isNotEmpty(record.getDwyb().toString())) {
    			 list.add("ifnull(dwyb,'')");
    		 }
						 if(record.getLxr()!=null&&StringUtils.isNotEmpty(record.getLxr().toString())) {
    			 list.add("ifnull(lxr,'')");
    		 }
						 if(record.getGx()!=null&&StringUtils.isNotEmpty(record.getGx().toString())) {
    			 list.add("ifnull(gx,'')");
    		 }
						 if(record.getLxrdz()!=null&&StringUtils.isNotEmpty(record.getLxrdz().toString())) {
    			 list.add("ifnull(lxrdz,'')");
    		 }
						 if(record.getLxrdh()!=null&&StringUtils.isNotEmpty(record.getLxrdh().toString())) {
    			 list.add("ifnull(lxrdh,'')");
    		 }
						 if(record.getYblx()!=null&&StringUtils.isNotEmpty(record.getYblx().toString())) {
    			 list.add("ifnull(yblx,'')");
    		 }
						 if(record.getTsrylx()!=null&&StringUtils.isNotEmpty(record.getTsrylx().toString())) {
    			 list.add("ifnull(tsrylx,'')");
    		 }
						 if(record.getCbddm()!=null&&StringUtils.isNotEmpty(record.getCbddm().toString())) {
    			 list.add("ifnull(cbddm,'')");
    		 }
						 if(record.getXserylx()!=null&&StringUtils.isNotEmpty(record.getXserylx().toString())) {
    			 list.add("ifnull(xserylx,'')");
    		 }
						 if(record.getXsecstz()!=null&&StringUtils.isNotEmpty(record.getXsecstz().toString())) {
    			 list.add("ifnull(xsecstz,'')");
    		 }
						 if(record.getXserytz()!=null&&StringUtils.isNotEmpty(record.getXserytz().toString())) {
    			 list.add("ifnull(xserytz,'')");
    		 }
						 if(record.getCreatetime()!=null&&StringUtils.isNotEmpty(record.getCreatetime().toString())) {
    			 list.add("ifnull(createtime,'')");
    		 }
						 if(record.getUpdatetime()!=null&&StringUtils.isNotEmpty(record.getUpdatetime().toString())) {
    			 list.add("ifnull(updatetime,'')");
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
							 if(record.getXm()!=null&&StringUtils.isNotEmpty(record.getXm().toString())) {
        			list2.add("'%"+record.getXm()+"%'");
        		 }
							 if(record.getXb()!=null&&StringUtils.isNotEmpty(record.getXb().toString())) {
        			list2.add("'%"+record.getXb()+"%'");
        		 }
							 if(record.getCsrq()!=null&&StringUtils.isNotEmpty(record.getCsrq().toString())) {
        			list2.add("'%"+record.getCsrq()+"%'");
        		 }
							 if(record.getNl()!=null&&StringUtils.isNotEmpty(record.getNl().toString())) {
        			list2.add("'%"+record.getNl()+"%'");
        		 }
							 if(record.getGj()!=null&&StringUtils.isNotEmpty(record.getGj().toString())) {
        			list2.add("'%"+record.getGj()+"%'");
        		 }
							 if(record.getBzzsnl()!=null&&StringUtils.isNotEmpty(record.getBzzsnl().toString())) {
        			list2.add("'%"+record.getBzzsnl()+"%'");
        		 }
							 if(record.getMz()!=null&&StringUtils.isNotEmpty(record.getMz().toString())) {
        			list2.add("'%"+record.getMz()+"%'");
        		 }
							 if(record.getZjlb()!=null&&StringUtils.isNotEmpty(record.getZjlb().toString())) {
        			list2.add("'%"+record.getZjlb()+"%'");
        		 }
							 if(record.getZjhm()!=null&&StringUtils.isNotEmpty(record.getZjhm().toString())) {
        			list2.add("'%"+record.getZjhm()+"%'");
        		 }
							 if(record.getZy()!=null&&StringUtils.isNotEmpty(record.getZy().toString())) {
        			list2.add("'%"+record.getZy()+"%'");
        		 }
							 if(record.getXzz()!=null&&StringUtils.isNotEmpty(record.getXzz().toString())) {
        			list2.add("'%"+record.getXzz()+"%'");
        		 }
							 if(record.getDwmc()!=null&&StringUtils.isNotEmpty(record.getDwmc().toString())) {
        			list2.add("'%"+record.getDwmc()+"%'");
        		 }
							 if(record.getDwdz()!=null&&StringUtils.isNotEmpty(record.getDwdz().toString())) {
        			list2.add("'%"+record.getDwdz()+"%'");
        		 }
							 if(record.getDwdh()!=null&&StringUtils.isNotEmpty(record.getDwdh().toString())) {
        			list2.add("'%"+record.getDwdh()+"%'");
        		 }
							 if(record.getDwyb()!=null&&StringUtils.isNotEmpty(record.getDwyb().toString())) {
        			list2.add("'%"+record.getDwyb()+"%'");
        		 }
							 if(record.getLxr()!=null&&StringUtils.isNotEmpty(record.getLxr().toString())) {
        			list2.add("'%"+record.getLxr()+"%'");
        		 }
							 if(record.getGx()!=null&&StringUtils.isNotEmpty(record.getGx().toString())) {
        			list2.add("'%"+record.getGx()+"%'");
        		 }
							 if(record.getLxrdz()!=null&&StringUtils.isNotEmpty(record.getLxrdz().toString())) {
        			list2.add("'%"+record.getLxrdz()+"%'");
        		 }
							 if(record.getLxrdh()!=null&&StringUtils.isNotEmpty(record.getLxrdh().toString())) {
        			list2.add("'%"+record.getLxrdh()+"%'");
        		 }
							 if(record.getYblx()!=null&&StringUtils.isNotEmpty(record.getYblx().toString())) {
        			list2.add("'%"+record.getYblx()+"%'");
        		 }
							 if(record.getTsrylx()!=null&&StringUtils.isNotEmpty(record.getTsrylx().toString())) {
        			list2.add("'%"+record.getTsrylx()+"%'");
        		 }
							 if(record.getCbddm()!=null&&StringUtils.isNotEmpty(record.getCbddm().toString())) {
        			list2.add("'%"+record.getCbddm()+"%'");
        		 }
							 if(record.getXserylx()!=null&&StringUtils.isNotEmpty(record.getXserylx().toString())) {
        			list2.add("'%"+record.getXserylx()+"%'");
        		 }
							 if(record.getXsecstz()!=null&&StringUtils.isNotEmpty(record.getXsecstz().toString())) {
        			list2.add("'%"+record.getXsecstz()+"%'");
        		 }
							 if(record.getXserytz()!=null&&StringUtils.isNotEmpty(record.getXserytz().toString())) {
        			list2.add("'%"+record.getXserytz()+"%'");
        		 }
							 if(record.getCreatetime()!=null&&StringUtils.isNotEmpty(record.getCreatetime().toString())) {
        			list2.add("'%"+record.getCreatetime()+"%'");
        		 }
							 if(record.getUpdatetime()!=null&&StringUtils.isNotEmpty(record.getUpdatetime().toString())) {
        			list2.add("'%"+record.getUpdatetime()+"%'");
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