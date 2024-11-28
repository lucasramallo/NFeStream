package com.github.lucasramallo.nfestream.core.service;

import com.github.lucasramallo.nfestream.core.domain.Emitente;
import com.github.lucasramallo.nfestream.core.domain.Transporte;
import com.github.lucasramallo.nfestream.core.mappers.JaxbToImposto;
import com.github.lucasramallo.nfestream.core.domain.Imposto;
import com.github.lucasramallo.nfestream.core.model.NfeJAXBModel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.ArrayList;

public class NfeService {
    public void excecute() {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("static/fake_nfe.xml");
        if (inputStream == null) {
            throw new RuntimeException("Arquivo XML não encontrado!");
        }

        NfeJAXBModel nfeModel = convertXmlToModel(inputStream);
        ArrayList<Imposto> impostos = JaxbToImposto.execute(nfeModel.getInfNFe().getDet().getImposto());

        Emitente emitente = new Emitente();
        emitente.nfeModelToEntity(nfeModel);

        Transporte transporte = new Transporte();
        transporte.nfeModelToEntity(nfeModel);
    }

    private NfeJAXBModel convertXmlToModel(InputStream inputStream) {
        try {
            JAXBContext context = JAXBContext.newInstance(NfeJAXBModel.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();

            if (inputStream == null) {
                throw new RuntimeException("Arquivo não encontrado!");
            }

            return  (NfeJAXBModel) unmarshaller.unmarshal(inputStream);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
