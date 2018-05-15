package com.chane.service;

import com.chane.entity.Area;

import java.util.List;

/**
 * Created by fucheng on 2018/5/15.
 */
public interface AreaService {

    List<Area> getAreaList();
    Area getAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);
}
