package qyt.manageArticle.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Integer value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Integer value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Integer value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Integer value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Integer value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Integer> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Integer> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Integer value1, Integer value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBAuthorIsNull() {
            addCriterion("b_author is null");
            return (Criteria) this;
        }

        public Criteria andBAuthorIsNotNull() {
            addCriterion("b_author is not null");
            return (Criteria) this;
        }

        public Criteria andBAuthorEqualTo(String value) {
            addCriterion("b_author =", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotEqualTo(String value) {
            addCriterion("b_author <>", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorGreaterThan(String value) {
            addCriterion("b_author >", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("b_author >=", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorLessThan(String value) {
            addCriterion("b_author <", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorLessThanOrEqualTo(String value) {
            addCriterion("b_author <=", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorLike(String value) {
            addCriterion("b_author like", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotLike(String value) {
            addCriterion("b_author not like", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorIn(List<String> values) {
            addCriterion("b_author in", values, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotIn(List<String> values) {
            addCriterion("b_author not in", values, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorBetween(String value1, String value2) {
            addCriterion("b_author between", value1, value2, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotBetween(String value1, String value2) {
            addCriterion("b_author not between", value1, value2, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBSummaryIsNull() {
            addCriterion("b_summary is null");
            return (Criteria) this;
        }

        public Criteria andBSummaryIsNotNull() {
            addCriterion("b_summary is not null");
            return (Criteria) this;
        }

        public Criteria andBSummaryEqualTo(String value) {
            addCriterion("b_summary =", value, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryNotEqualTo(String value) {
            addCriterion("b_summary <>", value, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryGreaterThan(String value) {
            addCriterion("b_summary >", value, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("b_summary >=", value, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryLessThan(String value) {
            addCriterion("b_summary <", value, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryLessThanOrEqualTo(String value) {
            addCriterion("b_summary <=", value, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryLike(String value) {
            addCriterion("b_summary like", value, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryNotLike(String value) {
            addCriterion("b_summary not like", value, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryIn(List<String> values) {
            addCriterion("b_summary in", values, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryNotIn(List<String> values) {
            addCriterion("b_summary not in", values, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryBetween(String value1, String value2) {
            addCriterion("b_summary between", value1, value2, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBSummaryNotBetween(String value1, String value2) {
            addCriterion("b_summary not between", value1, value2, "bSummary");
            return (Criteria) this;
        }

        public Criteria andBDateIsNull() {
            addCriterion("b_date is null");
            return (Criteria) this;
        }

        public Criteria andBDateIsNotNull() {
            addCriterion("b_date is not null");
            return (Criteria) this;
        }

        public Criteria andBDateEqualTo(String value) {
            addCriterion("b_date =", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateNotEqualTo(String value) {
            addCriterion("b_date <>", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateGreaterThan(String value) {
            addCriterion("b_date >", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateGreaterThanOrEqualTo(String value) {
            addCriterion("b_date >=", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateLessThan(String value) {
            addCriterion("b_date <", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateLessThanOrEqualTo(String value) {
            addCriterion("b_date <=", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateLike(String value) {
            addCriterion("b_date like", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateNotLike(String value) {
            addCriterion("b_date not like", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateIn(List<String> values) {
            addCriterion("b_date in", values, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateNotIn(List<String> values) {
            addCriterion("b_date not in", values, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateBetween(String value1, String value2) {
            addCriterion("b_date between", value1, value2, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateNotBetween(String value1, String value2) {
            addCriterion("b_date not between", value1, value2, "bDate");
            return (Criteria) this;
        }

        public Criteria andBVerifyIsNull() {
            addCriterion("b_verify is null");
            return (Criteria) this;
        }

        public Criteria andBVerifyIsNotNull() {
            addCriterion("b_verify is not null");
            return (Criteria) this;
        }

        public Criteria andBVerifyEqualTo(Integer value) {
            addCriterion("b_verify =", value, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBVerifyNotEqualTo(Integer value) {
            addCriterion("b_verify <>", value, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBVerifyGreaterThan(Integer value) {
            addCriterion("b_verify >", value, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBVerifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_verify >=", value, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBVerifyLessThan(Integer value) {
            addCriterion("b_verify <", value, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBVerifyLessThanOrEqualTo(Integer value) {
            addCriterion("b_verify <=", value, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBVerifyIn(List<Integer> values) {
            addCriterion("b_verify in", values, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBVerifyNotIn(List<Integer> values) {
            addCriterion("b_verify not in", values, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBVerifyBetween(Integer value1, Integer value2) {
            addCriterion("b_verify between", value1, value2, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBVerifyNotBetween(Integer value1, Integer value2) {
            addCriterion("b_verify not between", value1, value2, "bVerify");
            return (Criteria) this;
        }

        public Criteria andBPublishIsNull() {
            addCriterion("b_publish is null");
            return (Criteria) this;
        }

        public Criteria andBPublishIsNotNull() {
            addCriterion("b_publish is not null");
            return (Criteria) this;
        }

        public Criteria andBPublishEqualTo(Integer value) {
            addCriterion("b_publish =", value, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBPublishNotEqualTo(Integer value) {
            addCriterion("b_publish <>", value, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBPublishGreaterThan(Integer value) {
            addCriterion("b_publish >", value, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBPublishGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_publish >=", value, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBPublishLessThan(Integer value) {
            addCriterion("b_publish <", value, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBPublishLessThanOrEqualTo(Integer value) {
            addCriterion("b_publish <=", value, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBPublishIn(List<Integer> values) {
            addCriterion("b_publish in", values, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBPublishNotIn(List<Integer> values) {
            addCriterion("b_publish not in", values, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBPublishBetween(Integer value1, Integer value2) {
            addCriterion("b_publish between", value1, value2, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBPublishNotBetween(Integer value1, Integer value2) {
            addCriterion("b_publish not between", value1, value2, "bPublish");
            return (Criteria) this;
        }

        public Criteria andBStatusIsNull() {
            addCriterion("b_status is null");
            return (Criteria) this;
        }

        public Criteria andBStatusIsNotNull() {
            addCriterion("b_status is not null");
            return (Criteria) this;
        }

        public Criteria andBStatusEqualTo(Integer value) {
            addCriterion("b_status =", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusNotEqualTo(Integer value) {
            addCriterion("b_status <>", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusGreaterThan(Integer value) {
            addCriterion("b_status >", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_status >=", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusLessThan(Integer value) {
            addCriterion("b_status <", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusLessThanOrEqualTo(Integer value) {
            addCriterion("b_status <=", value, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusIn(List<Integer> values) {
            addCriterion("b_status in", values, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusNotIn(List<Integer> values) {
            addCriterion("b_status not in", values, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusBetween(Integer value1, Integer value2) {
            addCriterion("b_status between", value1, value2, "bStatus");
            return (Criteria) this;
        }

        public Criteria andBStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("b_status not between", value1, value2, "bStatus");
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