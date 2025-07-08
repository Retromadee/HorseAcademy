package com.horsetrain.project.Service;

import com.horsetrain.project.Entity.Child;
import com.horsetrain.project.Repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService {
    @Autowired
    private ChildRepository childRepository;

    public List<Child> getAllChild(){
        return childRepository.findAll();
    }

    public Child saveChild(Child child){
        return childRepository.save(child);
    }
    public Child getChildById(Long id){
        return childRepository.findById(id).orElse(null);
    }
    public void deleteChild(Long id){
        childRepository.deleteById(id);
    }
    public Child updateChild(Child child){
        return childRepository.save(child);
    }
}
