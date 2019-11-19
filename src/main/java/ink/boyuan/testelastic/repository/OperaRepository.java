package ink.boyuan.testelastic.repository;

import ink.boyuan.testelastic.domain.OperaBO;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @author 有缘
 * @version 1.0
 * @date 2019/11/12 10:31
 * @description
 **/
@Component
@Document(indexName = "opera",type = "record",shards = 1,replicas = 0)
public interface OperaRepository extends ElasticsearchRepository<OperaBO,String> {

}
