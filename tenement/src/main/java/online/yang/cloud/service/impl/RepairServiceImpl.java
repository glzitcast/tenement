package online.yang.cloud.service.impl;

import cn.hutool.core.util.IdUtil;
import online.yang.cloud.mapper.AdminMapper;
import online.yang.cloud.mapper.ManagerMapper;
import online.yang.cloud.mapper.RepairMapper;
import online.yang.cloud.model.Repair;
import online.yang.cloud.service.RepairService;
import online.yang.cloud.utils.PageInfo;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class RepairServiceImpl implements RepairService {

    private RepairMapper repairMapper;
    private AdminMapper adminMapper;
    private ManagerMapper managerMapper;

    public RepairServiceImpl(RepairMapper repairMapper, AdminMapper adminMapper, ManagerMapper managerMapper) {
        this.repairMapper = repairMapper;
        this.adminMapper = adminMapper;
        this.managerMapper = managerMapper;
    }

    @Override
    public Repair findById(String id) {
        return repairMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(Repair repair) {
        repair.setRepairId(IdUtil.simpleUUID());
        repair.setRepairDate(new Date());
        repair.setRepairOperator(managerMapper.selectByPrimaryKey(repair.getRepairOperatorNo()).getEmpName());
        repair.setRepairStatus(0);
        repair.setRepairOwnerStatus(0);
        return repairMapper.insertSelective(repair);
    }

    @Override
    public int update(Repair repair) {
        return repairMapper.updateByPrimaryKeySelective(repair);
    }

    @Override
    public int delete(String id) {
        return repairMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PageInfo<Repair> findAll(PageInfo<Repair> info) {
        info.setCount(repairMapper.getCount());
        info.setData(repairMapper.selectAll((info.getPage() - 1) * info.getLimit(), info.getLimit()));
        return info;
    }
}
