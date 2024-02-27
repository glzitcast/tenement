package online.yang.cloud.mapper;

import online.yang.cloud.model.House;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HouseMapper {
    int deleteByPrimaryKey(String houseId);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(String houseId);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    int getCount();

    List<House> findAll(@Param("houseNo") String houseNo, @Param("page") int page, @Param("limit") int limit);

    House findByNoAndUnit(House house);

    int findByBuilding(String building);
}