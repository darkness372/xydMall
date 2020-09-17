package com.edu118.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.sale.entity.SkuFullReductionEntity;
import com.edu118.fast.utils.PageUtils;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:22:44
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

