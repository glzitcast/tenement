package online.yang.cloud.controller;

import online.yang.cloud.model.Manager;
import online.yang.cloud.service.ManagerService;
import online.yang.cloud.utils.GlobalConstant;
import online.yang.cloud.utils.MD5Tools;
import online.yang.cloud.utils.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping(value = "/manage")
public class ManagerController {

    private ManagerService managerServiceImpl;

    public ManagerController(ManagerService managerServiceImpl) {
        this.managerServiceImpl = managerServiceImpl;
    }

    @PostMapping(value = "/login")
    public int login(Manager manager, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Manager loginManager = managerServiceImpl.findByManagerName(manager.getEmpName());
        if (loginManager != null && loginManager.getEmpPwd().equals(MD5Tools.reverseToMd5(manager.getEmpPwd()))) {
            session.setAttribute("emp", loginManager);
            return GlobalConstant.SUCCESS;
        }
        return GlobalConstant.ERROR;
    }

    @GetMapping(value = "/isLogin")
    public Manager isLogin(HttpServletRequest request) {
        return  (Manager) request.getSession().getAttribute("emp");
    }

    @PostMapping(value = "/addManager")
    public int addManager(Manager manager) {
        return managerServiceImpl.add(manager);
    }

    @PostMapping(value = "/updateManager")
    public int updateManager(Manager manager) {
        return managerServiceImpl.update(manager);
    }

    @PostMapping(value = "/delManager/{id}")
    public int delManager(@PathVariable("id") String id) {
        return managerServiceImpl.delete(id);
    }

    @GetMapping(value = "/findAll")
    public PageInfo<Manager> findAll(PageInfo<Manager> info, Manager manager) {
        return managerServiceImpl.findAll(info, manager);
    }

    @GetMapping(value = "/findByManagerName")
    public Manager findByManagerName(Manager manager) {
        return managerServiceImpl.findByManagerName(manager.getEmpName());
    }

    @GetMapping(value = "/findByCondition")
    public Manager findByCondition(Manager manager) {
        return managerServiceImpl.findByCondition(manager);
    }

}
