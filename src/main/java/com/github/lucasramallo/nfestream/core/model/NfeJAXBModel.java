//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0
// Consulte https://eclipse-ee4j.github.io/jaxb-ri
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem.
// Gerado em: 2024.11.03 às 09:01:43 PM BRT
//


package com.github.lucasramallo.nfestream.core.model;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java de anonymous complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infNFe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ide"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="cUF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cNF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="natOp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="indPag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="mod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="nNF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="dEmi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="tpNF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cMunFG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="tpImp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="tpEmis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cDV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="tpAmb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="finNFe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="procEmi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="verProc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="emit"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xFant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="enderEmit"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="xLgr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="nro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="xCpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="xBairro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="cMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="xMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="cPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="xPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="fone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="IE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="IM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CNAE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CRT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="dest"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="enderDest"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="xLgr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="nro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="xBairro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="cMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="xMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="cPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="xPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="fone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="IE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="det"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="prod"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="cProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="cEAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="xProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NCM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CFOP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="uCom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="qCom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vUnCom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vProd" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="cEANTrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="uTrib" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="qTrib" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vUnTrib" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="indTot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="xPed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="nItemPed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="imposto"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="ICMS"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ICMS00"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="orig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="modBC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="pICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="IPI"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="cEnq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="IPINT"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PIS"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="PISAliq"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="pPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="COFINS"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="COFINSAliq"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="pCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="infAdProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="nItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="total"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ICMSTot"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vBCST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vProd" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vFrete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vSeg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vDesc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vII" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vIPI" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vOutro" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vNF" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="transp"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="modFrete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="transporta"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="vol"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="qVol" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="esp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="pesoL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="pesoB" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="cobr"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="fat"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="nFat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="vOrig" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="vLiq" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="dup"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="nDup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="dVenc" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                       &lt;element name="vDup" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="infAdic"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="infAdFisco" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="obsCont"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="xTexto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="xCampo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="versao" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "infNFe"
})
@XmlRootElement(name = "NFe")
public class NfeJAXBModel {

    @XmlElement(required = true)
    protected NfeJAXBModel.InfNFe infNFe;

    /**
     * Obtém o valor da propriedade infNFe.
     *
     * @return
     *     possible object is
     *     {@link NfeJAXBModel.InfNFe }
     *
     */
    public NfeJAXBModel.InfNFe getInfNFe() {
        return infNFe;
    }

    /**
     * Define o valor da propriedade infNFe.
     *
     * @param value
     *     allowed object is
     *     {@link NfeJAXBModel.InfNFe }
     *
     */
    public void setInfNFe(NfeJAXBModel.InfNFe value) {
        this.infNFe = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ide"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="cUF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="cNF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="natOp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="indPag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="mod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="nNF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="dEmi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="tpNF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="cMunFG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="tpImp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="tpEmis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="cDV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="tpAmb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="finNFe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="procEmi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="verProc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="emit"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xFant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="enderEmit"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="xLgr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="nro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="xCpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="xBairro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="cMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="xMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="cPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="xPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="fone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="IE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="IM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CNAE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CRT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="dest"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="enderDest"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="xLgr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="nro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="xBairro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="cMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="xMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="cPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="xPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="fone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="IE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="det"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="prod"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="cProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="cEAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="xProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NCM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CFOP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="uCom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="qCom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vUnCom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vProd" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="cEANTrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="uTrib" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="qTrib" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vUnTrib" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="indTot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="xPed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="nItemPed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="imposto"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="ICMS"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ICMS00"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="orig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="modBC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="pICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="IPI"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="cEnq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="IPINT"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PIS"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="PISAliq"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="pPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="COFINS"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="COFINSAliq"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="pCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="infAdProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="nItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="total"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ICMSTot"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vBCST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vProd" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vFrete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vSeg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vDesc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vII" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vIPI" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vOutro" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vNF" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="transp"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="modFrete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="transporta"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="vol"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="qVol" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="esp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="pesoL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="pesoB" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="cobr"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="fat"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="nFat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="vOrig" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="vLiq" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="dup"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="nDup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="dVenc" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                             &lt;element name="vDup" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="infAdic"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="infAdFisco" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="obsCont"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="xTexto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="xCampo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="versao" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "ide",
            "emit",
            "dest",
            "det",
            "total",
            "transp",
            "cobr",
            "infAdic"
    })
    public static class InfNFe {

        @XmlElement(required = true)
        protected NfeJAXBModel.InfNFe.Ide ide;
        @XmlElement(required = true)
        protected NfeJAXBModel.InfNFe.Emit emit;
        @XmlElement(required = true)
        protected NfeJAXBModel.InfNFe.Dest dest;
        @XmlElement(required = true)
        protected NfeJAXBModel.InfNFe.Det det;
        @XmlElement(required = true)
        protected NfeJAXBModel.InfNFe.Total total;
        @XmlElement(required = true)
        protected NfeJAXBModel.InfNFe.Transp transp;
        @XmlElement(required = true)
        protected NfeJAXBModel.InfNFe.Cobr cobr;
        @XmlElement(required = true)
        protected NfeJAXBModel.InfNFe.InfAdic infAdic;
        @XmlAttribute(name = "Id", required = true)
        protected String id;
        @XmlAttribute(name = "versao", required = true)
        protected String versao;

        /**
         * Obtém o valor da propriedade ide.
         *
         * @return
         *     possible object is
         *     {@link NfeJAXBModel.InfNFe.Ide }
         *
         */
        public NfeJAXBModel.InfNFe.Ide getIde() {
            return ide;
        }

        /**
         * Define o valor da propriedade ide.
         *
         * @param value
         *     allowed object is
         *     {@link NfeJAXBModel.InfNFe.Ide }
         *
         */
        public void setIde(NfeJAXBModel.InfNFe.Ide value) {
            this.ide = value;
        }

        /**
         * Obtém o valor da propriedade emit.
         *
         * @return
         *     possible object is
         *     {@link NfeJAXBModel.InfNFe.Emit }
         *
         */
        public NfeJAXBModel.InfNFe.Emit getEmit() {
            return emit;
        }

        /**
         * Define o valor da propriedade emit.
         *
         * @param value
         *     allowed object is
         *     {@link NfeJAXBModel.InfNFe.Emit }
         *
         */
        public void setEmit(NfeJAXBModel.InfNFe.Emit value) {
            this.emit = value;
        }

        /**
         * Obtém o valor da propriedade dest.
         *
         * @return
         *     possible object is
         *     {@link NfeJAXBModel.InfNFe.Dest }
         *
         */
        public NfeJAXBModel.InfNFe.Dest getDest() {
            return dest;
        }

        /**
         * Define o valor da propriedade dest.
         *
         * @param value
         *     allowed object is
         *     {@link NfeJAXBModel.InfNFe.Dest }
         *
         */
        public void setDest(NfeJAXBModel.InfNFe.Dest value) {
            this.dest = value;
        }

        /**
         * Obtém o valor da propriedade det.
         *
         * @return
         *     possible object is
         *     {@link NfeJAXBModel.InfNFe.Det }
         *
         */
        public NfeJAXBModel.InfNFe.Det getDet() {
            return det;
        }

        /**
         * Define o valor da propriedade det.
         *
         * @param value
         *     allowed object is
         *     {@link NfeJAXBModel.InfNFe.Det }
         *
         */
        public void setDet(NfeJAXBModel.InfNFe.Det value) {
            this.det = value;
        }

        /**
         * Obtém o valor da propriedade total.
         *
         * @return
         *     possible object is
         *     {@link NfeJAXBModel.InfNFe.Total }
         *
         */
        public NfeJAXBModel.InfNFe.Total getTotal() {
            return total;
        }

        /**
         * Define o valor da propriedade total.
         *
         * @param value
         *     allowed object is
         *     {@link NfeJAXBModel.InfNFe.Total }
         *
         */
        public void setTotal(NfeJAXBModel.InfNFe.Total value) {
            this.total = value;
        }

        /**
         * Obtém o valor da propriedade transp.
         *
         * @return
         *     possible object is
         *     {@link NfeJAXBModel.InfNFe.Transp }
         *
         */
        public NfeJAXBModel.InfNFe.Transp getTransp() {
            return transp;
        }

        /**
         * Define o valor da propriedade transp.
         *
         * @param value
         *     allowed object is
         *     {@link NfeJAXBModel.InfNFe.Transp }
         *
         */
        public void setTransp(NfeJAXBModel.InfNFe.Transp value) {
            this.transp = value;
        }

        /**
         * Obtém o valor da propriedade cobr.
         *
         * @return
         *     possible object is
         *     {@link NfeJAXBModel.InfNFe.Cobr }
         *
         */
        public NfeJAXBModel.InfNFe.Cobr getCobr() {
            return cobr;
        }

        /**
         * Define o valor da propriedade cobr.
         *
         * @param value
         *     allowed object is
         *     {@link NfeJAXBModel.InfNFe.Cobr }
         *
         */
        public void setCobr(NfeJAXBModel.InfNFe.Cobr value) {
            this.cobr = value;
        }

        /**
         * Obtém o valor da propriedade infAdic.
         *
         * @return
         *     possible object is
         *     {@link NfeJAXBModel.InfNFe.InfAdic }
         *
         */
        public NfeJAXBModel.InfNFe.InfAdic getInfAdic() {
            return infAdic;
        }

        /**
         * Define o valor da propriedade infAdic.
         *
         * @param value
         *     allowed object is
         *     {@link NfeJAXBModel.InfNFe.InfAdic }
         *
         */
        public void setInfAdic(NfeJAXBModel.InfNFe.InfAdic value) {
            this.infAdic = value;
        }

        /**
         * Obtém o valor da propriedade id.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtém o valor da propriedade versao.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVersao() {
            return versao;
        }

        /**
         * Define o valor da propriedade versao.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVersao(String value) {
            this.versao = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="fat"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="nFat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="vOrig" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vLiq" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="dup"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="nDup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="dVenc" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                   &lt;element name="vDup" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "fat",
                "dup"
        })
        public static class Cobr {

            @XmlElement(required = true)
            protected NfeJAXBModel.InfNFe.Cobr.Fat fat;
            @XmlElement(required = true)
            protected NfeJAXBModel.InfNFe.Cobr.Dup dup;

            /**
             * Obtém o valor da propriedade fat.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.Cobr.Fat }
             *
             */
            public NfeJAXBModel.InfNFe.Cobr.Fat getFat() {
                return fat;
            }

            /**
             * Define o valor da propriedade fat.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.Cobr.Fat }
             *
             */
            public void setFat(NfeJAXBModel.InfNFe.Cobr.Fat value) {
                this.fat = value;
            }

            /**
             * Obtém o valor da propriedade dup.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.Cobr.Dup }
             *
             */
            public NfeJAXBModel.InfNFe.Cobr.Dup getDup() {
                return dup;
            }

            /**
             * Define o valor da propriedade dup.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.Cobr.Dup }
             *
             */
            public void setDup(NfeJAXBModel.InfNFe.Cobr.Dup value) {
                this.dup = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="nDup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="dVenc" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
             *         &lt;element name="vDup" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "nDup",
                    "dVenc",
                    "vDup"
            })
            public static class Dup {

                @XmlElement(required = true)
                protected String nDup;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dVenc;
                @XmlElement(required = true)
                protected BigDecimal vDup;

                /**
                 * Obtém o valor da propriedade nDup.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNDup() {
                    return nDup;
                }

                /**
                 * Define o valor da propriedade nDup.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNDup(String value) {
                    this.nDup = value;
                }

                /**
                 * Obtém o valor da propriedade dVenc.
                 *
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public XMLGregorianCalendar getDVenc() {
                    return dVenc;
                }

                /**
                 * Define o valor da propriedade dVenc.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *
                 */
                public void setDVenc(XMLGregorianCalendar value) {
                    this.dVenc = value;
                }

                /**
                 * Obtém o valor da propriedade vDup.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVDup() {
                    return vDup;
                }

                /**
                 * Define o valor da propriedade vDup.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVDup(BigDecimal value) {
                    this.vDup = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="nFat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="vOrig" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vLiq" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "nFat",
                    "vOrig",
                    "vLiq"
            })
            public static class Fat {

                @XmlElement(required = true)
                protected String nFat;
                @XmlElement(required = true)
                protected BigDecimal vOrig;
                @XmlElement(required = true)
                protected BigDecimal vLiq;

                /**
                 * Obtém o valor da propriedade nFat.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNFat() {
                    return nFat;
                }

                /**
                 * Define o valor da propriedade nFat.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNFat(String value) {
                    this.nFat = value;
                }

                /**
                 * Obtém o valor da propriedade vOrig.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVOrig() {
                    return vOrig;
                }

                /**
                 * Define o valor da propriedade vOrig.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVOrig(BigDecimal value) {
                    this.vOrig = value;
                }

                /**
                 * Obtém o valor da propriedade vLiq.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVLiq() {
                    return vLiq;
                }

                /**
                 * Define o valor da propriedade vLiq.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVLiq(BigDecimal value) {
                    this.vLiq = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="enderDest"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="xLgr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="nro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="xBairro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="cMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="xMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="cPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="xPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="fone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="IE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "cnpj",
                "xNome",
                "enderDest",
                "ie",
                "email"
        })
        public static class Dest {

            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;
            @XmlElement(required = true)
            protected String xNome;
            @XmlElement(required = true)
            protected NfeJAXBModel.InfNFe.Dest.EnderDest enderDest;
            @XmlElement(name = "IE", required = true)
            protected String ie;
            @XmlElement(required = true)
            protected String email;

            /**
             * Obtém o valor da propriedade cnpj.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obtém o valor da propriedade xNome.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Define o valor da propriedade xNome.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Obtém o valor da propriedade enderDest.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.Dest.EnderDest }
             *
             */
            public NfeJAXBModel.InfNFe.Dest.EnderDest getEnderDest() {
                return enderDest;
            }

            /**
             * Define o valor da propriedade enderDest.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.Dest.EnderDest }
             *
             */
            public void setEnderDest(NfeJAXBModel.InfNFe.Dest.EnderDest value) {
                this.enderDest = value;
            }

            /**
             * Obtém o valor da propriedade ie.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obtém o valor da propriedade email.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define o valor da propriedade email.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEmail(String value) {
                this.email = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="xLgr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="nro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="xBairro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="cMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="xMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="cPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="xPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="fone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "xLgr",
                    "nro",
                    "xBairro",
                    "cMun",
                    "xMun",
                    "uf",
                    "cep",
                    "cPais",
                    "xPais",
                    "fone"
            })
            public static class EnderDest {

                @XmlElement(required = true)
                protected String xLgr;
                @XmlElement(required = true)
                protected String nro;
                @XmlElement(required = true)
                protected String xBairro;
                @XmlElement(required = true)
                protected String cMun;
                @XmlElement(required = true)
                protected String xMun;
                @XmlElement(name = "UF", required = true)
                protected String uf;
                @XmlElement(name = "CEP", required = true)
                protected String cep;
                @XmlElement(required = true)
                protected String cPais;
                @XmlElement(required = true)
                protected String xPais;
                @XmlElement(required = true)
                protected String fone;

                /**
                 * Obtém o valor da propriedade xLgr.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXLgr() {
                    return xLgr;
                }

                /**
                 * Define o valor da propriedade xLgr.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXLgr(String value) {
                    this.xLgr = value;
                }

                /**
                 * Obtém o valor da propriedade nro.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNro() {
                    return nro;
                }

                /**
                 * Define o valor da propriedade nro.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNro(String value) {
                    this.nro = value;
                }

                /**
                 * Obtém o valor da propriedade xBairro.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXBairro() {
                    return xBairro;
                }

                /**
                 * Define o valor da propriedade xBairro.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXBairro(String value) {
                    this.xBairro = value;
                }

                /**
                 * Obtém o valor da propriedade cMun.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCMun() {
                    return cMun;
                }

                /**
                 * Define o valor da propriedade cMun.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCMun(String value) {
                    this.cMun = value;
                }

                /**
                 * Obtém o valor da propriedade xMun.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXMun() {
                    return xMun;
                }

                /**
                 * Define o valor da propriedade xMun.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXMun(String value) {
                    this.xMun = value;
                }

                /**
                 * Obtém o valor da propriedade uf.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUF() {
                    return uf;
                }

                /**
                 * Define o valor da propriedade uf.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUF(String value) {
                    this.uf = value;
                }

                /**
                 * Obtém o valor da propriedade cep.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCEP() {
                    return cep;
                }

                /**
                 * Define o valor da propriedade cep.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCEP(String value) {
                    this.cep = value;
                }

                /**
                 * Obtém o valor da propriedade cPais.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCPais() {
                    return cPais;
                }

                /**
                 * Define o valor da propriedade cPais.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCPais(String value) {
                    this.cPais = value;
                }

                /**
                 * Obtém o valor da propriedade xPais.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXPais() {
                    return xPais;
                }

                /**
                 * Define o valor da propriedade xPais.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXPais(String value) {
                    this.xPais = value;
                }

                /**
                 * Obtém o valor da propriedade fone.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getFone() {
                    return fone;
                }

                /**
                 * Define o valor da propriedade fone.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setFone(String value) {
                    this.fone = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="prod"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="cProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="cEAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="xProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NCM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CFOP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="uCom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="qCom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vUnCom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vProd" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="cEANTrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="uTrib" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="qTrib" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vUnTrib" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="indTot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="xPed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="nItemPed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="imposto"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="ICMS"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ICMS00"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="orig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="modBC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="pICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="IPI"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="cEnq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="IPINT"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PIS"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="PISAliq"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="pPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="COFINS"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="COFINSAliq"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="pCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="infAdProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="nItem" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "prod",
                "imposto",
                "infAdProd"
        })
        public static class Det {

            @XmlElement(required = true)
            protected NfeJAXBModel.InfNFe.Det.Prod prod;
            @XmlElement(required = true)
            protected NfeJAXBModel.InfNFe.Det.Imposto imposto;
            @XmlElement(required = true)
            protected String infAdProd;
            @XmlAttribute(name = "nItem", required = true)
            protected String nItem;

            /**
             * Obtém o valor da propriedade prod.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.Det.Prod }
             *
             */
            public NfeJAXBModel.InfNFe.Det.Prod getProd() {
                return prod;
            }

            /**
             * Define o valor da propriedade prod.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.Det.Prod }
             *
             */
            public void setProd(NfeJAXBModel.InfNFe.Det.Prod value) {
                this.prod = value;
            }

            /**
             * Obtém o valor da propriedade imposto.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.Det.Imposto }
             *
             */
            public NfeJAXBModel.InfNFe.Det.Imposto getImposto() {
                return imposto;
            }

            /**
             * Define o valor da propriedade imposto.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.Det.Imposto }
             *
             */
            public void setImposto(NfeJAXBModel.InfNFe.Det.Imposto value) {
                this.imposto = value;
            }

            /**
             * Obtém o valor da propriedade infAdProd.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getInfAdProd() {
                return infAdProd;
            }

            /**
             * Define o valor da propriedade infAdProd.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setInfAdProd(String value) {
                this.infAdProd = value;
            }

            /**
             * Obtém o valor da propriedade nItem.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNItem() {
                return nItem;
            }

            /**
             * Define o valor da propriedade nItem.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNItem(String value) {
                this.nItem = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="ICMS"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ICMS00"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="orig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="modBC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="pICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="IPI"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="cEnq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="IPINT"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PIS"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="PISAliq"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="pPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="COFINS"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="COFINSAliq"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="pCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "icms",
                    "ipi",
                    "pis",
                    "cofins"
            })
            public static class Imposto {

                @XmlElement(name = "ICMS", required = true)
                protected NfeJAXBModel.InfNFe.Det.Imposto.ICMS icms;
                @XmlElement(name = "IPI", required = true)
                protected NfeJAXBModel.InfNFe.Det.Imposto.IPI ipi;
                @XmlElement(name = "PIS", required = true)
                protected NfeJAXBModel.InfNFe.Det.Imposto.PIS pis;
                @XmlElement(name = "COFINS", required = true)
                protected NfeJAXBModel.InfNFe.Det.Imposto.COFINS cofins;

                /**
                 * Obtém o valor da propriedade icms.
                 *
                 * @return
                 *     possible object is
                 *     {@link NfeJAXBModel.InfNFe.Det.Imposto.ICMS }
                 *
                 */
                public NfeJAXBModel.InfNFe.Det.Imposto.ICMS getICMS() {
                    return icms;
                }

                /**
                 * Define o valor da propriedade icms.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link NfeJAXBModel.InfNFe.Det.Imposto.ICMS }
                 *
                 */
                public void setICMS(NfeJAXBModel.InfNFe.Det.Imposto.ICMS value) {
                    this.icms = value;
                }

                /**
                 * Obtém o valor da propriedade ipi.
                 *
                 * @return
                 *     possible object is
                 *     {@link NfeJAXBModel.InfNFe.Det.Imposto.IPI }
                 *
                 */
                public NfeJAXBModel.InfNFe.Det.Imposto.IPI getIPI() {
                    return ipi;
                }

                /**
                 * Define o valor da propriedade ipi.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link NfeJAXBModel.InfNFe.Det.Imposto.IPI }
                 *
                 */
                public void setIPI(NfeJAXBModel.InfNFe.Det.Imposto.IPI value) {
                    this.ipi = value;
                }

                /**
                 * Obtém o valor da propriedade pis.
                 *
                 * @return
                 *     possible object is
                 *     {@link NfeJAXBModel.InfNFe.Det.Imposto.PIS }
                 *
                 */
                public NfeJAXBModel.InfNFe.Det.Imposto.PIS getPIS() {
                    return pis;
                }

                /**
                 * Define o valor da propriedade pis.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link NfeJAXBModel.InfNFe.Det.Imposto.PIS }
                 *
                 */
                public void setPIS(NfeJAXBModel.InfNFe.Det.Imposto.PIS value) {
                    this.pis = value;
                }

                /**
                 * Obtém o valor da propriedade cofins.
                 *
                 * @return
                 *     possible object is
                 *     {@link NfeJAXBModel.InfNFe.Det.Imposto.COFINS }
                 *
                 */
                public NfeJAXBModel.InfNFe.Det.Imposto.COFINS getCOFINS() {
                    return cofins;
                }

                /**
                 * Define o valor da propriedade cofins.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link NfeJAXBModel.InfNFe.Det.Imposto.COFINS }
                 *
                 */
                public void setCOFINS(NfeJAXBModel.InfNFe.Det.Imposto.COFINS value) {
                    this.cofins = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="COFINSAliq"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="pCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "cofinsAliq"
                })
                public static class COFINS {

                    @XmlElement(name = "COFINSAliq", required = true)
                    protected NfeJAXBModel.InfNFe.Det.Imposto.COFINS.COFINSAliq cofinsAliq;

                    /**
                     * Obtém o valor da propriedade cofinsAliq.
                     *
                     * @return
                     *     possible object is
                     *     {@link NfeJAXBModel.InfNFe.Det.Imposto.COFINS.COFINSAliq }
                     *
                     */
                    public NfeJAXBModel.InfNFe.Det.Imposto.COFINS.COFINSAliq getCOFINSAliq() {
                        return cofinsAliq;
                    }

                    /**
                     * Define o valor da propriedade cofinsAliq.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link NfeJAXBModel.InfNFe.Det.Imposto.COFINS.COFINSAliq }
                     *
                     */
                    public void setCOFINSAliq(NfeJAXBModel.InfNFe.Det.Imposto.COFINS.COFINSAliq value) {
                        this.cofinsAliq = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     *
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="pCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "cst",
                            "vbc",
                            "pcofins",
                            "vcofins"
                    })
                    public static class COFINSAliq {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "vBC", required = true)
                        protected BigDecimal vbc;
                        @XmlElement(name = "pCOFINS", required = true)
                        protected BigDecimal pcofins;
                        @XmlElement(name = "vCOFINS", required = true)
                        protected BigDecimal vcofins;

                        /**
                         * Obtém o valor da propriedade cst.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obtém o valor da propriedade vbc.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setVBC(BigDecimal value) {
                            this.vbc = value;
                        }

                        /**
                         * Obtém o valor da propriedade pcofins.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getPCOFINS() {
                            return pcofins;
                        }

                        /**
                         * Define o valor da propriedade pcofins.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setPCOFINS(BigDecimal value) {
                            this.pcofins = value;
                        }

                        /**
                         * Obtém o valor da propriedade vcofins.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getVCOFINS() {
                            return vcofins;
                        }

                        /**
                         * Define o valor da propriedade vcofins.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setVCOFINS(BigDecimal value) {
                            this.vcofins = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="ICMS00"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="orig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="modBC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="pICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "icms00"
                })
                public static class ICMS {

                    @XmlElement(name = "ICMS00", required = true)
                    protected NfeJAXBModel.InfNFe.Det.Imposto.ICMS.ICMS00 icms00;

                    /**
                     * Obtém o valor da propriedade icms00.
                     *
                     * @return
                     *     possible object is
                     *     {@link NfeJAXBModel.InfNFe.Det.Imposto.ICMS.ICMS00 }
                     *
                     */
                    public NfeJAXBModel.InfNFe.Det.Imposto.ICMS.ICMS00 getICMS00() {
                        return icms00;
                    }

                    /**
                     * Define o valor da propriedade icms00.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link NfeJAXBModel.InfNFe.Det.Imposto.ICMS.ICMS00 }
                     *
                     */
                    public void setICMS00(NfeJAXBModel.InfNFe.Det.Imposto.ICMS.ICMS00 value) {
                        this.icms00 = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     *
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="orig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="modBC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="pICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "orig",
                            "cst",
                            "modBC",
                            "vbc",
                            "picms",
                            "vicms"
                    })
                    public static class ICMS00 {

                        @XmlElement(required = true)
                        protected String orig;
                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(required = true)
                        protected String modBC;
                        @XmlElement(name = "vBC", required = true)
                        protected BigDecimal vbc;
                        @XmlElement(name = "pICMS", required = true)
                        protected BigDecimal picms;
                        @XmlElement(name = "vICMS", required = true)
                        protected BigDecimal vicms;

                        /**
                         * Obtém o valor da propriedade orig.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getOrig() {
                            return orig;
                        }

                        /**
                         * Define o valor da propriedade orig.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setOrig(String value) {
                            this.orig = value;
                        }

                        /**
                         * Obtém o valor da propriedade cst.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obtém o valor da propriedade modBC.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getModBC() {
                            return modBC;
                        }

                        /**
                         * Define o valor da propriedade modBC.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setModBC(String value) {
                            this.modBC = value;
                        }

                        /**
                         * Obtém o valor da propriedade vbc.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setVBC(BigDecimal value) {
                            this.vbc = value;
                        }

                        /**
                         * Obtém o valor da propriedade picms.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getPICMS() {
                            return picms;
                        }

                        /**
                         * Define o valor da propriedade picms.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setPICMS(BigDecimal value) {
                            this.picms = value;
                        }

                        /**
                         * Obtém o valor da propriedade vicms.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getVICMS() {
                            return vicms;
                        }

                        /**
                         * Define o valor da propriedade vicms.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setVICMS(BigDecimal value) {
                            this.vicms = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="cEnq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="IPINT"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "cEnq",
                        "ipint"
                })
                public static class IPI {

                    @XmlElement(required = true)
                    protected String cEnq;
                    @XmlElement(name = "IPINT", required = true)
                    protected NfeJAXBModel.InfNFe.Det.Imposto.IPI.IPINT ipint;

                    /**
                     * Obtém o valor da propriedade cEnq.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCEnq() {
                        return cEnq;
                    }

                    /**
                     * Define o valor da propriedade cEnq.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCEnq(String value) {
                        this.cEnq = value;
                    }

                    /**
                     * Obtém o valor da propriedade ipint.
                     *
                     * @return
                     *     possible object is
                     *     {@link NfeJAXBModel.InfNFe.Det.Imposto.IPI.IPINT }
                     *
                     */
                    public NfeJAXBModel.InfNFe.Det.Imposto.IPI.IPINT getIPINT() {
                        return ipint;
                    }

                    /**
                     * Define o valor da propriedade ipint.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link NfeJAXBModel.InfNFe.Det.Imposto.IPI.IPINT }
                     *
                     */
                    public void setIPINT(NfeJAXBModel.InfNFe.Det.Imposto.IPI.IPINT value) {
                        this.ipint = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     *
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "cst"
                    })
                    public static class IPINT {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;

                        /**
                         * Obtém o valor da propriedade cst.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 *
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="PISAliq"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="pPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "pisAliq"
                })
                public static class PIS {

                    @XmlElement(name = "PISAliq", required = true)
                    protected NfeJAXBModel.InfNFe.Det.Imposto.PIS.PISAliq pisAliq;

                    /**
                     * Obtém o valor da propriedade pisAliq.
                     *
                     * @return
                     *     possible object is
                     *     {@link NfeJAXBModel.InfNFe.Det.Imposto.PIS.PISAliq }
                     *
                     */
                    public NfeJAXBModel.InfNFe.Det.Imposto.PIS.PISAliq getPISAliq() {
                        return pisAliq;
                    }

                    /**
                     * Define o valor da propriedade pisAliq.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link NfeJAXBModel.InfNFe.Det.Imposto.PIS.PISAliq }
                     *
                     */
                    public void setPISAliq(NfeJAXBModel.InfNFe.Det.Imposto.PIS.PISAliq value) {
                        this.pisAliq = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     *
                     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                     *
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="CST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="pPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                            "cst",
                            "vbc",
                            "ppis",
                            "vpis"
                    })
                    public static class PISAliq {

                        @XmlElement(name = "CST", required = true)
                        protected String cst;
                        @XmlElement(name = "vBC", required = true)
                        protected BigDecimal vbc;
                        @XmlElement(name = "pPIS", required = true)
                        protected BigDecimal ppis;
                        @XmlElement(name = "vPIS", required = true)
                        protected BigDecimal vpis;

                        /**
                         * Obtém o valor da propriedade cst.
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getCST() {
                            return cst;
                        }

                        /**
                         * Define o valor da propriedade cst.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setCST(String value) {
                            this.cst = value;
                        }

                        /**
                         * Obtém o valor da propriedade vbc.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getVBC() {
                            return vbc;
                        }

                        /**
                         * Define o valor da propriedade vbc.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setVBC(BigDecimal value) {
                            this.vbc = value;
                        }

                        /**
                         * Obtém o valor da propriedade ppis.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getPPIS() {
                            return ppis;
                        }

                        /**
                         * Define o valor da propriedade ppis.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setPPIS(BigDecimal value) {
                            this.ppis = value;
                        }

                        /**
                         * Obtém o valor da propriedade vpis.
                         *
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *
                         */
                        public BigDecimal getVPIS() {
                            return vpis;
                        }

                        /**
                         * Define o valor da propriedade vpis.
                         *
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *
                         */
                        public void setVPIS(BigDecimal value) {
                            this.vpis = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="cProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="cEAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="xProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NCM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CFOP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="uCom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="qCom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vUnCom" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vProd" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="cEANTrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="uTrib" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="qTrib" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vUnTrib" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="indTot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="xPed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="nItemPed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "cProd",
                    "cean",
                    "xProd",
                    "ncm",
                    "cfop",
                    "uCom",
                    "qCom",
                    "vUnCom",
                    "vProd",
                    "ceanTrib",
                    "uTrib",
                    "qTrib",
                    "vUnTrib",
                    "indTot",
                    "xPed",
                    "nItemPed"
            })
            public static class Prod {

                @XmlElement(required = true)
                protected String cProd;
                @XmlElement(name = "cEAN")
                protected String cean;
                @XmlElement(required = true)
                protected String xProd;
                @XmlElement(name = "NCM", required = true)
                protected String ncm;
                @XmlElement(name = "CFOP", required = true)
                protected String cfop;
                @XmlElement(required = true)
                protected String uCom;
                @XmlElement(required = true)
                protected BigDecimal qCom;
                @XmlElement(required = true)
                protected BigDecimal vUnCom;
                @XmlElement(required = true)
                protected BigDecimal vProd;
                @XmlElement(name = "cEANTrib")
                protected String ceanTrib;
                @XmlElement(required = true)
                protected String uTrib;
                @XmlElement(required = true)
                protected BigDecimal qTrib;
                @XmlElement(required = true)
                protected BigDecimal vUnTrib;
                @XmlElement(required = true)
                protected String indTot;
                @XmlElement(required = true)
                protected String xPed;
                @XmlElement(required = true)
                protected String nItemPed;

                /**
                 * Obtém o valor da propriedade cProd.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCProd() {
                    return cProd;
                }

                /**
                 * Define o valor da propriedade cProd.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCProd(String value) {
                    this.cProd = value;
                }

                /**
                 * Obtém o valor da propriedade cean.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCEAN() {
                    return cean;
                }

                /**
                 * Define o valor da propriedade cean.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCEAN(String value) {
                    this.cean = value;
                }

                /**
                 * Obtém o valor da propriedade xProd.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXProd() {
                    return xProd;
                }

                /**
                 * Define o valor da propriedade xProd.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXProd(String value) {
                    this.xProd = value;
                }

                /**
                 * Obtém o valor da propriedade ncm.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNCM() {
                    return ncm;
                }

                /**
                 * Define o valor da propriedade ncm.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNCM(String value) {
                    this.ncm = value;
                }

                /**
                 * Obtém o valor da propriedade cfop.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCFOP() {
                    return cfop;
                }

                /**
                 * Define o valor da propriedade cfop.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCFOP(String value) {
                    this.cfop = value;
                }

                /**
                 * Obtém o valor da propriedade uCom.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUCom() {
                    return uCom;
                }

                /**
                 * Define o valor da propriedade uCom.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUCom(String value) {
                    this.uCom = value;
                }

                /**
                 * Obtém o valor da propriedade qCom.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getQCom() {
                    return qCom;
                }

                /**
                 * Define o valor da propriedade qCom.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setQCom(BigDecimal value) {
                    this.qCom = value;
                }

                /**
                 * Obtém o valor da propriedade vUnCom.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVUnCom() {
                    return vUnCom;
                }

                /**
                 * Define o valor da propriedade vUnCom.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVUnCom(BigDecimal value) {
                    this.vUnCom = value;
                }

                /**
                 * Obtém o valor da propriedade vProd.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVProd() {
                    return vProd;
                }

                /**
                 * Define o valor da propriedade vProd.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVProd(BigDecimal value) {
                    this.vProd = value;
                }

                /**
                 * Obtém o valor da propriedade ceanTrib.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCEANTrib() {
                    return ceanTrib;
                }

                /**
                 * Define o valor da propriedade ceanTrib.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCEANTrib(String value) {
                    this.ceanTrib = value;
                }

                /**
                 * Obtém o valor da propriedade uTrib.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUTrib() {
                    return uTrib;
                }

                /**
                 * Define o valor da propriedade uTrib.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUTrib(String value) {
                    this.uTrib = value;
                }

                /**
                 * Obtém o valor da propriedade qTrib.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getQTrib() {
                    return qTrib;
                }

                /**
                 * Define o valor da propriedade qTrib.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setQTrib(BigDecimal value) {
                    this.qTrib = value;
                }

                /**
                 * Obtém o valor da propriedade vUnTrib.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVUnTrib() {
                    return vUnTrib;
                }

                /**
                 * Define o valor da propriedade vUnTrib.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVUnTrib(BigDecimal value) {
                    this.vUnTrib = value;
                }

                /**
                 * Obtém o valor da propriedade indTot.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getIndTot() {
                    return indTot;
                }

                /**
                 * Define o valor da propriedade indTot.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setIndTot(String value) {
                    this.indTot = value;
                }

                /**
                 * Obtém o valor da propriedade xPed.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXPed() {
                    return xPed;
                }

                /**
                 * Define o valor da propriedade xPed.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXPed(String value) {
                    this.xPed = value;
                }

                /**
                 * Obtém o valor da propriedade nItemPed.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNItemPed() {
                    return nItemPed;
                }

                /**
                 * Define o valor da propriedade nItemPed.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNItemPed(String value) {
                    this.nItemPed = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CNPJ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="xFant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="enderEmit"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="xLgr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="nro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="xCpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="xBairro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="cMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="xMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="cPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="xPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="fone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="IE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="IM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CNAE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CRT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "cnpj",
                "xNome",
                "xFant",
                "enderEmit",
                "ie",
                "im",
                "cnae",
                "crt"
        })
        public static class Emit {

            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;
            @XmlElement(required = true)
            protected String xNome;
            @XmlElement(required = true)
            protected String xFant;
            @XmlElement(required = true)
            protected NfeJAXBModel.InfNFe.Emit.EnderEmit enderEmit;
            @XmlElement(name = "IE", required = true)
            protected String ie;
            @XmlElement(name = "IM", required = true)
            protected String im;
            @XmlElement(name = "CNAE", required = true)
            protected String cnae;
            @XmlElement(name = "CRT", required = true)
            protected String crt;

            /**
             * Obtém o valor da propriedade cnpj.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCNPJ() {
                return cnpj;
            }

            /**
             * Define o valor da propriedade cnpj.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCNPJ(String value) {
                this.cnpj = value;
            }

            /**
             * Obtém o valor da propriedade xNome.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getXNome() {
                return xNome;
            }

            /**
             * Define o valor da propriedade xNome.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setXNome(String value) {
                this.xNome = value;
            }

            /**
             * Obtém o valor da propriedade xFant.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getXFant() {
                return xFant;
            }

            /**
             * Define o valor da propriedade xFant.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setXFant(String value) {
                this.xFant = value;
            }

            /**
             * Obtém o valor da propriedade enderEmit.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.Emit.EnderEmit }
             *
             */
            public NfeJAXBModel.InfNFe.Emit.EnderEmit getEnderEmit() {
                return enderEmit;
            }

            /**
             * Define o valor da propriedade enderEmit.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.Emit.EnderEmit }
             *
             */
            public void setEnderEmit(NfeJAXBModel.InfNFe.Emit.EnderEmit value) {
                this.enderEmit = value;
            }

            /**
             * Obtém o valor da propriedade ie.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obtém o valor da propriedade im.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIM() {
                return im;
            }

            /**
             * Define o valor da propriedade im.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIM(String value) {
                this.im = value;
            }

            /**
             * Obtém o valor da propriedade cnae.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCNAE() {
                return cnae;
            }

            /**
             * Define o valor da propriedade cnae.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCNAE(String value) {
                this.cnae = value;
            }

            /**
             * Obtém o valor da propriedade crt.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCRT() {
                return crt;
            }

            /**
             * Define o valor da propriedade crt.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCRT(String value) {
                this.crt = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="xLgr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="nro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="xCpl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="xBairro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="cMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="xMun" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="UF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CEP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="cPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="xPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="fone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "xLgr",
                    "nro",
                    "xCpl",
                    "xBairro",
                    "cMun",
                    "xMun",
                    "uf",
                    "cep",
                    "cPais",
                    "xPais",
                    "fone"
            })
            public static class EnderEmit {

                @XmlElement(required = true)
                protected String xLgr;
                @XmlElement(required = true)
                protected String nro;
                protected String xCpl;
                @XmlElement(required = true)
                protected String xBairro;
                @XmlElement(required = true)
                protected String cMun;
                @XmlElement(required = true)
                protected String xMun;
                @XmlElement(name = "UF", required = true)
                protected String uf;
                @XmlElement(name = "CEP", required = true)
                protected String cep;
                @XmlElement(required = true)
                protected String cPais;
                @XmlElement(required = true)
                protected String xPais;
                @XmlElement(required = true)
                protected String fone;

                /**
                 * Obtém o valor da propriedade xLgr.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXLgr() {
                    return xLgr;
                }

                /**
                 * Define o valor da propriedade xLgr.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXLgr(String value) {
                    this.xLgr = value;
                }

                /**
                 * Obtém o valor da propriedade nro.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNro() {
                    return nro;
                }

                /**
                 * Define o valor da propriedade nro.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNro(String value) {
                    this.nro = value;
                }

                /**
                 * Obtém o valor da propriedade xCpl.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXCpl() {
                    return xCpl;
                }

                /**
                 * Define o valor da propriedade xCpl.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXCpl(String value) {
                    this.xCpl = value;
                }

                /**
                 * Obtém o valor da propriedade xBairro.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXBairro() {
                    return xBairro;
                }

                /**
                 * Define o valor da propriedade xBairro.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXBairro(String value) {
                    this.xBairro = value;
                }

                /**
                 * Obtém o valor da propriedade cMun.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCMun() {
                    return cMun;
                }

                /**
                 * Define o valor da propriedade cMun.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCMun(String value) {
                    this.cMun = value;
                }

                /**
                 * Obtém o valor da propriedade xMun.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXMun() {
                    return xMun;
                }

                /**
                 * Define o valor da propriedade xMun.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXMun(String value) {
                    this.xMun = value;
                }

                /**
                 * Obtém o valor da propriedade uf.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUF() {
                    return uf;
                }

                /**
                 * Define o valor da propriedade uf.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUF(String value) {
                    this.uf = value;
                }

                /**
                 * Obtém o valor da propriedade cep.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCEP() {
                    return cep;
                }

                /**
                 * Define o valor da propriedade cep.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCEP(String value) {
                    this.cep = value;
                }

                /**
                 * Obtém o valor da propriedade cPais.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCPais() {
                    return cPais;
                }

                /**
                 * Define o valor da propriedade cPais.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCPais(String value) {
                    this.cPais = value;
                }

                /**
                 * Obtém o valor da propriedade xPais.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXPais() {
                    return xPais;
                }

                /**
                 * Define o valor da propriedade xPais.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXPais(String value) {
                    this.xPais = value;
                }

                /**
                 * Obtém o valor da propriedade fone.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getFone() {
                    return fone;
                }

                /**
                 * Define o valor da propriedade fone.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setFone(String value) {
                    this.fone = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="cUF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="cNF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="natOp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="indPag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="mod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="nNF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="dEmi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="tpNF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="cMunFG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="tpImp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="tpEmis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="cDV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="tpAmb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="finNFe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="procEmi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="verProc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "cuf",
                "cnf",
                "natOp",
                "indPag",
                "mod",
                "serie",
                "nnf",
                "dEmi",
                "tpNF",
                "cMunFG",
                "tpImp",
                "tpEmis",
                "cdv",
                "tpAmb",
                "finNFe",
                "procEmi",
                "verProc"
        })
        public static class Ide {

            @XmlElement(name = "cUF", required = true)
            protected String cuf;
            @XmlElement(name = "cNF", required = true)
            protected String cnf;
            @XmlElement(required = true)
            protected String natOp;
            @XmlElement(required = true)
            protected String indPag;
            @XmlElement(required = true)
            protected String mod;
            @XmlElement(required = true)
            protected String serie;
            @XmlElement(name = "nNF", required = true)
            protected String nnf;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dEmi;
            @XmlElement(required = true)
            protected String tpNF;
            @XmlElement(required = true)
            protected String cMunFG;
            @XmlElement(required = true)
            protected String tpImp;
            @XmlElement(required = true)
            protected String tpEmis;
            @XmlElement(name = "cDV", required = true)
            protected String cdv;
            @XmlElement(required = true)
            protected String tpAmb;
            @XmlElement(required = true)
            protected String finNFe;
            @XmlElement(required = true)
            protected String procEmi;
            @XmlElement(required = true)
            protected String verProc;

            /**
             * Obtém o valor da propriedade cuf.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCUF() {
                return cuf;
            }

            /**
             * Define o valor da propriedade cuf.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCUF(String value) {
                this.cuf = value;
            }

            /**
             * Obtém o valor da propriedade cnf.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCNF() {
                return cnf;
            }

            /**
             * Define o valor da propriedade cnf.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCNF(String value) {
                this.cnf = value;
            }

            /**
             * Obtém o valor da propriedade natOp.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNatOp() {
                return natOp;
            }

            /**
             * Define o valor da propriedade natOp.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNatOp(String value) {
                this.natOp = value;
            }

            /**
             * Obtém o valor da propriedade indPag.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIndPag() {
                return indPag;
            }

            /**
             * Define o valor da propriedade indPag.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIndPag(String value) {
                this.indPag = value;
            }

            /**
             * Obtém o valor da propriedade mod.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMod() {
                return mod;
            }

            /**
             * Define o valor da propriedade mod.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMod(String value) {
                this.mod = value;
            }

            /**
             * Obtém o valor da propriedade serie.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSerie() {
                return serie;
            }

            /**
             * Define o valor da propriedade serie.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSerie(String value) {
                this.serie = value;
            }

            /**
             * Obtém o valor da propriedade nnf.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNNF() {
                return nnf;
            }

            /**
             * Define o valor da propriedade nnf.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNNF(String value) {
                this.nnf = value;
            }

            /**
             * Obtém o valor da propriedade dEmi.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getDEmi() {
                return dEmi;
            }

            /**
             * Define o valor da propriedade dEmi.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setDEmi(XMLGregorianCalendar value) {
                this.dEmi = value;
            }

            /**
             * Obtém o valor da propriedade tpNF.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTpNF() {
                return tpNF;
            }

            /**
             * Define o valor da propriedade tpNF.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTpNF(String value) {
                this.tpNF = value;
            }

            /**
             * Obtém o valor da propriedade cMunFG.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCMunFG() {
                return cMunFG;
            }

            /**
             * Define o valor da propriedade cMunFG.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCMunFG(String value) {
                this.cMunFG = value;
            }

            /**
             * Obtém o valor da propriedade tpImp.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTpImp() {
                return tpImp;
            }

            /**
             * Define o valor da propriedade tpImp.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTpImp(String value) {
                this.tpImp = value;
            }

            /**
             * Obtém o valor da propriedade tpEmis.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTpEmis() {
                return tpEmis;
            }

            /**
             * Define o valor da propriedade tpEmis.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTpEmis(String value) {
                this.tpEmis = value;
            }

            /**
             * Obtém o valor da propriedade cdv.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCDV() {
                return cdv;
            }

            /**
             * Define o valor da propriedade cdv.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCDV(String value) {
                this.cdv = value;
            }

            /**
             * Obtém o valor da propriedade tpAmb.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTpAmb() {
                return tpAmb;
            }

            /**
             * Define o valor da propriedade tpAmb.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTpAmb(String value) {
                this.tpAmb = value;
            }

            /**
             * Obtém o valor da propriedade finNFe.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFinNFe() {
                return finNFe;
            }

            /**
             * Define o valor da propriedade finNFe.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFinNFe(String value) {
                this.finNFe = value;
            }

            /**
             * Obtém o valor da propriedade procEmi.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getProcEmi() {
                return procEmi;
            }

            /**
             * Define o valor da propriedade procEmi.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setProcEmi(String value) {
                this.procEmi = value;
            }

            /**
             * Obtém o valor da propriedade verProc.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Define o valor da propriedade verProc.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVerProc(String value) {
                this.verProc = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="infAdFisco" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="obsCont"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="xTexto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="xCampo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "infAdFisco",
                "obsCont"
        })
        public static class InfAdic {

            @XmlElement(required = true)
            protected String infAdFisco;
            @XmlElement(required = true)
            protected NfeJAXBModel.InfNFe.InfAdic.ObsCont obsCont;

            /**
             * Obtém o valor da propriedade infAdFisco.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getInfAdFisco() {
                return infAdFisco;
            }

            /**
             * Define o valor da propriedade infAdFisco.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setInfAdFisco(String value) {
                this.infAdFisco = value;
            }

            /**
             * Obtém o valor da propriedade obsCont.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.InfAdic.ObsCont }
             *
             */
            public NfeJAXBModel.InfNFe.InfAdic.ObsCont getObsCont() {
                return obsCont;
            }

            /**
             * Define o valor da propriedade obsCont.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.InfAdic.ObsCont }
             *
             */
            public void setObsCont(NfeJAXBModel.InfNFe.InfAdic.ObsCont value) {
                this.obsCont = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="xTexto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="xCampo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "xTexto"
            })
            public static class ObsCont {

                @XmlElement(required = true)
                protected String xTexto;
                @XmlAttribute(name = "xCampo", required = true)
                protected String xCampo;

                /**
                 * Obtém o valor da propriedade xTexto.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Define o valor da propriedade xTexto.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Obtém o valor da propriedade xCampo.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Define o valor da propriedade xCampo.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXCampo(String value) {
                    this.xCampo = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ICMSTot"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vBCST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vProd" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vFrete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vSeg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vDesc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vII" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vIPI" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vOutro" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="vNF" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "icmsTot"
        })
        public static class Total {

            @XmlElement(name = "ICMSTot", required = true)
            protected NfeJAXBModel.InfNFe.Total.ICMSTot icmsTot;

            /**
             * Obtém o valor da propriedade icmsTot.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.Total.ICMSTot }
             *
             */
            public NfeJAXBModel.InfNFe.Total.ICMSTot getICMSTot() {
                return icmsTot;
            }

            /**
             * Define o valor da propriedade icmsTot.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.Total.ICMSTot }
             *
             */
            public void setICMSTot(NfeJAXBModel.InfNFe.Total.ICMSTot value) {
                this.icmsTot = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="vBC" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vICMS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vBCST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vST" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vProd" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vFrete" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vSeg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vDesc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vII" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vIPI" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vPIS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vCOFINS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vOutro" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="vNF" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "vbc",
                    "vicms",
                    "vbcst",
                    "vst",
                    "vProd",
                    "vFrete",
                    "vSeg",
                    "vDesc",
                    "vii",
                    "vipi",
                    "vpis",
                    "vcofins",
                    "vOutro",
                    "vnf"
            })
            public static class ICMSTot {

                @XmlElement(name = "vBC", required = true)
                protected BigDecimal vbc;
                @XmlElement(name = "vICMS", required = true)
                protected BigDecimal vicms;
                @XmlElement(name = "vBCST", required = true)
                protected BigDecimal vbcst;
                @XmlElement(name = "vST", required = true)
                protected BigDecimal vst;
                @XmlElement(required = true)
                protected BigDecimal vProd;
                @XmlElement(required = true)
                protected BigDecimal vFrete;
                @XmlElement(required = true)
                protected BigDecimal vSeg;
                @XmlElement(required = true)
                protected BigDecimal vDesc;
                @XmlElement(name = "vII", required = true)
                protected BigDecimal vii;
                @XmlElement(name = "vIPI", required = true)
                protected BigDecimal vipi;
                @XmlElement(name = "vPIS", required = true)
                protected BigDecimal vpis;
                @XmlElement(name = "vCOFINS", required = true)
                protected BigDecimal vcofins;
                @XmlElement(required = true)
                protected BigDecimal vOutro;
                @XmlElement(name = "vNF", required = true)
                protected BigDecimal vnf;

                /**
                 * Obtém o valor da propriedade vbc.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVBC() {
                    return vbc;
                }

                /**
                 * Define o valor da propriedade vbc.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVBC(BigDecimal value) {
                    this.vbc = value;
                }

                /**
                 * Obtém o valor da propriedade vicms.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVICMS() {
                    return vicms;
                }

                /**
                 * Define o valor da propriedade vicms.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVICMS(BigDecimal value) {
                    this.vicms = value;
                }

                /**
                 * Obtém o valor da propriedade vbcst.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVBCST() {
                    return vbcst;
                }

                /**
                 * Define o valor da propriedade vbcst.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVBCST(BigDecimal value) {
                    this.vbcst = value;
                }

                /**
                 * Obtém o valor da propriedade vst.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVST() {
                    return vst;
                }

                /**
                 * Define o valor da propriedade vst.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVST(BigDecimal value) {
                    this.vst = value;
                }

                /**
                 * Obtém o valor da propriedade vProd.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVProd() {
                    return vProd;
                }

                /**
                 * Define o valor da propriedade vProd.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVProd(BigDecimal value) {
                    this.vProd = value;
                }

                /**
                 * Obtém o valor da propriedade vFrete.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVFrete() {
                    return vFrete;
                }

                /**
                 * Define o valor da propriedade vFrete.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVFrete(BigDecimal value) {
                    this.vFrete = value;
                }

                /**
                 * Obtém o valor da propriedade vSeg.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVSeg() {
                    return vSeg;
                }

                /**
                 * Define o valor da propriedade vSeg.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVSeg(BigDecimal value) {
                    this.vSeg = value;
                }

                /**
                 * Obtém o valor da propriedade vDesc.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVDesc() {
                    return vDesc;
                }

                /**
                 * Define o valor da propriedade vDesc.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVDesc(BigDecimal value) {
                    this.vDesc = value;
                }

                /**
                 * Obtém o valor da propriedade vii.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVII() {
                    return vii;
                }

                /**
                 * Define o valor da propriedade vii.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVII(BigDecimal value) {
                    this.vii = value;
                }

                /**
                 * Obtém o valor da propriedade vipi.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVIPI() {
                    return vipi;
                }

                /**
                 * Define o valor da propriedade vipi.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVIPI(BigDecimal value) {
                    this.vipi = value;
                }

                /**
                 * Obtém o valor da propriedade vpis.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVPIS() {
                    return vpis;
                }

                /**
                 * Define o valor da propriedade vpis.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVPIS(BigDecimal value) {
                    this.vpis = value;
                }

                /**
                 * Obtém o valor da propriedade vcofins.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVCOFINS() {
                    return vcofins;
                }

                /**
                 * Define o valor da propriedade vcofins.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVCOFINS(BigDecimal value) {
                    this.vcofins = value;
                }

                /**
                 * Obtém o valor da propriedade vOutro.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVOutro() {
                    return vOutro;
                }

                /**
                 * Define o valor da propriedade vOutro.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVOutro(BigDecimal value) {
                    this.vOutro = value;
                }

                /**
                 * Obtém o valor da propriedade vnf.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getVNF() {
                    return vnf;
                }

                /**
                 * Define o valor da propriedade vnf.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setVNF(BigDecimal value) {
                    this.vnf = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="modFrete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="transporta"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="vol"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="qVol" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="esp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="pesoL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="pesoB" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "modFrete",
                "transporta",
                "vol"
        })
        public static class Transp {

            @XmlElement(required = true)
            protected String modFrete;
            @XmlElement(required = true)
            protected NfeJAXBModel.InfNFe.Transp.Transporta transporta;
            @XmlElement(required = true)
            protected NfeJAXBModel.InfNFe.Transp.Vol vol;

            /**
             * Obtém o valor da propriedade modFrete.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getModFrete() {
                return modFrete;
            }

            /**
             * Define o valor da propriedade modFrete.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setModFrete(String value) {
                this.modFrete = value;
            }

            /**
             * Obtém o valor da propriedade transporta.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.Transp.Transporta }
             *
             */
            public NfeJAXBModel.InfNFe.Transp.Transporta getTransporta() {
                return transporta;
            }

            /**
             * Define o valor da propriedade transporta.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.Transp.Transporta }
             *
             */
            public void setTransporta(NfeJAXBModel.InfNFe.Transp.Transporta value) {
                this.transporta = value;
            }

            /**
             * Obtém o valor da propriedade vol.
             *
             * @return
             *     possible object is
             *     {@link NfeJAXBModel.InfNFe.Transp.Vol }
             *
             */
            public NfeJAXBModel.InfNFe.Transp.Vol getVol() {
                return vol;
            }

            /**
             * Define o valor da propriedade vol.
             *
             * @param value
             *     allowed object is
             *     {@link NfeJAXBModel.InfNFe.Transp.Vol }
             *
             */
            public void setVol(NfeJAXBModel.InfNFe.Transp.Vol value) {
                this.vol = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="xNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "xNome"
            })
            public static class Transporta {

                @XmlElement(required = true)
                protected String xNome;

                /**
                 * Obtém o valor da propriedade xNome.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getXNome() {
                    return xNome;
                }

                /**
                 * Define o valor da propriedade xNome.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setXNome(String value) {
                    this.xNome = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             *
             * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="qVol" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="esp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="pesoL" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="pesoB" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "qVol",
                    "esp",
                    "pesoL",
                    "pesoB"
            })
            public static class Vol {

                @XmlElement(required = true)
                protected BigDecimal qVol;
                @XmlElement(required = true)
                protected String esp;
                @XmlElement(required = true)
                protected BigDecimal pesoL;
                @XmlElement(required = true)
                protected BigDecimal pesoB;

                /**
                 * Obtém o valor da propriedade qVol.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getQVol() {
                    return qVol;
                }

                /**
                 * Define o valor da propriedade qVol.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setQVol(BigDecimal value) {
                    this.qVol = value;
                }

                /**
                 * Obtém o valor da propriedade esp.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getEsp() {
                    return esp;
                }

                /**
                 * Define o valor da propriedade esp.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setEsp(String value) {
                    this.esp = value;
                }

                /**
                 * Obtém o valor da propriedade pesoL.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getPesoL() {
                    return pesoL;
                }

                /**
                 * Define o valor da propriedade pesoL.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setPesoL(BigDecimal value) {
                    this.pesoL = value;
                }

                /**
                 * Obtém o valor da propriedade pesoB.
                 *
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *
                 */
                public BigDecimal getPesoB() {
                    return pesoB;
                }

                /**
                 * Define o valor da propriedade pesoB.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *
                 */
                public void setPesoB(BigDecimal value) {
                    this.pesoB = value;
                }

            }

        }

    }

}
