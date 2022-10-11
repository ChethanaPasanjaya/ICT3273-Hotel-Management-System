package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.JobRole;
import com.fot.hotelmanagementsystem.repo.JobRoleRepo;
import com.fot.hotelmanagementsystem.service.JobRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class JobRoleServiceImpl implements JobRoleService {

    @Autowired
    JobRoleRepo jobRoleRepo;

    @Override
    public JobRole save(JobRole dto) {
        return null;
    }

    @Override
    public JobRole update(JobRole dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public JobRole findById(long id) {
        return null;
    }

    @Override
    public ArrayList<JobRole> findAll() {
        return null;
    }
}
