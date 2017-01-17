package com.fusion.model;


import java.util.List;

/**
 *  业务监控分组子业务对象
 */
public class BusinessGroup {

    /**
     *  业务管理ID  如果为新建分组则ID为null
     */
    private String id;

    /**
     *  分组名称
     */
    private String label;

    /**
     *  暂时未用 (无用, 可设空)
     */
    private String value;

    /**
     *  是否选择分组 (无用)
     */
    private boolean check;

    /**
     *  是否有子业务 (无用)
     */
    private boolean indeterminate;

    /**
     *  是否展示
     */
    private Boolean isshow;

    private List<BusinessGroup> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public boolean isIndeterminate() {
        return indeterminate;
    }

    public void setIndeterminate(boolean indeterminate) {
        this.indeterminate = indeterminate;
    }

    public boolean isshow() {
        return isshow;
    }

    public void setIsshow(boolean isshow) {
        this.isshow = isshow;
    }

    public List<BusinessGroup> getChildren() {
        return children;
    }

    public void setChildren(List<BusinessGroup> children) {
        this.children = children;
    }
}
