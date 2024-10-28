package com.github.lucasramallo.nfestream.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@XmlRootElement(name = "NFe", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
public class NfeJAXBModel {

    @XmlElement(name = "infNFe", namespace = "http://www.portalfiscal.inf.br/nfe")
    private InformacaoNFe informacaoNFe;

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class InformacaoNFe {

        @XmlAttribute(name = "Id")
        private String id;

        @XmlAttribute(name = "versao")
        private String versao;

        @XmlElement(name = "ide", namespace = "http://www.portalfiscal.inf.br/nfe")
        private Identificacao identificacao;

        @XmlElement(name = "emit", namespace = "http://www.portalfiscal.inf.br/nfe")
        private Emitente emitente;

        @XmlElement(name = "dest", namespace = "http://www.portalfiscal.inf.br/nfe")
        private Destinatario destinatario;

        @XmlElement(name = "det", namespace = "http://www.portalfiscal.inf.br/nfe")
        private List<Detalhe> detalhes;

        @XmlElement(name = "total", namespace = "http://www.portalfiscal.inf.br/nfe")
        private Total total;

        @XmlElement(name = "transp", namespace = "http://www.portalfiscal.inf.br/nfe")
        private Transporte transporte;

        @XmlElement(name = "cobr", namespace = "http://www.portalfiscal.inf.br/nfe")
        private Cobranca cobranca;

        @XmlElement(name = "infAdic", namespace = "http://www.portalfiscal.inf.br/nfe")
        private InformacaoAdicional informacaoAdicional;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Identificacao {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String cUF;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String cNF;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String natOp;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String indPag;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String mod;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String serie;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String nNF;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String dEmi;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String tpNF;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String cMunFG;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String tpImp;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String tpEmis;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String cDV;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String tpAmb;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String finNFe;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String procEmi;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String verProc;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Emitente {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String CNPJ;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xNome;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xFant;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private EnderecoEmitente enderEmit;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String IE;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String IM;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String CNAE;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String CRT;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class EnderecoEmitente {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xLgr;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String nro;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xCpl;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xBairro;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String cMun;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xMun;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String UF;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String CEP;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String cPais;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xPais;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String fone;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Destinatario {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String CNPJ;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xNome;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private EnderecoDestinatario enderDest;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String IE;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String email;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class EnderecoDestinatario {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xLgr;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String nro;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xBairro;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String cMun;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xMun;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String UF;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String CEP;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String cPais;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xPais;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String fone;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Detalhe {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private Produto prod;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private Imposto imposto;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Produto {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String cProd;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String xProd;
        // Adicione outros campos do produto conforme necessário
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Imposto {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private ICMS icms;
        // Outros impostos conforme necessário
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ICMS {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String orig;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String CST;
        // Outros campos ICMS conforme necessário
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Total {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private ICMSTot icmsTot;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ICMSTot {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String vBC;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String vICMS;
        // Outros campos ICMS Totais conforme necessário
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Transporte {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String modFrete;
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Cobranca {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String nDup;
        // Outros campos de cobrança conforme necessário
    }

    @Getter
    @Setter
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class InformacaoAdicional {
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        private String infCpl;
    }
}
