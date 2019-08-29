package com.wyfdc.go.elasticsearch.entity.es;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@NoArgsConstructor
@Document(indexName = "user_info_index", type = "user")
public class User {

  @Id
  private String userId;

  private String name;

  private Date created_Date = new Date();

  private int age;

  private int sex;

}
