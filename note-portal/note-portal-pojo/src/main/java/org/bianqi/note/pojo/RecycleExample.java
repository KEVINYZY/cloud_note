package org.bianqi.note.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecycleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecycleExample() {
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

        public Criteria andRecycleIdIsNull() {
            addCriterion("recycle_id is null");
            return (Criteria) this;
        }

        public Criteria andRecycleIdIsNotNull() {
            addCriterion("recycle_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecycleIdEqualTo(Integer value) {
            addCriterion("recycle_id =", value, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleIdNotEqualTo(Integer value) {
            addCriterion("recycle_id <>", value, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleIdGreaterThan(Integer value) {
            addCriterion("recycle_id >", value, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recycle_id >=", value, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleIdLessThan(Integer value) {
            addCriterion("recycle_id <", value, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleIdLessThanOrEqualTo(Integer value) {
            addCriterion("recycle_id <=", value, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleIdIn(List<Integer> values) {
            addCriterion("recycle_id in", values, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleIdNotIn(List<Integer> values) {
            addCriterion("recycle_id not in", values, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleIdBetween(Integer value1, Integer value2) {
            addCriterion("recycle_id between", value1, value2, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recycle_id not between", value1, value2, "recycleId");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteIsNull() {
            addCriterion("recycle_note is null");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteIsNotNull() {
            addCriterion("recycle_note is not null");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteEqualTo(String value) {
            addCriterion("recycle_note =", value, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteNotEqualTo(String value) {
            addCriterion("recycle_note <>", value, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteGreaterThan(String value) {
            addCriterion("recycle_note >", value, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteGreaterThanOrEqualTo(String value) {
            addCriterion("recycle_note >=", value, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteLessThan(String value) {
            addCriterion("recycle_note <", value, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteLessThanOrEqualTo(String value) {
            addCriterion("recycle_note <=", value, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteLike(String value) {
            addCriterion("recycle_note like", value, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteNotLike(String value) {
            addCriterion("recycle_note not like", value, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteIn(List<String> values) {
            addCriterion("recycle_note in", values, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteNotIn(List<String> values) {
            addCriterion("recycle_note not in", values, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteBetween(String value1, String value2) {
            addCriterion("recycle_note between", value1, value2, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleNoteNotBetween(String value1, String value2) {
            addCriterion("recycle_note not between", value1, value2, "recycleNote");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateIsNull() {
            addCriterion("recycle_create is null");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateIsNotNull() {
            addCriterion("recycle_create is not null");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateEqualTo(Date value) {
            addCriterion("recycle_create =", value, "recycleCreate");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateNotEqualTo(Date value) {
            addCriterion("recycle_create <>", value, "recycleCreate");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateGreaterThan(Date value) {
            addCriterion("recycle_create >", value, "recycleCreate");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("recycle_create >=", value, "recycleCreate");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateLessThan(Date value) {
            addCriterion("recycle_create <", value, "recycleCreate");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateLessThanOrEqualTo(Date value) {
            addCriterion("recycle_create <=", value, "recycleCreate");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateIn(List<Date> values) {
            addCriterion("recycle_create in", values, "recycleCreate");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateNotIn(List<Date> values) {
            addCriterion("recycle_create not in", values, "recycleCreate");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateBetween(Date value1, Date value2) {
            addCriterion("recycle_create between", value1, value2, "recycleCreate");
            return (Criteria) this;
        }

        public Criteria andRecycleCreateNotBetween(Date value1, Date value2) {
            addCriterion("recycle_create not between", value1, value2, "recycleCreate");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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