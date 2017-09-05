package com.jxt.get_tool.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToolGetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ToolGetExample() {
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

        public Criteria andToolidIsNull() {
            addCriterion("toolId is null");
            return (Criteria) this;
        }

        public Criteria andToolidIsNotNull() {
            addCriterion("toolId is not null");
            return (Criteria) this;
        }

        public Criteria andToolidEqualTo(Long value) {
            addCriterion("toolId =", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidNotEqualTo(Long value) {
            addCriterion("toolId <>", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidGreaterThan(Long value) {
            addCriterion("toolId >", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidGreaterThanOrEqualTo(Long value) {
            addCriterion("toolId >=", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidLessThan(Long value) {
            addCriterion("toolId <", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidLessThanOrEqualTo(Long value) {
            addCriterion("toolId <=", value, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidIn(List<Long> values) {
            addCriterion("toolId in", values, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidNotIn(List<Long> values) {
            addCriterion("toolId not in", values, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidBetween(Long value1, Long value2) {
            addCriterion("toolId between", value1, value2, "toolid");
            return (Criteria) this;
        }

        public Criteria andToolidNotBetween(Long value1, Long value2) {
            addCriterion("toolId not between", value1, value2, "toolid");
            return (Criteria) this;
        }

        public Criteria andNoteNumIsNull() {
            addCriterion("note_num is null");
            return (Criteria) this;
        }

        public Criteria andNoteNumIsNotNull() {
            addCriterion("note_num is not null");
            return (Criteria) this;
        }

        public Criteria andNoteNumEqualTo(String value) {
            addCriterion("note_num =", value, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumNotEqualTo(String value) {
            addCriterion("note_num <>", value, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumGreaterThan(String value) {
            addCriterion("note_num >", value, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumGreaterThanOrEqualTo(String value) {
            addCriterion("note_num >=", value, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumLessThan(String value) {
            addCriterion("note_num <", value, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumLessThanOrEqualTo(String value) {
            addCriterion("note_num <=", value, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumLike(String value) {
            addCriterion("note_num like", value, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumNotLike(String value) {
            addCriterion("note_num not like", value, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumIn(List<String> values) {
            addCriterion("note_num in", values, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumNotIn(List<String> values) {
            addCriterion("note_num not in", values, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumBetween(String value1, String value2) {
            addCriterion("note_num between", value1, value2, "noteNum");
            return (Criteria) this;
        }

        public Criteria andNoteNumNotBetween(String value1, String value2) {
            addCriterion("note_num not between", value1, value2, "noteNum");
            return (Criteria) this;
        }

        public Criteria andGetDateIsNull() {
            addCriterion("get_date is null");
            return (Criteria) this;
        }

        public Criteria andGetDateIsNotNull() {
            addCriterion("get_date is not null");
            return (Criteria) this;
        }

        public Criteria andGetDateEqualTo(Date value) {
            addCriterion("get_date =", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateNotEqualTo(Date value) {
            addCriterion("get_date <>", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateGreaterThan(Date value) {
            addCriterion("get_date >", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateGreaterThanOrEqualTo(Date value) {
            addCriterion("get_date >=", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateLessThan(Date value) {
            addCriterion("get_date <", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateLessThanOrEqualTo(Date value) {
            addCriterion("get_date <=", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateIn(List<Date> values) {
            addCriterion("get_date in", values, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateNotIn(List<Date> values) {
            addCriterion("get_date not in", values, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateBetween(Date value1, Date value2) {
            addCriterion("get_date between", value1, value2, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateNotBetween(Date value1, Date value2) {
            addCriterion("get_date not between", value1, value2, "getDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("return_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("return_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(Date value) {
            addCriterion("return_date =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(Date value) {
            addCriterion("return_date <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(Date value) {
            addCriterion("return_date >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("return_date >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(Date value) {
            addCriterion("return_date <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(Date value) {
            addCriterion("return_date <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<Date> values) {
            addCriterion("return_date in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<Date> values) {
            addCriterion("return_date not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(Date value1, Date value2) {
            addCriterion("return_date between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(Date value1, Date value2) {
            addCriterion("return_date not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGetToolNameIsNull() {
            addCriterion("get_tool_name is null");
            return (Criteria) this;
        }

        public Criteria andGetToolNameIsNotNull() {
            addCriterion("get_tool_name is not null");
            return (Criteria) this;
        }

        public Criteria andGetToolNameEqualTo(String value) {
            addCriterion("get_tool_name =", value, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameNotEqualTo(String value) {
            addCriterion("get_tool_name <>", value, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameGreaterThan(String value) {
            addCriterion("get_tool_name >", value, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameGreaterThanOrEqualTo(String value) {
            addCriterion("get_tool_name >=", value, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameLessThan(String value) {
            addCriterion("get_tool_name <", value, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameLessThanOrEqualTo(String value) {
            addCriterion("get_tool_name <=", value, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameLike(String value) {
            addCriterion("get_tool_name like", value, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameNotLike(String value) {
            addCriterion("get_tool_name not like", value, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameIn(List<String> values) {
            addCriterion("get_tool_name in", values, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameNotIn(List<String> values) {
            addCriterion("get_tool_name not in", values, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameBetween(String value1, String value2) {
            addCriterion("get_tool_name between", value1, value2, "getToolName");
            return (Criteria) this;
        }

        public Criteria andGetToolNameNotBetween(String value1, String value2) {
            addCriterion("get_tool_name not between", value1, value2, "getToolName");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceIsNull() {
            addCriterion("working_place is null");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceIsNotNull() {
            addCriterion("working_place is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceEqualTo(String value) {
            addCriterion("working_place =", value, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceNotEqualTo(String value) {
            addCriterion("working_place <>", value, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceGreaterThan(String value) {
            addCriterion("working_place >", value, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("working_place >=", value, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceLessThan(String value) {
            addCriterion("working_place <", value, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceLessThanOrEqualTo(String value) {
            addCriterion("working_place <=", value, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceLike(String value) {
            addCriterion("working_place like", value, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceNotLike(String value) {
            addCriterion("working_place not like", value, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceIn(List<String> values) {
            addCriterion("working_place in", values, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceNotIn(List<String> values) {
            addCriterion("working_place not in", values, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceBetween(String value1, String value2) {
            addCriterion("working_place between", value1, value2, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingPlaceNotBetween(String value1, String value2) {
            addCriterion("working_place not between", value1, value2, "workingPlace");
            return (Criteria) this;
        }

        public Criteria andWorkingContentIsNull() {
            addCriterion("working_content is null");
            return (Criteria) this;
        }

        public Criteria andWorkingContentIsNotNull() {
            addCriterion("working_content is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingContentEqualTo(String value) {
            addCriterion("working_content =", value, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentNotEqualTo(String value) {
            addCriterion("working_content <>", value, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentGreaterThan(String value) {
            addCriterion("working_content >", value, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentGreaterThanOrEqualTo(String value) {
            addCriterion("working_content >=", value, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentLessThan(String value) {
            addCriterion("working_content <", value, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentLessThanOrEqualTo(String value) {
            addCriterion("working_content <=", value, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentLike(String value) {
            addCriterion("working_content like", value, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentNotLike(String value) {
            addCriterion("working_content not like", value, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentIn(List<String> values) {
            addCriterion("working_content in", values, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentNotIn(List<String> values) {
            addCriterion("working_content not in", values, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentBetween(String value1, String value2) {
            addCriterion("working_content between", value1, value2, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkingContentNotBetween(String value1, String value2) {
            addCriterion("working_content not between", value1, value2, "workingContent");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateIsNull() {
            addCriterion("work_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateIsNotNull() {
            addCriterion("work_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateEqualTo(Date value) {
            addCriterion("work_begin_date =", value, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateNotEqualTo(Date value) {
            addCriterion("work_begin_date <>", value, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateGreaterThan(Date value) {
            addCriterion("work_begin_date >", value, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("work_begin_date >=", value, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateLessThan(Date value) {
            addCriterion("work_begin_date <", value, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("work_begin_date <=", value, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateIn(List<Date> values) {
            addCriterion("work_begin_date in", values, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateNotIn(List<Date> values) {
            addCriterion("work_begin_date not in", values, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateBetween(Date value1, Date value2) {
            addCriterion("work_begin_date between", value1, value2, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("work_begin_date not between", value1, value2, "workBeginDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateIsNull() {
            addCriterion("work_end_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateIsNotNull() {
            addCriterion("work_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateEqualTo(Date value) {
            addCriterion("work_end_date =", value, "workEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateNotEqualTo(Date value) {
            addCriterion("work_end_date <>", value, "workEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateGreaterThan(Date value) {
            addCriterion("work_end_date >", value, "workEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("work_end_date >=", value, "workEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateLessThan(Date value) {
            addCriterion("work_end_date <", value, "workEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateLessThanOrEqualTo(Date value) {
            addCriterion("work_end_date <=", value, "workEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateIn(List<Date> values) {
            addCriterion("work_end_date in", values, "workEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateNotIn(List<Date> values) {
            addCriterion("work_end_date not in", values, "workEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateBetween(Date value1, Date value2) {
            addCriterion("work_end_date between", value1, value2, "workEndDate");
            return (Criteria) this;
        }

        public Criteria andWorkEndDateNotBetween(Date value1, Date value2) {
            addCriterion("work_end_date not between", value1, value2, "workEndDate");
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