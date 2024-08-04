package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Users implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    private LocalDate userCreated;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String confirmationPassword;

    @Column(unique = true, nullable = false)
    private String email;
//
//    @Enumerated(EnumType.STRING)
//    private Role role;
//
//    @Column(nullable = false)
//    private int age;
//    @Enumerated(EnumType.STRING)
//    private Sex sex;
//
//    @OneToMany(mappedBy = "appUser")
//    private List<Token> tokens;
//
//    @OneToMany(mappedBy = "appUser", cascade = CascadeType.ALL)
//    private Set<RegistryWorkHours> registryWorkHoursSet;
//
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return email;
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
}