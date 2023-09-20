package com.shop.model.entity;

import java.io.Serializable;

/**
 * <p>
 * refactoring log
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class __RefactorLog implements Serializable {

    private static final long serialVersionUID = 1L;

      private String OperationKey;


    public String getOperationKey() {
        return OperationKey;
    }

    public void setOperationKey(String OperationKey) {
        this.OperationKey = OperationKey;
    }

    @Override
    public String toString() {
        return "__RefactorLog{" +
        "OperationKey=" + OperationKey +
        "}";
    }
}
