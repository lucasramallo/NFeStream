package com.github.lucasramallo.nfestream;

import com.github.lucasramallo.nfestream.core.mappers.JaxbToImposto;
import com.github.lucasramallo.nfestream.core.entity.Imposto;
import com.github.lucasramallo.nfestream.core.model.NfeJAXBModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.ArrayList;

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

			InputStream inputStream = getClass().getClassLoader()
					.getResourceAsStream("static/fake_nfe.xml");

			if (inputStream == null) {
				System.out.println("acho n patrao");
			}
			NfeJAXBModel nfeJAXBModel = (NfeJAXBModel) unmarshaller.unmarshal(inputStream);

			System.out.println();
			System.out.println("===== EMITENTE =====");
			System.out.println();
			System.out.println("cnpjCpf: " + nfeJAXBModel.getInfNFe().getEmit().getCNPJ());
			System.out.println("nome: " + nfeJAXBModel.getInfNFe().getEmit().getXNome());
			System.out.println("endereço: " + nfeJAXBModel.getInfNFe().getEmit().getEnderEmit().toString());
			System.out.println("telefone: " + null);
			System.out.println("email: " + null);

			System.out.println();
			System.out.println("===== DESTINATARIO =====");
			System.out.println();
			System.out.println("cnpjCpf: " + nfeJAXBModel.getInfNFe().getDest().getCNPJ());
			System.out.println("nome: " + nfeJAXBModel.getInfNFe().getDest().getXNome());
			System.out.println("endereço: " + nfeJAXBModel.getInfNFe().getDest().getEnderDest().toString());
			System.out.println("telefone: " + null);
			System.out.println("email: " + null);

			System.out.println();
			System.out.println("===== NFE =====");
			System.out.println();
			System.out.println("chaveAcesso: " + nfeJAXBModel.getInfNFe().getId());
			System.out.println("numeroNfe: " + nfeJAXBModel.getInfNFe().getIde().getNNF());
			System.out.println("serie: " + nfeJAXBModel.getInfNFe().getIde().getSerie());
			System.out.println("data_emissao: " + nfeJAXBModel.getInfNFe().getIde().getDEmi().toString());
			System.out.println("tipo: " + nfeJAXBModel.getInfNFe().getIde().getTpNF());
			System.out.println("total: " + nfeJAXBModel.getInfNFe().getTotal().getICMSTot().getVNF());

			System.out.println();
			System.out.println("===== Imposto =====");
			System.out.println();

			ArrayList<Imposto> impostos = JaxbToImposto.execute(nfeJAXBModel.getInfNFe().getDet().getImposto());

			System.out.println(impostos.toString());

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}