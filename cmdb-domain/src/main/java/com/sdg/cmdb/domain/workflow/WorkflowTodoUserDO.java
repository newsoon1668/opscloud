package com.sdg.cmdb.domain.workflow;

import java.io.Serializable;

public class WorkflowTodoUserDO implements Serializable {

    private static final long serialVersionUID = 2349909897311211918L;
    private long id;

    /**
     * 代理类型 0:teamleader 1:deptLeader 2:ops
     */
    private int assigneeType;

    public enum AssigneeTypeEnum {
        qc(0, "qc"),
        teamleader(1, "teamleader"),
        deptLeader(2, "deptLeader"),
        ops(3, "ops");
        private int code;
        private String desc;

        AssigneeTypeEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }

        public static String getAssigneeTypeName(int code) {
            for (AssigneeTypeEnum assigneeTypeEnum : AssigneeTypeEnum.values()) {
                if (assigneeTypeEnum.getCode() == code) {
                    return assigneeTypeEnum.getDesc();
                }
            }
            return "undefined";
        }
    }

    private String assigneeDesc;

    private long userId;

    private String displayName;

    /**
     * approve/disapprove/refuse/delegate
     */
    private int evaluation;

    public enum EvaluationTypeEnum {
        empty(0,"empty"),
        approve(1, "approve"),
        disapprove(2, "disapprove"),
        refuse(3, "refuse"),
        delegate(4, "delegate");
        private int code;
        private String desc;

        EvaluationTypeEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }

        public static String getEvaluationTypeName(int code) {
            for (EvaluationTypeEnum evaluationTypeEnum : EvaluationTypeEnum.values()) {
                if (evaluationTypeEnum.getCode() == code) {
                    return evaluationTypeEnum.getDesc();
                }
            }
            return "undefined";
        }
    }


    private String evaluationMsg;

    private String gmtCreate;

    private String gmtModify;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAssigneeType() {
        return assigneeType;
    }

    public void setAssigneeType(int assigneeType) {
        this.assigneeType = assigneeType;
    }

    public String getAssigneeDesc() {
        return assigneeDesc;
    }

    public void setAssigneeDesc(String assigneeDesc) {
        this.assigneeDesc = assigneeDesc;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public String getEvaluationMsg() {
        return evaluationMsg;
    }

    public void setEvaluationMsg(String evaluationMsg) {
        this.evaluationMsg = evaluationMsg;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
    }
}
