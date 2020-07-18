package github.service.serviceimpl;

import github.entity.StudentEntity;
import github.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public String getUerNameBy(String id) {
        StudentEntity nameById = studentMapper.getNameById(id);
        List<String> strList = new ArrayList<String>();
        return nameById.getClassName();
    }
}
