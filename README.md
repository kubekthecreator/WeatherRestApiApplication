# 🌩 WeatherRestApiApplication 🌩


Aplikacja tworzona w Javie wykorzystująca Spring Boot'a. Za pomocą aplikacji możemy sprawdzić gdzie w danym dniu będą najlepsze warunki pogodowe do surfowania.

# Jak włączyć aplikację:
- Otwórz projekt w InteliJ, przejdź do: WeatherRestApiApplication/WeatherRestApiApplication/src/main/java/io/kubekthecreator/WeatherRestApiApplication/WeatherRestApiApplication.java -> prawy klik na WeatherRestApiApplication.java -> Odpal 'WeatherRestApiApplication.main()'
- Otwórz główny folder WeatherRestApiApplication -> Otwórz cmd i wpisz: mvn spring-boot:run
- Otwórz aplikacje:
Aplikacja włączy się pod adresem http://localhost:8080

🌊

Aby pobrać dane lokalizacji, która najbardziej nadaję w danym dniu do surfowania trzeba przejść pod adres http://localhost:8080/surfing/{data}
Przykładowo: http://localhost:8080/surfing/2022-06-10
Jeżeli żadna z podanych w bazie lokalizacji nie spełnia warunków godnych do surfowania aplikacja nie zwróci nic. 

🌊

# Wykorzystane technologie 🔧
- Java 17
- Spring Boot
- Hibernate/JPA

