package com.github.lucasramallo.nfestream.presenter.controller;

import com.github.lucasramallo.nfestream.core.domain.Nfe;
import com.github.lucasramallo.nfestream.data.repository.NfeRopository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/api/v1/nfes")
public class NfeController {

    @Autowired
    NfeRopository nfeRopository;

    @GetMapping
    public ResponseEntity<List<Nfe>> getAll(
            @RequestParam(value = "page", required = false, defaultValue = "-1") int page,
            @RequestParam(value = "size", required = false, defaultValue = "-1") int size,
            @RequestParam(value = "dataInicial", required = false) String dataInicial,
            @RequestParam(value = "dataFinal", required = false) String dataFinal,
            @RequestParam(value = "valorMin", required = false) String valorMin,
            @RequestParam(value = "valorMax", required = false) String valorMax,
            @RequestParam(value = "numeroNfe", required = false) String numeroNfe,
            @RequestParam(value = "nomeEmitente", required = false) String nomeEmitente,
            @RequestParam(value = "nomeDestinatario", required = false) String nomeDestinatario,
            @RequestParam(value = "cnpjEmitente", required = false) String cnpjEmitente,
            @RequestParam(value = "cnpjDestinatario", required = false) String cnpjDestinatario
    ) {

        List<Nfe> nfes = nfeRopository.findAll();

        if (cnpjEmitente != null && !cnpjEmitente.isEmpty()) {
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getEmitente().getCnpj() != null && nfe.getEmitente().getCnpj().contains(cnpjEmitente))
                    .toList();
        }

        if (cnpjDestinatario != null && !cnpjDestinatario.isEmpty()) {
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getDestinatario().getCnpjCpf() != null && nfe.getDestinatario().getCnpjCpf().contains(cnpjDestinatario))
                    .toList();
        }

        if (nomeEmitente != null && !nomeEmitente.isEmpty()) {
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getEmitente().getNome() != null && nfe.getEmitente().getNome().toLowerCase().contains(nomeEmitente.toLowerCase()))
                    .toList();
        }

        if (nomeDestinatario != null && !nomeDestinatario.isEmpty()) {
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getDestinatario().getNome() != null && nfe.getDestinatario().getNome().toLowerCase().contains(nomeDestinatario.toLowerCase()))
                    .toList();
        }

        if (numeroNfe != null && !numeroNfe.isEmpty()) {
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getNumeroNfe() != null && nfe.getNumeroNfe().toString().contains(numeroNfe))
                    .toList();
        }

        if (dataInicial != null && !dataInicial.isEmpty() && dataFinal != null && !dataFinal.isEmpty()) {
            LocalDate startDate = LocalDate.parse(dataInicial);
            LocalDate endDate = LocalDate.parse(dataFinal);

            nfes = nfes.stream()
                    .filter(nfe -> nfe.getDataEmissao() != null &&
                            !nfe.getDataEmissao().isBefore(startDate.atStartOfDay()) &&
                            !nfe.getDataEmissao().isAfter(endDate.atStartOfDay()))
                    .toList();

        } else if (dataInicial != null && !dataInicial.isEmpty()) {
            LocalDate startDate = LocalDate.parse(dataInicial);
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getDataEmissao() != null &&
                            !nfe.getDataEmissao().isBefore(startDate.atStartOfDay()))
                    .toList();
        } else if (dataFinal != null && !dataFinal.isEmpty()) {
            LocalDate endDate = LocalDate.parse(dataFinal);
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getDataEmissao() != null &&
                            !nfe.getDataEmissao().isAfter(endDate.atStartOfDay()))
                    .toList();
        }

        if (valorMin != null && !valorMin.isEmpty() && valorMax != null && !valorMax.isEmpty()) {
            BigDecimal min = new BigDecimal(valorMin);
            BigDecimal max = new BigDecimal(valorMax);
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getValorTotal() != null &&
                            nfe.getValorTotal().compareTo(min) >= 0 &&
                            nfe.getValorTotal().compareTo(max) <= 0)
                    .toList();
        } else if (valorMin != null && !valorMin.isEmpty()) {
            BigDecimal min = new BigDecimal(valorMin);
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getValorTotal() != null &&
                            nfe.getValorTotal().compareTo(min) >= 0)
                    .toList();
        } else if (valorMax != null && !valorMax.isEmpty()) {
            BigDecimal max = new BigDecimal(valorMax);
            nfes = nfes.stream()
                    .filter(nfe -> nfe.getValorTotal() != null &&
                            nfe.getValorTotal().compareTo(max) <= 0)
                    .toList();
        }

        if (page >= 0 && size > 0) {
            int totalElements = nfes.size();
            int fromIndex = page * size;
            int toIndex = Math.min(fromIndex + size, totalElements);

            if (fromIndex > totalElements) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(Collections.emptyList());
            }

            nfes = nfes.subList(fromIndex, toIndex);
        }

        return ResponseEntity.status(HttpStatus.OK).body(nfes);
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Long id) {
        Nfe nfe = nfeRopository.findById(id).orElse(null);
        if (nfe == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nfe not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(nfe);
    }
}
