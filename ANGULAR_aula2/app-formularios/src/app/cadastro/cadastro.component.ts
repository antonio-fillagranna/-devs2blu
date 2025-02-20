import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-cadastro',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {
  formulario = new FormGroup({
    nome: new FormControl('',[Validators.required, Validators.minLength(3)]),
    email: new FormControl('',[Validators.email]),
    fone: new FormControl('')
  })

  onSubmit(){
    console.log(this.formulario.value)
  }
}
