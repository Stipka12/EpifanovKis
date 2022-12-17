package ru.miit.kisproject.mapper;

import java.util.List;
import ru.miit.kisproject.model.SysOptions;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface SysOptionsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into sys_options (option_name, option_value)",
        "values (#{optionName,jdbcType=VARCHAR}, #{optionValue,jdbcType=VARCHAR})"
    })
    int insert(SysOptions row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "option_name, option_value",
        "from tdma.sys_options"
    })
    @Results({
        @Result(column="option_name", property="optionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="option_value", property="optionValue", jdbcType=JdbcType.VARCHAR)
    })
    List<SysOptions> selectAll();
}