package com.senac.designpatterns.abstractfactory.Q2.factory;

import com.senac.designpatterns.abstractfactory.Q2.model.Chart;
import com.senac.designpatterns.abstractfactory.Q2.model.HTMLChart;
import com.senac.designpatterns.abstractfactory.Q2.model.HTMLReport;
import com.senac.designpatterns.abstractfactory.Q2.model.Report;

public class HTMLFactory implements ReportFactory{
    @Override
    public Report criarRelatorio() {
        return new HTMLReport();
    }

    @Override
    public Chart criarGrafico() {
        return new HTMLChart();
    }
}