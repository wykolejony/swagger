package pl.costam.nic.controller;

import org.springframework.web.bind.annotation.*;
import pl.costam.nic.model.dto.NicDto;

@RestController
@RequestMapping("nic")
public class NicController {

    @GetMapping
    public String getNic() {
        return "nic tu nie ma!";
    }

    @PostMapping
    public NicDto createNic(@RequestBody NicDto nicDto) {
        nicDto.setId(1L);
        return nicDto;
    }
}
