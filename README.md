# 馃尒 WeatherRestApiApplication 馃尒


Aplikacja tworzona w Javie wykorzystuj膮ca Spring Boot'a. Za pomoc膮 aplikacji mo偶emy sprawdzi膰 gdzie w danym dniu b臋d膮 najlepsze warunki pogodowe do surfowania.

# Jak w艂膮czy膰 aplikacj臋:
- Otw贸rz projekt w InteliJ, przejd藕 do: WeatherRestApiApplication/WeatherRestApiApplication/src/main/java/io/kubekthecreator/WeatherRestApiApplication/WeatherRestApiApplication.java -> prawy klik na WeatherRestApiApplication.java -> Odpal 'WeatherRestApiApplication.main()'
- Otw贸rz g艂贸wny folder WeatherRestApiApplication -> Otw贸rz cmd i wpisz: mvn spring-boot:run
- Otw贸rz aplikacje:
Aplikacja w艂膮czy si臋 pod adresem http://localhost:8080

馃寠

Aby pobra膰 dane lokalizacji, kt贸ra najbardziej nadaj臋 si臋 w danym dniu do surfowania trzeba przej艣膰 pod adres http://localhost:8080/surfing/{data}
Przyk艂adowo: http://localhost:8080/surfing/2022-06-10
Je偶eli 偶adna z podanych w bazie lokalizacji nie spe艂nia warunk贸w godnych do surfowania aplikacja nie zwr贸ci nic. 

馃寠

# Wykorzystane technologie 馃敡
- Java 17
- Spring Boot
- RestTemplate
- Lombok

