package com.letgym.gymcourse.service.impl;

import com.letgym.gymcourse.dao.TearcherDisplayMapper;
import com.letgym.gymcourse.model.TearcherDisplay;
import com.letgym.gymcourse.service.TearcherDisplayService;
import com.letgym.gymcourse.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/04/02.
 */
@Service
@Transactional
public class TearcherDisplayServiceImpl extends AbstractService<TearcherDisplay> implements TearcherDisplayService {
    @Resource
    private TearcherDisplayMapper tearcherDisplayMapper;

}
