package org.bianqi.note.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoteExample() {
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

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Long value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Long value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Long value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Long value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Long value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Long> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Long> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Long value1, Long value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Long value1, Long value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNNameIsNull() {
            addCriterion("n_name is null");
            return (Criteria) this;
        }

        public Criteria andNNameIsNotNull() {
            addCriterion("n_name is not null");
            return (Criteria) this;
        }

        public Criteria andNNameEqualTo(String value) {
            addCriterion("n_name =", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotEqualTo(String value) {
            addCriterion("n_name <>", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameGreaterThan(String value) {
            addCriterion("n_name >", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameGreaterThanOrEqualTo(String value) {
            addCriterion("n_name >=", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameLessThan(String value) {
            addCriterion("n_name <", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameLessThanOrEqualTo(String value) {
            addCriterion("n_name <=", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameLike(String value) {
            addCriterion("n_name like", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotLike(String value) {
            addCriterion("n_name not like", value, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameIn(List<String> values) {
            addCriterion("n_name in", values, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotIn(List<String> values) {
            addCriterion("n_name not in", values, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameBetween(String value1, String value2) {
            addCriterion("n_name between", value1, value2, "nName");
            return (Criteria) this;
        }

        public Criteria andNNameNotBetween(String value1, String value2) {
            addCriterion("n_name not between", value1, value2, "nName");
            return (Criteria) this;
        }

        public Criteria andNCreatedIsNull() {
            addCriterion("n_created is null");
            return (Criteria) this;
        }

        public Criteria andNCreatedIsNotNull() {
            addCriterion("n_created is not null");
            return (Criteria) this;
        }

        public Criteria andNCreatedEqualTo(Date value) {
            addCriterion("n_created =", value, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNCreatedNotEqualTo(Date value) {
            addCriterion("n_created <>", value, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNCreatedGreaterThan(Date value) {
            addCriterion("n_created >", value, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("n_created >=", value, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNCreatedLessThan(Date value) {
            addCriterion("n_created <", value, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNCreatedLessThanOrEqualTo(Date value) {
            addCriterion("n_created <=", value, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNCreatedIn(List<Date> values) {
            addCriterion("n_created in", values, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNCreatedNotIn(List<Date> values) {
            addCriterion("n_created not in", values, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNCreatedBetween(Date value1, Date value2) {
            addCriterion("n_created between", value1, value2, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNCreatedNotBetween(Date value1, Date value2) {
            addCriterion("n_created not between", value1, value2, "nCreated");
            return (Criteria) this;
        }

        public Criteria andNStatusIsNull() {
            addCriterion("n_status is null");
            return (Criteria) this;
        }

        public Criteria andNStatusIsNotNull() {
            addCriterion("n_status is not null");
            return (Criteria) this;
        }

        public Criteria andNStatusEqualTo(Integer value) {
            addCriterion("n_status =", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusNotEqualTo(Integer value) {
            addCriterion("n_status <>", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusGreaterThan(Integer value) {
            addCriterion("n_status >", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_status >=", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusLessThan(Integer value) {
            addCriterion("n_status <", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusLessThanOrEqualTo(Integer value) {
            addCriterion("n_status <=", value, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusIn(List<Integer> values) {
            addCriterion("n_status in", values, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusNotIn(List<Integer> values) {
            addCriterion("n_status not in", values, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusBetween(Integer value1, Integer value2) {
            addCriterion("n_status between", value1, value2, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("n_status not between", value1, value2, "nStatus");
            return (Criteria) this;
        }

        public Criteria andNContentIsNull() {
            addCriterion("n_content is null");
            return (Criteria) this;
        }

        public Criteria andNContentIsNotNull() {
            addCriterion("n_content is not null");
            return (Criteria) this;
        }

        public Criteria andNContentEqualTo(String value) {
            addCriterion("n_content =", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotEqualTo(String value) {
            addCriterion("n_content <>", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentGreaterThan(String value) {
            addCriterion("n_content >", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentGreaterThanOrEqualTo(String value) {
            addCriterion("n_content >=", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentLessThan(String value) {
            addCriterion("n_content <", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentLessThanOrEqualTo(String value) {
            addCriterion("n_content <=", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentLike(String value) {
            addCriterion("n_content like", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotLike(String value) {
            addCriterion("n_content not like", value, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentIn(List<String> values) {
            addCriterion("n_content in", values, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotIn(List<String> values) {
            addCriterion("n_content not in", values, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentBetween(String value1, String value2) {
            addCriterion("n_content between", value1, value2, "nContent");
            return (Criteria) this;
        }

        public Criteria andNContentNotBetween(String value1, String value2) {
            addCriterion("n_content not between", value1, value2, "nContent");
            return (Criteria) this;
        }

        public Criteria andNotebookIdIsNull() {
            addCriterion("notebook_id is null");
            return (Criteria) this;
        }

        public Criteria andNotebookIdIsNotNull() {
            addCriterion("notebook_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotebookIdEqualTo(Long value) {
            addCriterion("notebook_id =", value, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNotebookIdNotEqualTo(Long value) {
            addCriterion("notebook_id <>", value, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNotebookIdGreaterThan(Long value) {
            addCriterion("notebook_id >", value, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNotebookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("notebook_id >=", value, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNotebookIdLessThan(Long value) {
            addCriterion("notebook_id <", value, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNotebookIdLessThanOrEqualTo(Long value) {
            addCriterion("notebook_id <=", value, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNotebookIdIn(List<Long> values) {
            addCriterion("notebook_id in", values, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNotebookIdNotIn(List<Long> values) {
            addCriterion("notebook_id not in", values, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNotebookIdBetween(Long value1, Long value2) {
            addCriterion("notebook_id between", value1, value2, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNotebookIdNotBetween(Long value1, Long value2) {
            addCriterion("notebook_id not between", value1, value2, "notebookId");
            return (Criteria) this;
        }

        public Criteria andNTitleIsNull() {
            addCriterion("n_title is null");
            return (Criteria) this;
        }

        public Criteria andNTitleIsNotNull() {
            addCriterion("n_title is not null");
            return (Criteria) this;
        }

        public Criteria andNTitleEqualTo(String value) {
            addCriterion("n_title =", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotEqualTo(String value) {
            addCriterion("n_title <>", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleGreaterThan(String value) {
            addCriterion("n_title >", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleGreaterThanOrEqualTo(String value) {
            addCriterion("n_title >=", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleLessThan(String value) {
            addCriterion("n_title <", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleLessThanOrEqualTo(String value) {
            addCriterion("n_title <=", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleLike(String value) {
            addCriterion("n_title like", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotLike(String value) {
            addCriterion("n_title not like", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleIn(List<String> values) {
            addCriterion("n_title in", values, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotIn(List<String> values) {
            addCriterion("n_title not in", values, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleBetween(String value1, String value2) {
            addCriterion("n_title between", value1, value2, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotBetween(String value1, String value2) {
            addCriterion("n_title not between", value1, value2, "nTitle");
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