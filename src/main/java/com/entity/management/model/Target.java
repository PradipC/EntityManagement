package com.entity.management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Target")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Target {

    @Id
    private String id;
    private String targetEntity;
    private String targetServiceId;
    private String targetGuid;
    private String refreshToken;


}
