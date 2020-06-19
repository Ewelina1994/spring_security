package pl.klobut.spring_security;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuatationApi {
    private List<Quatation> quatations;

    public QuatationApi() {
        this.quatations = new ArrayList<>();
        quatations.add(new Quatation("To, że milczę, nie znaczy, że nie mam nic do powiedzenia.", "Jonathan Carroll"));
        quatations.add(new Quatation("Lepiej zaliczać się do niektórych, niż do wszystkich.", "Andrzej Sapkowski"));

    }

    @GetMapping ("/api")
    public List<Quatation> getContent() {
        return quatations;
    }

    @PostMapping("/api")
    public boolean add(@RequestBody Quatation quatation) {
        return quatations.add(quatation);
    }

    @DeleteMapping("/api")
    public void delete(@RequestParam int index) {
        if(index<quatations.size()){
            quatations.remove(index);
        }

    }


}
