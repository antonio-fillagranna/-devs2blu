import { Component } from '@angular/core';
import { CommonModule} from '@angular/common'
import { NgxPaginationModule } from 'ngx-pagination'

@Component({
  selector: 'app-paginacao-com-library',
  imports: [
    CommonModule,
    NgxPaginationModule
  ],
  templateUrl: './paginacao-com-library.component.html',
  styleUrl: './paginacao-com-library.component.css'
})
export class PaginacaoComLibraryComponent {
  items = Array.from({ length: 100 }, (_, i) => `Item ${i + 1}`);
  page = 1;
}
