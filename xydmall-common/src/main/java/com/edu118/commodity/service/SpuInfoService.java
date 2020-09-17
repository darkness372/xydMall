package com.edu118.commodity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.commodity.entity.SpuInfoEntity;
import com.edu118.fast.utils.PageUtils;

import java.util.Map;

/**
 * spu信息
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 15:56:16
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

