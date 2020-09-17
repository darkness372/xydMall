package com.edu118.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.fast.utils.PageUtils;
import com.edu118.warehouse.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:43:44
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

