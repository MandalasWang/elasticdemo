package ink.boyuan.testelastic.domain;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/8/22 13:11
 * @description
 **/
public class OperaPO {

    /**
     * 操作人
     */
    private String operator;
    /**
     * 操作人id
     */
    private String operatorId;
    /**
     * 操作详细记录
     */
    private String operateDetail;
    /**
     * 操作时间
     */
    private String operateTime;
    /**
     * 操作类型 0表示纯动作 1表示编辑
     */
    private Integer operaType;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperateDetail() {
        return operateDetail;
    }

    public void setOperateDetail(String operateDetail) {
        this.operateDetail = operateDetail;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getOperaType() {
        return operaType;
    }

    public void setOperaType(Integer operaType) {
        this.operaType = operaType;
    }
}
