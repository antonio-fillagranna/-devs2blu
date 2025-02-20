import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormsModule, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
   usuario = {nome: '', email: '', fone: ''}
   nomeInValido = false;

  validarNome() {
    this.nomeInValido = this.usuario.nome.trim().length === 0;
  }

   dados(dados:any){
      this.validarNome()
      if (this.nomeInValido) {
        return; 
      }
      console.log(dados.value)
   }
}
