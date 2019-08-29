package com.wyfdc.go.elasticsearch.controller;

import com.wyfdc.go.elasticsearch.service.EsBaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:
 */
@RequestMapping("/es")
@RestController
@Slf4j
public class EsController {

  @Autowired
  private EsBaseService esService;

  @GetMapping("/indexExists/{indexName}")
  public boolean indexExists(@PathVariable String indexName){
    return esService.indexExists(indexName);
  }

  @DeleteMapping("/index/{indexName}")
  public boolean deleteIndex(@PathVariable String indexName){
    return esService.deleteIndex(indexName);
  }

}
