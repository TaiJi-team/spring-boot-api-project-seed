package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.project.common.StringUtils;

/**
 *  ZzjhExample
 * @author SWJ
 * @date 2020-07-29 11:14:17
 */
public class ZzjhExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZzjhExample() {
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
        
			
        public Criteria andBflxIsNull() {
            addCriterion("bflx is null");
            return (Criteria) this;
        }

        public Criteria andBflxIsNotNull() {
            addCriterion("bflx is not null");
            return (Criteria) this;
        }

        public Criteria andBflxEqualTo(Integer value) {
            addCriterion("bflx =", value, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxNotEqualTo(Integer value) {
            addCriterion("bflx <>", value, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxGreaterThan(Integer value) {
            addCriterion("bflx >", value, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxGreaterThanOrEqualTo(Integer value) {
            addCriterion("bflx >=", value, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxLessThan(Integer value) {
            addCriterion("bflx <", value, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxLessThanOrEqualTo(Integer value) {
            addCriterion("bflx <=", value, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxLike(Integer value) {
            addCriterion("bflx like", value, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxNotLike(Integer value) {
            addCriterion("bflx not like", value, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxIn(List<Integer> values) {
            addCriterion("bflx in", values, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxNotIn(List<Integer> values) {
            addCriterion("bflx not in", values, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxBetween(Integer value1, Integer value2) {
            addCriterion("bflx between", value1, value2, "bflx");
            return (Criteria) this;
        }

        public Criteria andBflxNotBetween(Integer value1, Integer value2) {
            addCriterion("bflx not between", value1, value2, "bflx");
            return (Criteria) this;
        }
        
			
        public Criteria andJrsjIsNull() {
            addCriterion("jrsj is null");
            return (Criteria) this;
        }

        public Criteria andJrsjIsNotNull() {
            addCriterion("jrsj is not null");
            return (Criteria) this;
        }

        public Criteria andJrsjEqualTo(Date value) {
            addCriterion("jrsj =", value, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjNotEqualTo(Date value) {
            addCriterion("jrsj <>", value, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjGreaterThan(Date value) {
            addCriterion("jrsj >", value, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjGreaterThanOrEqualTo(Date value) {
            addCriterion("jrsj >=", value, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjLessThan(Date value) {
            addCriterion("jrsj <", value, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjLessThanOrEqualTo(Date value) {
            addCriterion("jrsj <=", value, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjLike(Date value) {
            addCriterion("jrsj like", value, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjNotLike(Date value) {
            addCriterion("jrsj not like", value, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjIn(List<Date> values) {
            addCriterion("jrsj in", values, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjNotIn(List<Date> values) {
            addCriterion("jrsj not in", values, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjBetween(Date value1, Date value2) {
            addCriterion("jrsj between", value1, value2, "jrsj");
            return (Criteria) this;
        }

        public Criteria andJrsjNotBetween(Date value1, Date value2) {
            addCriterion("jrsj not between", value1, value2, "jrsj");
            return (Criteria) this;
        }
        
			
        public Criteria andClsjIsNull() {
            addCriterion("clsj is null");
            return (Criteria) this;
        }

        public Criteria andClsjIsNotNull() {
            addCriterion("clsj is not null");
            return (Criteria) this;
        }

        public Criteria andClsjEqualTo(Date value) {
            addCriterion("clsj =", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjNotEqualTo(Date value) {
            addCriterion("clsj <>", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjGreaterThan(Date value) {
            addCriterion("clsj >", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjGreaterThanOrEqualTo(Date value) {
            addCriterion("clsj >=", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjLessThan(Date value) {
            addCriterion("clsj <", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjLessThanOrEqualTo(Date value) {
            addCriterion("clsj <=", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjLike(Date value) {
            addCriterion("clsj like", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjNotLike(Date value) {
            addCriterion("clsj not like", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjIn(List<Date> values) {
            addCriterion("clsj in", values, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjNotIn(List<Date> values) {
            addCriterion("clsj not in", values, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjBetween(Date value1, Date value2) {
            addCriterion("clsj between", value1, value2, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjNotBetween(Date value1, Date value2) {
            addCriterion("clsj not between", value1, value2, "clsj");
            return (Criteria) this;
        }
        
		
		 public Criteria andLikeQuery(Zzjh record) {
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
						 if(record.getBflx()!=null&&StringUtils.isNotEmpty(record.getBflx().toString())) {
    			 list.add("ifnull(bflx,'')");
    		 }
						 if(record.getJrsj()!=null&&StringUtils.isNotEmpty(record.getJrsj().toString())) {
    			 list.add("ifnull(jrsj,'')");
    		 }
						 if(record.getClsj()!=null&&StringUtils.isNotEmpty(record.getClsj().toString())) {
    			 list.add("ifnull(clsj,'')");
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
							 if(record.getBflx()!=null&&StringUtils.isNotEmpty(record.getBflx().toString())) {
        			list2.add("'%"+record.getBflx()+"%'");
        		 }
							 if(record.getJrsj()!=null&&StringUtils.isNotEmpty(record.getJrsj().toString())) {
        			list2.add("'%"+record.getJrsj()+"%'");
        		 }
							 if(record.getClsj()!=null&&StringUtils.isNotEmpty(record.getClsj().toString())) {
        			list2.add("'%"+record.getClsj()+"%'");
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