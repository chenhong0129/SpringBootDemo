package cn.ucmed.model;

import java.util.Date;

public class TUser {
    private Integer id;

    private Integer quesId;

    private String sessionId;

    private Integer deptId;

    private String deptName;

    private Integer doctId;

    private String doctName;

    private String doctDesc;

    private String doctTitle;

    private String doctSex;

    private Date createTime;

    private Date modifyTime;

    private String temp1;

    private String temp2;

    private String temp3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getDoctId() {
        return doctId;
    }

    public void setDoctId(Integer doctId) {
        this.doctId = doctId;
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName == null ? null : doctName.trim();
    }

    public String getDoctDesc() {
        return doctDesc;
    }

    public void setDoctDesc(String doctDesc) {
        this.doctDesc = doctDesc == null ? null : doctDesc.trim();
    }

    public String getDoctTitle() {
        return doctTitle;
    }

    public void setDoctTitle(String doctTitle) {
        this.doctTitle = doctTitle == null ? null : doctTitle.trim();
    }

    public String getDoctSex() {
        return doctSex;
    }

    public void setDoctSex(String doctSex) {
        this.doctSex = doctSex == null ? null : doctSex.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }

    public String getTemp3() {
        return temp3;
    }

    public void setTemp3(String temp3) {
        this.temp3 = temp3 == null ? null : temp3.trim();
    }
}