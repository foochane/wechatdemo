package com.chane.dao;

import com.chane.entity.Area;

import java.util.List;

/**
 * Created by fucheng on 2018/5/15.
 */

public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
