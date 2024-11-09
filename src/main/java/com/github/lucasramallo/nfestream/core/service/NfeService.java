package com.github.lucasramallo.nfestream.core.service;

import com.github.lucasramallo.nfestream.core.model.NfeJAXBModel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class NfeService {
    public void excecute() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("static/fake_nfe.xml");
        if (inputStream == null) {
            System.out.println("acho n patrao");
        }

        NfeJAXBModel model = convertXmlToModel(inputStream);

//        System.out.println("cnpjCpf: " + model.getInformacaoNFe().getDestinatario().getCNPJ());
//        System.out.println("nome: " + model.getInformacaoNFe().getDestinatario().getXNome());
//        System.out.println("endereco: " + model.getInformacaoNFe().getDestinatario().getEnderDest());
//        System.out.println("telefone: " + model.getInformacaoNFe().getDestinatario().getIE());
//        System.out.println("email: " + model.getInformacaoNFe().getDestinatario().getEmail());
    }

    private NfeJAXBModel convertXmlToModel(InputStream inputStream) {
        try {
            JAXBContext context = JAXBContext.newInstance(NfeJAXBModel.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();

            if (inputStream == null) {
                System.out.println("acho n patrao");
            }

            return  (NfeJAXBModel) unmarshaller.unmarshal(inputStream);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
