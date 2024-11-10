package com.senac.designpatterns.abstractfactory.Q2;

import com.senac.designpatterns.abstractfactory.Q2.factory.ReportFactory;
import com.senac.designpatterns.abstractfactory.Q2.model.Chart;
import com.senac.designpatterns.abstractfactory.Q2.model.Report;

public class Gerador {
    private final ReportFactory reportFactory;

    public Gerador(ReportFactory reportFactory) {
        this.reportFactory = reportFactory;
    }

    public void gerar() {
        Report report = reportFactory.criarRelatorio();
        Chart chart = reportFactory.criarGrafico();

        report.gerarReport();
        chart.gerarChart();
    }
}