package com.edu118.member.service.impl;

import com.edu118.fast.utils.PageUtils;
import com.edu118.fast.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.edu118.member.dao.GrowthChangeHistoryDao;
import com.edu118.member.entity.GrowthChangeHistoryEntity;
import com.edu118.member.service.GrowthChangeHistoryService;


@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistoryEntity> implements GrowthChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GrowthChangeHistoryEntity> page = this.page(
                new Query<GrowthChangeHistoryEntity>().getPage(params),
                new QueryWrapper<GrowthChangeHistoryEntity>()
        );

        return new PageUtils(page);
    }

}