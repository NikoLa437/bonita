package BonitaExternalApi.Api.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import BonitaExternalApi.Api.DTO.MostFrequentCityDTO;
import BonitaExternalApi.Api.DTO.MostFrequentPartOfDayDTO;
import BonitaExternalApi.Api.DTO.StatisticsDTO;

@RestController
@RequestMapping(value = "api/statistics")
public class StatisticController {

	
	@GetMapping("/form-access")
	@CrossOrigin
	public ResponseEntity<?> getStatistics(){
		MostFrequentCityDTO mfc = new MostFrequentCityDTO("Beograd", 125l);
		MostFrequentPartOfDayDTO mfpd = new MostFrequentPartOfDayDTO("Podne", "12h", "17h", 81l);
		List<MostFrequentCityDTO> listmfc = new ArrayList<MostFrequentCityDTO>() {
			{
				add(new MostFrequentCityDTO("Beograd", 125l));
				add(new MostFrequentCityDTO("Novi Sad", 83l));
				add(new MostFrequentCityDTO("Šabac", 33l));
			}
		};
		List<MostFrequentPartOfDayDTO> listmfpd = new ArrayList<MostFrequentPartOfDayDTO>() {
			{
				add(new MostFrequentPartOfDayDTO("Podne", "12h", "17h", 81l));
				add(new MostFrequentPartOfDayDTO("Veče", "17h", "21h", 61l));
				add(new MostFrequentPartOfDayDTO("Noć", "21h", "24h", 25l));
				add(new MostFrequentPartOfDayDTO("Jutro", "06h", "12h", 51l));
				add(new MostFrequentPartOfDayDTO("Zora", "00h", "06h", 11l));

			}
		};
		return new ResponseEntity<>(new StatisticsDTO(mfc, mfpd, listmfc, listmfpd), HttpStatus.OK);

	}
}
