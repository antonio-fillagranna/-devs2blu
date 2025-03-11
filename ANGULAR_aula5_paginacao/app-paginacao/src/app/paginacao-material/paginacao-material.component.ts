import { CommonModule } from '@angular/common';
import { AfterViewInit, Component, ViewChild } from '@angular/core'
import { MatPaginatorModule, MatPaginator } from '@angular/material/paginator'
import { MatTableDataSource, MatTableModule } from '@angular/material/table'

export interface UserData {
  id: number;
  name: string;
  age: number;
}

const USERS: UserData[] = Array.from({ length: 50 }, (_, k) => ({
  id: k + 1,
  name: `Usuário ${k + 1}`,
  age: Math.floor(Math.random() * 50) + 18
}));

@Component({
  selector: 'app-paginacao-material',
  imports: [ CommonModule, MatPaginatorModule, MatTableModule],
  templateUrl: './paginacao-material.component.html',
  styleUrl: './paginacao-material.component.css'
})
export class PaginacaoMaterialComponent implements AfterViewInit {
  displayedColumns: string[] = ['id', 'name', 'age'];
  dataSource = new MatTableDataSource<UserData>(USERS);
  
  @ViewChild(MatPaginator) paginator!: MatPaginator

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
  }
}
