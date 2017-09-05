package com.jxt.toolmanage.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ToolExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andToolNameIsNull() {
            addCriterion("tool_name is null");
            return (Criteria) this;
        }

        public Criteria andToolNameIsNotNull() {
            addCriterion("tool_name is not null");
            return (Criteria) this;
        }

        public Criteria andToolNameEqualTo(String value) {
            addCriterion("tool_name =", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameNotEqualTo(String value) {
            addCriterion("tool_name <>", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameGreaterThan(String value) {
            addCriterion("tool_name >", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameGreaterThanOrEqualTo(String value) {
            addCriterion("tool_name >=", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameLessThan(String value) {
            addCriterion("tool_name <", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameLessThanOrEqualTo(String value) {
            addCriterion("tool_name <=", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameLike(String value) {
            addCriterion("tool_name like", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameNotLike(String value) {
            addCriterion("tool_name not like", value, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameIn(List<String> values) {
            addCriterion("tool_name in", values, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameNotIn(List<String> values) {
            addCriterion("tool_name not in", values, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameBetween(String value1, String value2) {
            addCriterion("tool_name between", value1, value2, "toolName");
            return (Criteria) this;
        }

        public Criteria andToolNameNotBetween(String value1, String value2) {
            addCriterion("tool_name not between", value1, value2, "toolName");
            return (Criteria) this;
        }

        public Criteria andTestPeriodIsNull() {
            addCriterion("test_period is null");
            return (Criteria) this;
        }

        public Criteria andTestPeriodIsNotNull() {
            addCriterion("test_period is not null");
            return (Criteria) this;
        }

        public Criteria andTestPeriodEqualTo(Integer value) {
            addCriterion("test_period =", value, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andTestPeriodNotEqualTo(Integer value) {
            addCriterion("test_period <>", value, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andTestPeriodGreaterThan(Integer value) {
            addCriterion("test_period >", value, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andTestPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_period >=", value, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andTestPeriodLessThan(Integer value) {
            addCriterion("test_period <", value, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andTestPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("test_period <=", value, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andTestPeriodIn(List<Integer> values) {
            addCriterion("test_period in", values, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andTestPeriodNotIn(List<Integer> values) {
            addCriterion("test_period not in", values, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andTestPeriodBetween(Integer value1, Integer value2) {
            addCriterion("test_period between", value1, value2, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andTestPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("test_period not between", value1, value2, "testPeriod");
            return (Criteria) this;
        }

        public Criteria andLastTestDateIsNull() {
            addCriterion("last_test_date is null");
            return (Criteria) this;
        }

        public Criteria andLastTestDateIsNotNull() {
            addCriterion("last_test_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastTestDateEqualTo(Date value) {
            addCriterion("last_test_date =", value, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andLastTestDateNotEqualTo(Date value) {
            addCriterion("last_test_date <>", value, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andLastTestDateGreaterThan(Date value) {
            addCriterion("last_test_date >", value, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andLastTestDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_test_date >=", value, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andLastTestDateLessThan(Date value) {
            addCriterion("last_test_date <", value, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andLastTestDateLessThanOrEqualTo(Date value) {
            addCriterion("last_test_date <=", value, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andLastTestDateIn(List<Date> values) {
            addCriterion("last_test_date in", values, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andLastTestDateNotIn(List<Date> values) {
            addCriterion("last_test_date not in", values, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andLastTestDateBetween(Date value1, Date value2) {
            addCriterion("last_test_date between", value1, value2, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andLastTestDateNotBetween(Date value1, Date value2) {
            addCriterion("last_test_date not between", value1, value2, "lastTestDate");
            return (Criteria) this;
        }

        public Criteria andModelNumberIsNull() {
            addCriterion("model_number is null");
            return (Criteria) this;
        }

        public Criteria andModelNumberIsNotNull() {
            addCriterion("model_number is not null");
            return (Criteria) this;
        }

        public Criteria andModelNumberEqualTo(String value) {
            addCriterion("model_number =", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotEqualTo(String value) {
            addCriterion("model_number <>", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberGreaterThan(String value) {
            addCriterion("model_number >", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("model_number >=", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberLessThan(String value) {
            addCriterion("model_number <", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberLessThanOrEqualTo(String value) {
            addCriterion("model_number <=", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberLike(String value) {
            addCriterion("model_number like", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotLike(String value) {
            addCriterion("model_number not like", value, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberIn(List<String> values) {
            addCriterion("model_number in", values, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotIn(List<String> values) {
            addCriterion("model_number not in", values, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberBetween(String value1, String value2) {
            addCriterion("model_number between", value1, value2, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andModelNumberNotBetween(String value1, String value2) {
            addCriterion("model_number not between", value1, value2, "modelNumber");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodIsNull() {
            addCriterion("valid_use_period is null");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodIsNotNull() {
            addCriterion("valid_use_period is not null");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodEqualTo(Integer value) {
            addCriterion("valid_use_period =", value, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodNotEqualTo(Integer value) {
            addCriterion("valid_use_period <>", value, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodGreaterThan(Integer value) {
            addCriterion("valid_use_period >", value, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_use_period >=", value, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodLessThan(Integer value) {
            addCriterion("valid_use_period <", value, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("valid_use_period <=", value, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodIn(List<Integer> values) {
            addCriterion("valid_use_period in", values, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodNotIn(List<Integer> values) {
            addCriterion("valid_use_period not in", values, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodBetween(Integer value1, Integer value2) {
            addCriterion("valid_use_period between", value1, value2, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andValidUsePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_use_period not between", value1, value2, "validUsePeriod");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireIsNull() {
            addCriterion("keep_and_deposit_require is null");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireIsNotNull() {
            addCriterion("keep_and_deposit_require is not null");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireEqualTo(String value) {
            addCriterion("keep_and_deposit_require =", value, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireNotEqualTo(String value) {
            addCriterion("keep_and_deposit_require <>", value, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireGreaterThan(String value) {
            addCriterion("keep_and_deposit_require >", value, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireGreaterThanOrEqualTo(String value) {
            addCriterion("keep_and_deposit_require >=", value, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireLessThan(String value) {
            addCriterion("keep_and_deposit_require <", value, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireLessThanOrEqualTo(String value) {
            addCriterion("keep_and_deposit_require <=", value, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireLike(String value) {
            addCriterion("keep_and_deposit_require like", value, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireNotLike(String value) {
            addCriterion("keep_and_deposit_require not like", value, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireIn(List<String> values) {
            addCriterion("keep_and_deposit_require in", values, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireNotIn(List<String> values) {
            addCriterion("keep_and_deposit_require not in", values, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireBetween(String value1, String value2) {
            addCriterion("keep_and_deposit_require between", value1, value2, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andKeepAndDepositRequireNotBetween(String value1, String value2) {
            addCriterion("keep_and_deposit_require not between", value1, value2, "keepAndDepositRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireIsNull() {
            addCriterion("inspection_and_use_require is null");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireIsNotNull() {
            addCriterion("inspection_and_use_require is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireEqualTo(String value) {
            addCriterion("inspection_and_use_require =", value, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireNotEqualTo(String value) {
            addCriterion("inspection_and_use_require <>", value, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireGreaterThan(String value) {
            addCriterion("inspection_and_use_require >", value, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_and_use_require >=", value, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireLessThan(String value) {
            addCriterion("inspection_and_use_require <", value, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireLessThanOrEqualTo(String value) {
            addCriterion("inspection_and_use_require <=", value, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireLike(String value) {
            addCriterion("inspection_and_use_require like", value, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireNotLike(String value) {
            addCriterion("inspection_and_use_require not like", value, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireIn(List<String> values) {
            addCriterion("inspection_and_use_require in", values, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireNotIn(List<String> values) {
            addCriterion("inspection_and_use_require not in", values, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireBetween(String value1, String value2) {
            addCriterion("inspection_and_use_require between", value1, value2, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andInspectionAndUseRequireNotBetween(String value1, String value2) {
            addCriterion("inspection_and_use_require not between", value1, value2, "inspectionAndUseRequire");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedIsNull() {
            addCriterion("is_qualified is null");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedIsNotNull() {
            addCriterion("is_qualified is not null");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedEqualTo(Integer value) {
            addCriterion("is_qualified =", value, "isQualified");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedNotEqualTo(Integer value) {
            addCriterion("is_qualified <>", value, "isQualified");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedGreaterThan(Integer value) {
            addCriterion("is_qualified >", value, "isQualified");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_qualified >=", value, "isQualified");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedLessThan(Integer value) {
            addCriterion("is_qualified <", value, "isQualified");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedLessThanOrEqualTo(Integer value) {
            addCriterion("is_qualified <=", value, "isQualified");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedIn(List<Integer> values) {
            addCriterion("is_qualified in", values, "isQualified");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedNotIn(List<Integer> values) {
            addCriterion("is_qualified not in", values, "isQualified");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedBetween(Integer value1, Integer value2) {
            addCriterion("is_qualified between", value1, value2, "isQualified");
            return (Criteria) this;
        }

        public Criteria andIsQualifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_qualified not between", value1, value2, "isQualified");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeIsNull() {
            addCriterion("two_dimension_code is null");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeIsNotNull() {
            addCriterion("two_dimension_code is not null");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeEqualTo(String value) {
            addCriterion("two_dimension_code =", value, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeNotEqualTo(String value) {
            addCriterion("two_dimension_code <>", value, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeGreaterThan(String value) {
            addCriterion("two_dimension_code >", value, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("two_dimension_code >=", value, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeLessThan(String value) {
            addCriterion("two_dimension_code <", value, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeLessThanOrEqualTo(String value) {
            addCriterion("two_dimension_code <=", value, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeLike(String value) {
            addCriterion("two_dimension_code like", value, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeNotLike(String value) {
            addCriterion("two_dimension_code not like", value, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeIn(List<String> values) {
            addCriterion("two_dimension_code in", values, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeNotIn(List<String> values) {
            addCriterion("two_dimension_code not in", values, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeBetween(String value1, String value2) {
            addCriterion("two_dimension_code between", value1, value2, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andTwoDimensionCodeNotBetween(String value1, String value2) {
            addCriterion("two_dimension_code not between", value1, value2, "twoDimensionCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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