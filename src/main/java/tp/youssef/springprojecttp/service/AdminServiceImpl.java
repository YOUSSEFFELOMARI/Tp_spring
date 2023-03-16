package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminRepository adminRepository;
}
