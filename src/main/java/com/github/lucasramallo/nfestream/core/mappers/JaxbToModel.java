package com.github.lucasramallo.nfestream.core.mappers;

import com.github.lucasramallo.nfestream.core.model.NfeJAXBModel;

public interface JaxbToModel<T> {
    public T execute(NfeJAXBModel nfeJAXBModel);
}
