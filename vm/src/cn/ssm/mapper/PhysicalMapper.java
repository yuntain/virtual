package cn.ssm.mapper;

import cn.ssm.po.Physical;
import cn.ssm.po.PhysicalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhysicalMapper {
    int countByExample(PhysicalExample example);

    int deleteByExample(PhysicalExample example);

    int deleteByPrimaryKey(Integer phyId);

    int insert(Physical record);

    int insertSelective(Physical record);

    List<Physical> selectByExample(PhysicalExample example);

    Physical selectByPrimaryKey(Integer phyId);

    int updateByExampleSelective(@Param("record") Physical record, @Param("example") PhysicalExample example);

    int updateByExample(@Param("record") Physical record, @Param("example") PhysicalExample example);

    int updateByPrimaryKeySelective(Physical record);

    int updateByPrimaryKey(Physical record);
}