package com.github.lucasramallo.nfestream.core.mappers;

import com.github.lucasramallo.nfestream.core.model.Imposto;
import com.github.lucasramallo.nfestream.core.model.NfeJAXBModel;

public class JaxbToImposto implements JaxbToModel {

    @Override
    public Imposto execute(NfeJAXBModel nfeJAXBModel) {
        Imposto imposto = new Imposto();
        return null;
    }
}
