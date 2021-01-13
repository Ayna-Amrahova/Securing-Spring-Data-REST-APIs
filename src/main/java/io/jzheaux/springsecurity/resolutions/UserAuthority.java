package io.jzheaux.springsecurity.resolutions;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "authorities")
public class UserAuthority {

    @Id
    UUID id;
    @Column
    String authority;

    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    User user;




    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserAuthority() {
    }

    public UserAuthority(User user, String authority) {
        this.id = UUID.randomUUID();
        this.user = user;
        this.authority = authority;
    }

    public UserAuthority(UserAuthority userAuthority) {
        this.id = userAuthority.id;
        this.authority = userAuthority.authority;
        this.user = userAuthority.user;
    }

}
