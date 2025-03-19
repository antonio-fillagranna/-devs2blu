import { Routes } from '@angular/router';
import { CadastroComponent } from './cadastro/cadastro.component';
import { ConsultaComponent } from './consulta/consulta.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './guards/auth.guard';

export const routes: Routes = [
    {   path:'cadastro', 
        component: CadastroComponent,
        canActivate:[AuthGuard]
        },

    { path:'consulta', component: ConsultaComponent},
    { path:'login', component: LoginComponent },
];
