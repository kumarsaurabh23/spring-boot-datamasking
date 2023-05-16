package com.example.datamasking.dto;

import com.example.datamasking.annotation.MaskData;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class User {

    private String id;
    private String name;
    @MaskData
    private String ssn;
    @MaskData
    private String phone;
    private List<Account> accounts;
}
