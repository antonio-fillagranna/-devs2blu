import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PaginacaoSimplesComponent } from './paginacao-simples/paginacao-simples.component';
import { PaginacaoComLibraryComponent } from './paginacao-com-library/paginacao-com-library.component';

@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet,
    PaginacaoSimplesComponent,
    PaginacaoComLibraryComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'app-paginacao';
}
