package com.example.cars.controller;

import com.example.cars.entity.Car;
import com.example.cars.service.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CarController.class)
class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarService mockService;



    @Test
    void testGetAllCar() throws Exception {
        // Setup
        // Configure CarService.getAll(...).
        final List<Car> cars = List.of(new Car(0, "name", 0, "brand", "colour", 0, "datee", "status"));
        when(mockService.getAll()).thenReturn(cars);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharathcars/cars")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testGetAllCar_CarServiceReturnsNoItems() throws Exception {
        // Setup
        when(mockService.getAll()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharathcars/cars")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("[]");
    }

    @Test
    void testGetCarsByDate() throws Exception {
        // Setup
        // Configure CarService.getCarByDate(...).
        final List<Car> cars = List.of(new Car(0, "name", 0, "brand", "colour", 0, "datee", "status"));
        when(mockService.getCarByDate("datee")).thenReturn(cars);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharathcars/{datee}", "datee")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testGetCarsByDate_CarServiceReturnsNoItems() throws Exception {
        // Setup
        when(mockService.getCarByDate("datee")).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharathcars/{datee}", "datee")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("[]");
    }
}
