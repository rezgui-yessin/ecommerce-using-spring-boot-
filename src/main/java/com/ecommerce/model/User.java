package com.ecommerce.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;

    private Role role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Cart cart;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLle"+ this.role.name())) ;
    }

    // return email as username
    @Override
    public String getUsername() {
        return this.email;
    }

    // this block used for checking account expiration
    // accountNonExpired  its the method that checks if the user's account is expired or not
    // we return true to indicate that the account is not expired
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // this block used for checking account lock
    // accountNonLocked  its the method that checks if the user's account is locked or not
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // this block used for checking credentials expiration
    //credentialsNonExpired  its the method that checks if the user's credentials (password) are still valid
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // true means the user is enabled
    @Override
    public boolean isEnabled() {
        return true;
    }

    public enum Role {
        ADMIN,
        CUSTOMER
    }
}
