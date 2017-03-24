package cn.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class VirtualExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VirtualExample() {
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

        public Criteria andVirIdIsNull() {
            addCriterion("vir_id is null");
            return (Criteria) this;
        }

        public Criteria andVirIdIsNotNull() {
            addCriterion("vir_id is not null");
            return (Criteria) this;
        }

        public Criteria andVirIdEqualTo(Integer value) {
            addCriterion("vir_id =", value, "virId");
            return (Criteria) this;
        }

        public Criteria andVirIdNotEqualTo(Integer value) {
            addCriterion("vir_id <>", value, "virId");
            return (Criteria) this;
        }

        public Criteria andVirIdGreaterThan(Integer value) {
            addCriterion("vir_id >", value, "virId");
            return (Criteria) this;
        }

        public Criteria andVirIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vir_id >=", value, "virId");
            return (Criteria) this;
        }

        public Criteria andVirIdLessThan(Integer value) {
            addCriterion("vir_id <", value, "virId");
            return (Criteria) this;
        }

        public Criteria andVirIdLessThanOrEqualTo(Integer value) {
            addCriterion("vir_id <=", value, "virId");
            return (Criteria) this;
        }

        public Criteria andVirIdIn(List<Integer> values) {
            addCriterion("vir_id in", values, "virId");
            return (Criteria) this;
        }

        public Criteria andVirIdNotIn(List<Integer> values) {
            addCriterion("vir_id not in", values, "virId");
            return (Criteria) this;
        }

        public Criteria andVirIdBetween(Integer value1, Integer value2) {
            addCriterion("vir_id between", value1, value2, "virId");
            return (Criteria) this;
        }

        public Criteria andVirIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vir_id not between", value1, value2, "virId");
            return (Criteria) this;
        }

        public Criteria andVirNameIsNull() {
            addCriterion("vir_name is null");
            return (Criteria) this;
        }

        public Criteria andVirNameIsNotNull() {
            addCriterion("vir_name is not null");
            return (Criteria) this;
        }

        public Criteria andVirNameEqualTo(String value) {
            addCriterion("vir_name =", value, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameNotEqualTo(String value) {
            addCriterion("vir_name <>", value, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameGreaterThan(String value) {
            addCriterion("vir_name >", value, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameGreaterThanOrEqualTo(String value) {
            addCriterion("vir_name >=", value, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameLessThan(String value) {
            addCriterion("vir_name <", value, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameLessThanOrEqualTo(String value) {
            addCriterion("vir_name <=", value, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameLike(String value) {
            addCriterion("vir_name like", value, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameNotLike(String value) {
            addCriterion("vir_name not like", value, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameIn(List<String> values) {
            addCriterion("vir_name in", values, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameNotIn(List<String> values) {
            addCriterion("vir_name not in", values, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameBetween(String value1, String value2) {
            addCriterion("vir_name between", value1, value2, "virName");
            return (Criteria) this;
        }

        public Criteria andVirNameNotBetween(String value1, String value2) {
            addCriterion("vir_name not between", value1, value2, "virName");
            return (Criteria) this;
        }

        public Criteria andVirMemoryIsNull() {
            addCriterion("vir_memory is null");
            return (Criteria) this;
        }

        public Criteria andVirMemoryIsNotNull() {
            addCriterion("vir_memory is not null");
            return (Criteria) this;
        }

        public Criteria andVirMemoryEqualTo(String value) {
            addCriterion("vir_memory =", value, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryNotEqualTo(String value) {
            addCriterion("vir_memory <>", value, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryGreaterThan(String value) {
            addCriterion("vir_memory >", value, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("vir_memory >=", value, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryLessThan(String value) {
            addCriterion("vir_memory <", value, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryLessThanOrEqualTo(String value) {
            addCriterion("vir_memory <=", value, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryLike(String value) {
            addCriterion("vir_memory like", value, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryNotLike(String value) {
            addCriterion("vir_memory not like", value, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryIn(List<String> values) {
            addCriterion("vir_memory in", values, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryNotIn(List<String> values) {
            addCriterion("vir_memory not in", values, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryBetween(String value1, String value2) {
            addCriterion("vir_memory between", value1, value2, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirMemoryNotBetween(String value1, String value2) {
            addCriterion("vir_memory not between", value1, value2, "virMemory");
            return (Criteria) this;
        }

        public Criteria andVirDiskIsNull() {
            addCriterion("vir_disk is null");
            return (Criteria) this;
        }

        public Criteria andVirDiskIsNotNull() {
            addCriterion("vir_disk is not null");
            return (Criteria) this;
        }

        public Criteria andVirDiskEqualTo(String value) {
            addCriterion("vir_disk =", value, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskNotEqualTo(String value) {
            addCriterion("vir_disk <>", value, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskGreaterThan(String value) {
            addCriterion("vir_disk >", value, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskGreaterThanOrEqualTo(String value) {
            addCriterion("vir_disk >=", value, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskLessThan(String value) {
            addCriterion("vir_disk <", value, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskLessThanOrEqualTo(String value) {
            addCriterion("vir_disk <=", value, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskLike(String value) {
            addCriterion("vir_disk like", value, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskNotLike(String value) {
            addCriterion("vir_disk not like", value, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskIn(List<String> values) {
            addCriterion("vir_disk in", values, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskNotIn(List<String> values) {
            addCriterion("vir_disk not in", values, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskBetween(String value1, String value2) {
            addCriterion("vir_disk between", value1, value2, "virDisk");
            return (Criteria) this;
        }

        public Criteria andVirDiskNotBetween(String value1, String value2) {
            addCriterion("vir_disk not between", value1, value2, "virDisk");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
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