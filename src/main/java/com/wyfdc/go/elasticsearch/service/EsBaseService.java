package com.wyfdc.go.elasticsearch.service;

/**
 * @Author:
 */
public interface EsBaseService {

  boolean indexExists(String indexName);

  boolean deleteIndex(String indexName);
}
