import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-paginacao-simples',
  imports: [CommonModule],
  templateUrl: './paginacao-simples.component.html',
  styleUrl: './paginacao-simples.component.css'
})
export class PaginacaoSimplesComponent {
  items = Array.from({ length: 100 }, (_, i) => `Item ${i + 1}`)

  pageSize = 10;
  currentPage = 2;

  get paginatedItems() {
    const startIndex = (this.currentPage - 1) * this.pageSize;
    return this.items.slice(startIndex, startIndex +
      this.pageSize);
  }

  changePage(page: number) {
    this.currentPage = page;
    }
    

}
