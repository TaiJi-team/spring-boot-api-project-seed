package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.project.common.StringUtils;



/**
 *  CyxyqtExample
 * @author SWJ
 * @date 2020-07-29 10:22:41
 */
public class CyxyqtExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CyxyqtExample() {
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
        
			
        public Criteria andJbmcIsNull() {
            addCriterion("jbmc is null");
            return (Criteria) this;
        }

        public Criteria andJbmcIsNotNull() {
            addCriterion("jbmc is not null");
            return (Criteria) this;
        }

        public Criteria andJbmcEqualTo(String value) {
            addCriterion("jbmc =", value, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcNotEqualTo(String value) {
            addCriterion("jbmc <>", value, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcGreaterThan(String value) {
            addCriterion("jbmc >", value, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcGreaterThanOrEqualTo(String value) {
            addCriterion("jbmc >=", value, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcLessThan(String value) {
            addCriterion("jbmc <", value, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcLessThanOrEqualTo(String value) {
            addCriterion("jbmc <=", value, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcLike(String value) {
            addCriterion("jbmc like", value, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcNotLike(String value) {
            addCriterion("jbmc not like", value, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcIn(List<String> values) {
            addCriterion("jbmc in", values, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcNotIn(List<String> values) {
            addCriterion("jbmc not in", values, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcBetween(String value1, String value2) {
            addCriterion("jbmc between", value1, value2, "jbmc");
            return (Criteria) this;
        }

        public Criteria andJbmcNotBetween(String value1, String value2) {
            addCriterion("jbmc not between", value1, value2, "jbmc");
            return (Criteria) this;
        }
        
			
        public Criteria andJbdmIsNull() {
            addCriterion("jbdm is null");
            return (Criteria) this;
        }

        public Criteria andJbdmIsNotNull() {
            addCriterion("jbdm is not null");
            return (Criteria) this;
        }

        public Criteria andJbdmEqualTo(String value) {
            addCriterion("jbdm =", value, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmNotEqualTo(String value) {
            addCriterion("jbdm <>", value, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmGreaterThan(String value) {
            addCriterion("jbdm >", value, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmGreaterThanOrEqualTo(String value) {
            addCriterion("jbdm >=", value, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmLessThan(String value) {
            addCriterion("jbdm <", value, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmLessThanOrEqualTo(String value) {
            addCriterion("jbdm <=", value, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmLike(String value) {
            addCriterion("jbdm like", value, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmNotLike(String value) {
            addCriterion("jbdm not like", value, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmIn(List<String> values) {
            addCriterion("jbdm in", values, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmNotIn(List<String> values) {
            addCriterion("jbdm not in", values, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmBetween(String value1, String value2) {
            addCriterion("jbdm between", value1, value2, "jbdm");
            return (Criteria) this;
        }

        public Criteria andJbdmNotBetween(String value1, String value2) {
            addCriterion("jbdm not between", value1, value2, "jbdm");
            return (Criteria) this;
        }
        
			
        public Criteria andRyxqlbIsNull() {
            addCriterion("ryxqlb is null");
            return (Criteria) this;
        }

        public Criteria andRyxqlbIsNotNull() {
            addCriterion("ryxqlb is not null");
            return (Criteria) this;
        }

        public Criteria andRyxqlbEqualTo(String value) {
            addCriterion("ryxqlb =", value, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbNotEqualTo(String value) {
            addCriterion("ryxqlb <>", value, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbGreaterThan(String value) {
            addCriterion("ryxqlb >", value, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbGreaterThanOrEqualTo(String value) {
            addCriterion("ryxqlb >=", value, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbLessThan(String value) {
            addCriterion("ryxqlb <", value, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbLessThanOrEqualTo(String value) {
            addCriterion("ryxqlb <=", value, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbLike(String value) {
            addCriterion("ryxqlb like", value, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbNotLike(String value) {
            addCriterion("ryxqlb not like", value, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbIn(List<String> values) {
            addCriterion("ryxqlb in", values, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbNotIn(List<String> values) {
            addCriterion("ryxqlb not in", values, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbBetween(String value1, String value2) {
            addCriterion("ryxqlb between", value1, value2, "ryxqlb");
            return (Criteria) this;
        }

        public Criteria andRyxqlbNotBetween(String value1, String value2) {
            addCriterion("ryxqlb not between", value1, value2, "ryxqlb");
            return (Criteria) this;
        }
        
		
		 public Criteria andLikeQuery(Cyxyqt record) {
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
						 if(record.getJbmc()!=null&&StringUtils.isNotEmpty(record.getJbmc().toString())) {
    			 list.add("ifnull(jbmc,'')");
    		 }
						 if(record.getJbdm()!=null&&StringUtils.isNotEmpty(record.getJbdm().toString())) {
    			 list.add("ifnull(jbdm,'')");
    		 }
						 if(record.getRyxqlb()!=null&&StringUtils.isNotEmpty(record.getRyxqlb().toString())) {
    			 list.add("ifnull(ryxqlb,'')");
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
							 if(record.getJbmc()!=null&&StringUtils.isNotEmpty(record.getJbmc().toString())) {
        			list2.add("'%"+record.getJbmc()+"%'");
        		 }
							 if(record.getJbdm()!=null&&StringUtils.isNotEmpty(record.getJbdm().toString())) {
        			list2.add("'%"+record.getJbdm()+"%'");
        		 }
							 if(record.getRyxqlb()!=null&&StringUtils.isNotEmpty(record.getRyxqlb().toString())) {
        			list2.add("'%"+record.getRyxqlb()+"%'");
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