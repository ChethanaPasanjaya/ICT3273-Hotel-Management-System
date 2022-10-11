package com.fot.hotelmanagementsystem.service;

import java.util.List;

public interface CustomerUpdateServices {
    List<Object[]> putCustomerUpdateById(Integer id, String name, String mail, String phone, String nic);
}
