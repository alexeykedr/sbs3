package com.example.sbs3;
/**
 * Работа над заданием: 1 этап:
 *
 * 1.  получить список компаний из апи
 * 2. на каждую компанию вызвать апи и получить данные
 * */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@SpringBootApplication
public class Sbs3Application {

	public static void main(String[] args) {
		SpringApplication.run(Sbs3Application.class, args);

	}
}

/*ВОПРОСЫ
* 1. мне нужен список компаний из ответа по
*
* The base url for the API is: https://cloud.iexapis.com/
* */
