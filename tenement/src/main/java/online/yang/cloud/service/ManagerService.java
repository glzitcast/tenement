package online.yang.cloud.service;

import online.yang.cloud.model.Manager;
import online.yang.cloud.utils.PageInfo;

public interface ManagerService extends BaseService<Manager> {

    PageInfo<Manager> findAll(PageInfo<Manager> info, Manager manager);

    Manager findByManagerName(String empName);

    Manager findByCondition(Manager manager);

}
