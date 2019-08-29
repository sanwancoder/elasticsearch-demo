package com.wyfdc.go.elasticsearch.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder
@Document(indexName = "user_info_index", type = "user")
public class User {

  @Id
  private String userId;

  private String name;

  private Date created_Date = new Date();

  private int age;


}
