package com.example.countryservice.controller;

    import com.example.countryservice.model.Country;
    import com.example.countryservice.service.CountryService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    @RequestMapping("/countries")
    public class CountryController {

        @Autowired
        private CountryService countryService;

        @GetMapping("/{code}")
        public Country getCountryByCode(@PathVariable String code) {
            return countryService.getCountryByCode(code);
        }

        @GetMapping("/search")
        public List<Country> searchCountries(@RequestParam String name) {
            return countryService.searchCountriesByName(name);
        }

        @PostMapping
        public Country addCountry(@RequestBody Country country) {
            return countryService.addCountry(country);
        }

        @PutMapping("/{code}")
        public Country updateCountry(@PathVariable String code, @RequestBody Country country) {
            return countryService.updateCountry(code, country);
        }

        @DeleteMapping("/{code}")
        public void deleteCountry(@PathVariable String code) {
            countryService.deleteCountry(code);
        }
    }