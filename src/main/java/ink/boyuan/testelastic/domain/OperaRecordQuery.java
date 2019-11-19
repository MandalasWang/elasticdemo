package ink.boyuan.testelastic.domain;


/**
 * @author wyy
 * @version 1.0
 * @date 2019/8/22 13:06
 * @description
 **/

public class OperaRecordQuery  {

    /**
     * 被操作的唯一标识
     */
    private String sourceId;
    /**
     * 模块id
     */
    private String moduleId;
    /**
     * 模块方法名
     */
    private String moduleName;
    /**
     * 操作类型 0表示纯动作 1表示编辑
     */
    private String operaType;

}
