package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class PhysicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhysicalExample() {
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

        public Criteria andPhyIdIsNull() {
            addCriterion("phy_id is null");
            return (Criteria) this;
        }

        public Criteria andPhyIdIsNotNull() {
            addCriterion("phy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhyIdEqualTo(Integer value) {
            addCriterion("phy_id =", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdNotEqualTo(Integer value) {
            addCriterion("phy_id <>", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdGreaterThan(Integer value) {
            addCriterion("phy_id >", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("phy_id >=", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdLessThan(Integer value) {
            addCriterion("phy_id <", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdLessThanOrEqualTo(Integer value) {
            addCriterion("phy_id <=", value, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdIn(List<Integer> values) {
            addCriterion("phy_id in", values, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdNotIn(List<Integer> values) {
            addCriterion("phy_id not in", values, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdBetween(Integer value1, Integer value2) {
            addCriterion("phy_id between", value1, value2, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("phy_id not between", value1, value2, "phyId");
            return (Criteria) this;
        }

        public Criteria andPhyNameIsNull() {
            addCriterion("phy_name is null");
            return (Criteria) this;
        }

        public Criteria andPhyNameIsNotNull() {
            addCriterion("phy_name is not null");
            return (Criteria) this;
        }

        public Criteria andPhyNameEqualTo(String value) {
            addCriterion("phy_name =", value, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameNotEqualTo(String value) {
            addCriterion("phy_name <>", value, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameGreaterThan(String value) {
            addCriterion("phy_name >", value, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameGreaterThanOrEqualTo(String value) {
            addCriterion("phy_name >=", value, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameLessThan(String value) {
            addCriterion("phy_name <", value, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameLessThanOrEqualTo(String value) {
            addCriterion("phy_name <=", value, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameLike(String value) {
            addCriterion("phy_name like", value, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameNotLike(String value) {
            addCriterion("phy_name not like", value, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameIn(List<String> values) {
            addCriterion("phy_name in", values, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameNotIn(List<String> values) {
            addCriterion("phy_name not in", values, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameBetween(String value1, String value2) {
            addCriterion("phy_name between", value1, value2, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyNameNotBetween(String value1, String value2) {
            addCriterion("phy_name not between", value1, value2, "phyName");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryIsNull() {
            addCriterion("phy_memory is null");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryIsNotNull() {
            addCriterion("phy_memory is not null");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryEqualTo(String value) {
            addCriterion("phy_memory =", value, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryNotEqualTo(String value) {
            addCriterion("phy_memory <>", value, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryGreaterThan(String value) {
            addCriterion("phy_memory >", value, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("phy_memory >=", value, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryLessThan(String value) {
            addCriterion("phy_memory <", value, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryLessThanOrEqualTo(String value) {
            addCriterion("phy_memory <=", value, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryLike(String value) {
            addCriterion("phy_memory like", value, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryNotLike(String value) {
            addCriterion("phy_memory not like", value, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryIn(List<String> values) {
            addCriterion("phy_memory in", values, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryNotIn(List<String> values) {
            addCriterion("phy_memory not in", values, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryBetween(String value1, String value2) {
            addCriterion("phy_memory between", value1, value2, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyMemoryNotBetween(String value1, String value2) {
            addCriterion("phy_memory not between", value1, value2, "phyMemory");
            return (Criteria) this;
        }

        public Criteria andPhyDiskIsNull() {
            addCriterion("phy_disk is null");
            return (Criteria) this;
        }

        public Criteria andPhyDiskIsNotNull() {
            addCriterion("phy_disk is not null");
            return (Criteria) this;
        }

        public Criteria andPhyDiskEqualTo(String value) {
            addCriterion("phy_disk =", value, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskNotEqualTo(String value) {
            addCriterion("phy_disk <>", value, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskGreaterThan(String value) {
            addCriterion("phy_disk >", value, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskGreaterThanOrEqualTo(String value) {
            addCriterion("phy_disk >=", value, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskLessThan(String value) {
            addCriterion("phy_disk <", value, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskLessThanOrEqualTo(String value) {
            addCriterion("phy_disk <=", value, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskLike(String value) {
            addCriterion("phy_disk like", value, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskNotLike(String value) {
            addCriterion("phy_disk not like", value, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskIn(List<String> values) {
            addCriterion("phy_disk in", values, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskNotIn(List<String> values) {
            addCriterion("phy_disk not in", values, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskBetween(String value1, String value2) {
            addCriterion("phy_disk between", value1, value2, "phyDisk");
            return (Criteria) this;
        }

        public Criteria andPhyDiskNotBetween(String value1, String value2) {
            addCriterion("phy_disk not between", value1, value2, "phyDisk");
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