package com.fot.hotelmanagementsystem.service;

import com.fot.hotelmanagementsystem.entity.JobRole;

import java.util.ArrayList;

public interface JobRoleService {
    public JobRole save(JobRole dto);
    public JobRole update(JobRole dto);
    public boolean delete(long id);
    public JobRole findById(long id);
    public ArrayList<JobRole> findAll();
}
