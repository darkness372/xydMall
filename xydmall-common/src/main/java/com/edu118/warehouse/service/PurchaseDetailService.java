package com.edu118.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.fast.utils.PageUtils;
import com.edu118.warehouse.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 采购明细
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:43:44
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

