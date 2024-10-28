package com.github.lucasramallo.nfestream;

import com.github.lucasramallo.nfestream.core.model.NfeJAXBModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.InputStream;

@SpringBootApplication
public class NfestreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(NfestreamApplication.class, args);
	}

}

@Component
class StartupRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		try {
			JAXBContext context = JAXBContext.newInstance(NfeJAXBModel.class);

			Unmarshaller unmarshaller = context.createUnmarshaller();

			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("static/35101158716523000119550010000000011003000000-nfe.xml");
			if (inputStream == null) {
				System.out.println("acho n patrao");
			}
			NfeJAXBModel nfeJAXBModel = (NfeJAXBModel) unmarshaller.unmarshal(inputStream);

			System.out.println("codigo de serie: " + nfeJAXBModel.getInformacaoNFe().getEmitente().getXNome());
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}