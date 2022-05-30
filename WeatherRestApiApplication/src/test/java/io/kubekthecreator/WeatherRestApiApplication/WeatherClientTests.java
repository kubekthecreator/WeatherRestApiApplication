package io.kubekthecreator.WeatherRestApiApplication;

import io.kubekthecreator.WeatherRestApiApplication.webclient.weather.WeatherClient;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class WeatherClientTests {


	private WeatherClient weatherClient = new WeatherClient();

//	@Mock
//	private WeatherRepo weatherRepo;

//	@Test
//	void should_return_the_best_location() {
//		//given
//		WeatherDto example1 = WeatherDto.builder()
//				.city("Poznan")
//				.datetime("2022-05-30")
//				.temperature(22.0f)
//				.windSpeed(4.0f)
//				.build();
//
//
//		WeatherDto example2 = WeatherDto.builder()
//				.city("Kozmin")
//				.datetime("2022-05-30")
//				.temperature(30.0f)
//				.windSpeed(10.0f)
//				.build();
//
//		List<WeatherDto> test = new ArrayList<>();
//		test.add(example1);
//		test.add(example2);
//
//		String date = "2022-05-30";
//
//		Mockito.when(weatherRepo.getWeatherRepo()).thenReturn(test);
//
//		//when
//		var result = weatherClient.something(date);
//
//		//then
//		assertEquals(example2, result);
//
//
//
//	}

}
