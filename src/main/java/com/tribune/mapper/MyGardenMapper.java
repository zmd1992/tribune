package com.tribune.mapper;

import com.tribune.pojo.MyGarden;

import java.util.List;

public interface MyGardenMapper {
    public int addMyGradeContent(MyGarden myGarden);
    public List<MyGarden> selectMyGardenAllContent();
    public int deleteMyGardenContent(MyGarden myGarden);
    public List<MyGarden> selectMyGardenContentById(List<Integer> idList);
    public MyGarden selectMyGardenContentByIds(MyGarden myGarden);
}
