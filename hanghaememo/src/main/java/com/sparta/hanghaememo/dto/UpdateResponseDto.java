package com.sparta.hanghaememo.dto;

import com.sparta.hanghaememo.entity.Memo;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class UpdateResponseDto {

    private String username;
    private String contents;
    private String title;
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;



    public UpdateResponseDto(Memo memo) {
        this.username = memo.getUsername();
        this.contents = memo.getContents();
        this.title = memo.getTitle();
        this.id = memo.getId();
        this.createdAt = memo.getCreatedAt();
        this.modifiedAt = memo.getModifiedAt();
    }


}