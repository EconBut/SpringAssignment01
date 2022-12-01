package com.sparta.hanghaememo.dto;

import lombok.Getter;
// If you dont wanna use the annotation Getter then generate the getter username~id
@Getter
public class MemoRequestDto {
    private String username;
    private String contents;
    private String pw;
    private String title;
    private Long id;

    public String getUsername() {
        return username;
    }

    public String getContents() {
        return contents;
    }

    public String getPw() {
        return pw;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }
}