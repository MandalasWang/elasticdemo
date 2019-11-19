package ink.boyuan.testelastic.domain;


import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @author wyy
 * @description 操作记录实体类
 * @since 2019/7/22
 *
 * Document : 表示一个实体为一条数据 文档式存储
 * indexName : 对应哪个数据库找
 * type : 对应哪个表
 */
@Data
@Document(indexName = "opera",type = "record")
public class OperaBO implements Serializable {

    private static final long serialVersionUID =1L;
    /**
     * 唯一标识
     */
    private String id;
    /**
     * 模块id
     */
    private String moduleId;
    /**
     * 被操作人的唯一标识
     */
    private String sourceId;
    /**
     * 模块方法名
     */
    private String moduleName;
    /**
     * 操作详细记录
     */
    private String operateDetail;
    /**
     * 操作类型 0表示纯动作 1表示编辑
     */
    private Integer operaType;


}
