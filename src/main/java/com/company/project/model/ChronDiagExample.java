package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.project.common.StringUtils;

/**
 *  ChronDiagExample
 * @author SWJ
 * @date 2020-07-30 16:46:06
 */
public class ChronDiagExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChronDiagExample() {
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
        
			
        public Criteria andZdkbIsNull() {
            addCriterion("zdkb is null");
            return (Criteria) this;
        }

        public Criteria andZdkbIsNotNull() {
            addCriterion("zdkb is not null");
            return (Criteria) this;
        }

        public Criteria andZdkbEqualTo(String value) {
            addCriterion("zdkb =", value, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbNotEqualTo(String value) {
            addCriterion("zdkb <>", value, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbGreaterThan(String value) {
            addCriterion("zdkb >", value, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbGreaterThanOrEqualTo(String value) {
            addCriterion("zdkb >=", value, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbLessThan(String value) {
            addCriterion("zdkb <", value, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbLessThanOrEqualTo(String value) {
            addCriterion("zdkb <=", value, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbLike(String value) {
            addCriterion("zdkb like", value, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbNotLike(String value) {
            addCriterion("zdkb not like", value, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbIn(List<String> values) {
            addCriterion("zdkb in", values, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbNotIn(List<String> values) {
            addCriterion("zdkb not in", values, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbBetween(String value1, String value2) {
            addCriterion("zdkb between", value1, value2, "zdkb");
            return (Criteria) this;
        }

        public Criteria andZdkbNotBetween(String value1, String value2) {
            addCriterion("zdkb not between", value1, value2, "zdkb");
            return (Criteria) this;
        }
        
			
        public Criteria andJzrqIsNull() {
            addCriterion("jzrq is null");
            return (Criteria) this;
        }

        public Criteria andJzrqIsNotNull() {
            addCriterion("jzrq is not null");
            return (Criteria) this;
        }

        public Criteria andJzrqEqualTo(String value) {
            addCriterion("jzrq =", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotEqualTo(String value) {
            addCriterion("jzrq <>", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqGreaterThan(String value) {
            addCriterion("jzrq >", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqGreaterThanOrEqualTo(String value) {
            addCriterion("jzrq >=", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqLessThan(String value) {
            addCriterion("jzrq <", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqLessThanOrEqualTo(String value) {
            addCriterion("jzrq <=", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqLike(String value) {
            addCriterion("jzrq like", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotLike(String value) {
            addCriterion("jzrq not like", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqIn(List<String> values) {
            addCriterion("jzrq in", values, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotIn(List<String> values) {
            addCriterion("jzrq not in", values, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqBetween(String value1, String value2) {
            addCriterion("jzrq between", value1, value2, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotBetween(String value1, String value2) {
            addCriterion("jzrq not between", value1, value2, "jzrq");
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
        
			
        public Criteria andUpdateimeIsNull() {
            addCriterion("updateime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateimeIsNotNull() {
            addCriterion("updateime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateimeEqualTo(Date value) {
            addCriterion("updateime =", value, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeNotEqualTo(Date value) {
            addCriterion("updateime <>", value, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeGreaterThan(Date value) {
            addCriterion("updateime >", value, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateime >=", value, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeLessThan(Date value) {
            addCriterion("updateime <", value, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeLessThanOrEqualTo(Date value) {
            addCriterion("updateime <=", value, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeLike(Date value) {
            addCriterion("updateime like", value, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeNotLike(Date value) {
            addCriterion("updateime not like", value, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeIn(List<Date> values) {
            addCriterion("updateime in", values, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeNotIn(List<Date> values) {
            addCriterion("updateime not in", values, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeBetween(Date value1, Date value2) {
            addCriterion("updateime between", value1, value2, "updateime");
            return (Criteria) this;
        }

        public Criteria andUpdateimeNotBetween(Date value1, Date value2) {
            addCriterion("updateime not between", value1, value2, "updateime");
            return (Criteria) this;
        }
        
		
		 public Criteria andLikeQuery(ChronDiag record) {
		 	List<String> list= new ArrayList<String>();
		 	List<String> list2= new ArrayList<String>();
        	StringBuffer buffer=new StringBuffer();
        	
        				 if(record.getYbbm()!=null&&StringUtils.isNotEmpty(record.getYbbm().toString())) {
    			 list.add("ifnull(ybbm,'')");
    		 }
						 if(record.getBabm()!=null&&StringUtils.isNotEmpty(record.getBabm().toString())) {
    			 list.add("ifnull(babm,'')");
    		 }
						 if(record.getZdkb()!=null&&StringUtils.isNotEmpty(record.getZdkb().toString())) {
    			 list.add("ifnull(zdkb,'')");
    		 }
						 if(record.getJzrq()!=null&&StringUtils.isNotEmpty(record.getJzrq().toString())) {
    			 list.add("ifnull(jzrq,'')");
    		 }
						 if(record.getCreatetime()!=null&&StringUtils.isNotEmpty(record.getCreatetime().toString())) {
    			 list.add("ifnull(createtime,'')");
    		 }
						 if(record.getUpdateime()!=null&&StringUtils.isNotEmpty(record.getUpdateime().toString())) {
    			 list.add("ifnull(updateime,'')");
    		 }
										 if(record.getYbbm()!=null&&StringUtils.isNotEmpty(record.getYbbm().toString())) {
        			list2.add("'%"+record.getYbbm()+"%'");
        		 }
							 if(record.getBabm()!=null&&StringUtils.isNotEmpty(record.getBabm().toString())) {
        			list2.add("'%"+record.getBabm()+"%'");
        		 }
							 if(record.getZdkb()!=null&&StringUtils.isNotEmpty(record.getZdkb().toString())) {
        			list2.add("'%"+record.getZdkb()+"%'");
        		 }
							 if(record.getJzrq()!=null&&StringUtils.isNotEmpty(record.getJzrq().toString())) {
        			list2.add("'%"+record.getJzrq()+"%'");
        		 }
							 if(record.getCreatetime()!=null&&StringUtils.isNotEmpty(record.getCreatetime().toString())) {
        			list2.add("'%"+record.getCreatetime()+"%'");
        		 }
							 if(record.getUpdateime()!=null&&StringUtils.isNotEmpty(record.getUpdateime().toString())) {
        			list2.add("'%"+record.getUpdateime()+"%'");
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