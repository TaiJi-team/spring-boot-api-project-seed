package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.project.common.StringUtils;

/**
 *  HospiDiagExample
 * @author SWJ
 * @date 2020-07-29 10:21:50
 */
public class HospiDiagExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospiDiagExample() {
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
        
			
        public Criteria andZyyllxIsNull() {
            addCriterion("zyyllx is null");
            return (Criteria) this;
        }

        public Criteria andZyyllxIsNotNull() {
            addCriterion("zyyllx is not null");
            return (Criteria) this;
        }

        public Criteria andZyyllxEqualTo(Integer value) {
            addCriterion("zyyllx =", value, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxNotEqualTo(Integer value) {
            addCriterion("zyyllx <>", value, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxGreaterThan(Integer value) {
            addCriterion("zyyllx >", value, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxGreaterThanOrEqualTo(Integer value) {
            addCriterion("zyyllx >=", value, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxLessThan(Integer value) {
            addCriterion("zyyllx <", value, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxLessThanOrEqualTo(Integer value) {
            addCriterion("zyyllx <=", value, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxLike(Integer value) {
            addCriterion("zyyllx like", value, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxNotLike(Integer value) {
            addCriterion("zyyllx not like", value, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxIn(List<Integer> values) {
            addCriterion("zyyllx in", values, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxNotIn(List<Integer> values) {
            addCriterion("zyyllx not in", values, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxBetween(Integer value1, Integer value2) {
            addCriterion("zyyllx between", value1, value2, "zyyllx");
            return (Criteria) this;
        }

        public Criteria andZyyllxNotBetween(Integer value1, Integer value2) {
            addCriterion("zyyllx not between", value1, value2, "zyyllx");
            return (Criteria) this;
        }
        
			
        public Criteria andRytjIsNull() {
            addCriterion("rytj is null");
            return (Criteria) this;
        }

        public Criteria andRytjIsNotNull() {
            addCriterion("rytj is not null");
            return (Criteria) this;
        }

        public Criteria andRytjEqualTo(Integer value) {
            addCriterion("rytj =", value, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjNotEqualTo(Integer value) {
            addCriterion("rytj <>", value, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjGreaterThan(Integer value) {
            addCriterion("rytj >", value, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjGreaterThanOrEqualTo(Integer value) {
            addCriterion("rytj >=", value, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjLessThan(Integer value) {
            addCriterion("rytj <", value, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjLessThanOrEqualTo(Integer value) {
            addCriterion("rytj <=", value, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjLike(Integer value) {
            addCriterion("rytj like", value, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjNotLike(Integer value) {
            addCriterion("rytj not like", value, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjIn(List<Integer> values) {
            addCriterion("rytj in", values, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjNotIn(List<Integer> values) {
            addCriterion("rytj not in", values, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjBetween(Integer value1, Integer value2) {
            addCriterion("rytj between", value1, value2, "rytj");
            return (Criteria) this;
        }

        public Criteria andRytjNotBetween(Integer value1, Integer value2) {
            addCriterion("rytj not between", value1, value2, "rytj");
            return (Criteria) this;
        }
        
			
        public Criteria andZllbIsNull() {
            addCriterion("zllb is null");
            return (Criteria) this;
        }

        public Criteria andZllbIsNotNull() {
            addCriterion("zllb is not null");
            return (Criteria) this;
        }

        public Criteria andZllbEqualTo(Integer value) {
            addCriterion("zllb =", value, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbNotEqualTo(Integer value) {
            addCriterion("zllb <>", value, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbGreaterThan(Integer value) {
            addCriterion("zllb >", value, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbGreaterThanOrEqualTo(Integer value) {
            addCriterion("zllb >=", value, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbLessThan(Integer value) {
            addCriterion("zllb <", value, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbLessThanOrEqualTo(Integer value) {
            addCriterion("zllb <=", value, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbLike(Integer value) {
            addCriterion("zllb like", value, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbNotLike(Integer value) {
            addCriterion("zllb not like", value, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbIn(List<Integer> values) {
            addCriterion("zllb in", values, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbNotIn(List<Integer> values) {
            addCriterion("zllb not in", values, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbBetween(Integer value1, Integer value2) {
            addCriterion("zllb between", value1, value2, "zllb");
            return (Criteria) this;
        }

        public Criteria andZllbNotBetween(Integer value1, Integer value2) {
            addCriterion("zllb not between", value1, value2, "zllb");
            return (Criteria) this;
        }
        
			
        public Criteria andRysjIsNull() {
            addCriterion("rysj is null");
            return (Criteria) this;
        }

        public Criteria andRysjIsNotNull() {
            addCriterion("rysj is not null");
            return (Criteria) this;
        }

        public Criteria andRysjEqualTo(Date value) {
            addCriterion("rysj =", value, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjNotEqualTo(Date value) {
            addCriterion("rysj <>", value, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjGreaterThan(Date value) {
            addCriterion("rysj >", value, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjGreaterThanOrEqualTo(Date value) {
            addCriterion("rysj >=", value, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjLessThan(Date value) {
            addCriterion("rysj <", value, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjLessThanOrEqualTo(Date value) {
            addCriterion("rysj <=", value, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjLike(Date value) {
            addCriterion("rysj like", value, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjNotLike(Date value) {
            addCriterion("rysj not like", value, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjIn(List<Date> values) {
            addCriterion("rysj in", values, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjNotIn(List<Date> values) {
            addCriterion("rysj not in", values, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjBetween(Date value1, Date value2) {
            addCriterion("rysj between", value1, value2, "rysj");
            return (Criteria) this;
        }

        public Criteria andRysjNotBetween(Date value1, Date value2) {
            addCriterion("rysj not between", value1, value2, "rysj");
            return (Criteria) this;
        }
        
			
        public Criteria andRykbIsNull() {
            addCriterion("rykb is null");
            return (Criteria) this;
        }

        public Criteria andRykbIsNotNull() {
            addCriterion("rykb is not null");
            return (Criteria) this;
        }

        public Criteria andRykbEqualTo(Integer value) {
            addCriterion("rykb =", value, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbNotEqualTo(Integer value) {
            addCriterion("rykb <>", value, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbGreaterThan(Integer value) {
            addCriterion("rykb >", value, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbGreaterThanOrEqualTo(Integer value) {
            addCriterion("rykb >=", value, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbLessThan(Integer value) {
            addCriterion("rykb <", value, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbLessThanOrEqualTo(Integer value) {
            addCriterion("rykb <=", value, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbLike(Integer value) {
            addCriterion("rykb like", value, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbNotLike(Integer value) {
            addCriterion("rykb not like", value, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbIn(List<Integer> values) {
            addCriterion("rykb in", values, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbNotIn(List<Integer> values) {
            addCriterion("rykb not in", values, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbBetween(Integer value1, Integer value2) {
            addCriterion("rykb between", value1, value2, "rykb");
            return (Criteria) this;
        }

        public Criteria andRykbNotBetween(Integer value1, Integer value2) {
            addCriterion("rykb not between", value1, value2, "rykb");
            return (Criteria) this;
        }
        
			
        public Criteria andZkkbIsNull() {
            addCriterion("zkkb is null");
            return (Criteria) this;
        }

        public Criteria andZkkbIsNotNull() {
            addCriterion("zkkb is not null");
            return (Criteria) this;
        }

        public Criteria andZkkbEqualTo(Integer value) {
            addCriterion("zkkb =", value, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbNotEqualTo(Integer value) {
            addCriterion("zkkb <>", value, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbGreaterThan(Integer value) {
            addCriterion("zkkb >", value, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbGreaterThanOrEqualTo(Integer value) {
            addCriterion("zkkb >=", value, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbLessThan(Integer value) {
            addCriterion("zkkb <", value, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbLessThanOrEqualTo(Integer value) {
            addCriterion("zkkb <=", value, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbLike(Integer value) {
            addCriterion("zkkb like", value, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbNotLike(Integer value) {
            addCriterion("zkkb not like", value, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbIn(List<Integer> values) {
            addCriterion("zkkb in", values, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbNotIn(List<Integer> values) {
            addCriterion("zkkb not in", values, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbBetween(Integer value1, Integer value2) {
            addCriterion("zkkb between", value1, value2, "zkkb");
            return (Criteria) this;
        }

        public Criteria andZkkbNotBetween(Integer value1, Integer value2) {
            addCriterion("zkkb not between", value1, value2, "zkkb");
            return (Criteria) this;
        }
        
			
        public Criteria andCysjIsNull() {
            addCriterion("cysj is null");
            return (Criteria) this;
        }

        public Criteria andCysjIsNotNull() {
            addCriterion("cysj is not null");
            return (Criteria) this;
        }

        public Criteria andCysjEqualTo(Date value) {
            addCriterion("cysj =", value, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjNotEqualTo(Date value) {
            addCriterion("cysj <>", value, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjGreaterThan(Date value) {
            addCriterion("cysj >", value, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjGreaterThanOrEqualTo(Date value) {
            addCriterion("cysj >=", value, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjLessThan(Date value) {
            addCriterion("cysj <", value, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjLessThanOrEqualTo(Date value) {
            addCriterion("cysj <=", value, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjLike(Date value) {
            addCriterion("cysj like", value, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjNotLike(Date value) {
            addCriterion("cysj not like", value, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjIn(List<Date> values) {
            addCriterion("cysj in", values, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjNotIn(List<Date> values) {
            addCriterion("cysj not in", values, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjBetween(Date value1, Date value2) {
            addCriterion("cysj between", value1, value2, "cysj");
            return (Criteria) this;
        }

        public Criteria andCysjNotBetween(Date value1, Date value2) {
            addCriterion("cysj not between", value1, value2, "cysj");
            return (Criteria) this;
        }
        
			
        public Criteria andCykbIsNull() {
            addCriterion("cykb is null");
            return (Criteria) this;
        }

        public Criteria andCykbIsNotNull() {
            addCriterion("cykb is not null");
            return (Criteria) this;
        }

        public Criteria andCykbEqualTo(Integer value) {
            addCriterion("cykb =", value, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbNotEqualTo(Integer value) {
            addCriterion("cykb <>", value, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbGreaterThan(Integer value) {
            addCriterion("cykb >", value, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbGreaterThanOrEqualTo(Integer value) {
            addCriterion("cykb >=", value, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbLessThan(Integer value) {
            addCriterion("cykb <", value, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbLessThanOrEqualTo(Integer value) {
            addCriterion("cykb <=", value, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbLike(Integer value) {
            addCriterion("cykb like", value, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbNotLike(Integer value) {
            addCriterion("cykb not like", value, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbIn(List<Integer> values) {
            addCriterion("cykb in", values, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbNotIn(List<Integer> values) {
            addCriterion("cykb not in", values, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbBetween(Integer value1, Integer value2) {
            addCriterion("cykb between", value1, value2, "cykb");
            return (Criteria) this;
        }

        public Criteria andCykbNotBetween(Integer value1, Integer value2) {
            addCriterion("cykb not between", value1, value2, "cykb");
            return (Criteria) this;
        }
        
			
        public Criteria andSjzytsIsNull() {
            addCriterion("sjzyts is null");
            return (Criteria) this;
        }

        public Criteria andSjzytsIsNotNull() {
            addCriterion("sjzyts is not null");
            return (Criteria) this;
        }

        public Criteria andSjzytsEqualTo(Integer value) {
            addCriterion("sjzyts =", value, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsNotEqualTo(Integer value) {
            addCriterion("sjzyts <>", value, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsGreaterThan(Integer value) {
            addCriterion("sjzyts >", value, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsGreaterThanOrEqualTo(Integer value) {
            addCriterion("sjzyts >=", value, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsLessThan(Integer value) {
            addCriterion("sjzyts <", value, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsLessThanOrEqualTo(Integer value) {
            addCriterion("sjzyts <=", value, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsLike(Integer value) {
            addCriterion("sjzyts like", value, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsNotLike(Integer value) {
            addCriterion("sjzyts not like", value, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsIn(List<Integer> values) {
            addCriterion("sjzyts in", values, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsNotIn(List<Integer> values) {
            addCriterion("sjzyts not in", values, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsBetween(Integer value1, Integer value2) {
            addCriterion("sjzyts between", value1, value2, "sjzyts");
            return (Criteria) this;
        }

        public Criteria andSjzytsNotBetween(Integer value1, Integer value2) {
            addCriterion("sjzyts not between", value1, value2, "sjzyts");
            return (Criteria) this;
        }
        
		
		 public Criteria andLikeQuery(HospiDiag record) {
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
						 if(record.getZyyllx()!=null&&StringUtils.isNotEmpty(record.getZyyllx().toString())) {
    			 list.add("ifnull(zyyllx,'')");
    		 }
						 if(record.getRytj()!=null&&StringUtils.isNotEmpty(record.getRytj().toString())) {
    			 list.add("ifnull(rytj,'')");
    		 }
						 if(record.getZllb()!=null&&StringUtils.isNotEmpty(record.getZllb().toString())) {
    			 list.add("ifnull(zllb,'')");
    		 }
						 if(record.getRysj()!=null&&StringUtils.isNotEmpty(record.getRysj().toString())) {
    			 list.add("ifnull(rysj,'')");
    		 }
						 if(record.getRykb()!=null&&StringUtils.isNotEmpty(record.getRykb().toString())) {
    			 list.add("ifnull(rykb,'')");
    		 }
						 if(record.getZkkb()!=null&&StringUtils.isNotEmpty(record.getZkkb().toString())) {
    			 list.add("ifnull(zkkb,'')");
    		 }
						 if(record.getCysj()!=null&&StringUtils.isNotEmpty(record.getCysj().toString())) {
    			 list.add("ifnull(cysj,'')");
    		 }
						 if(record.getCykb()!=null&&StringUtils.isNotEmpty(record.getCykb().toString())) {
    			 list.add("ifnull(cykb,'')");
    		 }
						 if(record.getSjzyts()!=null&&StringUtils.isNotEmpty(record.getSjzyts().toString())) {
    			 list.add("ifnull(sjzyts,'')");
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
							 if(record.getZyyllx()!=null&&StringUtils.isNotEmpty(record.getZyyllx().toString())) {
        			list2.add("'%"+record.getZyyllx()+"%'");
        		 }
							 if(record.getRytj()!=null&&StringUtils.isNotEmpty(record.getRytj().toString())) {
        			list2.add("'%"+record.getRytj()+"%'");
        		 }
							 if(record.getZllb()!=null&&StringUtils.isNotEmpty(record.getZllb().toString())) {
        			list2.add("'%"+record.getZllb()+"%'");
        		 }
							 if(record.getRysj()!=null&&StringUtils.isNotEmpty(record.getRysj().toString())) {
        			list2.add("'%"+record.getRysj()+"%'");
        		 }
							 if(record.getRykb()!=null&&StringUtils.isNotEmpty(record.getRykb().toString())) {
        			list2.add("'%"+record.getRykb()+"%'");
        		 }
							 if(record.getZkkb()!=null&&StringUtils.isNotEmpty(record.getZkkb().toString())) {
        			list2.add("'%"+record.getZkkb()+"%'");
        		 }
							 if(record.getCysj()!=null&&StringUtils.isNotEmpty(record.getCysj().toString())) {
        			list2.add("'%"+record.getCysj()+"%'");
        		 }
							 if(record.getCykb()!=null&&StringUtils.isNotEmpty(record.getCykb().toString())) {
        			list2.add("'%"+record.getCykb()+"%'");
        		 }
							 if(record.getSjzyts()!=null&&StringUtils.isNotEmpty(record.getSjzyts().toString())) {
        			list2.add("'%"+record.getSjzyts()+"%'");
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