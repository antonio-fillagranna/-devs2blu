package com.senac.designpatterns.abstractfactory.Q2.factory;

import com.senac.designpatterns.abstractfactory.Q2.model.*;

public class PDFFactory implements ReportFactory{
    @Override
    public Report criarRelatorio() {
        return new PDFReport();
    }

    @Override
    public Chart criarGrafico() {
        return new PDFChart();
    }
}