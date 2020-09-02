package br.com.spdata.controller;

import br.com.spdata.util.VerifyParImpar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("verify")
public class NumberController {

    private final VerifyParImpar verifyParImpar;
    @Autowired
    public NumberController(VerifyParImpar verifyParImpar) {
        this.verifyParImpar = verifyParImpar;
    }




    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> verifyParImpar(@RequestParam String number){
        String response  = verifyParImpar.verify(number);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
