package com.accp.domain;

public class Permission {
    private Integer pid;

    private String pname;

    private String path;

    private Integer parentid;

    private Integer boolid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getBoolid() {
        return boolid;
    }

    public void setBoolid(Integer boolid) {
        this.boolid = boolid;
    }
}