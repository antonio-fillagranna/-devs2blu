package com.senac.designpatterns.abstractfactory.Q2.factory;

import com.senac.designpatterns.abstractfactory.Q2.model.Chart;
import com.senac.designpatterns.abstractfactory.Q2.model.Report;

public interface ReportFactory {
    Report criarRelatorio();
    Chart criarGrafico();
}