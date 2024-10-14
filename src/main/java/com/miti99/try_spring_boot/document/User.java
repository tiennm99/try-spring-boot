package com.miti99.try_spring_boot.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.index.QueryIndexed;
import org.springframework.data.couchbase.core.mapping.Document;

@AllArgsConstructor
@Builder
@Data
@Document
@NoArgsConstructor
public class User {
  @Id String id;
  @QueryIndexed String name;

  @QueryIndexed String password;

  @QueryIndexed String value;
}
