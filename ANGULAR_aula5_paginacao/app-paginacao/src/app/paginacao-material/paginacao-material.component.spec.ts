import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaginacaoMaterialComponent } from './paginacao-material.component';

describe('PaginacaoMaterialComponent', () => {
  let component: PaginacaoMaterialComponent;
  let fixture: ComponentFixture<PaginacaoMaterialComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PaginacaoMaterialComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PaginacaoMaterialComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
