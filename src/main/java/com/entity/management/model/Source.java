package com.entity.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Source")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Source {

    @Id
    private String id;

    private String sourceEntity;
    private String sourceServiceId;
    private String sourceGuid;
    private String refreshToken;


}
