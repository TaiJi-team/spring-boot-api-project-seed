package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.project.common.StringUtils;

/**
 *  ZdlbExample
 * @author fuce_自动生成
 * @email 115889198@qq.com
 * @date 2020-07-29 10:22:18
 */
public class ZdlbExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZdlbExample() {
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
        
			
        public Criteria andZdmcIsNull() {
            addCriterion("zdmc is null");
            return (Criteria) this;
        }

        public Criteria andZdmcIsNotNull() {
            addCriterion("zdmc is not null");
            return (Criteria) this;
        }

        public Criteria andZdmcEqualTo(String value) {
            addCriterion("zdmc =", value, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcNotEqualTo(String value) {
            addCriterion("zdmc <>", value, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcGreaterThan(String value) {
            addCriterion("zdmc >", value, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcGreaterThanOrEqualTo(String value) {
            addCriterion("zdmc >=", value, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcLessThan(String value) {
            addCriterion("zdmc <", value, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcLessThanOrEqualTo(String value) {
            addCriterion("zdmc <=", value, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcLike(String value) {
            addCriterion("zdmc like", value, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcNotLike(String value) {
            addCriterion("zdmc not like", value, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcIn(List<String> values) {
            addCriterion("zdmc in", values, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcNotIn(List<String> values) {
            addCriterion("zdmc not in", values, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcBetween(String value1, String value2) {
            addCriterion("zdmc between", value1, value2, "zdmc");
            return (Criteria) this;
        }

        public Criteria andZdmcNotBetween(String value1, String value2) {
            addCriterion("zdmc not between", value1, value2, "zdmc");
            return (Criteria) this;
        }
        
			
        public Criteria andZddmIsNull() {
            addCriterion("zddm is null");
            return (Criteria) this;
        }

        public Criteria andZddmIsNotNull() {
            addCriterion("zddm is not null");
            return (Criteria) this;
        }

        public Criteria andZddmEqualTo(String value) {
            addCriterion("zddm =", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotEqualTo(String value) {
            addCriterion("zddm <>", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmGreaterThan(String value) {
            addCriterion("zddm >", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmGreaterThanOrEqualTo(String value) {
            addCriterion("zddm >=", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmLessThan(String value) {
            addCriterion("zddm <", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmLessThanOrEqualTo(String value) {
            addCriterion("zddm <=", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmLike(String value) {
            addCriterion("zddm like", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotLike(String value) {
            addCriterion("zddm not like", value, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmIn(List<String> values) {
            addCriterion("zddm in", values, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotIn(List<String> values) {
            addCriterion("zddm not in", values, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmBetween(String value1, String value2) {
            addCriterion("zddm between", value1, value2, "zddm");
            return (Criteria) this;
        }

        public Criteria andZddmNotBetween(String value1, String value2) {
            addCriterion("zddm not between", value1, value2, "zddm");
            return (Criteria) this;
        }
        
			
        public Criteria andSsczmcIsNull() {
            addCriterion("ssczmc is null");
            return (Criteria) this;
        }

        public Criteria andSsczmcIsNotNull() {
            addCriterion("ssczmc is not null");
            return (Criteria) this;
        }

        public Criteria andSsczmcEqualTo(String value) {
            addCriterion("ssczmc =", value, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcNotEqualTo(String value) {
            addCriterion("ssczmc <>", value, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcGreaterThan(String value) {
            addCriterion("ssczmc >", value, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcGreaterThanOrEqualTo(String value) {
            addCriterion("ssczmc >=", value, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcLessThan(String value) {
            addCriterion("ssczmc <", value, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcLessThanOrEqualTo(String value) {
            addCriterion("ssczmc <=", value, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcLike(String value) {
            addCriterion("ssczmc like", value, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcNotLike(String value) {
            addCriterion("ssczmc not like", value, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcIn(List<String> values) {
            addCriterion("ssczmc in", values, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcNotIn(List<String> values) {
            addCriterion("ssczmc not in", values, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcBetween(String value1, String value2) {
            addCriterion("ssczmc between", value1, value2, "ssczmc");
            return (Criteria) this;
        }

        public Criteria andSsczmcNotBetween(String value1, String value2) {
            addCriterion("ssczmc not between", value1, value2, "ssczmc");
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
        
		
		 public Criteria andLikeQuery(Zdlb record) {
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
						 if(record.getZdmc()!=null&&StringUtils.isNotEmpty(record.getZdmc().toString())) {
    			 list.add("ifnull(zdmc,'')");
    		 }
						 if(record.getZddm()!=null&&StringUtils.isNotEmpty(record.getZddm().toString())) {
    			 list.add("ifnull(zddm,'')");
    		 }
						 if(record.getSsczmc()!=null&&StringUtils.isNotEmpty(record.getSsczmc().toString())) {
    			 list.add("ifnull(ssczmc,'')");
    		 }
						 if(record.getSsczdm()!=null&&StringUtils.isNotEmpty(record.getSsczdm().toString())) {
    			 list.add("ifnull(ssczdm,'')");
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
							 if(record.getZdmc()!=null&&StringUtils.isNotEmpty(record.getZdmc().toString())) {
        			list2.add("'%"+record.getZdmc()+"%'");
        		 }
							 if(record.getZddm()!=null&&StringUtils.isNotEmpty(record.getZddm().toString())) {
        			list2.add("'%"+record.getZddm()+"%'");
        		 }
							 if(record.getSsczmc()!=null&&StringUtils.isNotEmpty(record.getSsczmc().toString())) {
        			list2.add("'%"+record.getSsczmc()+"%'");
        		 }
							 if(record.getSsczdm()!=null&&StringUtils.isNotEmpty(record.getSsczdm().toString())) {
        			list2.add("'%"+record.getSsczdm()+"%'");
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