package com.wyfdc.go.elasticsearch.service.impl;

import com.wyfdc.go.elasticsearch.service.EsBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author:
 */
@Service
public class EsBaseServiceImpl implements EsBaseService {


  @Autowired
  private ElasticsearchTemplate elasticsearchTemplate;

  @Override
  public boolean indexExists(String indexName) {
    return elasticsearchTemplate.indexExists(indexName);
  }

  @Override
  public boolean deleteIndex(String indexName) {
    return elasticsearchTemplate.deleteIndex(indexName);
  }

}
