package cn.ssm.mapper;

import cn.ssm.po.Virtual;
import cn.ssm.po.VirtualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VirtualMapper {
    int countByExample(VirtualExample example);

    int deleteByExample(VirtualExample example);

    int deleteByPrimaryKey(Integer virId);

    int insert(Virtual record);

    int insertSelective(Virtual record);

    List<Virtual> selectByExample(VirtualExample example);

    Virtual selectByPrimaryKey(Integer virId);

    int updateByExampleSelective(@Param("record") Virtual record, @Param("example") VirtualExample example);

    int updateByExample(@Param("record") Virtual record, @Param("example") VirtualExample example);

    int updateByPrimaryKeySelective(Virtual record);

    int updateByPrimaryKey(Virtual record);
}