import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms'
@Component({
  selector: 'app-diretivas',
  imports: [CommonModule, FormsModule],
  templateUrl: './diretivas.component.html',
  styleUrl: './diretivas.component.css'
})
export class DiretivasComponent {
  mostrar = true;
  

  trocar(){
    this.mostrar=!this.mostrar
  }

  frutas = ['maça', 'uva', 'laranja']
  novaFruta = ''

  showLista(): void{
    this.mostrar = !this.mostrar
  }
  adicionarLista(){
    this.frutas.push(this.novaFruta)
    this.novaFruta=''
  }
}
