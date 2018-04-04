package cn.xm.jwxt.service.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo;
import cn.xm.jwxt.bean.trainScheme.Trainschemeinfo2;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 12:17 2018/3/26
 */
public interface TrainschemeinfoService {
    /**
     * 添加培养方案的基本信息1
     * @param trainschemeinfo   培养方案基本信息1
     * @param trainschemeinfo2   培养方案基本信息
     * @return  是否添加成功
     * @throws SQLException
     */
    public boolean addTrainschemeinfo(Trainschemeinfo trainschemeinfo,Trainschemeinfo2 trainschemeinfo2)throws SQLException;

    /**
     * 根据培养方案ID删除培养方案基本信息(删除与之相关的培养方案信息)
     * @param trainschemeinfoId
     * @return
     * @throws SQLException
     */
    public boolean deleteTrainschemeinfoById(String trainschemeinfoId)throws SQLException;

    /**
     * 根据修改培养方案ID修改培养方案信息
     * @param trainschemeinfo
     * @return
     * @throws SQLException
     */
    public boolean updateTrainschemeinfoById(Trainschemeinfo trainschemeinfo)throws SQLException;

    /**
     * 查询单个培养方案的详细信息
     * @param trainschemeinfoId
     * @return
     * @throws SQLException
     */
    public Map<String,Object> getTrainschemeinfoById(String trainschemeinfoId) throws SQLException;

    /**
     * 根据条件查询培养方案的信息(用于分页查询)
     * @param condition
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> getTrainschemeinfoByCondition(Map<String,Object> condition)throws SQLException;


}
