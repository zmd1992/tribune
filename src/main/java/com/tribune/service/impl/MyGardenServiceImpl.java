package com.tribune.service.impl;

import com.tribune.mapper.MyGardenMapper;
import com.tribune.pojo.MyGarden;
import com.tribune.service.MyGardenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "myGradeService")
public class MyGardenServiceImpl implements MyGardenService {
    @Resource
    private MyGardenMapper myGardenMapper;

    @Override
    public int pushContent(MyGarden myGarden) {
        return myGardenMapper.addMyGradeContent(myGarden);
    }

    @Override
    public List<MyGarden> findTotalStationContent() {
        return myGardenMapper.selectMyGardenAllContent();
    }
}
