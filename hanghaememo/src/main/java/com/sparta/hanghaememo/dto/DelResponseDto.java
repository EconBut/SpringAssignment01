package com.sparta.hanghaememo.dto;

import com.sparta.hanghaememo.entity.Memo;
import lombok.Getter;

/*public class DelResponseDto {
    private String msg;

    public DelResponseDto(Memo memo){
        this.msg = "삭제되었습니다";
    }
}
 */

@Getter
public class DelResponseDto {
    private String msg;
    private Boolean success;


    public DelResponseDto(boolean success){
        this.success = success;
        if(success==true){
            this.msg = "success";
        }else {
            this.msg="failed";
        }
    }
}



