package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 代下单任务表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class ImportOrderTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键标识
     */
      private Long Id;

    /**
     * 批次号
     */
    private String BatchNo;

    /**
     * 生成文件标识
     */
    private Long OrderFileId;

    /**
     * 有效数
     */
    private Integer ValidNumber;

    /**
     * 总行数
     */
    private Integer TotalNumber;

    /**
     * 生产订单数
     */
    private Integer OrderNumber;

    /**
     * 任务状态;待上传=10、校验中=20、生成中=25、已完成=30、已终止=40
     */
    private Integer Status;

    /**
     * 是否删除
     */
    private Boolean IsDeleted;

    /**
     * 创建人
     */
    private String CreatedBy;

    /**
     * 乐观锁
     */
    private Integer Revision;

    /**
     * 创建时间
     */
    private LocalDateTime CreatedTime;

    /**
     * 更新人
     */
    private String UpdatedBy;

    /**
     * 更新时间
     */
    private LocalDateTime UpdatedTime;

    /**
     * 生成失败数量
     */
    private Integer FailureNumber;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(String BatchNo) {
        this.BatchNo = BatchNo;
    }

    public Long getOrderFileId() {
        return OrderFileId;
    }

    public void setOrderFileId(Long OrderFileId) {
        this.OrderFileId = OrderFileId;
    }

    public Integer getValidNumber() {
        return ValidNumber;
    }

    public void setValidNumber(Integer ValidNumber) {
        this.ValidNumber = ValidNumber;
    }

    public Integer getTotalNumber() {
        return TotalNumber;
    }

    public void setTotalNumber(Integer TotalNumber) {
        this.TotalNumber = TotalNumber;
    }

    public Integer getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(Integer OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public Integer getRevision() {
        return Revision;
    }

    public void setRevision(Integer Revision) {
        this.Revision = Revision;
    }

    public LocalDateTime getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(LocalDateTime CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public String getUpdatedBy() {
        return UpdatedBy;
    }

    public void setUpdatedBy(String UpdatedBy) {
        this.UpdatedBy = UpdatedBy;
    }

    public LocalDateTime getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(LocalDateTime UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public Integer getFailureNumber() {
        return FailureNumber;
    }

    public void setFailureNumber(Integer FailureNumber) {
        this.FailureNumber = FailureNumber;
    }

    @Override
    public String toString() {
        return "ImportOrderTask{" +
        "Id=" + Id +
        ", BatchNo=" + BatchNo +
        ", OrderFileId=" + OrderFileId +
        ", ValidNumber=" + ValidNumber +
        ", TotalNumber=" + TotalNumber +
        ", OrderNumber=" + OrderNumber +
        ", Status=" + Status +
        ", IsDeleted=" + IsDeleted +
        ", CreatedBy=" + CreatedBy +
        ", Revision=" + Revision +
        ", CreatedTime=" + CreatedTime +
        ", UpdatedBy=" + UpdatedBy +
        ", UpdatedTime=" + UpdatedTime +
        ", FailureNumber=" + FailureNumber +
        "}";
    }
}
