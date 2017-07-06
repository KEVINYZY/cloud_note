package org.bianqi.note.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShareExample() {
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

        public Criteria andShareIdIsNull() {
            addCriterion("share_id is null");
            return (Criteria) this;
        }

        public Criteria andShareIdIsNotNull() {
            addCriterion("share_id is not null");
            return (Criteria) this;
        }

        public Criteria andShareIdEqualTo(Integer value) {
            addCriterion("share_id =", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotEqualTo(Integer value) {
            addCriterion("share_id <>", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThan(Integer value) {
            addCriterion("share_id >", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_id >=", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThan(Integer value) {
            addCriterion("share_id <", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdLessThanOrEqualTo(Integer value) {
            addCriterion("share_id <=", value, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdIn(List<Integer> values) {
            addCriterion("share_id in", values, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotIn(List<Integer> values) {
            addCriterion("share_id not in", values, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdBetween(Integer value1, Integer value2) {
            addCriterion("share_id between", value1, value2, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareIdNotBetween(Integer value1, Integer value2) {
            addCriterion("share_id not between", value1, value2, "shareId");
            return (Criteria) this;
        }

        public Criteria andShareNoteIsNull() {
            addCriterion("share_note is null");
            return (Criteria) this;
        }

        public Criteria andShareNoteIsNotNull() {
            addCriterion("share_note is not null");
            return (Criteria) this;
        }

        public Criteria andShareNoteEqualTo(String value) {
            addCriterion("share_note =", value, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteNotEqualTo(String value) {
            addCriterion("share_note <>", value, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteGreaterThan(String value) {
            addCriterion("share_note >", value, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteGreaterThanOrEqualTo(String value) {
            addCriterion("share_note >=", value, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteLessThan(String value) {
            addCriterion("share_note <", value, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteLessThanOrEqualTo(String value) {
            addCriterion("share_note <=", value, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteLike(String value) {
            addCriterion("share_note like", value, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteNotLike(String value) {
            addCriterion("share_note not like", value, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteIn(List<String> values) {
            addCriterion("share_note in", values, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteNotIn(List<String> values) {
            addCriterion("share_note not in", values, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteBetween(String value1, String value2) {
            addCriterion("share_note between", value1, value2, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareNoteNotBetween(String value1, String value2) {
            addCriterion("share_note not between", value1, value2, "shareNote");
            return (Criteria) this;
        }

        public Criteria andShareUserIsNull() {
            addCriterion("share_user is null");
            return (Criteria) this;
        }

        public Criteria andShareUserIsNotNull() {
            addCriterion("share_user is not null");
            return (Criteria) this;
        }

        public Criteria andShareUserEqualTo(String value) {
            addCriterion("share_user =", value, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserNotEqualTo(String value) {
            addCriterion("share_user <>", value, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserGreaterThan(String value) {
            addCriterion("share_user >", value, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserGreaterThanOrEqualTo(String value) {
            addCriterion("share_user >=", value, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserLessThan(String value) {
            addCriterion("share_user <", value, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserLessThanOrEqualTo(String value) {
            addCriterion("share_user <=", value, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserLike(String value) {
            addCriterion("share_user like", value, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserNotLike(String value) {
            addCriterion("share_user not like", value, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserIn(List<String> values) {
            addCriterion("share_user in", values, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserNotIn(List<String> values) {
            addCriterion("share_user not in", values, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserBetween(String value1, String value2) {
            addCriterion("share_user between", value1, value2, "shareUser");
            return (Criteria) this;
        }

        public Criteria andShareUserNotBetween(String value1, String value2) {
            addCriterion("share_user not between", value1, value2, "shareUser");
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