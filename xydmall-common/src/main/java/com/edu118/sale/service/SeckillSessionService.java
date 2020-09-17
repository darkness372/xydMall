package com.edu118.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.sale.entity.SeckillSessionEntity;
import com.edu118.fast.utils.PageUtils;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:22:44
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

