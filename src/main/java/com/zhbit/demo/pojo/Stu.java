package com.zhbit.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
    private Long sno;
    private String sname;
    private String password;
    private String tno;

}
