package com.app.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "userCustom")
@Data
public class UserCustom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String firstName;
    private String lastName;
    private String email;
}
