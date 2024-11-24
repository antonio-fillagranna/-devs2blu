package com.senac.designpatterns.facade.exemplo1;

public class FacadeConcreta extends Facade {
    private final SubSistemaA subSistemaA;
    private final SubSistemaB subSistemaB;

    public FacadeConcreta(SubSistemaA subSistemaA, SubSistemaB subSistemaB) {
        this.subSistemaA = subSistemaA;
        this.subSistemaB = subSistemaB;
    }

    @Override
    public void operar() {
        subSistemaA.acao();
        subSistemaB.acao();
    }
}
