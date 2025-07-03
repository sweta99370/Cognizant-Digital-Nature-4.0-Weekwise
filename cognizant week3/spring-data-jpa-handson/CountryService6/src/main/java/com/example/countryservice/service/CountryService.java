package com.example.countryservice.service;

    import com.example.countryservice.exception.CountryNotFoundException;
    import com.example.countryservice.model.Country;
    import com.example.countryservice.repository.CountryRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import org.springframework.transaction.annotation.Transactional;

    import java.util.List;
    import java.util.Optional;

    @Service
    public class CountryService {

        @Autowired
        private CountryRepository countryRepository;

        @Transactional
        public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
            Optional<Country> result = countryRepository.findById(countryCode);
            if (!result.isPresent()) {
                throw new CountryNotFoundException("Country not found for code: " + countryCode);
            }
            return result.get();
        }

        public Country getCountryByCode(String code) {
            return countryRepository.findById(code).orElse(null);
        }

        public Country addCountry(Country country) {
            return countryRepository.save(country);
        }

        public Country updateCountry(String code, Country updatedCountry) {
            Optional<Country> optional = countryRepository.findById(code);
            if (optional.isPresent()) {
                Country country = optional.get();
                country.setCoName(updatedCountry.getCoName());
                return countryRepository.save(country);
            }
            return null;
        }

        public void deleteCountry(String code) {
            countryRepository.deleteById(code);
        }

        public List<Country> searchCountriesByName(String name) {
            return countryRepository.findByCoNameContainingIgnoreCase(name);
        }
    }