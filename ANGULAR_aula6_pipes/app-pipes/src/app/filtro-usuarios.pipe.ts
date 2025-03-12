import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filtroUsuarios',
  pure: false
})
export class FiltroUsuariosPipe implements PipeTransform {

  transform(usuarios:any[], termoBusca:string): any[] {
    if(!usuarios || !termoBusca){
      return usuarios;
    }
    return usuarios.filter(user => user.nome.toLowerCase().includes(termoBusca.toLowerCase()));
  }

}
