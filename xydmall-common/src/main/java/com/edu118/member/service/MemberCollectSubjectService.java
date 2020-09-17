package com.edu118.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.member.entity.MemberCollectSubjectEntity;
import com.edu118.fast.utils.PageUtils;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xiaoyu
 * @email 1076202404@qq.com
 * @date 2020-09-16 16:41:34
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

