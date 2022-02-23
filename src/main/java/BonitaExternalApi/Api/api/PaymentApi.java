package BonitaExternalApi.Api.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BonitaExternalApi.Api.DTO.ZahtevZaNabavkuOpremeMakePaymentDTO;

@RestController
@RequestMapping(value = "make-payment")
public class PaymentApi {
	@PostMapping()
    @CrossOrigin
    public ResponseEntity<?> makePayment(@RequestBody ZahtevZaNabavkuOpremeMakePaymentDTO zahtevZaNabavkuOpremeMakePaymentDTO){
        try {
            System.out.println(zahtevZaNabavkuOpremeMakePaymentDTO.ZahtevZaNabavkuOpremeId);
            System.out.println(zahtevZaNabavkuOpremeMakePaymentDTO.Cena);

            return new ResponseEntity<>(true, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
