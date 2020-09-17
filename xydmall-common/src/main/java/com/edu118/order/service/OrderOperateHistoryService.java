package com.edu118.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.order.entity.OrderOperateHistoryEntity;
import com.edu118.fast.utils.PageUtils;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 12:01:09
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

