package tp.youssef.springprojecttp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tp.youssef.springprojecttp.repository.DriverRepository;

@Service
public class DriverServiceImpl implements DriverService{
    @Autowired
    private DriverRepository driverRepository;
}
