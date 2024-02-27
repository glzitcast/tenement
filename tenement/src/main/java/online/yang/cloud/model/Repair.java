package online.yang.cloud.model;


import java.util.Date;


public class Repair {
    private String repairId;

    private String repairHouse;

    private String repairContent;

    private Date repairDate;

    private String repairOperator;

    private String repairOperatorNo;

    private Integer repairStatus;

    private Integer repairOwnerStatus;

    private String repairComment;

    public String getRepairId() {
        return repairId;
    }

    public void setRepairId(String repairId) {
        this.repairId = repairId;
    }

    public String getRepairHouse() {
        return repairHouse;
    }

    public void setRepairHouse(String repairHouse) {
        this.repairHouse = repairHouse;
    }

    public String getRepairContent() {
        return repairContent;
    }

    public void setRepairContent(String repairContent) {
        this.repairContent = repairContent;
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public String getRepairOperator() {
        return repairOperator;
    }

    public void setRepairOperator(String repairOperator) {
        this.repairOperator = repairOperator;
    }

    public String getRepairOperatorNo() {
        return repairOperatorNo;
    }

    public void setRepairOperatorNo(String repairOperatorNo) {
        this.repairOperatorNo = repairOperatorNo;
    }

    public Integer getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(Integer repairStatus) {
        this.repairStatus = repairStatus;
    }

    public Integer getRepairOwnerStatus() {
        return repairOwnerStatus;
    }

    public void setRepairOwnerStatus(Integer repairOwnerStatus) {
        this.repairOwnerStatus = repairOwnerStatus;
    }

    public String getRepairComment() {
        return repairComment;
    }

    public void setRepairComment(String repairComment) {
        this.repairComment = repairComment;
    }
}