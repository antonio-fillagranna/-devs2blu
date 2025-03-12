import { CommonModule, CurrencyPipe, DatePipe, LowerCasePipe, SlicePipe, TitleCasePipe, UpperCasePipe } from '@angular/common';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FiltroUsuariosPipe } from './filtro-usuarios.pipe';
import { FormsModule } from '@angular/forms';

interface iUsuario  {
  id:number,
  nome:string,
  email:string,
}

@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet,
    CommonModule,
    FormsModule,
    UpperCasePipe,
    LowerCasePipe,
    TitleCasePipe,
    DatePipe,
    CurrencyPipe,
    SlicePipe,
    FiltroUsuariosPipe
    
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'app-pipes';

  mensagem = 'Olá PESSOAL hoje aula de pipes'

  aniversario = new Date()

  valorPastel = 8.50

  pessoas = ['Maria','Ana','Zé','Jó']

  termoPesquisa = ''
  usuarios = [
    { id:1, nome:'Maria', email:'maria@gmail.com'},
    { id:2, nome:'Ana', email:'ana@gmail.com'},
    { id:3, nome:'Josefa', email:'josefa@gmail.com'},
    { id:4, nome:'João', email:'joao@gmail.com'}
  ]
}
