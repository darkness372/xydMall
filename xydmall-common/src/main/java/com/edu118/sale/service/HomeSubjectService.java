package com.edu118.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.sale.entity.HomeSubjectEntity;
import com.edu118.fast.utils.PageUtils;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:22:45
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

