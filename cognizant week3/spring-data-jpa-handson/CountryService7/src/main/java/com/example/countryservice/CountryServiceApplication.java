package com.example.countryservice;

    import com.example.countryservice.exception.CountryNotFoundException;
    import com.example.countryservice.model.Country;
    import com.example.countryservice.service.CountryService;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
    public class CountryServiceApplication implements CommandLineRunner {

        private static final Logger LOGGER = LoggerFactory.getLogger(CountryServiceApplication.class);

        @Autowired
        private CountryService countryService;

        public static void main(String[] args) {
            SpringApplication.run(CountryServiceApplication.class, args);
        }

        @Override
        public void run(String... args) throws Exception {
            getCountryByCodeTest();
            testAddCountry();
        }

        private void getCountryByCodeTest() {
            LOGGER.info("Start");
            try {
                Country country = countryService.findCountryByCode("IN");
                LOGGER.debug("Country: {}", country);
            } catch (CountryNotFoundException e) {
                LOGGER.error("Error: {}", e.getMessage());
            }
            LOGGER.info("End");
        }

        private void testAddCountry() {
            LOGGER.info("Start testAddCountry");
            Country country = new Country();
            country.setCoCode("XY");
            country.setCoName("Xylophonia");
            countryService.addCountry(country);

            try {
                Country result = countryService.findCountryByCode("XY");
                LOGGER.debug("Added Country: {}", result);
            } catch (CountryNotFoundException e) {
                LOGGER.error("Country not found: {}", e.getMessage());
            }
            LOGGER.info("End testAddCountry");
        }
    }