package qyt.manageArticle.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDDateIsNull() {
            addCriterion("d_date is null");
            return (Criteria) this;
        }

        public Criteria andDDateIsNotNull() {
            addCriterion("d_date is not null");
            return (Criteria) this;
        }

        public Criteria andDDateEqualTo(String value) {
            addCriterion("d_date =", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotEqualTo(String value) {
            addCriterion("d_date <>", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateGreaterThan(String value) {
            addCriterion("d_date >", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateGreaterThanOrEqualTo(String value) {
            addCriterion("d_date >=", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateLessThan(String value) {
            addCriterion("d_date <", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateLessThanOrEqualTo(String value) {
            addCriterion("d_date <=", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateLike(String value) {
            addCriterion("d_date like", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotLike(String value) {
            addCriterion("d_date not like", value, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateIn(List<String> values) {
            addCriterion("d_date in", values, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotIn(List<String> values) {
            addCriterion("d_date not in", values, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateBetween(String value1, String value2) {
            addCriterion("d_date between", value1, value2, "dDate");
            return (Criteria) this;
        }

        public Criteria andDDateNotBetween(String value1, String value2) {
            addCriterion("d_date not between", value1, value2, "dDate");
            return (Criteria) this;
        }

        public Criteria andDContentIsNull() {
            addCriterion("d_content is null");
            return (Criteria) this;
        }

        public Criteria andDContentIsNotNull() {
            addCriterion("d_content is not null");
            return (Criteria) this;
        }

        public Criteria andDContentEqualTo(String value) {
            addCriterion("d_content =", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotEqualTo(String value) {
            addCriterion("d_content <>", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentGreaterThan(String value) {
            addCriterion("d_content >", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentGreaterThanOrEqualTo(String value) {
            addCriterion("d_content >=", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentLessThan(String value) {
            addCriterion("d_content <", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentLessThanOrEqualTo(String value) {
            addCriterion("d_content <=", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentLike(String value) {
            addCriterion("d_content like", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotLike(String value) {
            addCriterion("d_content not like", value, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentIn(List<String> values) {
            addCriterion("d_content in", values, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotIn(List<String> values) {
            addCriterion("d_content not in", values, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentBetween(String value1, String value2) {
            addCriterion("d_content between", value1, value2, "dContent");
            return (Criteria) this;
        }

        public Criteria andDContentNotBetween(String value1, String value2) {
            addCriterion("d_content not between", value1, value2, "dContent");
            return (Criteria) this;
        }

        public Criteria andDForNameIsNull() {
            addCriterion("d_for_name is null");
            return (Criteria) this;
        }

        public Criteria andDForNameIsNotNull() {
            addCriterion("d_for_name is not null");
            return (Criteria) this;
        }

        public Criteria andDForNameEqualTo(String value) {
            addCriterion("d_for_name =", value, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameNotEqualTo(String value) {
            addCriterion("d_for_name <>", value, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameGreaterThan(String value) {
            addCriterion("d_for_name >", value, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_for_name >=", value, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameLessThan(String value) {
            addCriterion("d_for_name <", value, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameLessThanOrEqualTo(String value) {
            addCriterion("d_for_name <=", value, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameLike(String value) {
            addCriterion("d_for_name like", value, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameNotLike(String value) {
            addCriterion("d_for_name not like", value, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameIn(List<String> values) {
            addCriterion("d_for_name in", values, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameNotIn(List<String> values) {
            addCriterion("d_for_name not in", values, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameBetween(String value1, String value2) {
            addCriterion("d_for_name between", value1, value2, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForNameNotBetween(String value1, String value2) {
            addCriterion("d_for_name not between", value1, value2, "dForName");
            return (Criteria) this;
        }

        public Criteria andDForWordsIsNull() {
            addCriterion("d_for_words is null");
            return (Criteria) this;
        }

        public Criteria andDForWordsIsNotNull() {
            addCriterion("d_for_words is not null");
            return (Criteria) this;
        }

        public Criteria andDForWordsEqualTo(String value) {
            addCriterion("d_for_words =", value, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsNotEqualTo(String value) {
            addCriterion("d_for_words <>", value, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsGreaterThan(String value) {
            addCriterion("d_for_words >", value, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsGreaterThanOrEqualTo(String value) {
            addCriterion("d_for_words >=", value, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsLessThan(String value) {
            addCriterion("d_for_words <", value, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsLessThanOrEqualTo(String value) {
            addCriterion("d_for_words <=", value, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsLike(String value) {
            addCriterion("d_for_words like", value, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsNotLike(String value) {
            addCriterion("d_for_words not like", value, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsIn(List<String> values) {
            addCriterion("d_for_words in", values, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsNotIn(List<String> values) {
            addCriterion("d_for_words not in", values, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsBetween(String value1, String value2) {
            addCriterion("d_for_words between", value1, value2, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForWordsNotBetween(String value1, String value2) {
            addCriterion("d_for_words not between", value1, value2, "dForWords");
            return (Criteria) this;
        }

        public Criteria andDForReplyIsNull() {
            addCriterion("d_for_reply is null");
            return (Criteria) this;
        }

        public Criteria andDForReplyIsNotNull() {
            addCriterion("d_for_reply is not null");
            return (Criteria) this;
        }

        public Criteria andDForReplyEqualTo(String value) {
            addCriterion("d_for_reply =", value, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyNotEqualTo(String value) {
            addCriterion("d_for_reply <>", value, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyGreaterThan(String value) {
            addCriterion("d_for_reply >", value, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyGreaterThanOrEqualTo(String value) {
            addCriterion("d_for_reply >=", value, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyLessThan(String value) {
            addCriterion("d_for_reply <", value, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyLessThanOrEqualTo(String value) {
            addCriterion("d_for_reply <=", value, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyLike(String value) {
            addCriterion("d_for_reply like", value, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyNotLike(String value) {
            addCriterion("d_for_reply not like", value, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyIn(List<String> values) {
            addCriterion("d_for_reply in", values, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyNotIn(List<String> values) {
            addCriterion("d_for_reply not in", values, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyBetween(String value1, String value2) {
            addCriterion("d_for_reply between", value1, value2, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForReplyNotBetween(String value1, String value2) {
            addCriterion("d_for_reply not between", value1, value2, "dForReply");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdIsNull() {
            addCriterion("d_for_article_id is null");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdIsNotNull() {
            addCriterion("d_for_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdEqualTo(String value) {
            addCriterion("d_for_article_id =", value, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdNotEqualTo(String value) {
            addCriterion("d_for_article_id <>", value, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdGreaterThan(String value) {
            addCriterion("d_for_article_id >", value, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("d_for_article_id >=", value, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdLessThan(String value) {
            addCriterion("d_for_article_id <", value, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdLessThanOrEqualTo(String value) {
            addCriterion("d_for_article_id <=", value, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdLike(String value) {
            addCriterion("d_for_article_id like", value, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdNotLike(String value) {
            addCriterion("d_for_article_id not like", value, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdIn(List<String> values) {
            addCriterion("d_for_article_id in", values, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdNotIn(List<String> values) {
            addCriterion("d_for_article_id not in", values, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdBetween(String value1, String value2) {
            addCriterion("d_for_article_id between", value1, value2, "dForArticleId");
            return (Criteria) this;
        }

        public Criteria andDForArticleIdNotBetween(String value1, String value2) {
            addCriterion("d_for_article_id not between", value1, value2, "dForArticleId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
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