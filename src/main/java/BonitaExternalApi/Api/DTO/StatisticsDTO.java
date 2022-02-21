package BonitaExternalApi.Api.DTO;

import java.util.List;


public class StatisticsDTO {
	
	public MostFrequentCityDTO MostFrequentCity;
	
	public MostFrequentPartOfDayDTO MostFrequentPartOfTheDay;
	
	public List<MostFrequentCityDTO> Cities;
	
	public List<MostFrequentPartOfDayDTO> PartsOfDay;

	public StatisticsDTO() {}

	public StatisticsDTO(MostFrequentCityDTO mostFrequentCity, MostFrequentPartOfDayDTO mostFrequentPartOfTheDay,
			List<MostFrequentCityDTO> cities, List<MostFrequentPartOfDayDTO> partsOfDay) {
		super();
		MostFrequentCity = mostFrequentCity;
		MostFrequentPartOfTheDay = mostFrequentPartOfTheDay;
		Cities = cities;
		PartsOfDay = partsOfDay;
	}
}
