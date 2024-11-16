package cn.njust.myschool.entity;

import cn.njust.myschool.config.DoubleFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String userName;
    private String userNo;
//    @JsonIgnore
    private String userPwd;
    @JsonSerialize(using = DoubleFormat.class)
    private double money;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date loginTime;
}
