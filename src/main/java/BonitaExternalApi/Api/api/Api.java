package BonitaExternalApi.Api.api;

import BonitaExternalApi.Api.dto.KursPaymentRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "pay")
public class Api {
    @PostMapping()
    @CrossOrigin
    public ResponseEntity<?> createOrder(@RequestBody KursPaymentRequestDTO kursPaymentRequestDTO){
        try {
            System.out.println(kursPaymentRequestDTO.KonferencijaKursId);
            System.out.println(kursPaymentRequestDTO.UkupnoZaPlacanje);

            return new ResponseEntity<>(true, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
