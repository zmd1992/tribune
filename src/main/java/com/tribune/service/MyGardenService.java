package com.tribune.service;

import com.tribune.pojo.MyGarden;

import java.util.List;

public interface MyGardenService {
    /**
     * 发布内容
     * @param myGarden
     * @return
     */
    public int pushContent(MyGarden myGarden);

    /**
     * 搜寻全站内容
     * @return
     */
    public List<MyGarden> findTotalStationContent();
    /**
     * 删除我发布的内容
     * @param
     * @return
     */
    public int removeMyGardenContent(MyGarden myGarden);

    /**
     * 根据用户ID列表查询发布内容
     * @return
     */
    public List<MyGarden> findMyGardenContentById(List<Integer> idList);
    /**
     * 根据内容ID和创建人ID查询发布内容
     */
    public MyGarden findMyGardenContentByIds(MyGarden myGarden);
}
