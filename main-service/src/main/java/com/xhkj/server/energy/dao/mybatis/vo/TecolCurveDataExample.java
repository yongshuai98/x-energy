package com.xhkj.server.energy.dao.mybatis.vo;

import java.util.ArrayList;
import java.util.List;

public class TecolCurveDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public TecolCurveDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
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

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Short value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Short value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Short value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Short value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Short value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Short value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Short> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Short> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Short value1, Short value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Short value1, Short value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTe1IsNull() {
            addCriterion("TE1 is null");
            return (Criteria) this;
        }

        public Criteria andTe1IsNotNull() {
            addCriterion("TE1 is not null");
            return (Criteria) this;
        }

        public Criteria andTe1EqualTo(Float value) {
            addCriterion("TE1 =", value, "te1");
            return (Criteria) this;
        }

        public Criteria andTe1NotEqualTo(Float value) {
            addCriterion("TE1 <>", value, "te1");
            return (Criteria) this;
        }

        public Criteria andTe1GreaterThan(Float value) {
            addCriterion("TE1 >", value, "te1");
            return (Criteria) this;
        }

        public Criteria andTe1GreaterThanOrEqualTo(Float value) {
            addCriterion("TE1 >=", value, "te1");
            return (Criteria) this;
        }

        public Criteria andTe1LessThan(Float value) {
            addCriterion("TE1 <", value, "te1");
            return (Criteria) this;
        }

        public Criteria andTe1LessThanOrEqualTo(Float value) {
            addCriterion("TE1 <=", value, "te1");
            return (Criteria) this;
        }

        public Criteria andTe1In(List<Float> values) {
            addCriterion("TE1 in", values, "te1");
            return (Criteria) this;
        }

        public Criteria andTe1NotIn(List<Float> values) {
            addCriterion("TE1 not in", values, "te1");
            return (Criteria) this;
        }

        public Criteria andTe1Between(Float value1, Float value2) {
            addCriterion("TE1 between", value1, value2, "te1");
            return (Criteria) this;
        }

        public Criteria andTe1NotBetween(Float value1, Float value2) {
            addCriterion("TE1 not between", value1, value2, "te1");
            return (Criteria) this;
        }

        public Criteria andTe2IsNull() {
            addCriterion("TE2 is null");
            return (Criteria) this;
        }

        public Criteria andTe2IsNotNull() {
            addCriterion("TE2 is not null");
            return (Criteria) this;
        }

        public Criteria andTe2EqualTo(Float value) {
            addCriterion("TE2 =", value, "te2");
            return (Criteria) this;
        }

        public Criteria andTe2NotEqualTo(Float value) {
            addCriterion("TE2 <>", value, "te2");
            return (Criteria) this;
        }

        public Criteria andTe2GreaterThan(Float value) {
            addCriterion("TE2 >", value, "te2");
            return (Criteria) this;
        }

        public Criteria andTe2GreaterThanOrEqualTo(Float value) {
            addCriterion("TE2 >=", value, "te2");
            return (Criteria) this;
        }

        public Criteria andTe2LessThan(Float value) {
            addCriterion("TE2 <", value, "te2");
            return (Criteria) this;
        }

        public Criteria andTe2LessThanOrEqualTo(Float value) {
            addCriterion("TE2 <=", value, "te2");
            return (Criteria) this;
        }

        public Criteria andTe2In(List<Float> values) {
            addCriterion("TE2 in", values, "te2");
            return (Criteria) this;
        }

        public Criteria andTe2NotIn(List<Float> values) {
            addCriterion("TE2 not in", values, "te2");
            return (Criteria) this;
        }

        public Criteria andTe2Between(Float value1, Float value2) {
            addCriterion("TE2 between", value1, value2, "te2");
            return (Criteria) this;
        }

        public Criteria andTe2NotBetween(Float value1, Float value2) {
            addCriterion("TE2 not between", value1, value2, "te2");
            return (Criteria) this;
        }

        public Criteria andTe3IsNull() {
            addCriterion("TE3 is null");
            return (Criteria) this;
        }

        public Criteria andTe3IsNotNull() {
            addCriterion("TE3 is not null");
            return (Criteria) this;
        }

        public Criteria andTe3EqualTo(Float value) {
            addCriterion("TE3 =", value, "te3");
            return (Criteria) this;
        }

        public Criteria andTe3NotEqualTo(Float value) {
            addCriterion("TE3 <>", value, "te3");
            return (Criteria) this;
        }

        public Criteria andTe3GreaterThan(Float value) {
            addCriterion("TE3 >", value, "te3");
            return (Criteria) this;
        }

        public Criteria andTe3GreaterThanOrEqualTo(Float value) {
            addCriterion("TE3 >=", value, "te3");
            return (Criteria) this;
        }

        public Criteria andTe3LessThan(Float value) {
            addCriterion("TE3 <", value, "te3");
            return (Criteria) this;
        }

        public Criteria andTe3LessThanOrEqualTo(Float value) {
            addCriterion("TE3 <=", value, "te3");
            return (Criteria) this;
        }

        public Criteria andTe3In(List<Float> values) {
            addCriterion("TE3 in", values, "te3");
            return (Criteria) this;
        }

        public Criteria andTe3NotIn(List<Float> values) {
            addCriterion("TE3 not in", values, "te3");
            return (Criteria) this;
        }

        public Criteria andTe3Between(Float value1, Float value2) {
            addCriterion("TE3 between", value1, value2, "te3");
            return (Criteria) this;
        }

        public Criteria andTe3NotBetween(Float value1, Float value2) {
            addCriterion("TE3 not between", value1, value2, "te3");
            return (Criteria) this;
        }

        public Criteria andTe4IsNull() {
            addCriterion("TE4 is null");
            return (Criteria) this;
        }

        public Criteria andTe4IsNotNull() {
            addCriterion("TE4 is not null");
            return (Criteria) this;
        }

        public Criteria andTe4EqualTo(Float value) {
            addCriterion("TE4 =", value, "te4");
            return (Criteria) this;
        }

        public Criteria andTe4NotEqualTo(Float value) {
            addCriterion("TE4 <>", value, "te4");
            return (Criteria) this;
        }

        public Criteria andTe4GreaterThan(Float value) {
            addCriterion("TE4 >", value, "te4");
            return (Criteria) this;
        }

        public Criteria andTe4GreaterThanOrEqualTo(Float value) {
            addCriterion("TE4 >=", value, "te4");
            return (Criteria) this;
        }

        public Criteria andTe4LessThan(Float value) {
            addCriterion("TE4 <", value, "te4");
            return (Criteria) this;
        }

        public Criteria andTe4LessThanOrEqualTo(Float value) {
            addCriterion("TE4 <=", value, "te4");
            return (Criteria) this;
        }

        public Criteria andTe4In(List<Float> values) {
            addCriterion("TE4 in", values, "te4");
            return (Criteria) this;
        }

        public Criteria andTe4NotIn(List<Float> values) {
            addCriterion("TE4 not in", values, "te4");
            return (Criteria) this;
        }

        public Criteria andTe4Between(Float value1, Float value2) {
            addCriterion("TE4 between", value1, value2, "te4");
            return (Criteria) this;
        }

        public Criteria andTe4NotBetween(Float value1, Float value2) {
            addCriterion("TE4 not between", value1, value2, "te4");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("TAG is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("TAG is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(Boolean value) {
            addCriterion("TAG =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(Boolean value) {
            addCriterion("TAG <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(Boolean value) {
            addCriterion("TAG >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TAG >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(Boolean value) {
            addCriterion("TAG <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(Boolean value) {
            addCriterion("TAG <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<Boolean> values) {
            addCriterion("TAG in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<Boolean> values) {
            addCriterion("TAG not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(Boolean value1, Boolean value2) {
            addCriterion("TAG between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TAG not between", value1, value2, "tag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data_tecol_curve
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table data_tecol_curve
     *
     * @mbg.generated
     */
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


    ////*******自定义开始********/
    //***********自定义结束****////
}
