package com.example.firstgraphqlproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class ClientEntity {
    private UUID id;
    private String firstName;
    private String lastName;
}
