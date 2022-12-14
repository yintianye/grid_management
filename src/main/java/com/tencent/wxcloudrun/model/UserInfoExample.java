package com.tencent.wxcloudrun.model;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_info
     *
     * @mbggenerated
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
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

        public Criteria andCommitteeIdIsNull() {
            addCriterion("committee_id is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdIsNotNull() {
            addCriterion("committee_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdEqualTo(Integer value) {
            addCriterion("committee_id =", value, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdNotEqualTo(Integer value) {
            addCriterion("committee_id <>", value, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdGreaterThan(Integer value) {
            addCriterion("committee_id >", value, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("committee_id >=", value, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdLessThan(Integer value) {
            addCriterion("committee_id <", value, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdLessThanOrEqualTo(Integer value) {
            addCriterion("committee_id <=", value, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdIn(List<Integer> values) {
            addCriterion("committee_id in", values, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdNotIn(List<Integer> values) {
            addCriterion("committee_id not in", values, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdBetween(Integer value1, Integer value2) {
            addCriterion("committee_id between", value1, value2, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("committee_id not between", value1, value2, "committeeId");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameIsNull() {
            addCriterion("committee_name is null");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameIsNotNull() {
            addCriterion("committee_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameEqualTo(String value) {
            addCriterion("committee_name =", value, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameNotEqualTo(String value) {
            addCriterion("committee_name <>", value, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameGreaterThan(String value) {
            addCriterion("committee_name >", value, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameGreaterThanOrEqualTo(String value) {
            addCriterion("committee_name >=", value, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameLessThan(String value) {
            addCriterion("committee_name <", value, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameLessThanOrEqualTo(String value) {
            addCriterion("committee_name <=", value, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameLike(String value) {
            addCriterion("committee_name like", value, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameNotLike(String value) {
            addCriterion("committee_name not like", value, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameIn(List<String> values) {
            addCriterion("committee_name in", values, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameNotIn(List<String> values) {
            addCriterion("committee_name not in", values, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameBetween(String value1, String value2) {
            addCriterion("committee_name between", value1, value2, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommitteeNameNotBetween(String value1, String value2) {
            addCriterion("committee_name not between", value1, value2, "committeeName");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNull() {
            addCriterion("community_id is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIsNotNull() {
            addCriterion("community_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityIdEqualTo(Integer value) {
            addCriterion("community_id =", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotEqualTo(Integer value) {
            addCriterion("community_id <>", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThan(Integer value) {
            addCriterion("community_id >", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("community_id >=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThan(Integer value) {
            addCriterion("community_id <", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdLessThanOrEqualTo(Integer value) {
            addCriterion("community_id <=", value, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdIn(List<Integer> values) {
            addCriterion("community_id in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotIn(List<Integer> values) {
            addCriterion("community_id not in", values, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdBetween(Integer value1, Integer value2) {
            addCriterion("community_id between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("community_id not between", value1, value2, "communityId");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIsNull() {
            addCriterion("community_name is null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIsNotNull() {
            addCriterion("community_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityNameEqualTo(String value) {
            addCriterion("community_name =", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotEqualTo(String value) {
            addCriterion("community_name <>", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThan(String value) {
            addCriterion("community_name >", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameGreaterThanOrEqualTo(String value) {
            addCriterion("community_name >=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThan(String value) {
            addCriterion("community_name <", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLessThanOrEqualTo(String value) {
            addCriterion("community_name <=", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameLike(String value) {
            addCriterion("community_name like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotLike(String value) {
            addCriterion("community_name not like", value, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameIn(List<String> values) {
            addCriterion("community_name in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotIn(List<String> values) {
            addCriterion("community_name not in", values, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameBetween(String value1, String value2) {
            addCriterion("community_name between", value1, value2, "communityName");
            return (Criteria) this;
        }

        public Criteria andCommunityNameNotBetween(String value1, String value2) {
            addCriterion("community_name not between", value1, value2, "communityName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdIsNull() {
            addCriterion("party_branch_id is null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdIsNotNull() {
            addCriterion("party_branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdEqualTo(Integer value) {
            addCriterion("party_branch_id =", value, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdNotEqualTo(Integer value) {
            addCriterion("party_branch_id <>", value, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdGreaterThan(Integer value) {
            addCriterion("party_branch_id >", value, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("party_branch_id >=", value, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdLessThan(Integer value) {
            addCriterion("party_branch_id <", value, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdLessThanOrEqualTo(Integer value) {
            addCriterion("party_branch_id <=", value, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdIn(List<Integer> values) {
            addCriterion("party_branch_id in", values, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdNotIn(List<Integer> values) {
            addCriterion("party_branch_id not in", values, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdBetween(Integer value1, Integer value2) {
            addCriterion("party_branch_id between", value1, value2, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("party_branch_id not between", value1, value2, "partyBranchId");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameIsNull() {
            addCriterion("party_branch_name is null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameIsNotNull() {
            addCriterion("party_branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameEqualTo(String value) {
            addCriterion("party_branch_name =", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameNotEqualTo(String value) {
            addCriterion("party_branch_name <>", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameGreaterThan(String value) {
            addCriterion("party_branch_name >", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("party_branch_name >=", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameLessThan(String value) {
            addCriterion("party_branch_name <", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameLessThanOrEqualTo(String value) {
            addCriterion("party_branch_name <=", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameLike(String value) {
            addCriterion("party_branch_name like", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameNotLike(String value) {
            addCriterion("party_branch_name not like", value, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameIn(List<String> values) {
            addCriterion("party_branch_name in", values, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameNotIn(List<String> values) {
            addCriterion("party_branch_name not in", values, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameBetween(String value1, String value2) {
            addCriterion("party_branch_name between", value1, value2, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andPartyBranchNameNotBetween(String value1, String value2) {
            addCriterion("party_branch_name not between", value1, value2, "partyBranchName");
            return (Criteria) this;
        }

        public Criteria andGridIdIsNull() {
            addCriterion("grid_id is null");
            return (Criteria) this;
        }

        public Criteria andGridIdIsNotNull() {
            addCriterion("grid_id is not null");
            return (Criteria) this;
        }

        public Criteria andGridIdEqualTo(Integer value) {
            addCriterion("grid_id =", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotEqualTo(Integer value) {
            addCriterion("grid_id <>", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdGreaterThan(Integer value) {
            addCriterion("grid_id >", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grid_id >=", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdLessThan(Integer value) {
            addCriterion("grid_id <", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdLessThanOrEqualTo(Integer value) {
            addCriterion("grid_id <=", value, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdIn(List<Integer> values) {
            addCriterion("grid_id in", values, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotIn(List<Integer> values) {
            addCriterion("grid_id not in", values, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdBetween(Integer value1, Integer value2) {
            addCriterion("grid_id between", value1, value2, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grid_id not between", value1, value2, "gridId");
            return (Criteria) this;
        }

        public Criteria andGridNameIsNull() {
            addCriterion("grid_name is null");
            return (Criteria) this;
        }

        public Criteria andGridNameIsNotNull() {
            addCriterion("grid_name is not null");
            return (Criteria) this;
        }

        public Criteria andGridNameEqualTo(String value) {
            addCriterion("grid_name =", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotEqualTo(String value) {
            addCriterion("grid_name <>", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameGreaterThan(String value) {
            addCriterion("grid_name >", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameGreaterThanOrEqualTo(String value) {
            addCriterion("grid_name >=", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameLessThan(String value) {
            addCriterion("grid_name <", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameLessThanOrEqualTo(String value) {
            addCriterion("grid_name <=", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameLike(String value) {
            addCriterion("grid_name like", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotLike(String value) {
            addCriterion("grid_name not like", value, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameIn(List<String> values) {
            addCriterion("grid_name in", values, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotIn(List<String> values) {
            addCriterion("grid_name not in", values, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameBetween(String value1, String value2) {
            addCriterion("grid_name between", value1, value2, "gridName");
            return (Criteria) this;
        }

        public Criteria andGridNameNotBetween(String value1, String value2) {
            addCriterion("grid_name not between", value1, value2, "gridName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_info
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_info
     *
     * @mbggenerated
     */
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