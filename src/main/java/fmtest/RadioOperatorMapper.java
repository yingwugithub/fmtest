package fmtest;

import java.util.List;
import java.util.Map;

/**
 * Created by dfn on 15/9/25.
 */
public interface RadioOperatorMapper {
    /**
     *查询频道的分页行数
     * @param params
     * @return
     */
    Integer selectRadioListCount(Map<String, Object> params);
    /**
     * 查询频道的列表
     * @param params
     * @return
     */
    List<AdminRadioChannel> selectRadioList(Map<String, Object> params);
    /**int
     * 查询所有省份
     * @return
     */
    List< Object > findProvenceList();

    /**
     * 添加频道信息
     * @param map
     * @return
     */
    int addRadioInfo(Map<String, Object> map);

    /**
     * 查询频道对象
     * @param id
     * @return
     */
    AdminRadioChannel findRadioFm(Long id);


    /**
     * 修改频道数据
     * @param map
     * @return
     */
    int updateRadioInfo(Map<String, Object> map);

    /**
     * 修改频道状态
     * @param map
     */
    void updateRadioStatus(Map<String, Object> map);


}
