package qyt.manageArticle.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andAPasswordIsNull() {
            addCriterion("a_password is null");
            return (Criteria) this;
        }

        public Criteria andAPasswordIsNotNull() {
            addCriterion("a_password is not null");
            return (Criteria) this;
        }

        public Criteria andAPasswordEqualTo(String value) {
            addCriterion("a_password =", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotEqualTo(String value) {
            addCriterion("a_password <>", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordGreaterThan(String value) {
            addCriterion("a_password >", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("a_password >=", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLessThan(String value) {
            addCriterion("a_password <", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLessThanOrEqualTo(String value) {
            addCriterion("a_password <=", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordLike(String value) {
            addCriterion("a_password like", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotLike(String value) {
            addCriterion("a_password not like", value, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordIn(List<String> values) {
            addCriterion("a_password in", values, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotIn(List<String> values) {
            addCriterion("a_password not in", values, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordBetween(String value1, String value2) {
            addCriterion("a_password between", value1, value2, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPasswordNotBetween(String value1, String value2) {
            addCriterion("a_password not between", value1, value2, "aPassword");
            return (Criteria) this;
        }

        public Criteria andAPhoneIsNull() {
            addCriterion("a_phone is null");
            return (Criteria) this;
        }

        public Criteria andAPhoneIsNotNull() {
            addCriterion("a_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAPhoneEqualTo(String value) {
            addCriterion("a_phone =", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotEqualTo(String value) {
            addCriterion("a_phone <>", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneGreaterThan(String value) {
            addCriterion("a_phone >", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("a_phone >=", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLessThan(String value) {
            addCriterion("a_phone <", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLessThanOrEqualTo(String value) {
            addCriterion("a_phone <=", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneLike(String value) {
            addCriterion("a_phone like", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotLike(String value) {
            addCriterion("a_phone not like", value, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneIn(List<String> values) {
            addCriterion("a_phone in", values, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotIn(List<String> values) {
            addCriterion("a_phone not in", values, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneBetween(String value1, String value2) {
            addCriterion("a_phone between", value1, value2, "aPhone");
            return (Criteria) this;
        }

        public Criteria andAPhoneNotBetween(String value1, String value2) {
            addCriterion("a_phone not between", value1, value2, "aPhone");
            return (Criteria) this;
        }

        public Criteria andACheckcodeIsNull() {
            addCriterion("a_checkCode is null");
            return (Criteria) this;
        }

        public Criteria andACheckcodeIsNotNull() {
            addCriterion("a_checkCode is not null");
            return (Criteria) this;
        }

        public Criteria andACheckcodeEqualTo(String value) {
            addCriterion("a_checkCode =", value, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeNotEqualTo(String value) {
            addCriterion("a_checkCode <>", value, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeGreaterThan(String value) {
            addCriterion("a_checkCode >", value, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("a_checkCode >=", value, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeLessThan(String value) {
            addCriterion("a_checkCode <", value, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeLessThanOrEqualTo(String value) {
            addCriterion("a_checkCode <=", value, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeLike(String value) {
            addCriterion("a_checkCode like", value, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeNotLike(String value) {
            addCriterion("a_checkCode not like", value, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeIn(List<String> values) {
            addCriterion("a_checkCode in", values, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeNotIn(List<String> values) {
            addCriterion("a_checkCode not in", values, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeBetween(String value1, String value2) {
            addCriterion("a_checkCode between", value1, value2, "aCheckcode");
            return (Criteria) this;
        }

        public Criteria andACheckcodeNotBetween(String value1, String value2) {
            addCriterion("a_checkCode not between", value1, value2, "aCheckcode");
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