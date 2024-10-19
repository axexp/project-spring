package tn.esprit.ahmedbenhmida4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ahmedbenhmida4twin5.entities.Skier;
import tn.esprit.ahmedbenhmida4twin5.repositories.ISkierRepository;

@RequiredArgsConstructor
@Service
public class SkierServicesImpl {

    private final ISkierRepository skierRepository;
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }
}
