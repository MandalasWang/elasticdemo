package ink.boyuan.testelastic.controller;

import ink.boyuan.testelastic.domain.OperaBO;
import ink.boyuan.testelastic.repository.OperaRepository;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchAllQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author wyy
 * @version 1.0
 * @date 2019/11/12 10:41
 * @description
 **/
@RestController
@RequestMapping("/api/es")
public class Testelastic {


    @Autowired
    private OperaRepository repository;

    /**
     * 保存单条
     * @return
     */
        @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save() {
        OperaBO operaBO = new OperaBO() {{
            setId(UUID.randomUUID().toString());
            setOperateDetail("测试elastic");
            setSourceId(UUID.randomUUID().toString());
            setModuleName("生产线");
        }};
        repository.save(operaBO);
        return "OK";
    }

    /**
     * 保存多条
     * @return
     */
    @RequestMapping(value = "saveall",method = RequestMethod.GET)
    public String saveAll(){
        List<OperaBO> list = new ArrayList<>(16);
        OperaBO operaBO = new OperaBO() {{
            setId(UUID.randomUUID().toString());
            setOperateDetail("测试elastic1");
            setSourceId("85339f82-25be-474a-8b38-8b522fed33c0");
            setModuleName("生产线1");
            setOperaType(0);
        }};
        OperaBO operaBO1 = new OperaBO() {{
            setId(UUID.randomUUID().toString());
            setOperateDetail("测试elastic2");
            setSourceId("b8ffdd48-332e-4836-bf40-2ce5d1629d10");
            setModuleName("生产线2");
            setOperaType(1);
        }};
        list.add(operaBO);
        list.add(operaBO1);
        repository.saveAll(list);
        return "ok";
    }

    /**
     * 多条件查询
     * @param operaBO
     * @return
     */
    @RequestMapping(value = "search",method = RequestMethod.POST)
    public Object search(@RequestBody OperaBO operaBO){
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
        queryBuilder.must(QueryBuilders.matchQuery("sourceId", operaBO.getSourceId()));
        queryBuilder.must(QueryBuilders.matchQuery("operaType",operaBO.getOperaType()));
        Iterable<OperaBO> search = repository.search(queryBuilder);
        return search;
    }

    /**
     * 查询全部
     * @return
     */
    @RequestMapping(value = "all",method = RequestMethod.GET)
    public Object searchAll(){
        MatchAllQueryBuilder allQueryBuilder = QueryBuilders.matchAllQuery();
        Iterable<OperaBO> operaBOS = repository.search(allQueryBuilder);
        return  operaBOS;
    }

}
