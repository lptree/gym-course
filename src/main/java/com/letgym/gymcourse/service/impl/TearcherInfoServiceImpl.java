package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.TearcherInfoMapper;
import com.letgym.gymcourse.model.TearcherInfo;
import com.letgym.gymcourse.service.TearcherInfoService;
import com.letgym.gymcourse.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class TearcherInfoServiceImpl extends AbstractService<TearcherInfo> implements TearcherInfoService {
    @Resource
    private TearcherInfoMapper tearcherInfoMapper;

}
