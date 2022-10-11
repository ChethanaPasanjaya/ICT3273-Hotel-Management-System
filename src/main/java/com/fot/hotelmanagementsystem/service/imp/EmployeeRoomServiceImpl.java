package com.fot.hotelmanagementsystem.service.imp;

import com.fot.hotelmanagementsystem.entity.EmployeeRoom;
import com.fot.hotelmanagementsystem.repo.EmployeeRoomRepo;
import com.fot.hotelmanagementsystem.service.EmployeeRoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
@Slf4j
public class EmployeeRoomServiceImpl implements EmployeeRoomService {

    @Autowired
    EmployeeRoomRepo employeeRoomRepo;

    @Override
    public EmployeeRoom save(EmployeeRoom dto) {
        return null;
    }

    @Override
    public EmployeeRoom update(EmployeeRoom dto) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public EmployeeRoom findById(long id) {
        return null;
    }

    @Override
    public ArrayList<EmployeeRoom> findAll() {
        return null;
    }
}
