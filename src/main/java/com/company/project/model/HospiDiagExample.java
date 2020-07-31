package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.project.common.StringUtils;

/**
 *  HospiDiagExample
 * @author SWJ
 * @date 2020-07-30 16:46:16
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
        
			
        public Criteria andZddmjsIsNull() {
            addCriterion("zddmjs is null");
            return (Criteria) this;
        }

        public Criteria andZddmjsIsNotNull() {
            addCriterion("zddmjs is not null");
            return (Criteria) this;
        }

        public Criteria andZddmjsEqualTo(String value) {
            addCriterion("zddmjs =", value, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsNotEqualTo(String value) {
            addCriterion("zddmjs <>", value, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsGreaterThan(String value) {
            addCriterion("zddmjs >", value, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsGreaterThanOrEqualTo(String value) {
            addCriterion("zddmjs >=", value, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsLessThan(String value) {
            addCriterion("zddmjs <", value, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsLessThanOrEqualTo(String value) {
            addCriterion("zddmjs <=", value, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsLike(String value) {
            addCriterion("zddmjs like", value, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsNotLike(String value) {
            addCriterion("zddmjs not like", value, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsIn(List<String> values) {
            addCriterion("zddmjs in", values, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsNotIn(List<String> values) {
            addCriterion("zddmjs not in", values, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsBetween(String value1, String value2) {
            addCriterion("zddmjs between", value1, value2, "zddmjs");
            return (Criteria) this;
        }

        public Criteria andZddmjsNotBetween(String value1, String value2) {
            addCriterion("zddmjs not between", value1, value2, "zddmjs");
            return (Criteria) this;
        }
        
			
        public Criteria andSsczjsIsNull() {
            addCriterion("ssczjs is null");
            return (Criteria) this;
        }

        public Criteria andSsczjsIsNotNull() {
            addCriterion("ssczjs is not null");
            return (Criteria) this;
        }

        public Criteria andSsczjsEqualTo(String value) {
            addCriterion("ssczjs =", value, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsNotEqualTo(String value) {
            addCriterion("ssczjs <>", value, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsGreaterThan(String value) {
            addCriterion("ssczjs >", value, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsGreaterThanOrEqualTo(String value) {
            addCriterion("ssczjs >=", value, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsLessThan(String value) {
            addCriterion("ssczjs <", value, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsLessThanOrEqualTo(String value) {
            addCriterion("ssczjs <=", value, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsLike(String value) {
            addCriterion("ssczjs like", value, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsNotLike(String value) {
            addCriterion("ssczjs not like", value, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsIn(List<String> values) {
            addCriterion("ssczjs in", values, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsNotIn(List<String> values) {
            addCriterion("ssczjs not in", values, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsBetween(String value1, String value2) {
            addCriterion("ssczjs between", value1, value2, "ssczjs");
            return (Criteria) this;
        }

        public Criteria andSsczjsNotBetween(String value1, String value2) {
            addCriterion("ssczjs not between", value1, value2, "ssczjs");
            return (Criteria) this;
        }
        
			
        public Criteria andHxjsysjIsNull() {
            addCriterion("hxjsysj is null");
            return (Criteria) this;
        }

        public Criteria andHxjsysjIsNotNull() {
            addCriterion("hxjsysj is not null");
            return (Criteria) this;
        }

        public Criteria andHxjsysjEqualTo(String value) {
            addCriterion("hxjsysj =", value, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjNotEqualTo(String value) {
            addCriterion("hxjsysj <>", value, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjGreaterThan(String value) {
            addCriterion("hxjsysj >", value, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjGreaterThanOrEqualTo(String value) {
            addCriterion("hxjsysj >=", value, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjLessThan(String value) {
            addCriterion("hxjsysj <", value, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjLessThanOrEqualTo(String value) {
            addCriterion("hxjsysj <=", value, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjLike(String value) {
            addCriterion("hxjsysj like", value, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjNotLike(String value) {
            addCriterion("hxjsysj not like", value, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjIn(List<String> values) {
            addCriterion("hxjsysj in", values, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjNotIn(List<String> values) {
            addCriterion("hxjsysj not in", values, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjBetween(String value1, String value2) {
            addCriterion("hxjsysj between", value1, value2, "hxjsysj");
            return (Criteria) this;
        }

        public Criteria andHxjsysjNotBetween(String value1, String value2) {
            addCriterion("hxjsysj not between", value1, value2, "hxjsysj");
            return (Criteria) this;
        }
        
			
        public Criteria andSxlIsNull() {
            addCriterion("sxl is null");
            return (Criteria) this;
        }

        public Criteria andSxlIsNotNull() {
            addCriterion("sxl is not null");
            return (Criteria) this;
        }

        public Criteria andSxlEqualTo(String value) {
            addCriterion("sxl =", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlNotEqualTo(String value) {
            addCriterion("sxl <>", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlGreaterThan(String value) {
            addCriterion("sxl >", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlGreaterThanOrEqualTo(String value) {
            addCriterion("sxl >=", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlLessThan(String value) {
            addCriterion("sxl <", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlLessThanOrEqualTo(String value) {
            addCriterion("sxl <=", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlLike(String value) {
            addCriterion("sxl like", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlNotLike(String value) {
            addCriterion("sxl not like", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlIn(List<String> values) {
            addCriterion("sxl in", values, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlNotIn(List<String> values) {
            addCriterion("sxl not in", values, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlBetween(String value1, String value2) {
            addCriterion("sxl between", value1, value2, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlNotBetween(String value1, String value2) {
            addCriterion("sxl not between", value1, value2, "sxl");
            return (Criteria) this;
        }
        
			
        public Criteria andJldwIsNull() {
            addCriterion("jldw is null");
            return (Criteria) this;
        }

        public Criteria andJldwIsNotNull() {
            addCriterion("jldw is not null");
            return (Criteria) this;
        }

        public Criteria andJldwEqualTo(String value) {
            addCriterion("jldw =", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwNotEqualTo(String value) {
            addCriterion("jldw <>", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwGreaterThan(String value) {
            addCriterion("jldw >", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwGreaterThanOrEqualTo(String value) {
            addCriterion("jldw >=", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwLessThan(String value) {
            addCriterion("jldw <", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwLessThanOrEqualTo(String value) {
            addCriterion("jldw <=", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwLike(String value) {
            addCriterion("jldw like", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwNotLike(String value) {
            addCriterion("jldw not like", value, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwIn(List<String> values) {
            addCriterion("jldw in", values, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwNotIn(List<String> values) {
            addCriterion("jldw not in", values, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwBetween(String value1, String value2) {
            addCriterion("jldw between", value1, value2, "jldw");
            return (Criteria) this;
        }

        public Criteria andJldwNotBetween(String value1, String value2) {
            addCriterion("jldw not between", value1, value2, "jldw");
            return (Criteria) this;
        }
        
			
        public Criteria andTjhltsIsNull() {
            addCriterion("tjhlts is null");
            return (Criteria) this;
        }

        public Criteria andTjhltsIsNotNull() {
            addCriterion("tjhlts is not null");
            return (Criteria) this;
        }

        public Criteria andTjhltsEqualTo(String value) {
            addCriterion("tjhlts =", value, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsNotEqualTo(String value) {
            addCriterion("tjhlts <>", value, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsGreaterThan(String value) {
            addCriterion("tjhlts >", value, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsGreaterThanOrEqualTo(String value) {
            addCriterion("tjhlts >=", value, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsLessThan(String value) {
            addCriterion("tjhlts <", value, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsLessThanOrEqualTo(String value) {
            addCriterion("tjhlts <=", value, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsLike(String value) {
            addCriterion("tjhlts like", value, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsNotLike(String value) {
            addCriterion("tjhlts not like", value, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsIn(List<String> values) {
            addCriterion("tjhlts in", values, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsNotIn(List<String> values) {
            addCriterion("tjhlts not in", values, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsBetween(String value1, String value2) {
            addCriterion("tjhlts between", value1, value2, "tjhlts");
            return (Criteria) this;
        }

        public Criteria andTjhltsNotBetween(String value1, String value2) {
            addCriterion("tjhlts not between", value1, value2, "tjhlts");
            return (Criteria) this;
        }
        
			
        public Criteria andYjhltsIsNull() {
            addCriterion("yjhlts is null");
            return (Criteria) this;
        }

        public Criteria andYjhltsIsNotNull() {
            addCriterion("yjhlts is not null");
            return (Criteria) this;
        }

        public Criteria andYjhltsEqualTo(String value) {
            addCriterion("yjhlts =", value, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsNotEqualTo(String value) {
            addCriterion("yjhlts <>", value, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsGreaterThan(String value) {
            addCriterion("yjhlts >", value, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsGreaterThanOrEqualTo(String value) {
            addCriterion("yjhlts >=", value, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsLessThan(String value) {
            addCriterion("yjhlts <", value, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsLessThanOrEqualTo(String value) {
            addCriterion("yjhlts <=", value, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsLike(String value) {
            addCriterion("yjhlts like", value, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsNotLike(String value) {
            addCriterion("yjhlts not like", value, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsIn(List<String> values) {
            addCriterion("yjhlts in", values, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsNotIn(List<String> values) {
            addCriterion("yjhlts not in", values, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsBetween(String value1, String value2) {
            addCriterion("yjhlts between", value1, value2, "yjhlts");
            return (Criteria) this;
        }

        public Criteria andYjhltsNotBetween(String value1, String value2) {
            addCriterion("yjhlts not between", value1, value2, "yjhlts");
            return (Criteria) this;
        }
        
			
        public Criteria andEjhltsIsNull() {
            addCriterion("ejhlts is null");
            return (Criteria) this;
        }

        public Criteria andEjhltsIsNotNull() {
            addCriterion("ejhlts is not null");
            return (Criteria) this;
        }

        public Criteria andEjhltsEqualTo(String value) {
            addCriterion("ejhlts =", value, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsNotEqualTo(String value) {
            addCriterion("ejhlts <>", value, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsGreaterThan(String value) {
            addCriterion("ejhlts >", value, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsGreaterThanOrEqualTo(String value) {
            addCriterion("ejhlts >=", value, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsLessThan(String value) {
            addCriterion("ejhlts <", value, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsLessThanOrEqualTo(String value) {
            addCriterion("ejhlts <=", value, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsLike(String value) {
            addCriterion("ejhlts like", value, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsNotLike(String value) {
            addCriterion("ejhlts not like", value, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsIn(List<String> values) {
            addCriterion("ejhlts in", values, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsNotIn(List<String> values) {
            addCriterion("ejhlts not in", values, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsBetween(String value1, String value2) {
            addCriterion("ejhlts between", value1, value2, "ejhlts");
            return (Criteria) this;
        }

        public Criteria andEjhltsNotBetween(String value1, String value2) {
            addCriterion("ejhlts not between", value1, value2, "ejhlts");
            return (Criteria) this;
        }
        
			
        public Criteria andSjhltsIsNull() {
            addCriterion("sjhlts is null");
            return (Criteria) this;
        }

        public Criteria andSjhltsIsNotNull() {
            addCriterion("sjhlts is not null");
            return (Criteria) this;
        }

        public Criteria andSjhltsEqualTo(String value) {
            addCriterion("sjhlts =", value, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsNotEqualTo(String value) {
            addCriterion("sjhlts <>", value, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsGreaterThan(String value) {
            addCriterion("sjhlts >", value, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsGreaterThanOrEqualTo(String value) {
            addCriterion("sjhlts >=", value, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsLessThan(String value) {
            addCriterion("sjhlts <", value, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsLessThanOrEqualTo(String value) {
            addCriterion("sjhlts <=", value, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsLike(String value) {
            addCriterion("sjhlts like", value, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsNotLike(String value) {
            addCriterion("sjhlts not like", value, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsIn(List<String> values) {
            addCriterion("sjhlts in", values, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsNotIn(List<String> values) {
            addCriterion("sjhlts not in", values, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsBetween(String value1, String value2) {
            addCriterion("sjhlts between", value1, value2, "sjhlts");
            return (Criteria) this;
        }

        public Criteria andSjhltsNotBetween(String value1, String value2) {
            addCriterion("sjhlts not between", value1, value2, "sjhlts");
            return (Criteria) this;
        }
        
			
        public Criteria andLyfsIsNull() {
            addCriterion("lyfs is null");
            return (Criteria) this;
        }

        public Criteria andLyfsIsNotNull() {
            addCriterion("lyfs is not null");
            return (Criteria) this;
        }

        public Criteria andLyfsEqualTo(String value) {
            addCriterion("lyfs =", value, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsNotEqualTo(String value) {
            addCriterion("lyfs <>", value, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsGreaterThan(String value) {
            addCriterion("lyfs >", value, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsGreaterThanOrEqualTo(String value) {
            addCriterion("lyfs >=", value, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsLessThan(String value) {
            addCriterion("lyfs <", value, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsLessThanOrEqualTo(String value) {
            addCriterion("lyfs <=", value, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsLike(String value) {
            addCriterion("lyfs like", value, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsNotLike(String value) {
            addCriterion("lyfs not like", value, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsIn(List<String> values) {
            addCriterion("lyfs in", values, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsNotIn(List<String> values) {
            addCriterion("lyfs not in", values, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsBetween(String value1, String value2) {
            addCriterion("lyfs between", value1, value2, "lyfs");
            return (Criteria) this;
        }

        public Criteria andLyfsNotBetween(String value1, String value2) {
            addCriterion("lyfs not between", value1, value2, "lyfs");
            return (Criteria) this;
        }
        
			
        public Criteria andSfzzyIsNull() {
            addCriterion("sfzzy is null");
            return (Criteria) this;
        }

        public Criteria andSfzzyIsNotNull() {
            addCriterion("sfzzy is not null");
            return (Criteria) this;
        }

        public Criteria andSfzzyEqualTo(String value) {
            addCriterion("sfzzy =", value, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyNotEqualTo(String value) {
            addCriterion("sfzzy <>", value, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyGreaterThan(String value) {
            addCriterion("sfzzy >", value, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyGreaterThanOrEqualTo(String value) {
            addCriterion("sfzzy >=", value, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyLessThan(String value) {
            addCriterion("sfzzy <", value, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyLessThanOrEqualTo(String value) {
            addCriterion("sfzzy <=", value, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyLike(String value) {
            addCriterion("sfzzy like", value, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyNotLike(String value) {
            addCriterion("sfzzy not like", value, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyIn(List<String> values) {
            addCriterion("sfzzy in", values, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyNotIn(List<String> values) {
            addCriterion("sfzzy not in", values, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyBetween(String value1, String value2) {
            addCriterion("sfzzy between", value1, value2, "sfzzy");
            return (Criteria) this;
        }

        public Criteria andSfzzyNotBetween(String value1, String value2) {
            addCriterion("sfzzy not between", value1, value2, "sfzzy");
            return (Criteria) this;
        }
        
			
        public Criteria andZysmcIsNull() {
            addCriterion("zysmc is null");
            return (Criteria) this;
        }

        public Criteria andZysmcIsNotNull() {
            addCriterion("zysmc is not null");
            return (Criteria) this;
        }

        public Criteria andZysmcEqualTo(String value) {
            addCriterion("zysmc =", value, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcNotEqualTo(String value) {
            addCriterion("zysmc <>", value, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcGreaterThan(String value) {
            addCriterion("zysmc >", value, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcGreaterThanOrEqualTo(String value) {
            addCriterion("zysmc >=", value, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcLessThan(String value) {
            addCriterion("zysmc <", value, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcLessThanOrEqualTo(String value) {
            addCriterion("zysmc <=", value, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcLike(String value) {
            addCriterion("zysmc like", value, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcNotLike(String value) {
            addCriterion("zysmc not like", value, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcIn(List<String> values) {
            addCriterion("zysmc in", values, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcNotIn(List<String> values) {
            addCriterion("zysmc not in", values, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcBetween(String value1, String value2) {
            addCriterion("zysmc between", value1, value2, "zysmc");
            return (Criteria) this;
        }

        public Criteria andZysmcNotBetween(String value1, String value2) {
            addCriterion("zysmc not between", value1, value2, "zysmc");
            return (Criteria) this;
        }
        
			
        public Criteria andZzysdmIsNull() {
            addCriterion("zzysdm is null");
            return (Criteria) this;
        }

        public Criteria andZzysdmIsNotNull() {
            addCriterion("zzysdm is not null");
            return (Criteria) this;
        }

        public Criteria andZzysdmEqualTo(String value) {
            addCriterion("zzysdm =", value, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmNotEqualTo(String value) {
            addCriterion("zzysdm <>", value, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmGreaterThan(String value) {
            addCriterion("zzysdm >", value, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmGreaterThanOrEqualTo(String value) {
            addCriterion("zzysdm >=", value, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmLessThan(String value) {
            addCriterion("zzysdm <", value, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmLessThanOrEqualTo(String value) {
            addCriterion("zzysdm <=", value, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmLike(String value) {
            addCriterion("zzysdm like", value, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmNotLike(String value) {
            addCriterion("zzysdm not like", value, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmIn(List<String> values) {
            addCriterion("zzysdm in", values, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmNotIn(List<String> values) {
            addCriterion("zzysdm not in", values, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmBetween(String value1, String value2) {
            addCriterion("zzysdm between", value1, value2, "zzysdm");
            return (Criteria) this;
        }

        public Criteria andZzysdmNotBetween(String value1, String value2) {
            addCriterion("zzysdm not between", value1, value2, "zzysdm");
            return (Criteria) this;
        }
        
			
        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(Date value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(Date value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
        
			
        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(Date value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(Date value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
        
			
        public Criteria andSxbzIsNull() {
            addCriterion("sxbz is null");
            return (Criteria) this;
        }

        public Criteria andSxbzIsNotNull() {
            addCriterion("sxbz is not null");
            return (Criteria) this;
        }

        public Criteria andSxbzEqualTo(String value) {
            addCriterion("sxbz =", value, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzNotEqualTo(String value) {
            addCriterion("sxbz <>", value, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzGreaterThan(String value) {
            addCriterion("sxbz >", value, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzGreaterThanOrEqualTo(String value) {
            addCriterion("sxbz >=", value, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzLessThan(String value) {
            addCriterion("sxbz <", value, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzLessThanOrEqualTo(String value) {
            addCriterion("sxbz <=", value, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzLike(String value) {
            addCriterion("sxbz like", value, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzNotLike(String value) {
            addCriterion("sxbz not like", value, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzIn(List<String> values) {
            addCriterion("sxbz in", values, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzNotIn(List<String> values) {
            addCriterion("sxbz not in", values, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzBetween(String value1, String value2) {
            addCriterion("sxbz between", value1, value2, "sxbz");
            return (Criteria) this;
        }

        public Criteria andSxbzNotBetween(String value1, String value2) {
            addCriterion("sxbz not between", value1, value2, "sxbz");
            return (Criteria) this;
        }
        
			
        public Criteria andCyxyzyIsNull() {
            addCriterion("cyxyzy is null");
            return (Criteria) this;
        }

        public Criteria andCyxyzyIsNotNull() {
            addCriterion("cyxyzy is not null");
            return (Criteria) this;
        }

        public Criteria andCyxyzyEqualTo(String value) {
            addCriterion("cyxyzy =", value, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyNotEqualTo(String value) {
            addCriterion("cyxyzy <>", value, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyGreaterThan(String value) {
            addCriterion("cyxyzy >", value, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyGreaterThanOrEqualTo(String value) {
            addCriterion("cyxyzy >=", value, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyLessThan(String value) {
            addCriterion("cyxyzy <", value, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyLessThanOrEqualTo(String value) {
            addCriterion("cyxyzy <=", value, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyLike(String value) {
            addCriterion("cyxyzy like", value, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyNotLike(String value) {
            addCriterion("cyxyzy not like", value, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyIn(List<String> values) {
            addCriterion("cyxyzy in", values, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyNotIn(List<String> values) {
            addCriterion("cyxyzy not in", values, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyBetween(String value1, String value2) {
            addCriterion("cyxyzy between", value1, value2, "cyxyzy");
            return (Criteria) this;
        }

        public Criteria andCyxyzyNotBetween(String value1, String value2) {
            addCriterion("cyxyzy not between", value1, value2, "cyxyzy");
            return (Criteria) this;
        }
        
			
        public Criteria andCyzyzbIsNull() {
            addCriterion("cyzyzb is null");
            return (Criteria) this;
        }

        public Criteria andCyzyzbIsNotNull() {
            addCriterion("cyzyzb is not null");
            return (Criteria) this;
        }

        public Criteria andCyzyzbEqualTo(String value) {
            addCriterion("cyzyzb =", value, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbNotEqualTo(String value) {
            addCriterion("cyzyzb <>", value, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbGreaterThan(String value) {
            addCriterion("cyzyzb >", value, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbGreaterThanOrEqualTo(String value) {
            addCriterion("cyzyzb >=", value, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbLessThan(String value) {
            addCriterion("cyzyzb <", value, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbLessThanOrEqualTo(String value) {
            addCriterion("cyzyzb <=", value, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbLike(String value) {
            addCriterion("cyzyzb like", value, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbNotLike(String value) {
            addCriterion("cyzyzb not like", value, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbIn(List<String> values) {
            addCriterion("cyzyzb in", values, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbNotIn(List<String> values) {
            addCriterion("cyzyzb not in", values, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbBetween(String value1, String value2) {
            addCriterion("cyzyzb between", value1, value2, "cyzyzb");
            return (Criteria) this;
        }

        public Criteria andCyzyzbNotBetween(String value1, String value2) {
            addCriterion("cyzyzb not between", value1, value2, "cyzyzb");
            return (Criteria) this;
        }
        
			
        public Criteria andSjczzyIsNull() {
            addCriterion("sjczzy is null");
            return (Criteria) this;
        }

        public Criteria andSjczzyIsNotNull() {
            addCriterion("sjczzy is not null");
            return (Criteria) this;
        }

        public Criteria andSjczzyEqualTo(String value) {
            addCriterion("sjczzy =", value, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyNotEqualTo(String value) {
            addCriterion("sjczzy <>", value, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyGreaterThan(String value) {
            addCriterion("sjczzy >", value, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyGreaterThanOrEqualTo(String value) {
            addCriterion("sjczzy >=", value, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyLessThan(String value) {
            addCriterion("sjczzy <", value, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyLessThanOrEqualTo(String value) {
            addCriterion("sjczzy <=", value, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyLike(String value) {
            addCriterion("sjczzy like", value, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyNotLike(String value) {
            addCriterion("sjczzy not like", value, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyIn(List<String> values) {
            addCriterion("sjczzy in", values, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyNotIn(List<String> values) {
            addCriterion("sjczzy not in", values, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyBetween(String value1, String value2) {
            addCriterion("sjczzy between", value1, value2, "sjczzy");
            return (Criteria) this;
        }

        public Criteria andSjczzyNotBetween(String value1, String value2) {
            addCriterion("sjczzy not between", value1, value2, "sjczzy");
            return (Criteria) this;
        }
        
			
        public Criteria andLnsshmsjIsNull() {
            addCriterion("lnsshmsj is null");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjIsNotNull() {
            addCriterion("lnsshmsj is not null");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjEqualTo(String value) {
            addCriterion("lnsshmsj =", value, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjNotEqualTo(String value) {
            addCriterion("lnsshmsj <>", value, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjGreaterThan(String value) {
            addCriterion("lnsshmsj >", value, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjGreaterThanOrEqualTo(String value) {
            addCriterion("lnsshmsj >=", value, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjLessThan(String value) {
            addCriterion("lnsshmsj <", value, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjLessThanOrEqualTo(String value) {
            addCriterion("lnsshmsj <=", value, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjLike(String value) {
            addCriterion("lnsshmsj like", value, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjNotLike(String value) {
            addCriterion("lnsshmsj not like", value, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjIn(List<String> values) {
            addCriterion("lnsshmsj in", values, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjNotIn(List<String> values) {
            addCriterion("lnsshmsj not in", values, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjBetween(String value1, String value2) {
            addCriterion("lnsshmsj between", value1, value2, "lnsshmsj");
            return (Criteria) this;
        }

        public Criteria andLnsshmsjNotBetween(String value1, String value2) {
            addCriterion("lnsshmsj not between", value1, value2, "lnsshmsj");
            return (Criteria) this;
        }
        
			
        public Criteria andYzzyIsNull() {
            addCriterion("yzzy is null");
            return (Criteria) this;
        }

        public Criteria andYzzyIsNotNull() {
            addCriterion("yzzy is not null");
            return (Criteria) this;
        }

        public Criteria andYzzyEqualTo(String value) {
            addCriterion("yzzy =", value, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyNotEqualTo(String value) {
            addCriterion("yzzy <>", value, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyGreaterThan(String value) {
            addCriterion("yzzy >", value, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyGreaterThanOrEqualTo(String value) {
            addCriterion("yzzy >=", value, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyLessThan(String value) {
            addCriterion("yzzy <", value, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyLessThanOrEqualTo(String value) {
            addCriterion("yzzy <=", value, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyLike(String value) {
            addCriterion("yzzy like", value, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyNotLike(String value) {
            addCriterion("yzzy not like", value, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyIn(List<String> values) {
            addCriterion("yzzy in", values, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyNotIn(List<String> values) {
            addCriterion("yzzy not in", values, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyBetween(String value1, String value2) {
            addCriterion("yzzy between", value1, value2, "yzzy");
            return (Criteria) this;
        }

        public Criteria andYzzyNotBetween(String value1, String value2) {
            addCriterion("yzzy not between", value1, value2, "yzzy");
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
						 if(record.getZddmjs()!=null&&StringUtils.isNotEmpty(record.getZddmjs().toString())) {
    			 list.add("ifnull(zddmjs,'')");
    		 }
						 if(record.getSsczjs()!=null&&StringUtils.isNotEmpty(record.getSsczjs().toString())) {
    			 list.add("ifnull(ssczjs,'')");
    		 }
						 if(record.getHxjsysj()!=null&&StringUtils.isNotEmpty(record.getHxjsysj().toString())) {
    			 list.add("ifnull(hxjsysj,'')");
    		 }
						 if(record.getSxl()!=null&&StringUtils.isNotEmpty(record.getSxl().toString())) {
    			 list.add("ifnull(sxl,'')");
    		 }
						 if(record.getJldw()!=null&&StringUtils.isNotEmpty(record.getJldw().toString())) {
    			 list.add("ifnull(jldw,'')");
    		 }
						 if(record.getTjhlts()!=null&&StringUtils.isNotEmpty(record.getTjhlts().toString())) {
    			 list.add("ifnull(tjhlts,'')");
    		 }
						 if(record.getYjhlts()!=null&&StringUtils.isNotEmpty(record.getYjhlts().toString())) {
    			 list.add("ifnull(yjhlts,'')");
    		 }
						 if(record.getEjhlts()!=null&&StringUtils.isNotEmpty(record.getEjhlts().toString())) {
    			 list.add("ifnull(ejhlts,'')");
    		 }
						 if(record.getSjhlts()!=null&&StringUtils.isNotEmpty(record.getSjhlts().toString())) {
    			 list.add("ifnull(sjhlts,'')");
    		 }
						 if(record.getLyfs()!=null&&StringUtils.isNotEmpty(record.getLyfs().toString())) {
    			 list.add("ifnull(lyfs,'')");
    		 }
						 if(record.getSfzzy()!=null&&StringUtils.isNotEmpty(record.getSfzzy().toString())) {
    			 list.add("ifnull(sfzzy,'')");
    		 }
						 if(record.getZysmc()!=null&&StringUtils.isNotEmpty(record.getZysmc().toString())) {
    			 list.add("ifnull(zysmc,'')");
    		 }
						 if(record.getZzysdm()!=null&&StringUtils.isNotEmpty(record.getZzysdm().toString())) {
    			 list.add("ifnull(zzysdm,'')");
    		 }
						 if(record.getCreateTime()!=null&&StringUtils.isNotEmpty(record.getCreateTime().toString())) {
    			 list.add("ifnull(create_time,'')");
    		 }
						 if(record.getUpdateTime()!=null&&StringUtils.isNotEmpty(record.getUpdateTime().toString())) {
    			 list.add("ifnull(update_time,'')");
    		 }
						 if(record.getSxbz()!=null&&StringUtils.isNotEmpty(record.getSxbz().toString())) {
    			 list.add("ifnull(sxbz,'')");
    		 }
						 if(record.getCyxyzy()!=null&&StringUtils.isNotEmpty(record.getCyxyzy().toString())) {
    			 list.add("ifnull(cyxyzy,'')");
    		 }
						 if(record.getCyzyzb()!=null&&StringUtils.isNotEmpty(record.getCyzyzb().toString())) {
    			 list.add("ifnull(cyzyzb,'')");
    		 }
						 if(record.getSjczzy()!=null&&StringUtils.isNotEmpty(record.getSjczzy().toString())) {
    			 list.add("ifnull(sjczzy,'')");
    		 }
						 if(record.getLnsshmsj()!=null&&StringUtils.isNotEmpty(record.getLnsshmsj().toString())) {
    			 list.add("ifnull(lnsshmsj,'')");
    		 }
						 if(record.getYzzy()!=null&&StringUtils.isNotEmpty(record.getYzzy().toString())) {
    			 list.add("ifnull(yzzy,'')");
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
							 if(record.getZddmjs()!=null&&StringUtils.isNotEmpty(record.getZddmjs().toString())) {
        			list2.add("'%"+record.getZddmjs()+"%'");
        		 }
							 if(record.getSsczjs()!=null&&StringUtils.isNotEmpty(record.getSsczjs().toString())) {
        			list2.add("'%"+record.getSsczjs()+"%'");
        		 }
							 if(record.getHxjsysj()!=null&&StringUtils.isNotEmpty(record.getHxjsysj().toString())) {
        			list2.add("'%"+record.getHxjsysj()+"%'");
        		 }
							 if(record.getSxl()!=null&&StringUtils.isNotEmpty(record.getSxl().toString())) {
        			list2.add("'%"+record.getSxl()+"%'");
        		 }
							 if(record.getJldw()!=null&&StringUtils.isNotEmpty(record.getJldw().toString())) {
        			list2.add("'%"+record.getJldw()+"%'");
        		 }
							 if(record.getTjhlts()!=null&&StringUtils.isNotEmpty(record.getTjhlts().toString())) {
        			list2.add("'%"+record.getTjhlts()+"%'");
        		 }
							 if(record.getYjhlts()!=null&&StringUtils.isNotEmpty(record.getYjhlts().toString())) {
        			list2.add("'%"+record.getYjhlts()+"%'");
        		 }
							 if(record.getEjhlts()!=null&&StringUtils.isNotEmpty(record.getEjhlts().toString())) {
        			list2.add("'%"+record.getEjhlts()+"%'");
        		 }
							 if(record.getSjhlts()!=null&&StringUtils.isNotEmpty(record.getSjhlts().toString())) {
        			list2.add("'%"+record.getSjhlts()+"%'");
        		 }
							 if(record.getLyfs()!=null&&StringUtils.isNotEmpty(record.getLyfs().toString())) {
        			list2.add("'%"+record.getLyfs()+"%'");
        		 }
							 if(record.getSfzzy()!=null&&StringUtils.isNotEmpty(record.getSfzzy().toString())) {
        			list2.add("'%"+record.getSfzzy()+"%'");
        		 }
							 if(record.getZysmc()!=null&&StringUtils.isNotEmpty(record.getZysmc().toString())) {
        			list2.add("'%"+record.getZysmc()+"%'");
        		 }
							 if(record.getZzysdm()!=null&&StringUtils.isNotEmpty(record.getZzysdm().toString())) {
        			list2.add("'%"+record.getZzysdm()+"%'");
        		 }
							 if(record.getCreateTime()!=null&&StringUtils.isNotEmpty(record.getCreateTime().toString())) {
        			list2.add("'%"+record.getCreateTime()+"%'");
        		 }
							 if(record.getUpdateTime()!=null&&StringUtils.isNotEmpty(record.getUpdateTime().toString())) {
        			list2.add("'%"+record.getUpdateTime()+"%'");
        		 }
							 if(record.getSxbz()!=null&&StringUtils.isNotEmpty(record.getSxbz().toString())) {
        			list2.add("'%"+record.getSxbz()+"%'");
        		 }
							 if(record.getCyxyzy()!=null&&StringUtils.isNotEmpty(record.getCyxyzy().toString())) {
        			list2.add("'%"+record.getCyxyzy()+"%'");
        		 }
							 if(record.getCyzyzb()!=null&&StringUtils.isNotEmpty(record.getCyzyzb().toString())) {
        			list2.add("'%"+record.getCyzyzb()+"%'");
        		 }
							 if(record.getSjczzy()!=null&&StringUtils.isNotEmpty(record.getSjczzy().toString())) {
        			list2.add("'%"+record.getSjczzy()+"%'");
        		 }
							 if(record.getLnsshmsj()!=null&&StringUtils.isNotEmpty(record.getLnsshmsj().toString())) {
        			list2.add("'%"+record.getLnsshmsj()+"%'");
        		 }
							 if(record.getYzzy()!=null&&StringUtils.isNotEmpty(record.getYzzy().toString())) {
        			list2.add("'%"+record.getYzzy()+"%'");
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