package com.rohit.dsa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Collection;
import java.util.Date;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(unique = true)
    private String username;

    @ColumnDefault("false")
    private boolean active;

    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", nullable = false, updatable = false)
    private Date createdDate;

    @PrePersist
    protected void onCreate() {
        createdDate = new Date();
    }


    @ColumnDefault("false")
    private boolean accountVerified;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Set.of(new SimpleGrantedAuthority(role.name()));
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Transient
    private transient BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public boolean matchesPassword(String providedPassword) {
        return passwordEncoder.matches(providedPassword, this.password);
    }

    public String getHashPassword(String rawPassword)
    {
        return (passwordEncoder.encode(rawPassword));
    }

}
