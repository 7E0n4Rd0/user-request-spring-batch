package com.leonardo.user_request_spring_batch.dto;

import java.time.Instant;
import java.util.Objects;

public class UserDTO {

    private Long id;
    private String login;
    private String name;
    private String location;
    private String avatarUrl;
    private Integer followers;
    private Integer following;
    private Instant createdAt;
    private String reposUrl;
    private String company;

    public UserDTO(){}

    public UserDTO(Long id, String login, String name, String location, String avatarUrl, Integer followers, Integer following, Instant createdAt, String reposUrl, String company) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.location = location;
        this.avatarUrl = avatarUrl;
        this.followers = followers;
        this.following = following;
        this.createdAt = createdAt;
        this.reposUrl = reposUrl;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Integer getFollowers() {
        return followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return Objects.equals(id, userDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", followers=" + followers +
                ", following=" + following +
                ", createdAt=" + createdAt +
                ", reposUrl='" + reposUrl + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
