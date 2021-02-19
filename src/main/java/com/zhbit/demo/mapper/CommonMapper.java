package com.zhbit.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface CommonMapper {

    /**
     * 登录
     * @param sno 编号
     * @return
     */
    @Select("select sname from stu where sno=#{sno};")
    public String Login(@Param("sno") String sno);

//    String Login(Long sno);
}
