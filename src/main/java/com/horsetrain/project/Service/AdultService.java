package com.horsetrain.project.Service;

import com.horsetrain.project.Entity.Adult;
import com.horsetrain.project.Repository.AdultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdultService {
    @Autowired
    private AdultRepository adultRepository;

    public List<Adult> getAllAdults(){
        return adultRepository.findAll();
    }
    public Adult saveAdult(Adult adult){
        return adultRepository.save(adult);
    }
    public Adult getAdultById(Long id){
        return adultRepository.findById(id).orElse(null);
    }
    public void deleteAdult(Long id){
        adultRepository.deleteById(id);
    }
    public Adult updateAdult(Adult adult){
        return adultRepository.save(adult);
    }

}

