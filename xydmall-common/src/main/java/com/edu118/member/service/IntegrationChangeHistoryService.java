package com.edu118.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.member.entity.IntegrationChangeHistoryEntity;
import com.edu118.fast.utils.PageUtils;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:41:34
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

