package com.bkn.amazonclient.account_service.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "accounts")
public class Account {
    @Id
    private String id;
    private String firstName;
    private String lastName;

}
