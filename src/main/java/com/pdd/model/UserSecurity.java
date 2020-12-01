package com.pdd.model;


import com.pdd.common.Bean.BaseEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * 用户表 UserSecurity
 *
 * @author pdd_自动生成
 * @email pengdingding@lumlord.com
 * @date 2020-04-30 14:47:44
 */
public class UserSecurity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 主键ID，自增
     **/
    private Integer id;

    /**
     * 用户账号
     **/
    private String account;

    /**
     * 用户名
     **/
    private String userName;

    /**
     * 用户手机号
     **/
    private String mobilePhone;

    /**
     * 登录密码
     **/
    private String password;

    /**
     * 禁用状态（1禁用，0未禁用/默认）
     **/
    private Integer status;

    /**
     * 系统肤色
     **/
    private String skinColor;

    /**
     * redisToken 值。
     **/
    private String tooken;

    /**
     * 最后登录时间
     **/
    private Date lastLoginTime;

    /**
     * 注册时间
     **/
    private Date registerTime;

    /**
     * 登录次数 默认是 0
     **/
    private Integer loginTimes;

    /**
     * 登录IP
     **/
    private String ip;

    /**
     * 登录来源  0 PC 1 APP
     **/
    private Integer loginSource;

    /**
     * 机构ID
     **/
    private Integer organId;

    /**
     * 在岗状态(0在岗1离岗)
     **/
    private Integer dutyState;

    /**
     * 入职日期
     **/
    private Date joinDate;

    /**
     * 备注
     **/
    private String remark;

    /**
     * 聘用方式
     **/
    private Integer employType;

    /**
     * 离职日期
     **/
    private Date quitDate;

    /**
     * 身份证号码
     **/
    private String idNumber;

    /**
     * 是否实名认证 0 不是 1 是
     **/
    private Integer isRealname;

    /**
     * 劳务人员ID
     **/
    private Integer laborId;

    /**
     * 职位（从数据字典里取）
     **/
    private Integer job;

    /**
     * 机构名称
     */
    private String orginName;
    /**
     * 操作人名字
     */
    private String operatorName;

    /**
     * 项目传参数组
     */
    private int[] projectIds;

    /**
     * 角色传参数组
     */
    private int[] roleIds;

    /**
     * 职位名
     */
    private String jobName;

    /**
     * 雇佣类型名字
     */
    private String employTypeName;
    /**
     * 所属角色集合
     */
    private List<String> roleNames;

    /**
     * 所属项目集合
     */
    private List<String> projectNames;
    /**
     * 操作人名字
     */
    private String updateUserName;
    /**
     * 工种
     */
    private String workTypeName;

    /**
     * 在岗状态
     */
    private String dutyStateName;
    /** 用户头像 **/
    private String headAddress;
    /** 是否有数据权限（否   0   是 1） **/
    private Integer dataPermission;

    public Integer getDataPermission() {
        return dataPermission;
    }

    public void setDataPermission(Integer dataPermission) {
        this.dataPermission = dataPermission;
    }

    public String getHeadAddress() {
        return headAddress;
    }

    public void setHeadAddress(String headAddress) {
        this.headAddress = headAddress;
    }

    public String getDutyStateName() {
        return dutyStateName;
    }

    public void setDutyStateName(String dutyStateName) {
        this.dutyStateName = dutyStateName;
    }

    public String getWorkTypeName() {
        return workTypeName;
    }

    public void setWorkTypeName(String workTypeName) {
        this.workTypeName = workTypeName;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }


    public List<String> getProjectNames() {
        return projectNames;
    }

    public void setProjectNames(List<String> projectNames) {
        this.projectNames = projectNames;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

    public String getOrginName() {
        return orginName;
    }

    public void setOrginName(String orginName) {
        this.orginName = orginName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }


    public String getTooken() {
        return tooken;
    }

    public void setTooken(String tooken) {
        this.tooken = tooken;
    }


    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }


    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }


    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    public Integer getLoginSource() {
        return loginSource;
    }

    public void setLoginSource(Integer loginSource) {
        this.loginSource = loginSource;
    }


    public Integer getOrganId() {
        return organId;
    }

    public void setOrganId(Integer organId) {
        this.organId = organId;
    }


    public Integer getDutyState() {
        return dutyState;
    }

    public void setDutyState(Integer dutyState) {
        this.dutyState = dutyState;
    }


    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public Integer getEmployType() {
        return employType;
    }

    public void setEmployType(Integer employType) {
        this.employType = employType;
    }


    public Date getQuitDate() {
        return quitDate;
    }

    public void setQuitDate(Date quitDate) {
        this.quitDate = quitDate;
    }


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }


    public Integer getIsRealname() {
        return isRealname;
    }

    public void setIsRealname(Integer isRealname) {
        this.isRealname = isRealname;
    }


    public Integer getLaborId() {
        return laborId;
    }

    public void setLaborId(Integer laborId) {
        this.laborId = laborId;
    }


    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public int[] getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(int[] projectIds) {
        this.projectIds = projectIds;
    }

    public int[] getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(int[] roleIds) {
        this.roleIds = roleIds;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getEmployTypeName() {
        return employTypeName;
    }

    public void setEmployTypeName(String employTypeName) {
        this.employTypeName = employTypeName;
    }

    public UserSecurity() {
        super();
    }

}