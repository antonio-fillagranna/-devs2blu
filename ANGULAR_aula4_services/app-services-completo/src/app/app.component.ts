import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ContatoService } from './contato.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CommonModule, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  contatos: any[] = []
  contato = { id: null, nome: '', email: '', fone: '' };
  editando = false;
  erro = '';

  constructor(private service: ContatoService){}
  
  ngOnInit(): void {
    this.service.getContatos().subscribe(data => this.contatos = data)
  }

   listarContatos() {
    this.service.getContatos().subscribe(data => {
      this.contatos = data;
    });
  }

  salvar() {
    if(this.contato.nome === ''){
       this.erro = 'O nome deve ser informado';
       return
    }

    if(this.contato.email === ''){
      this.erro = 'O email deve ser informado';
      return
   }

   if(this.contato.fone === ''){
    this.erro = 'O fone deve ser informado';
    return
  }

    if (this.editando) {
      this.service.update(this.contato.id, this.contato).subscribe(() => {
        this.listarContatos();
        this.cancelarEdicao();
      });
    } else {
        let ct = {nome: this.contato.nome, email: this.contato.email, fone: this.contato.fone}
        this.service.save(ct).subscribe(() => {
        this.listarContatos();
        this.contato = { id: null, nome: '', email: '', fone:'' }
      });
    }
    this.erro = ''
  }

  editar(contato: any) {
    this.contato = { ...contato };
    this.editando = true;
  }

  cancelarEdicao() {
    this.contato = { id: null, nome: '', email: '', fone:'' };
    this.editando = false;
  }

  excluir(id: number) {
    this.service.delete(id).subscribe(() => {
      this.listarContatos();
    });
  }
}


