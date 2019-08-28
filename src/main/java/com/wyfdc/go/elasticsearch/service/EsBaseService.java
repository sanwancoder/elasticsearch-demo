package com.wyfdc.go.elasticsearch.service;

import com.wyfdc.go.elasticsearch.entity.User;
import java.util.List;

/**
 * @Author:
 */
public interface EsBaseService {

  boolean indexExists(String indexName);
}
