package com.example.sbs3;

import com.example.sbs3.repository.OnLoadAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sbs3Application implements OnLoadAPI {

	public static void main(String[] args) {
		SpringApplication.run(Sbs3Application.class, args);

	}
// при загрузке приложения вызов onloadAPI для каждой компании
	@Override
	public String getStockStartData(Long id) {
		// вызов https://sandbox.iexapis.com/stable/ref-data/symbols ?токен=Tpk_ee567917a6b640bb8602834c9d30e571

		// возвращает символы / названия / состояние для каждой торговой компании.
		return "символы, etc";
//		Ссылка: [https://iexcloud.io/docs/api/#symbols]

	}
}

/*
* ВОПРОСЫ:
* 1. как сюда передать список компаний (лист компаний есть в классе Company, но как он туда попадает)
* 2. какой должен быть список компаний
* 3. ...
* */