package com.berg.fastsearch.core.system.search.service;

import com.berg.fastsearch.core.system.base.web.dto.BaseQueryCondition;
import com.berg.fastsearch.core.system.kafka.message.BaseIndexMessage;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import java.io.Serializable;
import java.util.List;

/**
 * <p></p>
 *
 * @author bo.he02@hand-china.com
 * @version v1.0
 * @apiNote Created on 18-5-7
 */
public interface ISearchService<
        ID extends Serializable,
        MESSAGE extends BaseIndexMessage<ID>,
        CONDITION extends BaseQueryCondition> {

    /**
     * 索引目标
     * @param id    目标主键
     */
    void index(ID id);

    /**
     * 移除索引
     * @param id    目标主键
     */
    void remove(ID id);

    /**
     *  处理消息
     * @param content   消息对象
     */
    void processMessage(String content);

    /**
     * 检索
     * @param condition      查询条件
     * @return               检索的结果
     */
    List<ID> query(CONDITION condition);
}
