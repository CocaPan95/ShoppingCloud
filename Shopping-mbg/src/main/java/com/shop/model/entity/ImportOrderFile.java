package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 导入订单文件
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class ImportOrderFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键标识
     */
      private Long Id;

    /**
     * 任务标识
     */
    private Long TaskId;

    /**
     * 文件名称
     */
    private String FileName;

    /**
     * 文件路径;相对路径
     */
    private String FilePath;

    /**
     * 通过了;是否通过
     */
    private Boolean Passed;

    /**
     * 总行数
     */
    private Integer TotalRows;

    /**
     * 异常行数
     */
    private Integer ErrorRows;

    /**
     * 类型;有效数据、历史记录
     */
    private Integer Type;

    /**
     * 是否删除
     */
    private Boolean IsDeleted;

    /**
     * 乐观锁
     */
    private Integer Revision;

    /**
     * 创建人
     */
    private String CreatedBy;

    /**
     * 创建时间（导入时间）
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


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getTaskId() {
        return TaskId;
    }

    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public Boolean getPassed() {
        return Passed;
    }

    public void setPassed(Boolean Passed) {
        this.Passed = Passed;
    }

    public Integer getTotalRows() {
        return TotalRows;
    }

    public void setTotalRows(Integer TotalRows) {
        this.TotalRows = TotalRows;
    }

    public Integer getErrorRows() {
        return ErrorRows;
    }

    public void setErrorRows(Integer ErrorRows) {
        this.ErrorRows = ErrorRows;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public Integer getRevision() {
        return Revision;
    }

    public void setRevision(Integer Revision) {
        this.Revision = Revision;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
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

    @Override
    public String toString() {
        return "ImportOrderFile{" +
        "Id=" + Id +
        ", TaskId=" + TaskId +
        ", FileName=" + FileName +
        ", FilePath=" + FilePath +
        ", Passed=" + Passed +
        ", TotalRows=" + TotalRows +
        ", ErrorRows=" + ErrorRows +
        ", Type=" + Type +
        ", IsDeleted=" + IsDeleted +
        ", Revision=" + Revision +
        ", CreatedBy=" + CreatedBy +
        ", CreatedTime=" + CreatedTime +
        ", UpdatedBy=" + UpdatedBy +
        ", UpdatedTime=" + UpdatedTime +
        "}";
    }
}
