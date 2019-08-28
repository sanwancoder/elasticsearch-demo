package com.wyfdc.go.elasticsearch.entity;

import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "my_index", type = "user")
public class User {
  @Id
  private String userId;

  private String name;

  private Date creationDate = new Date();

  private int age;


}
